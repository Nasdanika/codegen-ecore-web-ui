package org.nasdanika.codegen.ecore.web.ui;

import java.util.Collection;
import java.util.Collections;

import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.java.Interface;
import org.nasdanika.config.Context;

/**
 * Iterates over selected EClasses in an EPackages.
 * @author Pavel
 *
 */
public class RendererInterfaceController implements GeneratorController<String, Interface> {

	@Override
	public Collection<Context> iterate(Context context, Interface generator) throws Exception {
		// TODO
		return Collections.singleton(context);
	}

}
