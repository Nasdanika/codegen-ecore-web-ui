/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration;
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

} //EClassConfigurationImpl
