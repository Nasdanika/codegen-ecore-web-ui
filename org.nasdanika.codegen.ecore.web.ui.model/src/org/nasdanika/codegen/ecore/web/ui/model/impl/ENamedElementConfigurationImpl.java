/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
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
	
	/**
	 * Derives label (display name) from a name. This implementation splits by camel case,
	 * lowercases 1+ segments and capitalizes the 0 segment. E.g. myCoolName becomes My cool name.
	 * @param name
	 * @return
	 */
	static String nameToLabel(String name) {
		String[] cca = StringUtils.splitByCharacterTypeCamelCase(name);
		cca[0] = StringUtils.capitalize(cca[0]);
		for (int i=1; i<cca.length; ++i) {
			cca[i] = cca[i].toLowerCase();
		}
		return StringUtils.join(cca, " ");
	}
	
	
	public void toProperties(EModelElement modelElement, String renderAnnotationSource, Properties properties) {
		super.toProperties(modelElement, renderAnnotationSource, properties);
		
		// generateResourceStrings - TODO

		// model element label
		setProperty(modelElement, renderAnnotationSource, properties, "model-element-label", getModelElementLabel());
		
		// constraints
		setProperty(modelElement, renderAnnotationSource, properties, "constraint", getConstraints());
		
		// sort
		setProperty(modelElement, renderAnnotationSource, properties, "sort", getSort());
		
	}
	

} //ENamedElementConfigurationImpl
