/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.Constraint#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.Constraint#getErrorMessage <em>Error Message</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.Constraint#getErrorMessageKey <em>Error Message Key</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getConstraint()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Constraint extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getConstraint_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.Constraint#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getConstraint_ErrorMessage()
	 * @model
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.Constraint#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

	/**
	 * Returns the value of the '<em><b>Error Message Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message Key</em>' attribute.
	 * @see #setErrorMessageKey(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getConstraint_ErrorMessageKey()
	 * @model
	 * @generated
	 */
	String getErrorMessageKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.Constraint#getErrorMessageKey <em>Error Message Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message Key</em>' attribute.
	 * @see #getErrorMessageKey()
	 * @generated
	 */
	void setErrorMessageKey(String value);

} // Constraint
