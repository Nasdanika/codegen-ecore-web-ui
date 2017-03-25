/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENamed Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl#getModelElementLabel <em>Model Element Label</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl#getSort <em>Sort</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ENamedElementConfigurationImpl extends EModelElementConfigurationImpl implements ENamedElementConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENamedElementConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelElementLabel() {
		return (String)eGet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElementLabel(String newModelElementLabel) {
		eSet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL, newModelElementLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstraints() {
		return (String)eGet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(String newConstraints) {
		eSet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__CONSTRAINTS, newConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSort() {
		return (String)eGet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__SORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSort(String newSort) {
		eSet(ModelPackage.Literals.ENAMED_ELEMENT_CONFIGURATION__SORT, newSort);
	}
	
	public void toProperties(EModelElement modelElement, String renderAnnotationSource, Properties properties) {
		super.toProperties(modelElement, renderAnnotationSource, properties);
		
		// generateResourceStrings - TODO

		// model element label
		
		// constraints
		
		// sort
		
		
	}
	

} //ENamedElementConfigurationImpl
