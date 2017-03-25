package org.nasdanika.codegen.ecore.web.ui;

import java.util.Collection;
import java.util.Collections;

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
public class RouteBaseController implements GeneratorController<String, Class> {

	@Override
	public Collection<Context> iterate(Context context, Class generator) throws Exception {
		MutableContext mc = context.createSubContext();
		ImportManager importManager = mc.get(ImportManager.class);
		mc.set("route-base-extends-imported", importManager.addImport((String) mc.get(RoutesPackageController.ROUTE_BASE_EXTENDS)));
		return Collections.singleton(mc);
	}

}
