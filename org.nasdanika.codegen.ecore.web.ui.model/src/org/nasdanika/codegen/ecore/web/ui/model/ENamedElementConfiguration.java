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
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getSort <em>Sort</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint shall be a YML text which defines a single constraint or a list of constraints. Constraint can be a string or a map containing:
	 * 
	 * * ``condition`` - XPath expression boolean expression.
	 * * ``errorMessageKey`` - Optional error message key. If it is present, error message is retrieved as resource string.
	 * * ``errorMessage`` - Error message to display if the expression evaluates to false. It is used if ``errorMessageKey`` is not defined or if there is no resource string for the key. 
	 * 
	 * If the constraint is a String, then it is treated as ``condition`` XPath expression and error message is constructed as ``Constraint violation: <condition>``. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getENamedElementConfiguration_Constraints()
	 * @model
	 * @generated
	 */
	String getConstraints();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(String value);

	/**
	 * Returns the value of the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath expression to use for sorting of items in tables and lists.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sort</em>' attribute.
	 * @see #setSort(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getENamedElementConfiguration_Sort()
	 * @model
	 * @generated
	 */
	String getSort();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getSort <em>Sort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' attribute.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(String value);

} // ENamedElementConfiguration
