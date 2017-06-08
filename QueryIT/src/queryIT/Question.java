/**
 */
package queryIT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link queryIT.Question#getType <em>Type</em>}</li>
 *   <li>{@link queryIT.Question#getTitle <em>Title</em>}</li>
 *   <li>{@link queryIT.Question#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link queryIT.Question#getRangeStart <em>Range Start</em>}</li>
 *   <li>{@link queryIT.Question#getRangeEnd <em>Range End</em>}</li>
 *   <li>{@link queryIT.Question#getInputType <em>Input Type</em>}</li>
 *   <li>{@link queryIT.Question#getVisibleIf <em>Visible If</em>}</li>
 *   <li>{@link queryIT.Question#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link queryIT.Question#getChoices <em>Choices</em>}</li>
 *   <li>{@link queryIT.Question#getColCount <em>Col Count</em>}</li>
 *   <li>{@link queryIT.Question#getMatrixRows <em>Matrix Rows</em>}</li>
 *   <li>{@link queryIT.Question#getMultiTextItems <em>Multi Text Items</em>}</li>
 *   <li>{@link queryIT.Question#getQuestionName <em>Question Name</em>}</li>
 *   <li>{@link queryIT.Question#getRows <em>Rows</em>}</li>
 *   <li>{@link queryIT.Question#getMininumRateDescription <em>Mininum Rate Description</em>}</li>
 *   <li>{@link queryIT.Question#getMaximumRateDescription <em>Maximum Rate Description</em>}</li>
 *   <li>{@link queryIT.Question#getMatrixColumns <em>Matrix Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see queryIT.QueryITPackage#getQuestion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rangeInvalid matrixHasRowsAndCols multipleTextHasItems choicesUseless choicesNeeded inputType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot rangeInvalid='\n\t\t\tif(type = QuestionType::text and inputType = TextInputType::range) then\n\t\t\t\trangeStart <> rangeEnd\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif' rangeInvalid$message='\'Range Start and Range End cannot be equal.\'' matrixHasRowsAndCols='\n\t\t\tif(type = QuestionType::matrix) then\n\t\t\t\tmatrixRows->size() > 0 and matrixColumns->size() > 0\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif' matrixHasRowsAndCols$message='\'matrixRows and matrixColumns must be declared for the Question of type \\\'Matrix\\\'\'' multipleTextHasItems='\n\t\t\tif(type = QuestionType::multipleText) then\n\t\t\t\tmultiTextItems->size() > 0\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif' multipleTextHasItems$message='\'Question of type \\\'MultipleText\\\' must have atleast one multiTextItem declared\'' choicesUseless='\n\t\t\tif(type <> QuestionType::radiogroup and type <> QuestionType::dropdown and type <> QuestionType::checkbox) then\n\t\t\t\tchoices-> isEmpty() = true\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif' choicesUseless$message='\'Choices are useless for the seleced type of Question\'' choicesNeeded='\n\t\t\tif(type = QuestionType::radiogroup or type = QuestionType::dropdown or type = QuestionType::checkbox) then\n\t\t\t\tchoices-> isEmpty() = false\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif' choicesNeeded$message='\'Choices are needed for the seleced type of Question\'' inputType='\n\t\t\tif(type <> QuestionType::text) then\n\t\t\t\tinputType = TextInputType::text\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif' inputType$message='\'InputType is used only for questions of type \\\'Text\\\'\''"
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link queryIT.QuestionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see queryIT.QuestionType
	 * @see #setType(QuestionType)
	 * @see queryIT.QueryITPackage#getQuestion_Type()
	 * @model required="true"
	 * @generated
	 */
	QuestionType getType();

	/**
	 * Sets the value of the '{@link queryIT.Question#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see queryIT.QuestionType
	 * @see #getType()
	 * @generated
	 */
	void setType(QuestionType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see queryIT.QueryITPackage#getQuestion_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link queryIT.Question#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see #setIsRequired(boolean)
	 * @see queryIT.QueryITPackage#getQuestion_IsRequired()
	 * @model
	 * @generated
	 */
	boolean isIsRequired();

	/**
	 * Sets the value of the '{@link queryIT.Question#isIsRequired <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Required</em>' attribute.
	 * @see #isIsRequired()
	 * @generated
	 */
	void setIsRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Range Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Start</em>' attribute.
	 * @see #setRangeStart(int)
	 * @see queryIT.QueryITPackage#getQuestion_RangeStart()
	 * @model
	 * @generated
	 */
	int getRangeStart();

	/**
	 * Sets the value of the '{@link queryIT.Question#getRangeStart <em>Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Start</em>' attribute.
	 * @see #getRangeStart()
	 * @generated
	 */
	void setRangeStart(int value);

	/**
	 * Returns the value of the '<em><b>Range End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range End</em>' attribute.
	 * @see #setRangeEnd(int)
	 * @see queryIT.QueryITPackage#getQuestion_RangeEnd()
	 * @model
	 * @generated
	 */
	int getRangeEnd();

	/**
	 * Sets the value of the '{@link queryIT.Question#getRangeEnd <em>Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range End</em>' attribute.
	 * @see #getRangeEnd()
	 * @generated
	 */
	void setRangeEnd(int value);

	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link queryIT.TextInputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see queryIT.TextInputType
	 * @see #setInputType(TextInputType)
	 * @see queryIT.QueryITPackage#getQuestion_InputType()
	 * @model
	 * @generated
	 */
	TextInputType getInputType();

	/**
	 * Sets the value of the '{@link queryIT.Question#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see queryIT.TextInputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(TextInputType value);

	/**
	 * Returns the value of the '<em><b>Visible If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible If</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible If</em>' attribute.
	 * @see #setVisibleIf(String)
	 * @see queryIT.QueryITPackage#getQuestion_VisibleIf()
	 * @model
	 * @generated
	 */
	String getVisibleIf();

	/**
	 * Sets the value of the '{@link queryIT.Question#getVisibleIf <em>Visible If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible If</em>' attribute.
	 * @see #getVisibleIf()
	 * @generated
	 */
	void setVisibleIf(String value);

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(String)
	 * @see queryIT.QueryITPackage#getQuestion_Placeholder()
	 * @model
	 * @generated
	 */
	String getPlaceholder();

	/**
	 * Sets the value of the '{@link queryIT.Question#getPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #getPlaceholder()
	 * @generated
	 */
	void setPlaceholder(String value);

	/**
	 * Returns the value of the '<em><b>Choices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choices</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' attribute list.
	 * @see queryIT.QueryITPackage#getQuestion_Choices()
	 * @model
	 * @generated
	 */
	EList getChoices();

	/**
	 * Returns the value of the '<em><b>Col Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col Count</em>' attribute.
	 * @see #setColCount(int)
	 * @see queryIT.QueryITPackage#getQuestion_ColCount()
	 * @model
	 * @generated
	 */
	int getColCount();

	/**
	 * Sets the value of the '{@link queryIT.Question#getColCount <em>Col Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Count</em>' attribute.
	 * @see #getColCount()
	 * @generated
	 */
	void setColCount(int value);

	/**
	 * Returns the value of the '<em><b>Matrix Rows</b></em>' containment reference list.
	 * The list contents are of type {@link queryIT.TextValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix Rows</em>' containment reference list.
	 * @see queryIT.QueryITPackage#getQuestion_MatrixRows()
	 * @model type="queryIT.TextValue" containment="true"
	 * @generated
	 */
	EList getMatrixRows();

	/**
	 * Returns the value of the '<em><b>Multi Text Items</b></em>' containment reference list.
	 * The list contents are of type {@link queryIT.MultiTextItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Text Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Text Items</em>' containment reference list.
	 * @see queryIT.QueryITPackage#getQuestion_MultiTextItems()
	 * @model type="queryIT.MultiTextItem" containment="true"
	 * @generated
	 */
	EList getMultiTextItems();

	/**
	 * Returns the value of the '<em><b>Question Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Name</em>' attribute.
	 * @see #setQuestionName(String)
	 * @see queryIT.QueryITPackage#getQuestion_QuestionName()
	 * @model
	 * @generated
	 */
	String getQuestionName();

	/**
	 * Sets the value of the '{@link queryIT.Question#getQuestionName <em>Question Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Name</em>' attribute.
	 * @see #getQuestionName()
	 * @generated
	 */
	void setQuestionName(String value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see queryIT.QueryITPackage#getQuestion_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link queryIT.Question#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Mininum Rate Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mininum Rate Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mininum Rate Description</em>' attribute.
	 * @see #setMininumRateDescription(String)
	 * @see queryIT.QueryITPackage#getQuestion_MininumRateDescription()
	 * @model
	 * @generated
	 */
	String getMininumRateDescription();

	/**
	 * Sets the value of the '{@link queryIT.Question#getMininumRateDescription <em>Mininum Rate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mininum Rate Description</em>' attribute.
	 * @see #getMininumRateDescription()
	 * @generated
	 */
	void setMininumRateDescription(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Rate Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Rate Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Rate Description</em>' attribute.
	 * @see #setMaximumRateDescription(String)
	 * @see queryIT.QueryITPackage#getQuestion_MaximumRateDescription()
	 * @model
	 * @generated
	 */
	String getMaximumRateDescription();

	/**
	 * Sets the value of the '{@link queryIT.Question#getMaximumRateDescription <em>Maximum Rate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Rate Description</em>' attribute.
	 * @see #getMaximumRateDescription()
	 * @generated
	 */
	void setMaximumRateDescription(String value);

	/**
	 * Returns the value of the '<em><b>Matrix Columns</b></em>' containment reference list.
	 * The list contents are of type {@link queryIT.TextValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix Columns</em>' containment reference list.
	 * @see queryIT.QueryITPackage#getQuestion_MatrixColumns()
	 * @model type="queryIT.TextValue" containment="true"
	 * @generated
	 */
	EList getMatrixColumns();

} // Question
