/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl#isDispatchFeatures <em>Dispatch Features</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl#getViewItem <em>View Item</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl#isHorizontalForm <em>Horizontal Form</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl#getFeatureItemsContainer <em>Feature Items Container</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl#getFeatureItemsContainerConfiguration <em>Feature Items Container Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassConfigurationImpl extends ENamedElementConfigurationImpl implements EClassConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ECLASS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDispatchFeatures() {
		return (Boolean)eGet(ModelPackage.Literals.ECLASS_CONFIGURATION__DISPATCH_FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatchFeatures(boolean newDispatchFeatures) {
		eSet(ModelPackage.Literals.ECLASS_CONFIGURATION__DISPATCH_FEATURES, newDispatchFeatures);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(ModelPackage.Literals.ECLASS_CONFIGURATION__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(ModelPackage.Literals.ECLASS_CONFIGURATION__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewItem() {
		return (String)eGet(ModelPackage.Literals.ECLASS_CONFIGURATION__VIEW_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewItem(String newViewItem) {
		eSet(ModelPackage.Literals.ECLASS_CONFIGURATION__VIEW_ITEM, newViewItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizontalForm() {
		return (Boolean)eGet(ModelPackage.Literals.ECLASS_CONFIGURATION__HORIZONTAL_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalForm(boolean newHorizontalForm) {
		eSet(ModelPackage.Literals.ECLASS_CONFIGURATION__HORIZONTAL_FORM, newHorizontalForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemsContainer getFeatureItemsContainer() {
		return (FeatureItemsContainer)eGet(ModelPackage.Literals.ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureItemsContainer(FeatureItemsContainer newFeatureItemsContainer) {
		eSet(ModelPackage.Literals.ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER, newFeatureItemsContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureItemsContainerConfiguration() {
		return (String)eGet(ModelPackage.Literals.ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureItemsContainerConfiguration(String newFeatureItemsContainerConfiguration) {
		eSet(ModelPackage.Literals.ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER_CONFIGURATION, newFeatureItemsContainerConfiguration);
	}
	
	@Override
	public void toProperties(EModelElement modelElement, String renderAnnotationSource, Properties properties) {
		super.toProperties(modelElement, renderAnnotationSource, properties);
		
		// generateResourceStrings - TODO
		
		// label
		
		// viewItem
		
		// horizontalForm
		
		// featureItemsContainer & featureItemsContainerConfiguration 

	}

} //EClassConfigurationImpl
