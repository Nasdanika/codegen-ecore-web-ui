/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.codegen.ecore.web.ui.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.EMODEL_ELEMENT_CONFIGURATION: {
				EModelElementConfiguration eModelElementConfiguration = (EModelElementConfiguration)theEObject;
				T result = caseEModelElementConfiguration(eModelElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENAMED_ELEMENT_CONFIGURATION: {
				ENamedElementConfiguration eNamedElementConfiguration = (ENamedElementConfiguration)theEObject;
				T result = caseENamedElementConfiguration(eNamedElementConfiguration);
				if (result == null) result = caseEModelElementConfiguration(eNamedElementConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ECLASS_CONFIGURATION: {
				EClassConfiguration eClassConfiguration = (EClassConfiguration)theEObject;
				T result = caseEClassConfiguration(eClassConfiguration);
				if (result == null) result = caseENamedElementConfiguration(eClassConfiguration);
				if (result == null) result = caseEModelElementConfiguration(eClassConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ESTRUCTURAL_FEATURE_CONFIGURATION: {
				EStructuralFeatureConfiguration eStructuralFeatureConfiguration = (EStructuralFeatureConfiguration)theEObject;
				T result = caseEStructuralFeatureConfiguration(eStructuralFeatureConfiguration);
				if (result == null) result = caseENamedElementConfiguration(eStructuralFeatureConfiguration);
				if (result == null) result = caseEModelElementConfiguration(eStructuralFeatureConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EATTRIBUTE_CONFIGURATION: {
				EAttributeConfiguration eAttributeConfiguration = (EAttributeConfiguration)theEObject;
				T result = caseEAttributeConfiguration(eAttributeConfiguration);
				if (result == null) result = caseEStructuralFeatureConfiguration(eAttributeConfiguration);
				if (result == null) result = caseENamedElementConfiguration(eAttributeConfiguration);
				if (result == null) result = caseEModelElementConfiguration(eAttributeConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.EREFERENCE_CONFIGURATION: {
				EReferenceConfiguration eReferenceConfiguration = (EReferenceConfiguration)theEObject;
				T result = caseEReferenceConfiguration(eReferenceConfiguration);
				if (result == null) result = caseEStructuralFeatureConfiguration(eReferenceConfiguration);
				if (result == null) result = caseENamedElementConfiguration(eReferenceConfiguration);
				if (result == null) result = caseEModelElementConfiguration(eReferenceConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElementConfiguration(EModelElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElementConfiguration(ENamedElementConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClassConfiguration(EClassConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EStructural Feature Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EStructural Feature Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStructuralFeatureConfiguration(EStructuralFeatureConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAttribute Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAttribute Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAttributeConfiguration(EAttributeConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EReference Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EReference Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEReferenceConfiguration(EReferenceConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
