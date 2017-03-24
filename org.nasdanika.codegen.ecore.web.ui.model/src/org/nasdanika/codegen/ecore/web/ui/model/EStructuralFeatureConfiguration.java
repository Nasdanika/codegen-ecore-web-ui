/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface EStructuralFeatureConfiguration extends ENamedElementConfiguration {

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the feature is visible in the object view.
	 * The value can be one of the following:
	 * 
	 * * Blank string or ``true`` boolean literal - the feature is visible.
	 * * ``false`` boolean literal - the feature is hidden.
	 * * [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is visible.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Visible()
	 * @model
	 * @generated
	 */
	String getVisible();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(String value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the feature is editabe if it is already visible.
	 * The value can be one of the following:
	 * 
	 * * Blank string - the feature is editable if it is not an item (``isItem()`` returns false)
	 * * ``true`` boolean literal - the feature is editable
	 * * ``false`` boolean literal - the feature is not editable.
	 * * [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is editable.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Editable()
	 * @model
	 * @generated
	 */
	String getEditable();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #getEditable()
	 * @generated
	 */
	void setEditable(String value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether an editable feature is disabled, i.e. it shall be displayed in the edit form, but the edit control shall be disabled.
	 * 
	 * * ``false`` boolean literal or empty string - the feature is enabled (default).* ``true`` boolean literal - the feature is disabled.
	 * * [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is disabled.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Disabled()
	 * @model
	 * @generated
	 */
	String getDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #getDisabled()
	 * @generated
	 */
	void setDisabled(String value);

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
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Format is used for rendering and parsing date and number feature values. 
	 * SimpleDateFormat for dates, DecimalFormat for numbers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation
	 * @see #setLocation(FeatureLocation)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Location()
	 * @model
	 * @generated
	 */
	FeatureLocation getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(FeatureLocation value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature category. Categories are displayed as panels in the view and the left panel, and field sets in edit forms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);
} // EStructuralFeatureConfiguration
