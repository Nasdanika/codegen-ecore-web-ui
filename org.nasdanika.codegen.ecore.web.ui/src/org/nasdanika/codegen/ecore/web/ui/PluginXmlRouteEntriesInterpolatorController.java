package org.nasdanika.codegen.ecore.web.ui;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.Interpolator;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Iterates over selected non-abstract EClasses
 * @author Pavel
 *
 */
public class PluginXmlRouteEntriesInterpolatorController implements GeneratorController<String, Interpolator> {

	@Override
	public Collection<Context> iterate(Context context, Interpolator generator) throws Exception {
		Collection<Context> ret = new ArrayList<>();
		EcoreCodeGenerator eCoreCodeGenerator = context.get(EcoreCodeGenerator.class);
		EList<EPackage> ePackages = eCoreCodeGenerator.getEPackages();
		for (EPackage ep: ePackages) {
			if (eCoreCodeGenerator.isSelected(ep)) {
				for (EClassifier ec: ep.getEClassifiers()) {
					if (ec instanceof EClass && !((EClass) ec).isAbstract() && eCoreCodeGenerator.isSelected(ec)) {
						MutableContext mc = context.createSubContext();
						mc.set("epackage-namespace-uri", ep.getNsURI());
						String ePackageName = ep.getName();
						for (EObject container = ep.eContainer(); ePackages.contains(container); container = container.eContainer()) {
							ePackageName = ((EPackage) container).getName() + "." + ePackageName;
						}
						mc.set("epackage-name", ePackageName);
						mc.set("eclass-name", ec.getName());
						ret.add(mc);
					}
				}
			}
		}
		
		return ret;
	}

}
