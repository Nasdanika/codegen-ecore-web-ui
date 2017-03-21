package org.nasdanika.codegen.ecore.web.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.config.Context;

public class RendererResourceBundlesPropertiesFileGenerator implements Work<InputStream> {

	@Override
	public int size() {
		return 1;
	}

	@Override
	public InputStream execute(Context context, SubMonitor monitor) throws Exception {
		EcoreCodeGenerator ecoreCodeGenerator = context.get(EcoreCodeGenerator.class);
		EClass eClass = context.get(EClass.class);
		Properties properties = new Properties();
		
		List<EStructuralFeature> selectedFeatures = new ArrayList<>();
		List<EOperation> selectedOperations= new ArrayList<>();
		
		// Own features and operations
		for (EStructuralFeature esf: eClass.getEStructuralFeatures()) {
			if (ecoreCodeGenerator.isSelected(esf)) {
				selectedFeatures.add(esf);
			}
		}
		for (EOperation op: eClass.getEOperations()) {
			if (ecoreCodeGenerator.isSelected(op)) {
				selectedOperations.add(op);
			}
		}
		// Features and operations from not selected supertypes
		collectFeaturesAndOperations(ecoreCodeGenerator, eClass, new HashSet<>(), selectedFeatures, selectedOperations);

// TODO - Generate resource entries from configurations.		
//		String className = eClass.getName();
//		properties.put("class.label", nameToLabel(className));
//		for (EStructuralFeature sf: selectedFeatures) {
//			properties.put("feature."+sf.getName()+".label", nameToLabel(sf.getName()));			
//		}
//		
//		for (EOperation op: selectedOperations) {
//			properties.put("operation."+op.getName()+".label", nameToLabel(op.getName()));			
//		}
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		properties.store(baos, null);
		baos.close();
		return new ByteArrayInputStream(baos.toByteArray());
	}
	
	private void collectFeaturesAndOperations(EcoreCodeGenerator ecoreCodeGenerator, EClass eClass, Set<EClass> traversed, Collection<EStructuralFeature> featureCollector, Collection<EOperation> operationCollector) {
		if (traversed.add(eClass) && !ecoreCodeGenerator.isSelected(eClass)) {
			for (EStructuralFeature esf: eClass.getEStructuralFeatures()) {
				featureCollector.add(esf);
			}
			for (EOperation op: eClass.getEOperations()) {
				operationCollector.add(op);
			}
			for (EClass st: eClass.getESuperTypes()) {
				collectFeaturesAndOperations(ecoreCodeGenerator, st, traversed, featureCollector, operationCollector);
			}
		}
	}

	private String nameToLabel(String name) {
		String[] cca = StringUtils.splitByCharacterTypeCamelCase(name);
		cca[0] = StringUtils.capitalize(cca[0]);
		for (int i=1; i<cca.length; ++i) {
			cca[i] = cca[i].toLowerCase();
		}
		String classLabel = StringUtils.join(cca, " ");
		return classLabel;
	}

}
