/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENamed Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ENamedElementConfigurationImpl extends EModelElementConfigurationImpl implements ENamedElementConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENamedElementConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__LABEL, newLabel);
	}

} //ENamedElementConfigurationImpl
