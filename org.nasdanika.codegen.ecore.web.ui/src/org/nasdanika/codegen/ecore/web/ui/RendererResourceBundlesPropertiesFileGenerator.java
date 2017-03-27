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

import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.nasdanika.codegen.Work;
import org.nasdanika.codegen.ecore.EcoreCodeGenerator;
import org.nasdanika.codegen.ecore.ModelElement;
import org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration;
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
		
		// Class properties
		toProperties(context, ecoreCodeGenerator, eClass, properties);
		
		List<EAttribute> selectedAttributes = new ArrayList<>();
		List<EReference> selectedReferences = new ArrayList<>();
		List<EOperation> selectedOperations= new ArrayList<>();
		
		// Own features and operations
		for (EAttribute attr: eClass.getEAttributes()) {
			if (ecoreCodeGenerator.isSelected(attr)) {
				selectedAttributes.add(attr);
			}
		}
		for (EReference ref: eClass.getEReferences()) {
			if (ecoreCodeGenerator.isSelected(ref)) {
				selectedReferences.add(ref);
			}
		}
		for (EOperation op: eClass.getEOperations()) {
			if (ecoreCodeGenerator.isSelected(op)) {
				selectedOperations.add(op);
			}
		}
		// Features and operations from not selected supertypes
		collectFeaturesAndOperations(ecoreCodeGenerator, eClass, new HashSet<>(), selectedAttributes, selectedReferences, selectedOperations);

		for (EAttribute sa: selectedAttributes) {
			toProperties(context, ecoreCodeGenerator, sa, properties);
		}
		for (EReference sr: selectedReferences) {
			toProperties(context, ecoreCodeGenerator, sr, properties);
		}
		// TODO - operations once supported.
		
		List<EStructuralFeature> visibleFeatures = new ArrayList<>();
		collectSelectedFeatures(ecoreCodeGenerator, eClass, new HashSet<>(), visibleFeatures);
		StringBuilder sb = new StringBuilder();
		for (EStructuralFeature f: visibleFeatures) {
			if (sb.length()>0) {
				sb.append(" ");
			}
			sb.append(f.getName());
		}
		properties.setProperty("class."+eClass.getName()+".render.visible-features", sb.toString());
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		properties.store(baos, null);
		baos.close();
		return new ByteArrayInputStream(baos.toByteArray());
	}

	private void toProperties(Context context, EcoreCodeGenerator ecoreCodeGenerator, EModelElement eClass,	Properties properties) {
		ModelElement me = ecoreCodeGenerator.find(eClass, false);
		if (me != null) {
			EObject config = me.getConfiguration(WebUIGenerationTarget.CONFIG_ID);
			if (config instanceof EModelElementConfiguration) {
				((EModelElementConfiguration) config).toProperties(eClass, (String) context.get(RoutesPackageController.RENDER_ANNOTATION_SOURCE), properties);
			}
		}
	}
	
	private void collectFeaturesAndOperations(
			EcoreCodeGenerator ecoreCodeGenerator, 
			EClass eClass, 
			Set<EClass> traversed, 
			Collection<EAttribute> attributeCollector, 
			Collection<EReference> referenceCollector, 
			Collection<EOperation> operationCollector) {
		if (traversed.add(eClass) && !ecoreCodeGenerator.isSelected(eClass)) {
			for (EAttribute a: eClass.getEAttributes()) {
				attributeCollector.add(a);
			}
			for (EReference r: eClass.getEReferences()) {
				referenceCollector.add(r);
			}
			for (EOperation op: eClass.getEOperations()) {
				operationCollector.add(op);
			}
			for (EClass st: eClass.getESuperTypes()) {
				collectFeaturesAndOperations(ecoreCodeGenerator, st, traversed, attributeCollector, referenceCollector, operationCollector);
			}
		}
	}
	
	private void collectSelectedFeatures(EcoreCodeGenerator ecoreCodeGenerator, EClass eClass, Set<EClass> traversed, Collection<EStructuralFeature> featureCollector) {
		if (traversed.add(eClass)) {
			for (EClass st: eClass.getESuperTypes()) {
				collectSelectedFeatures(ecoreCodeGenerator, st, traversed, featureCollector);
			}
			for (EStructuralFeature esf: eClass.getEStructuralFeatures()) {
				// All features from not-selected classes and selected features from selected classes.
				if (!ecoreCodeGenerator.isSelected(eClass) || ecoreCodeGenerator.isSelected(esf)) {
					featureCollector.add(esf);
				}
			}
		}
	}	

}
