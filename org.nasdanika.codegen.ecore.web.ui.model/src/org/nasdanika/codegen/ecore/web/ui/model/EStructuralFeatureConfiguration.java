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
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getControl <em>Control</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getControlConfiguration <em>Control Configuration</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#isFormInputGroup <em>Form Input Group</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getPlaceholder <em>Placeholder</em>}</li>
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
	 * 
	 * Features with a common prefix are auto-categorized if not explicitly categorized. E.g. features ``databaseUser`` and ``databasePassword`` will be auto-categorized under the category ``Database`` with
	 * labels ``User`` and ``Password`` respectively.
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

	/**
	 * Returns the value of the '<em><b>Control</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.ecore.web.ui.model.ControlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edit form control type for the feature. Defaults to input for attributes and multi-value features and select for references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ControlType
	 * @see #setControl(ControlType)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Control()
	 * @model
	 * @generated
	 */
	ControlType getControl();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getControl <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ControlType
	 * @see #getControl()
	 * @generated
	 */
	void setControl(ControlType value);

	/**
	 * Returns the value of the '<em><b>Control Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * YAML map with keys corresponding to control attribute names, and values being JXPath expressions evaluating to attribute values. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Configuration</em>' attribute.
	 * @see #setControlConfiguration(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_ControlConfiguration()
	 * @model
	 * @generated
	 */
	String getControlConfiguration();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getControlConfiguration <em>Control Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Configuration</em>' attribute.
	 * @see #getControlConfiguration()
	 * @generated
	 */
	void setControlConfiguration(String value);

	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.ecore.web.ui.model.InputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Input type if control is "Input".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.InputType
	 * @see #setInputType(InputType)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_InputType()
	 * @model default="Default"
	 * @generated
	 */
	InputType getInputType();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.InputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(InputType value);

	/**
	 * Returns the value of the '<em><b>Form Input Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set it to true to force rendering of the form control in a {@link FormInputGroup} instead of {@link FormGroup} or
	 * to false to force the opposite. If this annotation is not present then inputs with either icon (rendered on the left) or help icon (rendered on the right) 
	 * are rendered as form input groups.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Form Input Group</em>' attribute.
	 * @see #setFormInputGroup(boolean)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_FormInputGroup()
	 * @model
	 * @generated
	 */
	boolean isFormInputGroup();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#isFormInputGroup <em>Form Input Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Input Group</em>' attribute.
	 * @see #isFormInputGroup()
	 * @generated
	 */
	void setFormInputGroup(boolean value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath expression evaluating to the placeholder value for features. Placeholder value is an implicit application-specific value, different from the 
	 * default value. For example, in hierarchical structures children may implicitly inherit parent feature value, unless it is explicitly set (overridden) in the child.
	 * 
	 * In the absence of feature value (null or blank string for strings) placeholder values are displayed in the view in a small {@link Well}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEStructuralFeatureConfiguration_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);
} // EStructuralFeatureConfiguration
