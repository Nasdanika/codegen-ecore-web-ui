package org.nasdanika.codegen.ecore.web.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.java.ImportManager;
import org.nasdanika.codegen.java.Interface;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Iterates over selected EClasses in an EPackages.
 * @author Pavel
 *
 */
public class RendererInterfaceController implements GeneratorController<String, Interface> {

	@Override
	public Collection<Context> iterate(Context context, Interface generator) throws Exception {
		EClass eClass = context.get(EClass.class);
		EcoreCodeGenerator ecoreCodeGenerator = context.get(EcoreCodeGenerator.class);
		ImportManager importManager = context.get(ImportManager.class);
		MutableContext mc = context.createSubContext();
		mc.set("eclass-name-imported", importManager.addImport(eClass.getInstanceClassName()));
		List<EClass> supertypes = new ArrayList<>();
		for (EClass st: eClass.getESuperTypes()) {
			if (ecoreCodeGenerator.isSelected(st)) {
				supertypes.add(st);
			}
		}
		
		if (supertypes.isEmpty()) {
			mc.set("super-types", "RendererBase<T>");
			mc.set("add-super-resource-bundle-classes", "");  
		} else {
			String basePackage = (String) context.get("base-package");
			StringBuilder sb = new StringBuilder();
			StringBuilder addSuperResourceBundleClassesBuilder = new StringBuilder();
			for (EClass st: supertypes) {
				if (sb.length() > 0) {
					sb.append(", ");
				}
				String rendererFQN = basePackage + "." + st.getEPackage().getName() + "." + st.getName() + "Renderer";
				String rendererImported = importManager.addImport(rendererFQN);
				sb.append(rendererImported+"<T>");
				
				if (addSuperResourceBundleClassesBuilder.length() > 0) {
					addSuperResourceBundleClassesBuilder.append(System.lineSeparator());
				}
				addSuperResourceBundleClassesBuilder.append("ret.addAll(").append(rendererImported+".super.getResourceBundleClasses(context));");
			}
			mc.set("super-types", sb.toString());
			mc.set("add-super-resource-bundle-classes", addSuperResourceBundleClassesBuilder.toString());  
		}
		
		// Context
		String contextImport = importManager.addImport("org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext");
		String credentialsImport = importManager.addImport("org.nasdanika.cdo.security.LoginPasswordCredentials");
		mc.set("context-imported", contextImport+"<"+credentialsImport+">");
		
		return Collections.singleton(mc);
	}

}
