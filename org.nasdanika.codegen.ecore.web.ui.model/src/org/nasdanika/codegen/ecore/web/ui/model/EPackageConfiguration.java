/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRendererBaseExtends <em>Renderer Base Extends</em>}</li>
 *   <li>{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRouteBaseExtends <em>Route Base Extends</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEPackageConfiguration()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EPackageConfiguration extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Renderer Base Extends</b></em>' attribute.
	 * The default value is <code>"org.nasdanika.cdo.web.routes.app.Renderer"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renderer Base Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renderer Base Extends</em>' attribute.
	 * @see #setRendererBaseExtends(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEPackageConfiguration_RendererBaseExtends()
	 * @model default="org.nasdanika.cdo.web.routes.app.Renderer"
	 * @generated
	 */
	String getRendererBaseExtends();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRendererBaseExtends <em>Renderer Base Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderer Base Extends</em>' attribute.
	 * @see #getRendererBaseExtends()
	 * @generated
	 */
	void setRendererBaseExtends(String value);

	/**
	 * Returns the value of the '<em><b>Route Base Extends</b></em>' attribute.
	 * The default value is <code>"org.nasdanika.cdo.web.routes.app.Route"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Base Extends</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Base Extends</em>' attribute.
	 * @see #setRouteBaseExtends(String)
	 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getEPackageConfiguration_RouteBaseExtends()
	 * @model default="org.nasdanika.cdo.web.routes.app.Route"
	 * @generated
	 */
	String getRouteBaseExtends();

	/**
	 * Sets the value of the '{@link org.nasdanika.codegen.ecore.web.ui.model.EPackageConfiguration#getRouteBaseExtends <em>Route Base Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Base Extends</em>' attribute.
	 * @see #getRouteBaseExtends()
	 * @generated
	 */
	void setRouteBaseExtends(String value);

} // EPackageConfiguration
