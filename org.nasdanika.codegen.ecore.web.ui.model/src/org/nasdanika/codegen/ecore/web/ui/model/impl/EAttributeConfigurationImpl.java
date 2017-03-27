/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import java.util.Properties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.nasdanika.codegen.ecore.web.ui.model.EAttributeConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EAttributeConfigurationImpl#isHtml <em>Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributeConfigurationImpl extends EStructuralFeatureConfigurationImpl implements EAttributeConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAttributeConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EATTRIBUTE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return (String)eGet(ModelPackage.Literals.EATTRIBUTE_CONFIGURATION__FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		eSet(ModelPackage.Literals.EATTRIBUTE_CONFIGURATION__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoices() {
		return (String)eGet(ModelPackage.Literals.EATTRIBUTE_CONFIGURATION__CHOICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoices(String newChoices) {
		eSet(ModelPackage.Literals.EATTRIBUTE_CONFIGURATION__CHOICES, newChoices);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHtml() {
		return (Boolean)eGet(ModelPackage.Literals.EATTRIBUTE_CONFIGURATION__HTML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml(boolean newHtml) {
		eSet(ModelPackage.Literals.EATTRIBUTE_CONFIGURATION__HTML, newHtml);
	}
	
	@Override
	public void toProperties(EModelElement modelElement, String renderAnnotationSource, Properties properties) {
		super.toProperties(modelElement, renderAnnotationSource, properties);
		
		// choices
		setProperty(modelElement, renderAnnotationSource, properties, "choices", getChoices());				
		
		// format
		setProperty(modelElement, renderAnnotationSource, properties, "format", getFormat());				
		
		// html
		setProperty(modelElement, renderAnnotationSource, properties, "content-type", isHtml() ? "text/html" : "");							
	}

} //EAttributeConfigurationImpl
