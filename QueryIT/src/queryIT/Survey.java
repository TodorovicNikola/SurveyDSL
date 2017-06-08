/**
 */
package queryIT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link queryIT.Survey#getAuthor <em>Author</em>}</li>
 *   <li>{@link queryIT.Survey#getTitle <em>Title</em>}</li>
 *   <li>{@link queryIT.Survey#getPages <em>Pages</em>}</li>
 *   <li>{@link queryIT.Survey#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link queryIT.Survey#getCompletedMessage <em>Completed Message</em>}</li>
 *   <li>{@link queryIT.Survey#getPageNextText <em>Page Next Text</em>}</li>
 *   <li>{@link queryIT.Survey#getPagePrevText <em>Page Prev Text</em>}</li>
 *   <li>{@link queryIT.Survey#getCompleteText <em>Complete Text</em>}</li>
 *   <li>{@link queryIT.Survey#getQuestionTitleLocation <em>Question Title Location</em>}</li>
 *   <li>{@link queryIT.Survey#isHideNavigationButtons <em>Hide Navigation Buttons</em>}</li>
 *   <li>{@link queryIT.Survey#isHidePageTitles <em>Hide Page Titles</em>}</li>
 *   <li>{@link queryIT.Survey#getShowProgressBar <em>Show Progress Bar</em>}</li>
 *   <li>{@link queryIT.Survey#isHideQuestionNumbers <em>Hide Question Numbers</em>}</li>
 *   <li>{@link queryIT.Survey#isHidePageNumbers <em>Hide Page Numbers</em>}</li>
 * </ul>
 * </p>
 *
 * @see queryIT.QueryITPackage#getSurvey()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='timeLimitNotNegativeS'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot timeLimitNotNegativeS='\n\t\t\ttimeLimit >= 0' timeLimitNotNegativeS$message='\'Time Limit cannot be negative!\''"
 * @generated
 */
public interface Survey extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute list.
	 * @see queryIT.QueryITPackage#getSurvey_Author()
	 * @model
	 * @generated
	 */
	EList getAuthor();

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
	 * @see queryIT.QueryITPackage#getSurvey_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link queryIT.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see queryIT.QueryITPackage#getSurvey_Pages()
	 * @model type="queryIT.Page" containment="true" required="true"
	 * @generated
	 */
	EList getPages();

	/**
	 * Returns the value of the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Limit</em>' attribute.
	 * @see #setTimeLimit(int)
	 * @see queryIT.QueryITPackage#getSurvey_TimeLimit()
	 * @model
	 * @generated
	 */
	int getTimeLimit();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getTimeLimit <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit</em>' attribute.
	 * @see #getTimeLimit()
	 * @generated
	 */
	void setTimeLimit(int value);

	/**
	 * Returns the value of the '<em><b>Completed Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed Message</em>' attribute.
	 * @see #setCompletedMessage(String)
	 * @see queryIT.QueryITPackage#getSurvey_CompletedMessage()
	 * @model
	 * @generated
	 */
	String getCompletedMessage();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getCompletedMessage <em>Completed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed Message</em>' attribute.
	 * @see #getCompletedMessage()
	 * @generated
	 */
	void setCompletedMessage(String value);

	/**
	 * Returns the value of the '<em><b>Page Next Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Next Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Next Text</em>' attribute.
	 * @see #setPageNextText(String)
	 * @see queryIT.QueryITPackage#getSurvey_PageNextText()
	 * @model
	 * @generated
	 */
	String getPageNextText();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getPageNextText <em>Page Next Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Next Text</em>' attribute.
	 * @see #getPageNextText()
	 * @generated
	 */
	void setPageNextText(String value);

	/**
	 * Returns the value of the '<em><b>Page Prev Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Prev Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Prev Text</em>' attribute.
	 * @see #setPagePrevText(String)
	 * @see queryIT.QueryITPackage#getSurvey_PagePrevText()
	 * @model
	 * @generated
	 */
	String getPagePrevText();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getPagePrevText <em>Page Prev Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Prev Text</em>' attribute.
	 * @see #getPagePrevText()
	 * @generated
	 */
	void setPagePrevText(String value);

	/**
	 * Returns the value of the '<em><b>Complete Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Text</em>' attribute.
	 * @see #setCompleteText(String)
	 * @see queryIT.QueryITPackage#getSurvey_CompleteText()
	 * @model
	 * @generated
	 */
	String getCompleteText();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getCompleteText <em>Complete Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Text</em>' attribute.
	 * @see #getCompleteText()
	 * @generated
	 */
	void setCompleteText(String value);

	/**
	 * Returns the value of the '<em><b>Question Title Location</b></em>' attribute.
	 * The literals are from the enumeration {@link queryIT.TitleLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Title Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Title Location</em>' attribute.
	 * @see queryIT.TitleLocation
	 * @see #setQuestionTitleLocation(TitleLocation)
	 * @see queryIT.QueryITPackage#getSurvey_QuestionTitleLocation()
	 * @model
	 * @generated
	 */
	TitleLocation getQuestionTitleLocation();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getQuestionTitleLocation <em>Question Title Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Title Location</em>' attribute.
	 * @see queryIT.TitleLocation
	 * @see #getQuestionTitleLocation()
	 * @generated
	 */
	void setQuestionTitleLocation(TitleLocation value);

	/**
	 * Returns the value of the '<em><b>Hide Navigation Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Navigation Buttons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Navigation Buttons</em>' attribute.
	 * @see #setHideNavigationButtons(boolean)
	 * @see queryIT.QueryITPackage#getSurvey_HideNavigationButtons()
	 * @model
	 * @generated
	 */
	boolean isHideNavigationButtons();

	/**
	 * Sets the value of the '{@link queryIT.Survey#isHideNavigationButtons <em>Hide Navigation Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Navigation Buttons</em>' attribute.
	 * @see #isHideNavigationButtons()
	 * @generated
	 */
	void setHideNavigationButtons(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide Page Titles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Page Titles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Page Titles</em>' attribute.
	 * @see #setHidePageTitles(boolean)
	 * @see queryIT.QueryITPackage#getSurvey_HidePageTitles()
	 * @model
	 * @generated
	 */
	boolean isHidePageTitles();

	/**
	 * Sets the value of the '{@link queryIT.Survey#isHidePageTitles <em>Hide Page Titles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Page Titles</em>' attribute.
	 * @see #isHidePageTitles()
	 * @generated
	 */
	void setHidePageTitles(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Progress Bar</b></em>' attribute.
	 * The literals are from the enumeration {@link queryIT.ProgressBarLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Progress Bar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Progress Bar</em>' attribute.
	 * @see queryIT.ProgressBarLocation
	 * @see #setShowProgressBar(ProgressBarLocation)
	 * @see queryIT.QueryITPackage#getSurvey_ShowProgressBar()
	 * @model
	 * @generated
	 */
	ProgressBarLocation getShowProgressBar();

	/**
	 * Sets the value of the '{@link queryIT.Survey#getShowProgressBar <em>Show Progress Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Progress Bar</em>' attribute.
	 * @see queryIT.ProgressBarLocation
	 * @see #getShowProgressBar()
	 * @generated
	 */
	void setShowProgressBar(ProgressBarLocation value);

	/**
	 * Returns the value of the '<em><b>Hide Question Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Question Numbers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Question Numbers</em>' attribute.
	 * @see #setHideQuestionNumbers(boolean)
	 * @see queryIT.QueryITPackage#getSurvey_HideQuestionNumbers()
	 * @model
	 * @generated
	 */
	boolean isHideQuestionNumbers();

	/**
	 * Sets the value of the '{@link queryIT.Survey#isHideQuestionNumbers <em>Hide Question Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Question Numbers</em>' attribute.
	 * @see #isHideQuestionNumbers()
	 * @generated
	 */
	void setHideQuestionNumbers(boolean value);

	/**
	 * Returns the value of the '<em><b>Hide Page Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Page Numbers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Page Numbers</em>' attribute.
	 * @see #setHidePageNumbers(boolean)
	 * @see queryIT.QueryITPackage#getSurvey_HidePageNumbers()
	 * @model
	 * @generated
	 */
	boolean isHidePageNumbers();

	/**
	 * Sets the value of the '{@link queryIT.Survey#isHidePageNumbers <em>Hide Page Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Page Numbers</em>' attribute.
	 * @see #isHidePageNumbers()
	 * @generated
	 */
	void setHidePageNumbers(boolean value);

} // Survey
