/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS = 1;

	/**
	 * The number of structural features of the '<em>EModel Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS = EMODEL_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS;

	/**
	 * The feature id for the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL = EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__GENERATE_RESOURCE_STRINGS = ENAMED_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS;

	/**
	 * The feature id for the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__MODEL_ELEMENT_LABEL = ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL;

	/**
	 * The feature id for the '<em><b>Dispatch Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__DISPATCH_FEATURES = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__LABEL = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__VIEW_ITEM = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EClass Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION_FEATURE_COUNT = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__GENERATE_RESOURCE_STRINGS = ENAMED_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS;

	/**
	 * The feature id for the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__MODEL_ELEMENT_LABEL = ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__FORMAT = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EStructural Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__GENERATE_RESOURCE_STRINGS = ESTRUCTURAL_FEATURE_CONFIGURATION__GENERATE_RESOURCE_STRINGS;

	/**
	 * The feature id for the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__MODEL_ELEMENT_LABEL = ESTRUCTURAL_FEATURE_CONFIGURATION__MODEL_ELEMENT_LABEL;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__VISIBLE = ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__EDITABLE = ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__DISABLED = ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__FORMAT = ESTRUCTURAL_FEATURE_CONFIGURATION__FORMAT;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__LOCATION = ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__CATEGORY = ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY;

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
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__GENERATE_RESOURCE_STRINGS = ESTRUCTURAL_FEATURE_CONFIGURATION__GENERATE_RESOURCE_STRINGS;

	/**
	 * The feature id for the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__MODEL_ELEMENT_LABEL = ESTRUCTURAL_FEATURE_CONFIGURATION__MODEL_ELEMENT_LABEL;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__VISIBLE = ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__EDITABLE = ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__DISABLED = ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__FORMAT = ESTRUCTURAL_FEATURE_CONFIGURATION__FORMAT;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__LOCATION = ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__CATEGORY = ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Choices Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__CHOICES_SELECTOR = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__VIEW = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__VIEW_FEATURES = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EReference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION_FEATURE_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EReference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION_OPERATION_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation <em>Feature Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getFeatureLocation()
	 * @generated
	 */
	int FEATURE_LOCATION = 6;


	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.ReferenceView <em>Reference View</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ReferenceView
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getReferenceView()
	 * @generated
	 */
	int REFERENCE_VIEW = 7;


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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#isGenerateResourceStrings <em>Generate Resource Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Resource Strings</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#isGenerateResourceStrings()
	 * @see #getEModelElementConfiguration()
	 * @generated
	 */
	EAttribute getEModelElementConfiguration_GenerateResourceStrings();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getModelElementLabel <em>Model Element Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Element Label</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getModelElementLabel()
	 * @see #getENamedElementConfiguration()
	 * @generated
	 */
	EAttribute getENamedElementConfiguration_ModelElementLabel();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isDispatchFeatures <em>Dispatch Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dispatch Features</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isDispatchFeatures()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_DispatchFeatures();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getLabel()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getViewItem <em>View Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Item</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getViewItem()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_ViewItem();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getVisible()
	 * @see #getEStructuralFeatureConfiguration()
	 * @generated
	 */
	EAttribute getEStructuralFeatureConfiguration_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getEditable()
	 * @see #getEStructuralFeatureConfiguration()
	 * @generated
	 */
	EAttribute getEStructuralFeatureConfiguration_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getDisabled()
	 * @see #getEStructuralFeatureConfiguration()
	 * @generated
	 */
	EAttribute getEStructuralFeatureConfiguration_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getFormat()
	 * @see #getEStructuralFeatureConfiguration()
	 * @generated
	 */
	EAttribute getEStructuralFeatureConfiguration_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getLocation()
	 * @see #getEStructuralFeatureConfiguration()
	 * @generated
	 */
	EAttribute getEStructuralFeatureConfiguration_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration#getCategory()
	 * @see #getEStructuralFeatureConfiguration()
	 * @generated
	 */
	EAttribute getEStructuralFeatureConfiguration_Category();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getChoicesSelector <em>Choices Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choices Selector</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getChoicesSelector()
	 * @see #getEReferenceConfiguration()
	 * @generated
	 */
	EAttribute getEReferenceConfiguration_ChoicesSelector();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getView()
	 * @see #getEReferenceConfiguration()
	 * @generated
	 */
	EAttribute getEReferenceConfiguration_View();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getViewFeatures <em>View Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Features</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getViewFeatures()
	 * @see #getEReferenceConfiguration()
	 * @generated
	 */
	EAttribute getEReferenceConfiguration_ViewFeatures();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation <em>Feature Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Location</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation
	 * @generated
	 */
	EEnum getFeatureLocation();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.ecore.web.ui.model.ReferenceView <em>Reference View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference View</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ReferenceView
	 * @generated
	 */
	EEnum getReferenceView();

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
		 * The meta object literal for the '<em><b>Generate Resource Strings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMODEL_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS = eINSTANCE.getEModelElementConfiguration_GenerateResourceStrings();

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
		 * The meta object literal for the '<em><b>Model Element Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL = eINSTANCE.getENamedElementConfiguration_ModelElementLabel();

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
		 * The meta object literal for the '<em><b>Dispatch Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_CONFIGURATION__DISPATCH_FEATURES = eINSTANCE.getEClassConfiguration_DispatchFeatures();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_CONFIGURATION__LABEL = eINSTANCE.getEClassConfiguration_Label();

		/**
		 * The meta object literal for the '<em><b>View Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_CONFIGURATION__VIEW_ITEM = eINSTANCE.getEClassConfiguration_ViewItem();

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
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE = eINSTANCE.getEStructuralFeatureConfiguration_Visible();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE = eINSTANCE.getEStructuralFeatureConfiguration_Editable();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED = eINSTANCE.getEStructuralFeatureConfiguration_Disabled();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE_CONFIGURATION__FORMAT = eINSTANCE.getEStructuralFeatureConfiguration_Format();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION = eINSTANCE.getEStructuralFeatureConfiguration_Location();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY = eINSTANCE.getEStructuralFeatureConfiguration_Category();

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

		/**
		 * The meta object literal for the '<em><b>Choices Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE_CONFIGURATION__CHOICES_SELECTOR = eINSTANCE.getEReferenceConfiguration_ChoicesSelector();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE_CONFIGURATION__VIEW = eINSTANCE.getEReferenceConfiguration_View();

		/**
		 * The meta object literal for the '<em><b>View Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE_CONFIGURATION__VIEW_FEATURES = eINSTANCE.getEReferenceConfiguration_ViewFeatures();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation <em>Feature Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getFeatureLocation()
		 * @generated
		 */
		EEnum FEATURE_LOCATION = eINSTANCE.getFeatureLocation();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.ReferenceView <em>Reference View</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.ReferenceView
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getReferenceView()
		 * @generated
		 */
		EEnum REFERENCE_VIEW = eINSTANCE.getReferenceView();

	}

} //ModelPackage
