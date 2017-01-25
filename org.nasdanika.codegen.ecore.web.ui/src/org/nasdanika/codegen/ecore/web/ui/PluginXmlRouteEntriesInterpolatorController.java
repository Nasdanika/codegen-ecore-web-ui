package org.nasdanika.codegen.ecore.web.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
	public boolean validate(Interpolator generator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	@Override
	public Collection<Context> iterate(Context context, Interpolator generator) throws Exception {
		Collection<Context> ret = new ArrayList<>();
		EcoreCodeGenerator eCoreCodeGenerator = context.get(EcoreCodeGenerator.class);
		for (EPackage ep: eCoreCodeGenerator.getEPackages()) {
			if (eCoreCodeGenerator.isSelected(ep)) {
				for (EClassifier ec: ep.getEClassifiers()) {
					if (ec instanceof EClass && !((EClass) ec).isAbstract() && eCoreCodeGenerator.isSelected(ec)) {
						MutableContext mc = context.createSubContext();
						mc.set("epackage-namespace-uri", ep.getNsURI());
						mc.set("epackage-name", ep.getName());
						mc.set("eclass-name", ec.getName());
						ret.add(mc);
					}
				}
			}
		}
		
		return ret;
	}

	@Override
	public String configure(Interpolator generator, Context context, String result, SubMonitor monitor)	throws Exception {
		monitor.worked(1);
		return result;
	}

}
