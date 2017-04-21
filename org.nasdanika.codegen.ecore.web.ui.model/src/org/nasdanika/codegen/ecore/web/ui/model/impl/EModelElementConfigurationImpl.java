/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.codegen.ecore.web.ui.model.EModelElementConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EModel Element Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EModelElementConfigurationImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EModelElementConfigurationImpl#isGenerateResourceStrings <em>Generate Resource Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EModelElementConfigurationImpl extends CDOObjectImpl implements EModelElementConfiguration {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EModelElementConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMODEL_ELEMENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return (String)eGet(ModelPackage.Literals.EMODEL_ELEMENT_CONFIGURATION__ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		eSet(ModelPackage.Literals.EMODEL_ELEMENT_CONFIGURATION__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateResourceStrings() {
		return (Boolean)eGet(ModelPackage.Literals.EMODEL_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateResourceStrings(boolean newGenerateResourceStrings) {
		eSet(ModelPackage.Literals.EMODEL_ELEMENT_CONFIGURATION__GENERATE_RESOURCE_STRINGS, newGenerateResourceStrings);
	}

	static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	static String getPrefix(EModelElement modelElement) {		
		String className = modelElement.eClass().getName();
		if (className.startsWith("E")) {
			className = className.substring(1);
		}
		return modelElement instanceof ENamedElement ? StringUtils.uncapitalize(className)+"."+((ENamedElement) modelElement).getName()+".render." : "";		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void toProperties(EModelElement modelElement, String renderAnnotationSource, Properties properties) {
		// icon
		setProperty(modelElement, renderAnnotationSource, properties, "icon", getIcon());
	}

	/**
	 * If value is null, attempts to read value from the render annotation.
	 * @param modelElement
	 * @param renderAnnotationSource
	 * @param properties
	 * @param key
	 * @param value
	 */
	protected void setProperty(EModelElement modelElement, String renderAnnotationSource, Properties properties, String key, String value) {
		if (isBlank(value) && isGenerateResourceStrings()) {
			EAnnotation renderAnnotation = modelElement.getEAnnotation(renderAnnotationSource);
			if (renderAnnotation != null) {
				value = renderAnnotation.getDetails().get(key);
			}
		}				
				
		if (!isBlank(value)) {
			properties.setProperty(getPrefix(modelElement)+key, value);
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.EMODEL_ELEMENT_CONFIGURATION___TO_PROPERTIES__EMODELELEMENT_STRING_PROPERTIES:
				toProperties((EModelElement)arguments.get(0), (String)arguments.get(1), (Properties)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EModelElementConfigurationImpl
