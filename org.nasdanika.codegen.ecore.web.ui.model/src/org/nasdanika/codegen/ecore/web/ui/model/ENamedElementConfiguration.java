/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENamed Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getModelElementLabel <em>Model Element Label</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getENamedElementConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface ENamedElementConfiguration extends EModelElementConfiguration {
	/**
	 * Returns the value of the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EClass or EStructuralFeature label.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Element Label</em>' attribute.
	 * @see #setModelElementLabel(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getENamedElementConfiguration_ModelElementLabel()
	 * @model
	 * @generated
	 */
	String getModelElementLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getModelElementLabel <em>Model Element Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element Label</em>' attribute.
	 * @see #getModelElementLabel()
	 * @generated
	 */
	void setModelElementLabel(String value);

} // ENamedElementConfiguration
