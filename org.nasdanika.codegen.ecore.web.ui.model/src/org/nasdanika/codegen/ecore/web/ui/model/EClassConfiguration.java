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
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getViewItem <em>View Item</em>}</li>
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
	 * @see #setViewItem(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEClassConfiguration_ViewItem()
	 * @model
	 * @generated
	 */
	String getViewItem();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getViewItem <em>View Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Item</em>' attribute.
	 * @see #getViewItem()
	 * @generated
	 */
	void setViewItem(String value);
} // EClassConfiguration
