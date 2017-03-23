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
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getENamedElementConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface ENamedElementConfiguration extends EModelElementConfiguration {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getENamedElementConfiguration_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // ENamedElementConfiguration
