/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	 * The operation id for the '<em>To Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = 0;

	/**
	 * The number of operations of the '<em>EModel Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_CONFIGURATION_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION__CONSTRAINTS = EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION__SORT = EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ENamed Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT = EMODEL_ELEMENT_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = EMODEL_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES;

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
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__CONSTRAINTS = ENAMED_ELEMENT_CONFIGURATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__SORT = ENAMED_ELEMENT_CONFIGURATION__SORT;

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
	 * The feature id for the '<em><b>Horizontal Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__HORIZONTAL_FORM = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Novalidate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__NOVALIDATE = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature Items Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Feature Items Container Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER_CONFIGURATION = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EClass Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION_FEATURE_COUNT = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>To Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = ENAMED_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES;

	/**
	 * The number of operations of the '<em>EClass Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_CONFIGURATION_OPERATION_COUNT = ENAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl <em>ETyped Element Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getETypedElementConfiguration()
	 * @generated
	 */
	int ETYPED_ELEMENT_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__ICON = ENAMED_ELEMENT_CONFIGURATION__ICON;

	/**
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS = ENAMED_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS;

	/**
	 * The feature id for the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL = ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__CONSTRAINTS = ENAMED_ELEMENT_CONFIGURATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__SORT = ENAMED_ELEMENT_CONFIGURATION__SORT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__VISIBLE = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__EDITABLE = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__DISABLED = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__LOCATION = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__CATEGORY = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__CONTROL = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Control Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__CONTROL_CONFIGURATION = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__INPUT_TYPE = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Form Input Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__FORM_INPUT_GROUP = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION__PLACEHOLDER = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>ETyped Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION_FEATURE_COUNT = ENAMED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>To Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = ENAMED_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES;

	/**
	 * The number of operations of the '<em>ETyped Element Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_CONFIGURATION_OPERATION_COUNT = ENAMED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl <em>EStructural Feature Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EStructuralFeatureConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEStructuralFeatureConfiguration()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION = 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__ICON = ETYPED_ELEMENT_CONFIGURATION__ICON;

	/**
	 * The feature id for the '<em><b>Generate Resource Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__GENERATE_RESOURCE_STRINGS = ETYPED_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS;

	/**
	 * The feature id for the '<em><b>Model Element Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__MODEL_ELEMENT_LABEL = ETYPED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__CONSTRAINTS = ETYPED_ELEMENT_CONFIGURATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__SORT = ETYPED_ELEMENT_CONFIGURATION__SORT;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE = ETYPED_ELEMENT_CONFIGURATION__VISIBLE;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE = ETYPED_ELEMENT_CONFIGURATION__EDITABLE;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED = ETYPED_ELEMENT_CONFIGURATION__DISABLED;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION = ETYPED_ELEMENT_CONFIGURATION__LOCATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY = ETYPED_ELEMENT_CONFIGURATION__CATEGORY;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL = ETYPED_ELEMENT_CONFIGURATION__CONTROL;

	/**
	 * The feature id for the '<em><b>Control Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL_CONFIGURATION = ETYPED_ELEMENT_CONFIGURATION__CONTROL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__INPUT_TYPE = ETYPED_ELEMENT_CONFIGURATION__INPUT_TYPE;

	/**
	 * The feature id for the '<em><b>Form Input Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__FORM_INPUT_GROUP = ETYPED_ELEMENT_CONFIGURATION__FORM_INPUT_GROUP;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION__PLACEHOLDER = ETYPED_ELEMENT_CONFIGURATION__PLACEHOLDER;

	/**
	 * The number of structural features of the '<em>EStructural Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT = ETYPED_ELEMENT_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = ETYPED_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES;

	/**
	 * The number of operations of the '<em>EStructural Feature Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT = ETYPED_ELEMENT_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl <em>EAttribute Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEAttributeConfiguration()
	 * @generated
	 */
	int EATTRIBUTE_CONFIGURATION = 5;

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
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__CONSTRAINTS = ESTRUCTURAL_FEATURE_CONFIGURATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__SORT = ESTRUCTURAL_FEATURE_CONFIGURATION__SORT;

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
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__CONTROL = ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL;

	/**
	 * The feature id for the '<em><b>Control Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__CONTROL_CONFIGURATION = ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__INPUT_TYPE = ESTRUCTURAL_FEATURE_CONFIGURATION__INPUT_TYPE;

	/**
	 * The feature id for the '<em><b>Form Input Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__FORM_INPUT_GROUP = ESTRUCTURAL_FEATURE_CONFIGURATION__FORM_INPUT_GROUP;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__PLACEHOLDER = ESTRUCTURAL_FEATURE_CONFIGURATION__PLACEHOLDER;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__FORMAT = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__CHOICES = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION__HTML = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EAttribute Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION_FEATURE_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = ESTRUCTURAL_FEATURE_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES;

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
	int EREFERENCE_CONFIGURATION = 6;

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
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__CONSTRAINTS = ESTRUCTURAL_FEATURE_CONFIGURATION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__SORT = ESTRUCTURAL_FEATURE_CONFIGURATION__SORT;

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
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__CONTROL = ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL;

	/**
	 * The feature id for the '<em><b>Control Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__CONTROL_CONFIGURATION = ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL_CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__INPUT_TYPE = ESTRUCTURAL_FEATURE_CONFIGURATION__INPUT_TYPE;

	/**
	 * The feature id for the '<em><b>Form Input Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__FORM_INPUT_GROUP = ESTRUCTURAL_FEATURE_CONFIGURATION__FORM_INPUT_GROUP;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__PLACEHOLDER = ESTRUCTURAL_FEATURE_CONFIGURATION__PLACEHOLDER;

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
	 * The feature id for the '<em><b>Element Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__ELEMENT_TYPES = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION__TYPE_COLUMN = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EReference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION_FEATURE_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>To Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = ESTRUCTURAL_FEATURE_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES;

	/**
	 * The number of operations of the '<em>EReference Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_CONFIGURATION_OPERATION_COUNT = ESTRUCTURAL_FEATURE_CONFIGURATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EPackageConfigurationImpl <em>EPackage Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EPackageConfigurationImpl
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEPackageConfiguration()
	 * @generated
	 */
	int EPACKAGE_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>Render Annotation Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_CONFIGURATION__RENDER_ANNOTATION_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Route Base Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_CONFIGURATION__ROUTE_BASE_EXTENDS = 1;

	/**
	 * The feature id for the '<em><b>Renderer Base Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_CONFIGURATION__RENDERER_BASE_EXTENDS = 2;

	/**
	 * The number of structural features of the '<em>EPackage Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>EPackage Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.TypedElementLocation <em>Typed Element Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.TypedElementLocation
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getTypedElementLocation()
	 * @generated
	 */
	int TYPED_ELEMENT_LOCATION = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.ReferenceView <em>Reference View</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ReferenceView
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getReferenceView()
	 * @generated
	 */
	int REFERENCE_VIEW = 9;


	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.ControlType <em>Control Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ControlType
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.InputType <em>Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.InputType
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 11;


	/**
	 * The meta object id for the '{@link org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer <em>Feature Items Container</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getFeatureItemsContainer()
	 * @generated
	 */
	int FEATURE_ITEMS_CONTAINER = 12;


	/**
	 * The meta object id for the '<em>Properties</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Properties
	 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 13;


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
	 * Returns the meta object for the '{@link org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#toProperties(org.eclipse.emf.ecore.EModelElement, java.lang.String, java.util.Properties) <em>To Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Properties</em>' operation.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration#toProperties(org.eclipse.emf.ecore.EModelElement, java.lang.String, java.util.Properties)
	 * @generated
	 */
	EOperation getEModelElementConfiguration__ToProperties__EModelElement_String_Properties();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getConstraints()
	 * @see #getENamedElementConfiguration()
	 * @generated
	 */
	EAttribute getENamedElementConfiguration_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration#getSort()
	 * @see #getENamedElementConfiguration()
	 * @generated
	 */
	EAttribute getENamedElementConfiguration_Sort();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isViewItem <em>View Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Item</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isViewItem()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_ViewItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isHorizontalForm <em>Horizontal Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Form</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isHorizontalForm()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_HorizontalForm();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isNovalidate <em>Novalidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Novalidate</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#isNovalidate()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_Novalidate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainer <em>Feature Items Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Items Container</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainer()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_FeatureItemsContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainerConfiguration <em>Feature Items Container Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Items Container Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration#getFeatureItemsContainerConfiguration()
	 * @see #getEClassConfiguration()
	 * @generated
	 */
	EAttribute getEClassConfiguration_FeatureItemsContainerConfiguration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration <em>ETyped Element Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETyped Element Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration
	 * @generated
	 */
	EClass getETypedElementConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getVisible()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_Visible();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getEditable()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_Editable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getDisabled()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getLocation()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getCategory()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getControl()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_Control();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getControlConfiguration <em>Control Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getControlConfiguration()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_ControlConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getInputType()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_InputType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#isFormInputGroup <em>Form Input Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Form Input Group</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#isFormInputGroup()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_FormInputGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration#getPlaceholder()
	 * @see #getETypedElementConfiguration()
	 * @generated
	 */
	EAttribute getETypedElementConfiguration_Placeholder();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getFormat()
	 * @see #getEAttributeConfiguration()
	 * @generated
	 */
	EAttribute getEAttributeConfiguration_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choices</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#getChoices()
	 * @see #getEAttributeConfiguration()
	 * @generated
	 */
	EAttribute getEAttributeConfiguration_Choices();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#isHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration#isHtml()
	 * @see #getEAttributeConfiguration()
	 * @generated
	 */
	EAttribute getEAttributeConfiguration_Html();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getElementTypes <em>Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Types</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getElementTypes()
	 * @see #getEReferenceConfiguration()
	 * @generated
	 */
	EAttribute getEReferenceConfiguration_ElementTypes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getTypeColumn <em>Type Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Column</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration#getTypeColumn()
	 * @see #getEReferenceConfiguration()
	 * @generated
	 */
	EAttribute getEReferenceConfiguration_TypeColumn();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration <em>EPackage Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage Configuration</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration
	 * @generated
	 */
	EClass getEPackageConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRenderAnnotationSource <em>Render Annotation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Render Annotation Source</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRenderAnnotationSource()
	 * @see #getEPackageConfiguration()
	 * @generated
	 */
	EAttribute getEPackageConfiguration_RenderAnnotationSource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRendererBaseExtends <em>Renderer Base Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renderer Base Extends</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRendererBaseExtends()
	 * @see #getEPackageConfiguration()
	 * @generated
	 */
	EAttribute getEPackageConfiguration_RendererBaseExtends();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.ecore.web.ui.model.TypedElementLocation <em>Typed Element Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Typed Element Location</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.TypedElementLocation
	 * @generated
	 */
	EEnum getTypedElementLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRouteBaseExtends <em>Route Base Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route Base Extends</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRouteBaseExtends()
	 * @see #getEPackageConfiguration()
	 * @generated
	 */
	EAttribute getEPackageConfiguration_RouteBaseExtends();

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
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.ecore.web.ui.model.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ControlType
	 * @generated
	 */
	EEnum getControlType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.ecore.web.ui.model.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Type</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.InputType
	 * @generated
	 */
	EEnum getInputType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer <em>Feature Items Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feature Items Container</em>'.
	 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer
	 * @generated
	 */
	EEnum getFeatureItemsContainer();

	/**
	 * Returns the meta object for data type '{@link java.util.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Properties</em>'.
	 * @see java.util.Properties
	 * @model instanceClass="java.util.Properties"
	 * @generated
	 */
	EDataType getProperties();

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
		 * The meta object literal for the '<em><b>To Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMODEL_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES = eINSTANCE.getEModelElementConfiguration__ToProperties__EModelElement_String_Properties();

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
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT_CONFIGURATION__CONSTRAINTS = eINSTANCE.getENamedElementConfiguration_Constraints();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT_CONFIGURATION__SORT = eINSTANCE.getENamedElementConfiguration_Sort();

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
		 * The meta object literal for the '<em><b>Horizontal Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_CONFIGURATION__HORIZONTAL_FORM = eINSTANCE.getEClassConfiguration_HorizontalForm();

		/**
		 * The meta object literal for the '<em><b>Novalidate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_CONFIGURATION__NOVALIDATE = eINSTANCE.getEClassConfiguration_Novalidate();

		/**
		 * The meta object literal for the '<em><b>Feature Items Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER = eINSTANCE.getEClassConfiguration_FeatureItemsContainer();

		/**
		 * The meta object literal for the '<em><b>Feature Items Container Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER_CONFIGURATION = eINSTANCE.getEClassConfiguration_FeatureItemsContainerConfiguration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl <em>ETyped Element Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getETypedElementConfiguration()
		 * @generated
		 */
		EClass ETYPED_ELEMENT_CONFIGURATION = eINSTANCE.getETypedElementConfiguration();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__VISIBLE = eINSTANCE.getETypedElementConfiguration_Visible();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__EDITABLE = eINSTANCE.getETypedElementConfiguration_Editable();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__DISABLED = eINSTANCE.getETypedElementConfiguration_Disabled();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__LOCATION = eINSTANCE.getETypedElementConfiguration_Location();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__CATEGORY = eINSTANCE.getETypedElementConfiguration_Category();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__CONTROL = eINSTANCE.getETypedElementConfiguration_Control();

		/**
		 * The meta object literal for the '<em><b>Control Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__CONTROL_CONFIGURATION = eINSTANCE.getETypedElementConfiguration_ControlConfiguration();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__INPUT_TYPE = eINSTANCE.getETypedElementConfiguration_InputType();

		/**
		 * The meta object literal for the '<em><b>Form Input Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__FORM_INPUT_GROUP = eINSTANCE.getETypedElementConfiguration_FormInputGroup();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT_CONFIGURATION__PLACEHOLDER = eINSTANCE.getETypedElementConfiguration_Placeholder();

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
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE_CONFIGURATION__FORMAT = eINSTANCE.getEAttributeConfiguration_Format();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE_CONFIGURATION__CHOICES = eINSTANCE.getEAttributeConfiguration_Choices();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE_CONFIGURATION__HTML = eINSTANCE.getEAttributeConfiguration_Html();

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
		 * The meta object literal for the '<em><b>Element Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE_CONFIGURATION__ELEMENT_TYPES = eINSTANCE.getEReferenceConfiguration_ElementTypes();

		/**
		 * The meta object literal for the '<em><b>Type Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE_CONFIGURATION__TYPE_COLUMN = eINSTANCE.getEReferenceConfiguration_TypeColumn();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EPackageConfigurationImpl <em>EPackage Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.EPackageConfigurationImpl
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getEPackageConfiguration()
		 * @generated
		 */
		EClass EPACKAGE_CONFIGURATION = eINSTANCE.getEPackageConfiguration();

		/**
		 * The meta object literal for the '<em><b>Render Annotation Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE_CONFIGURATION__RENDER_ANNOTATION_SOURCE = eINSTANCE.getEPackageConfiguration_RenderAnnotationSource();

		/**
		 * The meta object literal for the '<em><b>Renderer Base Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE_CONFIGURATION__RENDERER_BASE_EXTENDS = eINSTANCE.getEPackageConfiguration_RendererBaseExtends();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.TypedElementLocation <em>Typed Element Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.TypedElementLocation
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getTypedElementLocation()
		 * @generated
		 */
		EEnum TYPED_ELEMENT_LOCATION = eINSTANCE.getTypedElementLocation();

		/**
		 * The meta object literal for the '<em><b>Route Base Extends</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE_CONFIGURATION__ROUTE_BASE_EXTENDS = eINSTANCE.getEPackageConfiguration_RouteBaseExtends();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.ReferenceView <em>Reference View</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.ReferenceView
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getReferenceView()
		 * @generated
		 */
		EEnum REFERENCE_VIEW = eINSTANCE.getReferenceView();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.ControlType <em>Control Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.ControlType
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getControlType()
		 * @generated
		 */
		EEnum CONTROL_TYPE = eINSTANCE.getControlType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.InputType <em>Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.InputType
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getInputType()
		 * @generated
		 */
		EEnum INPUT_TYPE = eINSTANCE.getInputType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer <em>Feature Items Container</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getFeatureItemsContainer()
		 * @generated
		 */
		EEnum FEATURE_ITEMS_CONTAINER = eINSTANCE.getFeatureItemsContainer();

		/**
		 * The meta object literal for the '<em>Properties</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Properties
		 * @see org.nasdanika.codegen.ecore.web.ui.model.impl.ModelPackageImpl#getProperties()
		 * @generated
		 */
		EDataType PROPERTIES = eINSTANCE.getProperties();

	}

} //ModelPackage
