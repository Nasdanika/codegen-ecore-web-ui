/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;
import org.nasdanika.codegen.ecore.web.ui.model.ReferenceView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EReference Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl#getChoicesSelector <em>Choices Selector</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl#getView <em>View</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl#getViewFeatures <em>View Features</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl#getElementTypes <em>Element Types</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl#getTypeColumn <em>Type Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EReferenceConfigurationImpl extends EStructuralFeatureConfigurationImpl implements EReferenceConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EReferenceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EREFERENCE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoicesSelector() {
		return (String)eGet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__CHOICES_SELECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoicesSelector(String newChoicesSelector) {
		eSet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__CHOICES_SELECTOR, newChoicesSelector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceView getView() {
		return (ReferenceView)eGet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__VIEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(ReferenceView newView) {
		eSet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__VIEW, newView);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewFeatures() {
		return (String)eGet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__VIEW_FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewFeatures(String newViewFeatures) {
		eSet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__VIEW_FEATURES, newViewFeatures);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementTypes() {
		return (String)eGet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__ELEMENT_TYPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementTypes(String newElementTypes) {
		eSet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__ELEMENT_TYPES, newElementTypes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeColumn() {
		return (String)eGet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__TYPE_COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeColumn(String newTypeColumn) {
		eSet(ModelPackage.Literals.EREFERENCE_CONFIGURATION__TYPE_COLUMN, newTypeColumn);
	}

} //EReferenceConfigurationImpl
