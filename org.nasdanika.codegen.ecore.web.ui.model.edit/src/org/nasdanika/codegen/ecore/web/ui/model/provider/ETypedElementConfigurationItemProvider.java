/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.codegen.ecore.web.ui.model.ETypedElementConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ETypedElementConfigurationItemProvider extends ENamedElementConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElementConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVisiblePropertyDescriptor(object);
			addEditablePropertyDescriptor(object);
			addDisabledPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addControlPropertyDescriptor(object);
			addControlConfigurationPropertyDescriptor(object);
			addInputTypePropertyDescriptor(object);
			addFormInputGroupPropertyDescriptor(object);
			addPlaceholderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_visible_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_editable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_editable_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_disabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_disabled_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_location_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_category_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CATEGORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_control_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_control_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CONTROL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Configuration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlConfigurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_controlConfiguration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_controlConfiguration_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__CONTROL_CONFIGURATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_inputType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_inputType_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__INPUT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Form Input Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormInputGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_formInputGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_formInputGroup_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__FORM_INPUT_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Placeholder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlaceholderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETypedElementConfiguration_placeholder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETypedElementConfiguration_placeholder_feature", "_UI_ETypedElementConfiguration_type"),
				 ModelPackage.Literals.ETYPED_ELEMENT_CONFIGURATION__PLACEHOLDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ETypedElementConfiguration)object).getIcon();
		return label == null || label.length() == 0 ?
			getString("_UI_ETypedElementConfiguration_type") :
			getString("_UI_ETypedElementConfiguration_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ETypedElementConfiguration.class)) {
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__VISIBLE:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__EDITABLE:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__DISABLED:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__LOCATION:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__CATEGORY:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__CONTROL:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__CONTROL_CONFIGURATION:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__INPUT_TYPE:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__FORM_INPUT_GROUP:
			case ModelPackage.ETYPED_ELEMENT_CONFIGURATION__PLACEHOLDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
