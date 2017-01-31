package org.nasdanika.codegen.ecore.web.ui;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.java.Class;
import org.nasdanika.codegen.java.ImportManager;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Iterates over selected EClasses in an EPackages.
 * @author Pavel
 *
 */
public class RouteClassController implements GeneratorController<String, Class> {

	@Override
	public Collection<Context> iterate(Context context, Class generator) throws Exception {
		MutableContext mc = context.createSubContext();
		// TODO - proper inheritance?
		EClass eClass = mc.get(EClass.class);
		String instanceClassName = eClass.getInstanceClassName();
		String instanceTypeName = eClass.getInstanceTypeName();
		String eClassShortName = mc.get(ImportManager.class).addImport(instanceTypeName);
		mc.set("route-super-type", "RouteBase<"+eClassShortName+">");
		
		return Collections.singleton(mc);
	}

}
