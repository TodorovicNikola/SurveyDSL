/**
 */
package queryIT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Question Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see queryIT.QueryITPackage#getQuestionType()
 * @model
 * @generated
 */
public final class QuestionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT_LITERAL
	 * @model name="text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT = 0;

	/**
	 * The '<em><b>Radiogroup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radiogroup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIOGROUP_LITERAL
	 * @model name="radiogroup"
	 * @generated
	 * @ordered
	 */
	public static final int RADIOGROUP = 1;

	/**
	 * The '<em><b>Checkbox</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Checkbox</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX_LITERAL
	 * @model name="checkbox"
	 * @generated
	 * @ordered
	 */
	public static final int CHECKBOX = 2;

	/**
	 * The '<em><b>Dropdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dropdown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN_LITERAL
	 * @model name="dropdown"
	 * @generated
	 * @ordered
	 */
	public static final int DROPDOWN = 3;

	/**
	 * The '<em><b>Comment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMENT_LITERAL
	 * @model name="comment"
	 * @generated
	 * @ordered
	 */
	public static final int COMMENT = 4;

	/**
	 * The '<em><b>Matrix</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Matrix</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MATRIX_LITERAL
	 * @model name="matrix"
	 * @generated
	 * @ordered
	 */
	public static final int MATRIX = 5;

	/**
	 * The '<em><b>Multiple Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_TEXT_LITERAL
	 * @model name="multipleText"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_TEXT = 8;

	/**
	 * The '<em><b>Rating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rating</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATING_LITERAL
	 * @model name="rating"
	 * @generated
	 * @ordered
	 */
	public static final int RATING = 10;

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @generated
	 * @ordered
	 */
	public static final QuestionType TEXT_LITERAL = new QuestionType(TEXT, "text", "text");

	/**
	 * The '<em><b>Radiogroup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIOGROUP
	 * @generated
	 * @ordered
	 */
	public static final QuestionType RADIOGROUP_LITERAL = new QuestionType(RADIOGROUP, "radiogroup", "radiogroup");

	/**
	 * The '<em><b>Checkbox</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKBOX
	 * @generated
	 * @ordered
	 */
	public static final QuestionType CHECKBOX_LITERAL = new QuestionType(CHECKBOX, "checkbox", "checkbox");

	/**
	 * The '<em><b>Dropdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROPDOWN
	 * @generated
	 * @ordered
	 */
	public static final QuestionType DROPDOWN_LITERAL = new QuestionType(DROPDOWN, "dropdown", "dropdown");

	/**
	 * The '<em><b>Comment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMENT
	 * @generated
	 * @ordered
	 */
	public static final QuestionType COMMENT_LITERAL = new QuestionType(COMMENT, "comment", "comment");

	/**
	 * The '<em><b>Matrix</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MATRIX
	 * @generated
	 * @ordered
	 */
	public static final QuestionType MATRIX_LITERAL = new QuestionType(MATRIX, "matrix", "matrix");

	/**
	 * The '<em><b>Multiple Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_TEXT
	 * @generated
	 * @ordered
	 */
	public static final QuestionType MULTIPLE_TEXT_LITERAL = new QuestionType(MULTIPLE_TEXT, "multipleText", "multipleText");

	/**
	 * The '<em><b>Rating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATING
	 * @generated
	 * @ordered
	 */
	public static final QuestionType RATING_LITERAL = new QuestionType(RATING, "rating", "rating");

	/**
	 * An array of all the '<em><b>Question Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QuestionType[] VALUES_ARRAY =
		new QuestionType[] {
			TEXT_LITERAL,
			RADIOGROUP_LITERAL,
			CHECKBOX_LITERAL,
			DROPDOWN_LITERAL,
			COMMENT_LITERAL,
			MATRIX_LITERAL,
			MULTIPLE_TEXT_LITERAL,
			RATING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Question Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QuestionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Question Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuestionType get(int value) {
		switch (value) {
			case TEXT: return TEXT_LITERAL;
			case RADIOGROUP: return RADIOGROUP_LITERAL;
			case CHECKBOX: return CHECKBOX_LITERAL;
			case DROPDOWN: return DROPDOWN_LITERAL;
			case COMMENT: return COMMENT_LITERAL;
			case MATRIX: return MATRIX_LITERAL;
			case MULTIPLE_TEXT: return MULTIPLE_TEXT_LITERAL;
			case RATING: return RATING_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private QuestionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //QuestionType
