/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#isHtml <em>Html</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEAttributeConfiguration()
 * @model
 * @generated
 */
public interface EAttributeConfiguration extends EStructuralFeatureConfiguration {

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Format is used for rendering and parsing date and number feature values. 
	 * SimpleDateFormat for dates, DecimalFormat for numbers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEAttributeConfiguration_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * YAML map of values to labels or list if values and labels are the same. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choices</em>' attribute.
	 * @see #setChoices(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEAttributeConfiguration_Choices()
	 * @model
	 * @generated
	 */
	String getChoices();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getChoices <em>Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choices</em>' attribute.
	 * @see #getChoices()
	 * @generated
	 */
	void setChoices(String value);

	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If control is ``textarea`` and ``html`` is set to ``true`` then the textarea is initialized with [TinyMCE](https://www.tinymce.com) editor. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(boolean)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEAttributeConfiguration_Html()
	 * @model
	 * @generated
	 */
	boolean isHtml();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#isHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #isHtml()
	 * @generated
	 */
	void setHtml(boolean value);
} // EAttributeConfiguration
