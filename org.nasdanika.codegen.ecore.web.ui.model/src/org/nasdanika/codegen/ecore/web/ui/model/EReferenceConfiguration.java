/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getChoicesSelector <em>Choices Selector</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getView <em>View</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getViewFeatures <em>View Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEReferenceConfiguration()
 * @model
 * @generated
 */
public interface EReferenceConfiguration extends EStructuralFeatureConfiguration {

	/**
	 * Returns the value of the '<em><b>Choices Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [JXPath](https://commons.apache.org/proper/commons-jxpath/) selector of choices to assign to the reference.
	 * The path is evaluated with the current object as context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choices Selector</em>' attribute.
	 * @see #setChoicesSelector(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEReferenceConfiguration_ChoicesSelector()
	 * @model
	 * @generated
	 */
	String getChoicesSelector();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getChoicesSelector <em>Choices Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choices Selector</em>' attribute.
	 * @see #getChoicesSelector()
	 * @generated
	 */
	void setChoicesSelector(String value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.ecore.web.ui.model.ReferenceView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference view.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ReferenceView
	 * @see #setView(ReferenceView)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEReferenceConfiguration_View()
	 * @model
	 * @generated
	 */
	ReferenceView getView();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ReferenceView
	 * @see #getView()
	 * @generated
	 */
	void setView(ReferenceView value);

	/**
	 * Returns the value of the '<em><b>View Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One of the following
	 * 
	 * * A space-separated list of feature names.
	 * * A YAML document list of feature names or mappings of feature name to feature configuration definition, which may include:
	 *      * ``visible`` - [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is included in the list.
	 *     * ``align`` - left, center, or right. Defaults to right for numbers, center for dates and booleans and left for other types.
	 *     * ``width`` - if this key maps to a number, then the number is used for all device sizes. Otherwise is shall map to a map of device-size to number mappings.
	 * 
	 * Example:
	 * ```yaml
	 * - name:
	 *      align: right
	 *      width: 5
	 * - age:
	 *     aligh: left
	 *     width:
	 *          xs: 3        
	 *  - ssn
	 * ```
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Features</em>' attribute.
	 * @see #setViewFeatures(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEReferenceConfiguration_ViewFeatures()
	 * @model
	 * @generated
	 */
	String getViewFeatures();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getViewFeatures <em>View Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Features</em>' attribute.
	 * @see #getViewFeatures()
	 * @generated
	 */
	void setViewFeatures(String value);
} // EReferenceConfiguration
