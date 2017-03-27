/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isDispatchFeatures <em>Dispatch Features</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isViewItem <em>View Item</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isHorizontalForm <em>Horizontal Form</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isNovalidate <em>Novalidate</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainer <em>Feature Items Container</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainerConfiguration <em>Feature Items Container Configuration</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration()
 * @model
 * @generated
 */
public interface EClassConfiguration extends ENamedElementConfiguration {

	/**
	 * Returns the value of the '<em><b>Dispatch Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true, the generator generates render``feature name``FeatureXXX(C,T,EStructuralFeature,...) and overrides renderFeatureXXX(C,T,EStructuralFeature,...)
	 * to dispatch invocations to feature-specific methods. This does not alter the default renderer behavior, but makes the variability points explicit and easier to customize.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispatch Features</em>' attribute.
	 * @see #setDispatchFeatures(boolean)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_DispatchFeatures()
	 * @model
	 * @generated
	 */
	boolean isDispatchFeatures();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isDispatchFeatures <em>Dispatch Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatch Features</em>' attribute.
	 * @see #isDispatchFeatures()
	 * @generated
	 */
	void setDispatchFeatures(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A pattern which is interpolated to generate object label.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>View Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set this to ``true`` to have the class view rendered in the item container. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View Item</em>' attribute.
	 * @see #setViewItem(boolean)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_ViewItem()
	 * @model
	 * @generated
	 */
	boolean isViewItem();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isViewItem <em>View Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Item</em>' attribute.
	 * @see #isViewItem()
	 * @generated
	 */
	void setViewItem(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Form</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  By default EClass edit forms are rendered as horizontal forms. Set this to ``false`` to change the default rendering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Form</em>' attribute.
	 * @see #setHorizontalForm(boolean)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_HorizontalForm()
	 * @model default="true"
	 * @generated
	 */
	boolean isHorizontalForm();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isHorizontalForm <em>Horizontal Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Form</em>' attribute.
	 * @see #isHorizontalForm()
	 * @generated
	 */
	void setHorizontalForm(boolean value);

	/**
	 * Returns the value of the '<em><b>Novalidate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true to disable HTML 5 form validation, e.g. if you have a required
	 * text area with TinyMCE editor in Chrome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Novalidate</em>' attribute.
	 * @see #setNovalidate(boolean)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_Novalidate()
	 * @model default="false"
	 * @generated
	 */
	boolean isNovalidate();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isNovalidate <em>Novalidate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Novalidate</em>' attribute.
	 * @see #isNovalidate()
	 * @generated
	 */
	void setNovalidate(boolean value);

	/**
	 * Returns the value of the '<em><b>Feature Items Container</b></em>' attribute.
	 * The default value is <code>"Tabs"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature items container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Items Container</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer
	 * @see #setFeatureItemsContainer(FeatureItemsContainer)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_FeatureItemsContainer()
	 * @model default="Tabs"
	 * @generated
	 */
	FeatureItemsContainer getFeatureItemsContainer();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainer <em>Feature Items Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Items Container</em>' attribute.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer
	 * @see #getFeatureItemsContainer()
	 * @generated
	 */
	void setFeatureItemsContainer(FeatureItemsContainer value);

	/**
	 * Returns the value of the '<em><b>Feature Items Container Configuration</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feature items container configuration.
	 * 
	 * For accordion:
	 * 
	 * * style: Bootstrap style, e.g. PRIMARY
	 * 
	 * For pills:
	 * 
	 * * stacked: true or false
	 * * justified: true or false
	 * * width: 1 - 11
	 * 
	 * For tabs:
	 * 
	 * * justified: true or false
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Items Container Configuration</em>' attribute.
	 * @see #setFeatureItemsContainerConfiguration(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_FeatureItemsContainerConfiguration()
	 * @model default=""
	 * @generated
	 */
	String getFeatureItemsContainerConfiguration();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainerConfiguration <em>Feature Items Container Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Items Container Configuration</em>' attribute.
	 * @see #getFeatureItemsContainerConfiguration()
	 * @generated
	 */
	void setFeatureItemsContainerConfiguration(String value);
} // EClassConfiguration
