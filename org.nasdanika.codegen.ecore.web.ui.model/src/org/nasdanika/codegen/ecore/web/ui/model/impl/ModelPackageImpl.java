/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import java.util.Properties;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.codegen.ecore.web.ui.model.ControlType;
import org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.FeatureItemsContainer;
import org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation;
import org.nasdanika.codegen.ecore.web.ui.model.InputType;
import org.nasdanika.codegen.ecore.web.ui.model.ModelFactory;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;
import org.nasdanika.codegen.ecore.web.ui.model.ReferenceView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eModelElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceViewEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum featureItemsContainerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertiesEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEModelElementConfiguration() {
		return eModelElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEModelElementConfiguration_Icon() {
		return (EAttribute)eModelElementConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEModelElementConfiguration_GenerateResourceStrings() {
		return (EAttribute)eModelElementConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEModelElementConfiguration__ToProperties__EModelElement_String_Properties() {
		return eModelElementConfigurationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENamedElementConfiguration() {
		return eNamedElementConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElementConfiguration_ModelElementLabel() {
		return (EAttribute)eNamedElementConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElementConfiguration_Constraints() {
		return (EAttribute)eNamedElementConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElementConfiguration_Sort() {
		return (EAttribute)eNamedElementConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassConfiguration() {
		return eClassConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassConfiguration_DispatchFeatures() {
		return (EAttribute)eClassConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassConfiguration_Label() {
		return (EAttribute)eClassConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassConfiguration_ViewItem() {
		return (EAttribute)eClassConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassConfiguration_HorizontalForm() {
		return (EAttribute)eClassConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassConfiguration_FeatureItemsContainer() {
		return (EAttribute)eClassConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassConfiguration_FeatureItemsContainerConfiguration() {
		return (EAttribute)eClassConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeatureConfiguration() {
		return eStructuralFeatureConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Visible() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Editable() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Disabled() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Location() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Category() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Control() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_ControlConfiguration() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_InputType() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_FormInputGroup() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Placeholder() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttributeConfiguration() {
		return eAttributeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttributeConfiguration_Format() {
		return (EAttribute)eAttributeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttributeConfiguration_Choices() {
		return (EAttribute)eAttributeConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttributeConfiguration_Html() {
		return (EAttribute)eAttributeConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReferenceConfiguration() {
		return eReferenceConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferenceConfiguration_ChoicesSelector() {
		return (EAttribute)eReferenceConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferenceConfiguration_View() {
		return (EAttribute)eReferenceConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferenceConfiguration_ViewFeatures() {
		return (EAttribute)eReferenceConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferenceConfiguration_ElementTypes() {
		return (EAttribute)eReferenceConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReferenceConfiguration_TypeColumn() {
		return (EAttribute)eReferenceConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackageConfiguration() {
		return ePackageConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackageConfiguration_RenderAnnotationSource() {
		return (EAttribute)ePackageConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackageConfiguration_RendererBaseExtends() {
		return (EAttribute)ePackageConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackageConfiguration_RouteBaseExtends() {
		return (EAttribute)ePackageConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureLocation() {
		return featureLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceView() {
		return referenceViewEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlType() {
		return controlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInputType() {
		return inputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeatureItemsContainer() {
		return featureItemsContainerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProperties() {
		return propertiesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eModelElementConfigurationEClass = createEClass(EMODEL_ELEMENT_CONFIGURATION);
		createEAttribute(eModelElementConfigurationEClass, EMODEL_ELEMENT_CONFIGURATION__ICON);
		createEAttribute(eModelElementConfigurationEClass, EMODEL_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS);
		createEOperation(eModelElementConfigurationEClass, EMODEL_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES);

		eNamedElementConfigurationEClass = createEClass(ENAMED_ELEMENT_CONFIGURATION);
		createEAttribute(eNamedElementConfigurationEClass, ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL);
		createEAttribute(eNamedElementConfigurationEClass, ENAMED_ELEMENT_CONFIGURATION__CONSTRAINTS);
		createEAttribute(eNamedElementConfigurationEClass, ENAMED_ELEMENT_CONFIGURATION__SORT);

		eClassConfigurationEClass = createEClass(ECLASS_CONFIGURATION);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__DISPATCH_FEATURES);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__LABEL);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__VIEW_ITEM);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__HORIZONTAL_FORM);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__FEATURE_ITEMS_CONTAINER_CONFIGURATION);

		eStructuralFeatureConfigurationEClass = createEClass(ESTRUCTURAL_FEATURE_CONFIGURATION);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__CONTROL_CONFIGURATION);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__INPUT_TYPE);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__FORM_INPUT_GROUP);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__PLACEHOLDER);

		eAttributeConfigurationEClass = createEClass(EATTRIBUTE_CONFIGURATION);
		createEAttribute(eAttributeConfigurationEClass, EATTRIBUTE_CONFIGURATION__FORMAT);
		createEAttribute(eAttributeConfigurationEClass, EATTRIBUTE_CONFIGURATION__CHOICES);
		createEAttribute(eAttributeConfigurationEClass, EATTRIBUTE_CONFIGURATION__HTML);

		eReferenceConfigurationEClass = createEClass(EREFERENCE_CONFIGURATION);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__CHOICES_SELECTOR);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__VIEW);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__VIEW_FEATURES);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__ELEMENT_TYPES);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__TYPE_COLUMN);

		ePackageConfigurationEClass = createEClass(EPACKAGE_CONFIGURATION);
		createEAttribute(ePackageConfigurationEClass, EPACKAGE_CONFIGURATION__RENDER_ANNOTATION_SOURCE);
		createEAttribute(ePackageConfigurationEClass, EPACKAGE_CONFIGURATION__ROUTE_BASE_EXTENDS);
		createEAttribute(ePackageConfigurationEClass, EPACKAGE_CONFIGURATION__RENDERER_BASE_EXTENDS);

		// Create enums
		featureLocationEEnum = createEEnum(FEATURE_LOCATION);
		referenceViewEEnum = createEEnum(REFERENCE_VIEW);
		controlTypeEEnum = createEEnum(CONTROL_TYPE);
		inputTypeEEnum = createEEnum(INPUT_TYPE);
		featureItemsContainerEEnum = createEEnum(FEATURE_ITEMS_CONTAINER);

		// Create data types
		propertiesEDataType = createEDataType(PROPERTIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eNamedElementConfigurationEClass.getESuperTypes().add(this.getEModelElementConfiguration());
		eClassConfigurationEClass.getESuperTypes().add(this.getENamedElementConfiguration());
		eStructuralFeatureConfigurationEClass.getESuperTypes().add(this.getENamedElementConfiguration());
		eAttributeConfigurationEClass.getESuperTypes().add(this.getEStructuralFeatureConfiguration());
		eReferenceConfigurationEClass.getESuperTypes().add(this.getEStructuralFeatureConfiguration());

		// Initialize classes, features, and operations; add parameters
		initEClass(eModelElementConfigurationEClass, EModelElementConfiguration.class, "EModelElementConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEModelElementConfiguration_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, EModelElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEModelElementConfiguration_GenerateResourceStrings(), ecorePackage.getEBoolean(), "generateResourceStrings", null, 0, 1, EModelElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEModelElementConfiguration__ToProperties__EModelElement_String_Properties(), null, "toProperties", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEModelElement(), "modelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "renderAnnotationSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperties(), "properties", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eNamedElementConfigurationEClass, ENamedElementConfiguration.class, "ENamedElementConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENamedElementConfiguration_ModelElementLabel(), ecorePackage.getEString(), "modelElementLabel", null, 0, 1, ENamedElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENamedElementConfiguration_Constraints(), ecorePackage.getEString(), "constraints", null, 0, 1, ENamedElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENamedElementConfiguration_Sort(), ecorePackage.getEString(), "sort", null, 0, 1, ENamedElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassConfigurationEClass, EClassConfiguration.class, "EClassConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClassConfiguration_DispatchFeatures(), ecorePackage.getEBoolean(), "dispatchFeatures", null, 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassConfiguration_Label(), ecorePackage.getEString(), "label", null, 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassConfiguration_ViewItem(), ecorePackage.getEString(), "viewItem", null, 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassConfiguration_HorizontalForm(), ecorePackage.getEBoolean(), "horizontalForm", "true", 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassConfiguration_FeatureItemsContainer(), this.getFeatureItemsContainer(), "featureItemsContainer", "Tabs", 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassConfiguration_FeatureItemsContainerConfiguration(), ecorePackage.getEString(), "featureItemsContainerConfiguration", "true", 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureConfigurationEClass, EStructuralFeatureConfiguration.class, "EStructuralFeatureConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStructuralFeatureConfiguration_Visible(), ecorePackage.getEString(), "visible", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Editable(), ecorePackage.getEString(), "editable", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Disabled(), ecorePackage.getEString(), "disabled", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Location(), this.getFeatureLocation(), "location", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Category(), ecorePackage.getEString(), "category", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Control(), this.getControlType(), "control", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_ControlConfiguration(), ecorePackage.getEString(), "controlConfiguration", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_InputType(), this.getInputType(), "inputType", "Default", 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_FormInputGroup(), ecorePackage.getEBoolean(), "formInputGroup", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAttributeConfigurationEClass, EAttributeConfiguration.class, "EAttributeConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAttributeConfiguration_Format(), ecorePackage.getEString(), "format", null, 0, 1, EAttributeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAttributeConfiguration_Choices(), ecorePackage.getEString(), "choices", null, 0, 1, EAttributeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAttributeConfiguration_Html(), ecorePackage.getEBoolean(), "html", null, 0, 1, EAttributeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceConfigurationEClass, EReferenceConfiguration.class, "EReferenceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReferenceConfiguration_ChoicesSelector(), ecorePackage.getEString(), "choicesSelector", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferenceConfiguration_View(), this.getReferenceView(), "view", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferenceConfiguration_ViewFeatures(), ecorePackage.getEString(), "viewFeatures", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferenceConfiguration_ElementTypes(), ecorePackage.getEString(), "elementTypes", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferenceConfiguration_TypeColumn(), ecorePackage.getEString(), "typeColumn", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePackageConfigurationEClass, EPackageConfiguration.class, "EPackageConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPackageConfiguration_RenderAnnotationSource(), ecorePackage.getEString(), "renderAnnotationSource", "org.nasdanika.cdo.web.render", 0, 1, EPackageConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPackageConfiguration_RouteBaseExtends(), ecorePackage.getEString(), "routeBaseExtends", "org.nasdanika.cdo.web.routes.app.Route", 0, 1, EPackageConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPackageConfiguration_RendererBaseExtends(), ecorePackage.getEString(), "rendererBaseExtends", "org.nasdanika.cdo.web.routes.app.Renderer", 0, 1, EPackageConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(featureLocationEEnum, FeatureLocation.class, "FeatureLocation");
		addEEnumLiteral(featureLocationEEnum, FeatureLocation.DEFAULT);
		addEEnumLiteral(featureLocationEEnum, FeatureLocation.ITEM_CONTAINER);
		addEEnumLiteral(featureLocationEEnum, FeatureLocation.LEFT_PANEL);
		addEEnumLiteral(featureLocationEEnum, FeatureLocation.VIEW);

		initEEnum(referenceViewEEnum, ReferenceView.class, "ReferenceView");
		addEEnumLiteral(referenceViewEEnum, ReferenceView.DEFAULT);
		addEEnumLiteral(referenceViewEEnum, ReferenceView.LIST);
		addEEnumLiteral(referenceViewEEnum, ReferenceView.TABLE);

		initEEnum(controlTypeEEnum, ControlType.class, "ControlType");
		addEEnumLiteral(controlTypeEEnum, ControlType.DEFAULT);
		addEEnumLiteral(controlTypeEEnum, ControlType.INPUT);
		addEEnumLiteral(controlTypeEEnum, ControlType.SELECT);
		addEEnumLiteral(controlTypeEEnum, ControlType.TEXTAREA);

		initEEnum(inputTypeEEnum, InputType.class, "InputType");
		addEEnumLiteral(inputTypeEEnum, InputType.DEFAULT);
		addEEnumLiteral(inputTypeEEnum, InputType.BUTTON);
		addEEnumLiteral(inputTypeEEnum, InputType.CHECKBOX);
		addEEnumLiteral(inputTypeEEnum, InputType.COLOR);
		addEEnumLiteral(inputTypeEEnum, InputType.DATE);
		addEEnumLiteral(inputTypeEEnum, InputType.DATETIME);
		addEEnumLiteral(inputTypeEEnum, InputType.DATETIME_LOCAL);
		addEEnumLiteral(inputTypeEEnum, InputType.EMAIL);
		addEEnumLiteral(inputTypeEEnum, InputType.FILE);
		addEEnumLiteral(inputTypeEEnum, InputType.HIDDEN);
		addEEnumLiteral(inputTypeEEnum, InputType.IMAGE);
		addEEnumLiteral(inputTypeEEnum, InputType.MONTH);
		addEEnumLiteral(inputTypeEEnum, InputType.NUMBER);
		addEEnumLiteral(inputTypeEEnum, InputType.PASSWORD);
		addEEnumLiteral(inputTypeEEnum, InputType.RADIO);
		addEEnumLiteral(inputTypeEEnum, InputType.RANGE);
		addEEnumLiteral(inputTypeEEnum, InputType.RESET);
		addEEnumLiteral(inputTypeEEnum, InputType.SEARCH);
		addEEnumLiteral(inputTypeEEnum, InputType.SUBMIT);
		addEEnumLiteral(inputTypeEEnum, InputType.TEL);
		addEEnumLiteral(inputTypeEEnum, InputType.TEXT);
		addEEnumLiteral(inputTypeEEnum, InputType.TIME);
		addEEnumLiteral(inputTypeEEnum, InputType.URL);
		addEEnumLiteral(inputTypeEEnum, InputType.WEEK);

		initEEnum(featureItemsContainerEEnum, FeatureItemsContainer.class, "FeatureItemsContainer");
		addEEnumLiteral(featureItemsContainerEEnum, FeatureItemsContainer.ACCORDION);
		addEEnumLiteral(featureItemsContainerEEnum, FeatureItemsContainer.PILLS);
		addEEnumLiteral(featureItemsContainerEEnum, FeatureItemsContainer.TABS);

		// Initialize data types
		initEDataType(propertiesEDataType, Properties.class, "Properties", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (getEModelElementConfiguration_Icon(), 
		   source, 
		   new String[] {
			 "documentation", "Icon for a model element such as EClass or EStructuralFeature.\r\nIf icon contains ``/`` it is treated as URL, otherwise it is treated as css class, e.g. Bootstrap\'s ``glyphicon glyphicon-close``."
		   });	
		addAnnotation
		  (getEModelElementConfiguration_GenerateResourceStrings(), 
		   source, 
		   new String[] {
			 "documentation", "If set to true, the generator generates resource strings in resource bundles \r\nproperties files. Resource strings are generated from model annotations and\r\nusing default values if annotations are not present. \r\n\r\nGeneration of resource strings simplifies localization. It does not alter the application\r\nbehavior for default locale."
		   });	
		addAnnotation
		  (getENamedElementConfiguration_ModelElementLabel(), 
		   source, 
		   new String[] {
			 "documentation", "EClass or EStructuralFeature label."
		   });	
		addAnnotation
		  (getENamedElementConfiguration_Constraints(), 
		   source, 
		   new String[] {
			 "documentation", "Constraint shall be a YML text which defines a single constraint or a list of constraints. Constraint can be a string or a map containing:\r\n\r\n* ``condition`` - XPath expression boolean expression.\r\n* ``errorMessageKey`` - Optional error message key. If it is present, error message is retrieved as resource string.\r\n* ``errorMessage`` - Error message to display if the expression evaluates to false. It is used if ``errorMessageKey`` is not defined or if there is no resource string for the key. \r\n\r\nIf the constraint is a String, then it is treated as ``condition`` XPath expression and error message is constructed as ``Constraint violation: <condition>``. "
		   });	
		addAnnotation
		  (getENamedElementConfiguration_Sort(), 
		   source, 
		   new String[] {
			 "documentation", "XPath expression to use for sorting of items in tables and lists."
		   });	
		addAnnotation
		  (getEClassConfiguration_DispatchFeatures(), 
		   source, 
		   new String[] {
			 "documentation", "If set to true, the generator generates render``feature name``FeatureXXX(C,T,EStructuralFeature,...) and overrides renderFeatureXXX(C,T,EStructuralFeature,...)\r\nto dispatch invocations to feature-specific methods. This does not alter the default renderer behavior, but makes the variability points explicit and easier to customize."
		   });	
		addAnnotation
		  (getEClassConfiguration_Label(), 
		   source, 
		   new String[] {
			 "documentation", "A pattern which is interpolated to generate object label.\r\n"
		   });	
		addAnnotation
		  (getEClassConfiguration_ViewItem(), 
		   source, 
		   new String[] {
			 "documentation", "Set this to ``true`` to have the class view rendered in the item container. "
		   });	
		addAnnotation
		  (getEClassConfiguration_HorizontalForm(), 
		   source, 
		   new String[] {
			 "documentation", " By default EClass edit forms are rendered as horizontal forms. Set this to ``false`` to change the default rendering."
		   });	
		addAnnotation
		  (getEClassConfiguration_FeatureItemsContainer(), 
		   source, 
		   new String[] {
			 "documentation", "Feature items container."
		   });	
		addAnnotation
		  (getEClassConfiguration_FeatureItemsContainerConfiguration(), 
		   source, 
		   new String[] {
			 "documentation", "Feature items container configuration.\r\n\r\nFor accordion:\r\n\r\n* style: Bootstrap style, e.g. PRIMARY\r\n\r\nFor pills:\r\n\r\n* stacked: true or false\r\n* justified: true or false\r\n* width: 1 - 11\r\n\r\nFor tabs:\r\n\r\n* justified: true or false\r\n"
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_Visible(), 
		   source, 
		   new String[] {
			 "documentation", "Defines whether the feature is visible in the object view.\r\nThe value can be one of the following:\r\n\r\n* Blank string or ``true`` boolean literal - the feature is visible.\r\n* ``false`` boolean literal - the feature is hidden.\r\n* [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is visible.\r\n"
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_Editable(), 
		   source, 
		   new String[] {
			 "documentation", "Defines whether the feature is editabe if it is already visible.\r\nThe value can be one of the following:\r\n\r\n* Blank string - the feature is editable if it is not an item (``isItem()`` returns false)\r\n* ``true`` boolean literal - the feature is editable\r\n* ``false`` boolean literal - the feature is not editable.\r\n* [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is editable.\r\n"
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_Disabled(), 
		   source, 
		   new String[] {
			 "documentation", "Defines whether an editable feature is disabled, i.e. it shall be displayed in the edit form, but the edit control shall be disabled.\r\n\r\n* ``false`` boolean literal or empty string - the feature is enabled (default).* ``true`` boolean literal - the feature is disabled.\r\n* [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is disabled.\r\n"
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_Location(), 
		   source, 
		   new String[] {
			 "documentation", "Format is used for rendering and parsing date and number feature values. \r\nSimpleDateFormat for dates, DecimalFormat for numbers."
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_Category(), 
		   source, 
		   new String[] {
			 "documentation", "Feature category. Categories are displayed as panels in the view and the left panel, and field sets in edit forms."
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_ControlConfiguration(), 
		   source, 
		   new String[] {
			 "documentation", "YAML map with keys corresponding to control attribute names, and values being JXPath expressions evaluating to attribute values. "
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_InputType(), 
		   source, 
		   new String[] {
			 "documentation", "Input type if control is \"Input\"."
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_FormInputGroup(), 
		   source, 
		   new String[] {
			 "documentation", "Set it to true to force rendering of the form control in a {@link FormInputGroup} instead of {@link FormGroup} or\r\nto false to force the opposite. If this annotation is not present then inputs with either icon (rendered on the left) or help icon (rendered on the right) \r\nare rendered as form input groups.  "
		   });	
		addAnnotation
		  (getEStructuralFeatureConfiguration_Placeholder(), 
		   source, 
		   new String[] {
			 "documentation", "XPath expression evaluating to the placeholder value for features. Placeholder value is an implicit application-specific value, different from the \r\ndefault value. For example, in hierarchical structures children may implicitly inherit parent feature value, unless it is explicitly set (overridden) in the child.\r\n\r\nIn the absence of feature value (null or blank string for strings) placeholder values are displayed in the view in a small {@link Well}."
		   });	
		addAnnotation
		  (getEAttributeConfiguration_Format(), 
		   source, 
		   new String[] {
			 "documentation", "Format is used for rendering and parsing date and number feature values. \r\nSimpleDateFormat for dates, DecimalFormat for numbers."
		   });	
		addAnnotation
		  (getEAttributeConfiguration_Choices(), 
		   source, 
		   new String[] {
			 "documentation", "YAML map of values to labels or list if values and labels are the same. "
		   });	
		addAnnotation
		  (getEAttributeConfiguration_Html(), 
		   source, 
		   new String[] {
			 "documentation", "If control is ``textarea`` and ``html`` is set to ``true`` then the textarea is initialized with [TinyMCE](https://www.tinymce.com) editor. "
		   });	
		addAnnotation
		  (getEReferenceConfiguration_ChoicesSelector(), 
		   source, 
		   new String[] {
			 "documentation", "[JXPath](https://commons.apache.org/proper/commons-jxpath/) selector of choices to assign to the reference.\r\nThe path is evaluated with the current object as context."
		   });	
		addAnnotation
		  (getEReferenceConfiguration_View(), 
		   source, 
		   new String[] {
			 "documentation", "Reference view."
		   });	
		addAnnotation
		  (getEReferenceConfiguration_ViewFeatures(), 
		   source, 
		   new String[] {
			 "documentation", "One of the following\r\n\r\n* A space-separated list of feature names.\r\n* A YAML document list of feature names or mappings of feature name to feature configuration definition, which may include:\r\n     * ``visible`` - [JXPath](https://commons.apache.org/proper/commons-jxpath/index.html) expression. If this expression evaluates to ``true`` (compared with ``Boolean.TRUE``), then the feature is included in the list.\r\n    * ``align`` - left, center, or right. Defaults to right for numbers, center for dates and booleans and left for other types.\r\n    * ``width`` - if this key maps to a number, then the number is used for all device sizes. Otherwise is shall map to a map of device-size to number mappings.\r\n\r\nExample:\r\n```yaml\r\n- name:\r\n     align: right\r\n     width: 5\r\n- age:\r\n    aligh: left\r\n    width:\r\n         xs: 3        \r\n - ssn\r\n```\r\n"
		   });	
		addAnnotation
		  (getEReferenceConfiguration_ElementTypes(), 
		   source, 
		   new String[] {
			 "documentation", "Specifies EClass-es of elements which can be instantiated and set/added to the reference.  \r\nThe list of element types shall be space-separated. Elements shall be in\r\nthe following format: ``<eclass name>[@<epackage ns uri>]``. EPackage namespace URI part can be omitted if the class is in the same package with the \r\nfeature\'s declaring EClass."
		   });	
		addAnnotation
		  (getEReferenceConfiguration_TypeColumn(), 
		   source, 
		   new String[] {
			 "documentation", "If not blank, indicates that the table listing reference elements shall display elements type in a type column. \r\nThe value of this attribute is a pattern which is interpolated with the following tokens:\r\n\r\n* ``icon`` - Element icon.\r\n* ``eclass-icon`` - Element type icon.\r\n* ``eclass-label`` - Element type label.\r\n* ``documentation-icon`` - Documentation icon or blank string if there is no documentation.\r\n\r\nThis attribute is useful for references containing elements of different types."
		   });
	}

} //ModelPackageImpl
