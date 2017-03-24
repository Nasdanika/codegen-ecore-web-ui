/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EClassConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ENamedElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EReferenceConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.EStructuralFeatureConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.FeatureLocation;
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
	private EEnum featureLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceViewEEnum = null;

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
	public EAttribute getEStructuralFeatureConfiguration_Format() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Location() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeatureConfiguration_Category() {
		return (EAttribute)eStructuralFeatureConfigurationEClass.getEStructuralFeatures().get(5);
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

		eNamedElementConfigurationEClass = createEClass(ENAMED_ELEMENT_CONFIGURATION);
		createEAttribute(eNamedElementConfigurationEClass, ENAMED_ELEMENT_CONFIGURATION__MODEL_ELEMENT_LABEL);

		eClassConfigurationEClass = createEClass(ECLASS_CONFIGURATION);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__DISPATCH_FEATURES);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__LABEL);
		createEAttribute(eClassConfigurationEClass, ECLASS_CONFIGURATION__VIEW_ITEM);

		eStructuralFeatureConfigurationEClass = createEClass(ESTRUCTURAL_FEATURE_CONFIGURATION);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__VISIBLE);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__EDITABLE);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__DISABLED);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__FORMAT);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__LOCATION);
		createEAttribute(eStructuralFeatureConfigurationEClass, ESTRUCTURAL_FEATURE_CONFIGURATION__CATEGORY);

		eAttributeConfigurationEClass = createEClass(EATTRIBUTE_CONFIGURATION);

		eReferenceConfigurationEClass = createEClass(EREFERENCE_CONFIGURATION);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__CHOICES_SELECTOR);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__VIEW);
		createEAttribute(eReferenceConfigurationEClass, EREFERENCE_CONFIGURATION__VIEW_FEATURES);

		// Create enums
		featureLocationEEnum = createEEnum(FEATURE_LOCATION);
		referenceViewEEnum = createEEnum(REFERENCE_VIEW);
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

		initEClass(eNamedElementConfigurationEClass, ENamedElementConfiguration.class, "ENamedElementConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENamedElementConfiguration_ModelElementLabel(), ecorePackage.getEString(), "modelElementLabel", null, 0, 1, ENamedElementConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassConfigurationEClass, EClassConfiguration.class, "EClassConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClassConfiguration_DispatchFeatures(), ecorePackage.getEBoolean(), "dispatchFeatures", null, 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassConfiguration_Label(), ecorePackage.getEString(), "label", null, 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassConfiguration_ViewItem(), ecorePackage.getEString(), "viewItem", null, 0, 1, EClassConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureConfigurationEClass, EStructuralFeatureConfiguration.class, "EStructuralFeatureConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStructuralFeatureConfiguration_Visible(), ecorePackage.getEString(), "visible", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Editable(), ecorePackage.getEString(), "editable", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Disabled(), ecorePackage.getEString(), "disabled", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Format(), ecorePackage.getEString(), "format", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Location(), this.getFeatureLocation(), "Location", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeatureConfiguration_Category(), ecorePackage.getEString(), "category", null, 0, 1, EStructuralFeatureConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAttributeConfigurationEClass, EAttributeConfiguration.class, "EAttributeConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eReferenceConfigurationEClass, EReferenceConfiguration.class, "EReferenceConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReferenceConfiguration_ChoicesSelector(), ecorePackage.getEString(), "choicesSelector", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferenceConfiguration_View(), this.getReferenceView(), "view", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReferenceConfiguration_ViewFeatures(), ecorePackage.getEString(), "viewFeatures", null, 0, 1, EReferenceConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getEStructuralFeatureConfiguration_Format(), 
		   source, 
		   new String[] {
			 "documentation", "Format is used for rendering and parsing date and number feature values. \r\nSimpleDateFormat for dates, DecimalFormat for numbers."
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
	}

} //ModelPackageImpl
