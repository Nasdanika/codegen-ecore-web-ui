/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.codegen.ecore.web.ui.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.codegen.ecore.web.ui.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EModelElementConfigurationImpl <em>EModel Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EModelElementConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEModelElementConfiguration()
	 * @generated
	 */
	int EMODEL_ELEMENT_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_CONFIGURATION__ICON = 0;

	/**
	 * The number of structural features of the '<em>EModel Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EModel Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl <em>ENamed Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getENamedElementConfiguration()
	 * @generated
	 */
	int ENAMED_ELEMENT_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION__ICON = EMODEL_ELEMENT_CONFIGURATION__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION__LABEL = EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENamed Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT = EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ENamed Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT = EMODEL_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl <em>EClass Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEClassConfiguration()
	 * @generated
	 */
	int ECLASS_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__ICON = ENAMED_ELEMENT_CONFIGURATION__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__LABEL = ENAMED_ELEMENT_CONFIGURATION__LABEL;

	/**
	 * The number of structural features of the '<em>EClass Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION_FEATURE_COUNT = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EClass Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION_OPERATION_COUNT = ENAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl <em>EStructural Feature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEStructuralFeatureConfiguration()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__ICON = ENAMED_ELEMENT_CONFIGURATION__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__LABEL = ENAMED_ELEMENT_CONFIGURATION__LABEL;

	/**
	 * The number of structural features of the '<em>EStructural Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EStructural Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT = ENAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl <em>EAttribute Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEAttributeConfiguration()
	 * @generated
	 */
	int EATTRIBUTE_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__ICON = ESTRUCTURAL_FEATURE_CONFIGURATION__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__LABEL = ESTRUCTURAL_FEATURE_CONFIGURATION__LABEL;

	/**
	 * The number of structural features of the '<em>EAttribute Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION_FEATURE_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EAttribute Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION_OPERATION_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl <em>EReference Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEReferenceConfiguration()
	 * @generated
	 */
	int EREFERENCE_CONFIGURATION = 5;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__ICON = ESTRUCTURAL_FEATURE_CONFIGURATION__ICON;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__LABEL = ESTRUCTURAL_FEATURE_CONFIGURATION__LABEL;

	/**
	 * The number of structural features of the '<em>EReference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION_FEATURE_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EReference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION_OPERATION_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration <em>EModel Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EModel Element Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration
	 * @generated
	 */
	EClass getEModelElementConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#getIcon()
	 * @see #getEModelElementConfiguration()
	 * @generated
	 */
	EAttribute getEModelElementConfiguration_Icon();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration <em>ENamed Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENamed Element Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration
	 * @generated
	 */
	EClass getENamedElementConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getLabel()
	 * @see #getENamedElementConfiguration()
	 * @generated
	 */
	EAttribute getENamedElementConfiguration_Label();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration <em>EClass Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration
	 * @generated
	 */
	EClass getEClassConfiguration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration <em>EStructural Feature Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration
	 * @generated
	 */
	EClass getEStructuralFeatureConfiguration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration <em>EAttribute Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration
	 * @generated
	 */
	EClass getEAttributeConfiguration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration <em>EReference Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration
	 * @generated
	 */
	EClass getEReferenceConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EModelElementConfigurationImpl <em>EModel Element Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EModelElementConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEModelElementConfiguration()
		 * @generated
		 */
		EClass EMODEL_ELEMENT_CONFIGURATION = eINSTANCE.getEModelElementConfiguration();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMODEL_ELEMENT_CONFIGURATION__ICON = eINSTANCE.getEModelElementConfiguration_Icon();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl <em>ENamed Element Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ENamedElementConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getENamedElementConfiguration()
		 * @generated
		 */
		EClass ENAMED_ELEMENT_CONFIGURATION = eINSTANCE.getENamedElementConfiguration();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT_CONFIGURATION__LABEL = eINSTANCE.getENamedElementConfiguration_Label();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl <em>EClass Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EClassConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEClassConfiguration()
		 * @generated
		 */
		EClass ECLASS_CONFIGURATION = eINSTANCE.getEClassConfiguration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl <em>EStructural Feature Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEStructuralFeatureConfiguration()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE_CONFIGURATION = eINSTANCE.getEStructuralFeatureConfiguration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl <em>EAttribute Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEAttributeConfiguration()
		 * @generated
		 */
		EClass EATTRIBUTE_CONFIGURATION = eINSTANCE.getEAttributeConfiguration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl <em>EReference Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EReferenceConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEReferenceConfiguration()
		 * @generated
		 */
		EClass EREFERENCE_CONFIGURATION = eINSTANCE.getEReferenceConfiguration();

	}

} //ModelPackage
