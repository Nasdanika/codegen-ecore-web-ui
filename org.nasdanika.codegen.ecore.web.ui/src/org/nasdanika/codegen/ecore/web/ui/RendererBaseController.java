package org.nasdanika.codegen.ecore.web.ui;

import java.util.Collection;
import java.util.Collections;

import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.java.ImportManager;
import org.nasdanika.codegen.java.Interface;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * 
 * @author Pavel
 *
 */
public class RendererBaseController implements GeneratorController<String, Interface> {

	@Override
	public Collection<Context> iterate(Context context, Interface generator) throws Exception {
		MutableContext mc = context.createSubContext();
		ImportManager importManager = mc.get(ImportManager.class);
		mc.set("renderer-base-extends-imported", importManager.addImport((String) mc.get(RoutesPackageController.RENDERER_BASE_EXTENDS)));
		return Collections.singleton(mc);
	}

}
