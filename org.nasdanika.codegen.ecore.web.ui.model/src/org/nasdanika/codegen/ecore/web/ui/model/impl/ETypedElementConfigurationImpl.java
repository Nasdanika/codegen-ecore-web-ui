/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.nasdanika.codegen.ecore.web.ui.model.ControlType;
import org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.InputType;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;
import org.nasdanika.codegen.ecore.web.ui.model.TypedElementLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETyped Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getDisabled <em>Disabled</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getControl <em>Control</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getControlConfiguration <em>Control Configuration</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#isFormInputGroup <em>Form Input Group</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.ETypedElementConfigurationImpl#getPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ETypedElementConfigurationImpl extends ENamedElementConfigurationImpl implements ETypedElementConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETypedElementConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisible() {
		return (String)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(String newVisible) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__VISIBLE, newVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditable() {
		return (String)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__EDITABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(String newEditable) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__EDITABLE, newEditable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisabled() {
		return (String)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(String newDisabled) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElementLocation getLocation() {
		return (TypedElementLocation)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(TypedElementLocation newLocation) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return (String)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType getControl() {
		return (ControlType)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(ControlType newControl) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CONTROL, newControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControlConfiguration() {
		return (String)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CONTROL_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlConfiguration(String newControlConfiguration) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CONTROL_CONFIGURATION, newControlConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType getInputType() {
		return (InputType)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__INPUT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputType(InputType newInputType) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__INPUT_TYPE, newInputType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFormInputGroup() {
		return (Boolean)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__FORM_INPUT_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormInputGroup(boolean newFormInputGroup) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__FORM_INPUT_GROUP, newFormInputGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return (String)eGet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__PLACEHOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		eSet(ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__PLACEHOLDER, newPlaceholder);
	}
	
	@Override
	public void toProperties(EModelElement modelElement, String renderAnnotationSource, Properties properties) {
		super.toProperties(modelElement, renderAnnotationSource, properties);
		
		// visible
		setProperty(modelElement, renderAnnotationSource, properties, "visible", getVisible());
		
		// editable
		setProperty(modelElement, renderAnnotationSource, properties, "editable", getEditable());
		
		// disabled
		setProperty(modelElement, renderAnnotationSource, properties, "disabled", getDisabled());
		
		// location
		switch (getLocation()) {
		case ITEM_CONTAINER:
			setProperty(modelElement, renderAnnotationSource, properties, "typed-element-location", "item");
			break;
		case LEFT_PANEL:
			setProperty(modelElement, renderAnnotationSource, properties, "typed-element-location", "leftPanel");
			break;
		case VIEW:
			setProperty(modelElement, renderAnnotationSource, properties, "typed-element-location", "view");			
			break;
		case DEFAULT:
		default:
			break;		
		}
		
		// category - TODO handle auto-category and model element name if generateResourceStrings is true
		setProperty(modelElement, renderAnnotationSource, properties, "category", getCategory());
		
		// control
		switch (getControl()) {
		case INPUT:
		case SELECT:
		case TEXTAREA:
			setProperty(modelElement, renderAnnotationSource, properties, "control", getControl().getName().toLowerCase());
			break;
		case DEFAULT:
		default:
			break;		
		}
		
		// control configuration
		setProperty(modelElement, renderAnnotationSource, properties, "control-configuration", getControlConfiguration());		
		
		// input type
		if (getInputType() != InputType.DEFAULT) {
			setProperty(modelElement, renderAnnotationSource, properties, "input-type", getInputType().getName());
		}		
		
		// form input group
		setProperty(modelElement, renderAnnotationSource, properties, "form-input-group", isFormInputGroup() ? "true" : "");				
		
		// placeholder
		setProperty(modelElement, renderAnnotationSource, properties, "placeholder", getPlaceholder());		

	}
	

} //ETypedElementConfigurationImpl
