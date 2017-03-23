/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.nasdanika.codegen.ecore.web.ui.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EClass Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass Configuration</em>'.
	 * @generated
	 */
	EClassConfiguration createEClassConfiguration();

	/**
	 * Returns a new object of class '<em>EAttribute Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute Configuration</em>'.
	 * @generated
	 */
	EAttributeConfiguration createEAttributeConfiguration();

	/**
	 * Returns a new object of class '<em>EReference Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReference Configuration</em>'.
	 * @generated
	 */
	EReferenceConfiguration createEReferenceConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
