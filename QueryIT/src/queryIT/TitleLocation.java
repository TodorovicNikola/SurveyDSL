/**
 */
package queryIT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Title Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see queryIT.QueryITPackage#getTitleLocation()
 * @model
 * @generated
 */
public final class TitleLocation extends AbstractEnumerator {
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
	public static final int BOTTOM = 1;

	/**
	 * The '<em><b>Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @generated
	 * @ordered
	 */
	public static final TitleLocation TOP_LITERAL = new TitleLocation(TOP, "top", "top");

	/**
	 * The '<em><b>Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM
	 * @generated
	 * @ordered
	 */
	public static final TitleLocation BOTTOM_LITERAL = new TitleLocation(BOTTOM, "bottom", "bottom");

	/**
	 * An array of all the '<em><b>Title Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TitleLocation[] VALUES_ARRAY =
		new TitleLocation[] {
			TOP_LITERAL,
			BOTTOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Title Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Title Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TitleLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TitleLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TitleLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TitleLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Title Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TitleLocation get(int value) {
		switch (value) {
			case TOP: return TOP_LITERAL;
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
	private TitleLocation(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TitleLocation
