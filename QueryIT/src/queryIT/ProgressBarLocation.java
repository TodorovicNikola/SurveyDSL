/**
 */
package queryIT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Progress Bar Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see queryIT.QueryITPackage#getProgressBarLocation()
 * @model
 * @generated
 */
public final class ProgressBarLocation extends AbstractEnumerator {
	/**
	 * The '<em><b>Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_LITERAL
	 * @model name="top"
	 * @generated
	 * @ordered
	 */
	public static final int TOP = 0;

	/**
	 * The '<em><b>Off</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Off</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF_LITERAL
	 * @model name="off"
	 * @generated
	 * @ordered
	 */
	public static final int OFF = 1;

	/**
	 * The '<em><b>Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LITERAL
	 * @model name="bottom"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM = 2;

	/**
	 * The '<em><b>Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @generated
	 * @ordered
	 */
	public static final ProgressBarLocation TOP_LITERAL = new ProgressBarLocation(TOP, "top", "top");

	/**
	 * The '<em><b>Off</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @generated
	 * @ordered
	 */
	public static final ProgressBarLocation OFF_LITERAL = new ProgressBarLocation(OFF, "off", "off");

	/**
	 * The '<em><b>Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM
	 * @generated
	 * @ordered
	 */
	public static final ProgressBarLocation BOTTOM_LITERAL = new ProgressBarLocation(BOTTOM, "bottom", "bottom");

	/**
	 * An array of all the '<em><b>Progress Bar Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgressBarLocation[] VALUES_ARRAY =
		new ProgressBarLocation[] {
			TOP_LITERAL,
			OFF_LITERAL,
			BOTTOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Progress Bar Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Progress Bar Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProgressBarLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgressBarLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Progress Bar Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProgressBarLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgressBarLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Progress Bar Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProgressBarLocation get(int value) {
		switch (value) {
			case TOP: return TOP_LITERAL;
			case OFF: return OFF_LITERAL;
			case BOTTOM: return BOTTOM_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProgressBarLocation(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProgressBarLocation
