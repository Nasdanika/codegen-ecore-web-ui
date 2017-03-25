/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import java.util.Properties;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EModelElement;

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
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#isGenerateResourceStrings <em>Generate Resource Strings</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Icon for a model element such as EClass or EStructuralFeature.
	 * If icon contains ``/`` it is treated as URL, otherwise it is treated as css class, e.g. Bootstrap's ``glyphicon glyphicon-close``.
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true, the generator generates resource strings in resource bundles 
	 * properties files. Resource strings are generated from model annotations and
	 * using default values if annotations are not present. 
	 * 
	 * Generation of resource strings simplifies localization. It does not alter the application
	 * behavior for default locale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generate Resource Strings</em>' attribute.
	 * @see #setGenerateResourceStrings(boolean)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEModelElementConfiguration_GenerateResourceStrings()
	 * @model
	 * @generated
	 */
	boolean isGenerateResourceStrings();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#isGenerateResourceStrings <em>Generate Resource Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Resource Strings</em>' attribute.
	 * @see #isGenerateResourceStrings()
	 * @generated
	 */
	void setGenerateResourceStrings(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model propertiesDataType="org.nasdanika.codegen.ecore.web.ui.model.Properties"
	 * @generated
	 */
	void toProperties(EModelElement modelElement, String renderAnnotationSource, Properties properties);

} // EModelElementConfiguration
