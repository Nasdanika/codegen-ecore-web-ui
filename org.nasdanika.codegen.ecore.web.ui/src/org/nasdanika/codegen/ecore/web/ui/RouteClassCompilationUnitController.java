package org.nasdanika.codegen.ecore.web.ui;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.core.ICompilationUnit;
import org.nasdanika.codegen.GeneratorController;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.java.CompilationUnit;
import org.nasdanika.config.Context;
import org.nasdanika.config.MutableContext;

/**
 * Iterates over selected EClasses in an EPackage.
 * @author Pavel
 *
 */
public class RouteClassCompilationUnitController implements GeneratorController<ICompilationUnit, CompilationUnit> {

	@Override
	public Collection<Context> iterate(Context context, CompilationUnit generator) throws Exception {
		Collection<Context> ret = new ArrayList<>();
		EcoreCodeGenerator eCoreCodeGenerator = context.get(EcoreCodeGenerator.class);
		for (EClassifier ec: context.get(EPackage.class).getEClassifiers()) {
			if (ec instanceof EClass && !((EClass) ec).isAbstract() && eCoreCodeGenerator.isSelected(ec)) {
				MutableContext mc = context.createSubContext();
				mc.set("eclass-name", ec.getName());
				mc.set(EClass.class, (EClass) ec);
				ret.add(mc);
			}
		}
		
		return ret;
	}

}
