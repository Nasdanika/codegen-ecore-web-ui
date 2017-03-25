/**
 */
package org.nasdanika.codegen.ecore.web.ui.model.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration;
import org.nasdanika.codegen.ecore.web.ui.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPackage Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EPackageConfigurationImpl#getRendererBaseExtends <em>Renderer Base Extends</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.impl.EPackageConfigurationImpl#getRouteBaseExtends <em>Route Base Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPackageConfigurationImpl extends CDOObjectImpl implements EPackageConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackageConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EPACKAGE_CONFIGURATION;
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
	public String getRendererBaseExtends() {
		return (String)eGet(ModelPackage.Literals.EPACKAGE_CONFIGURATION__RENDERER_BASE_EXTENDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRendererBaseExtends(String newRendererBaseExtends) {
		eSet(ModelPackage.Literals.EPACKAGE_CONFIGURATION__RENDERER_BASE_EXTENDS, newRendererBaseExtends);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRouteBaseExtends() {
		return (String)eGet(ModelPackage.Literals.EPACKAGE_CONFIGURATION__ROUTE_BASE_EXTENDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteBaseExtends(String newRouteBaseExtends) {
		eSet(ModelPackage.Literals.EPACKAGE_CONFIGURATION__ROUTE_BASE_EXTENDS, newRouteBaseExtends);
	}

} //EPackageConfigurationImpl
