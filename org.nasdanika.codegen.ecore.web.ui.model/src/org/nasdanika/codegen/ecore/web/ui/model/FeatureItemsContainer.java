/**
 */
package org.nasdanika.codegen.ecore.web.ui.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Feature Items Container</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.nasdanika.codegen.ecore.web.ui.model.ModelPackage#getFeatureItemsContainer()
 * @model
 * @generated
 */
public enum FeatureItemsContainer implements Enumerator {
	/**
	 * The '<em><b>Accordion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCORDION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCORDION(0, "Accordion", "Accordion"),

	/**
	 * The '<em><b>Pills</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PILLS_VALUE
	 * @generated
	 * @ordered
	 */
	PILLS(1, "Pills", "Pills"),

	/**
	 * The '<em><b>Tabs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABS_VALUE
	 * @generated
	 * @ordered
	 */
	TABS(2, "Tabs", "Tabs");

	/**
	 * The '<em><b>Accordion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Accordion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCORDION
	 * @model name="Accordion"
	 * @generated
	 * @ordered
	 */
	public static final int ACCORDION_VALUE = 0;

	/**
	 * The '<em><b>Pills</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pills</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PILLS
	 * @model name="Pills"
	 * @generated
	 * @ordered
	 */
	public static final int PILLS_VALUE = 1;

	/**
	 * The '<em><b>Tabs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tabs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABS
	 * @model name="Tabs"
	 * @generated
	 * @ordered
	 */
	public static final int TABS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Feature Items Container</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FeatureItemsContainer[] VALUES_ARRAY =
		new FeatureItemsContainer[] {
			ACCORDION,
			PILLS,
			TABS,
		};

	/**
	 * A public read-only list of all the '<em><b>Feature Items Container</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FeatureItemsContainer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Feature Items Container</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureItemsContainer get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureItemsContainer result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Items Container</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureItemsContainer getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FeatureItemsContainer result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Feature Items Container</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FeatureItemsContainer get(int value) {
		switch (value) {
			case ACCORDION_VALUE: return ACCORDION;
			case PILLS_VALUE: return PILLS;
			case TABS_VALUE: return TABS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeatureItemsContainer(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FeatureItemsContainer
