/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStructural Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EStructuralFeatureConfigurationImpl extends ENamedElementConfigurationImpl implements EStructuralFeatureConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeatureConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisible() {
		return (String)eGet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(String newVisible) {
		eSet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE, newVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditable() {
		return (String)eGet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(String newEditable) {
		eSet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE, newEditable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisabled() {
		return (String)eGet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(String newDisabled) {
		eSet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return (String)eGet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		eSet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureLocation getLocation() {
		return (FeatureLocation)eGet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(FeatureLocation newLocation) {
		eSet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return (String)eGet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		eSet(ModelPackage.Literals.ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY, newCategory);
	}

} //EStructuralFeatureConfigurationImpl
