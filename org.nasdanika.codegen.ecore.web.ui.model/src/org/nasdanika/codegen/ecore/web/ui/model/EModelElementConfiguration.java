/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EModel Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEModelElementConfiguration()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface EModelElementConfiguration extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEModelElementConfiguration_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

} // EModelElementConfiguration
