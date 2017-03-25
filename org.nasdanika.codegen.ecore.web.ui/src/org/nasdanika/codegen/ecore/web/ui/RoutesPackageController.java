package org.nasdanika.codegen.ecore.web.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.core.IPackageFragment;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration;
import org.nasdanika.codegen.java.PackageFragment;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Iterates over selected EPackages.
 * @author Pavel
 *
 */
public class RoutesPackageController implements GeneratorController<IPackageFragment, PackageFragment> {

	static final String ROUTE_BASE_EXTENDS = "route-base-extends";
	static final String RENDERER_BASE_EXTENDS = "renderer-base-extends";

	@Override
	public Collection<Context> iterate(Context context, PackageFragment generator) throws Exception {
		Collection<Context> ret = new ArrayList<>();
		EcoreCodeGenerator eCoreCodeGenerator = context.get(EcoreCodeGenerator.class);
		for (EPackage ep: eCoreCodeGenerator.getEPackages()) {
			if (eCoreCodeGenerator.isSelected(ep)) {
				MutableContext mc = context.createSubContext();
				mc.set("epackage-name", ep.getName());
				mc.set(EPackage.class, ep);
				ret.add(mc);
				Set<String> packageTypes = new HashSet<>();
				packageTypes.add("RouteBase");
				packageTypes.add("RendererBase");
				
				mc.set(RENDERER_BASE_EXTENDS, "org.nasdanika.cdo.web.routes.app.Renderer");
				mc.set(ROUTE_BASE_EXTENDS, "org.nasdanika.cdo.web.routes.app.Route");
				ModelElement me = eCoreCodeGenerator.find(ep, false);
				if (me != null) {
					EObject cfg = me.getConfiguration(WebUIGenerationTarget.CONFIG_ID);
					if (cfg instanceof EPackageConfiguration) {
						mc.set(RENDERER_BASE_EXTENDS, ((EPackageConfiguration) cfg).getRendererBaseExtends());
						mc.set(ROUTE_BASE_EXTENDS, ((EPackageConfiguration) cfg).getRouteBaseExtends());
					}
				}

				for (EClassifier ec: ep.getEClassifiers()) {
					if (ec instanceof EClass && eCoreCodeGenerator.isSelected(ec)) {
						packageTypes.add(ec.getName()+"Renderer");
						if (!((EClass) ec).isAbstract()) {
							packageTypes.add(ec.getName()+"Route");
						}
					}
				}
				mc.set("package-types", packageTypes);
			}
		}
		
		return ret;
	}

}
