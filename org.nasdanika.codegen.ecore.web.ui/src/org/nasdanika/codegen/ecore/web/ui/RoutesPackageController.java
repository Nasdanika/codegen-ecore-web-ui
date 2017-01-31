package org.nasdanika.codegen.ecore.web.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.core.IPackageFragment;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.java.PackageFragment;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Iterates over selected EPackages.
 * @author Pavel
 *
 */
public class RoutesPackageController implements GeneratorController<IPackageFragment, PackageFragment> {

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
