package org.nasdanika.codegen.ecore.web.ui;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.java.Class;
import org.nasdanika.codegen.java.ImportManager;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Iterates over selected EClasses in an EPackage.
 * @author Pavel
 *
 */
public class RouteClassController implements GeneratorController<String, Class> {

	@Override
	public Collection<Context> iterate(Context context, Class generator) throws Exception {
		MutableContext mc = context.createSubContext();
		EClass eClass = mc.get(EClass.class);
		String instanceTypeName = eClass.getInstanceTypeName();
		if (instanceTypeName == null) {
			instanceTypeName = EObject.class.getName();
		}
		ImportManager importManager = mc.get(ImportManager.class);
		String eClassImportedName = importManager.addImport(instanceTypeName);		
		mc.set("route-super-type", "RouteBase<"+eClassImportedName+">");
		mc.set("eclass-name-imported", eClassImportedName);
		
		return Collections.singleton(mc);
	}

}
