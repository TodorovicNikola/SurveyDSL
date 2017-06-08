/**
 */
package queryIT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see queryIT.QueryITFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface QueryITPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "queryIT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/queryIT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "queryIT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryITPackage eINSTANCE = queryIT.impl.QueryITPackageImpl.init();

	/**
	 * The meta object id for the '{@link queryIT.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.impl.SurveyImpl
	 * @see queryIT.impl.QueryITPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__PAGES = 2;

	/**
	 * The feature id for the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__TIME_LIMIT = 3;

	/**
	 * The feature id for the '<em><b>Completed Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__COMPLETED_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Page Next Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__PAGE_NEXT_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Page Prev Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__PAGE_PREV_TEXT = 6;

	/**
	 * The feature id for the '<em><b>Complete Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__COMPLETE_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Question Title Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__QUESTION_TITLE_LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Hide Navigation Buttons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__HIDE_NAVIGATION_BUTTONS = 9;

	/**
	 * The feature id for the '<em><b>Hide Page Titles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__HIDE_PAGE_TITLES = 10;

	/**
	 * The feature id for the '<em><b>Show Progress Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__SHOW_PROGRESS_BAR = 11;

	/**
	 * The feature id for the '<em><b>Hide Question Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__HIDE_QUESTION_NUMBERS = 12;

	/**
	 * The feature id for the '<em><b>Hide Page Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__HIDE_PAGE_NUMBERS = 13;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link queryIT.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.impl.QuestionImpl
	 * @see queryIT.impl.QueryITPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Range Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RANGE_START = 3;

	/**
	 * The feature id for the '<em><b>Range End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RANGE_END = 4;

	/**
	 * The feature id for the '<em><b>Input Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__INPUT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Visible If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VISIBLE_IF = 6;

	/**
	 * The feature id for the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__PLACEHOLDER = 7;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CHOICES = 8;

	/**
	 * The feature id for the '<em><b>Col Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__COL_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Matrix Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__MATRIX_ROWS = 10;

	/**
	 * The feature id for the '<em><b>Multi Text Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__MULTI_TEXT_ITEMS = 11;

	/**
	 * The feature id for the '<em><b>Question Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION_NAME = 12;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ROWS = 13;

	/**
	 * The feature id for the '<em><b>Mininum Rate Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__MININUM_RATE_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Maximum Rate Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__MAXIMUM_RATE_DESCRIPTION = 15;

	/**
	 * The feature id for the '<em><b>Matrix Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__MATRIX_COLUMNS = 16;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link queryIT.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.impl.PageImpl
	 * @see queryIT.impl.QueryITPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__QUESTIONS = 1;

	/**
	 * The feature id for the '<em><b>Visible If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__VISIBLE_IF = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link queryIT.impl.TextValueImpl <em>Text Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.impl.TextValueImpl
	 * @see queryIT.impl.QueryITPackageImpl#getTextValue()
	 * @generated
	 */
	int TEXT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Text Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link queryIT.impl.MultiTextItemImpl <em>Multi Text Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.impl.MultiTextItemImpl
	 * @see queryIT.impl.QueryITPackageImpl#getMultiTextItem()
	 * @generated
	 */
	int MULTI_TEXT_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TEXT_ITEM__TITLE = 0;

	/**
	 * The number of structural features of the '<em>Multi Text Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TEXT_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link queryIT.QuestionType <em>Question Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.QuestionType
	 * @see queryIT.impl.QueryITPackageImpl#getQuestionType()
	 * @generated
	 */
	int QUESTION_TYPE = 5;

	/**
	 * The meta object id for the '{@link queryIT.TitleLocation <em>Title Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.TitleLocation
	 * @see queryIT.impl.QueryITPackageImpl#getTitleLocation()
	 * @generated
	 */
	int TITLE_LOCATION = 6;

	/**
	 * The meta object id for the '{@link queryIT.ProgressBarLocation <em>Progress Bar Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.ProgressBarLocation
	 * @see queryIT.impl.QueryITPackageImpl#getProgressBarLocation()
	 * @generated
	 */
	int PROGRESS_BAR_LOCATION = 7;

	/**
	 * The meta object id for the '{@link queryIT.TextInputType <em>Text Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.TextInputType
	 * @see queryIT.impl.QueryITPackageImpl#getTextInputType()
	 * @generated
	 */
	int TEXT_INPUT_TYPE = 8;

	/**
	 * The meta object id for the '{@link queryIT.On_off <em>On off</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryIT.On_off
	 * @see queryIT.impl.QueryITPackageImpl#getOn_off()
	 * @generated
	 */
	int ON_OFF = 9;


	/**
	 * Returns the meta object for class '{@link queryIT.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see queryIT.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the attribute list '{@link queryIT.Survey#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Author</em>'.
	 * @see queryIT.Survey#getAuthor()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Author();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see queryIT.Survey#getTitle()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link queryIT.Survey#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see queryIT.Survey#getPages()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Pages();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getTimeLimit <em>Time Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit</em>'.
	 * @see queryIT.Survey#getTimeLimit()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_TimeLimit();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getCompletedMessage <em>Completed Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed Message</em>'.
	 * @see queryIT.Survey#getCompletedMessage()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_CompletedMessage();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getPageNextText <em>Page Next Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Next Text</em>'.
	 * @see queryIT.Survey#getPageNextText()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_PageNextText();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getPagePrevText <em>Page Prev Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Prev Text</em>'.
	 * @see queryIT.Survey#getPagePrevText()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_PagePrevText();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getCompleteText <em>Complete Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Text</em>'.
	 * @see queryIT.Survey#getCompleteText()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_CompleteText();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getQuestionTitleLocation <em>Question Title Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Title Location</em>'.
	 * @see queryIT.Survey#getQuestionTitleLocation()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_QuestionTitleLocation();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#isHideNavigationButtons <em>Hide Navigation Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Navigation Buttons</em>'.
	 * @see queryIT.Survey#isHideNavigationButtons()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_HideNavigationButtons();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#isHidePageTitles <em>Hide Page Titles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Page Titles</em>'.
	 * @see queryIT.Survey#isHidePageTitles()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_HidePageTitles();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#getShowProgressBar <em>Show Progress Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Progress Bar</em>'.
	 * @see queryIT.Survey#getShowProgressBar()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_ShowProgressBar();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#isHideQuestionNumbers <em>Hide Question Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Question Numbers</em>'.
	 * @see queryIT.Survey#isHideQuestionNumbers()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_HideQuestionNumbers();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Survey#isHidePageNumbers <em>Hide Page Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Page Numbers</em>'.
	 * @see queryIT.Survey#isHidePageNumbers()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_HidePageNumbers();

	/**
	 * Returns the meta object for class '{@link queryIT.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see queryIT.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see queryIT.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Type();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see queryIT.Question#getTitle()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Title();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see queryIT.Question#isIsRequired()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getRangeStart <em>Range Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range Start</em>'.
	 * @see queryIT.Question#getRangeStart()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_RangeStart();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getRangeEnd <em>Range End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range End</em>'.
	 * @see queryIT.Question#getRangeEnd()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_RangeEnd();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Type</em>'.
	 * @see queryIT.Question#getInputType()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_InputType();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getVisibleIf <em>Visible If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible If</em>'.
	 * @see queryIT.Question#getVisibleIf()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_VisibleIf();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getPlaceholder <em>Placeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placeholder</em>'.
	 * @see queryIT.Question#getPlaceholder()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Placeholder();

	/**
	 * Returns the meta object for the attribute list '{@link queryIT.Question#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choices</em>'.
	 * @see queryIT.Question#getChoices()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Choices();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getColCount <em>Col Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Col Count</em>'.
	 * @see queryIT.Question#getColCount()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_ColCount();

	/**
	 * Returns the meta object for the containment reference list '{@link queryIT.Question#getMatrixRows <em>Matrix Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix Rows</em>'.
	 * @see queryIT.Question#getMatrixRows()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_MatrixRows();

	/**
	 * Returns the meta object for the containment reference list '{@link queryIT.Question#getMultiTextItems <em>Multi Text Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Text Items</em>'.
	 * @see queryIT.Question#getMultiTextItems()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_MultiTextItems();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getQuestionName <em>Question Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Name</em>'.
	 * @see queryIT.Question#getQuestionName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_QuestionName();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see queryIT.Question#getRows()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Rows();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getMininumRateDescription <em>Mininum Rate Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mininum Rate Description</em>'.
	 * @see queryIT.Question#getMininumRateDescription()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_MininumRateDescription();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Question#getMaximumRateDescription <em>Maximum Rate Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Rate Description</em>'.
	 * @see queryIT.Question#getMaximumRateDescription()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_MaximumRateDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link queryIT.Question#getMatrixColumns <em>Matrix Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix Columns</em>'.
	 * @see queryIT.Question#getMatrixColumns()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_MatrixColumns();

	/**
	 * Returns the meta object for class '{@link queryIT.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see queryIT.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see queryIT.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link queryIT.Page#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see queryIT.Page#getQuestions()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Questions();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.Page#getVisibleIf <em>Visible If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible If</em>'.
	 * @see queryIT.Page#getVisibleIf()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_VisibleIf();

	/**
	 * Returns the meta object for class '{@link queryIT.TextValue <em>Text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Value</em>'.
	 * @see queryIT.TextValue
	 * @generated
	 */
	EClass getTextValue();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.TextValue#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see queryIT.TextValue#getText()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_Text();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.TextValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see queryIT.TextValue#getValue()
	 * @see #getTextValue()
	 * @generated
	 */
	EAttribute getTextValue_Value();

	/**
	 * Returns the meta object for class '{@link queryIT.MultiTextItem <em>Multi Text Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Text Item</em>'.
	 * @see queryIT.MultiTextItem
	 * @generated
	 */
	EClass getMultiTextItem();

	/**
	 * Returns the meta object for the attribute '{@link queryIT.MultiTextItem#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see queryIT.MultiTextItem#getTitle()
	 * @see #getMultiTextItem()
	 * @generated
	 */
	EAttribute getMultiTextItem_Title();

	/**
	 * Returns the meta object for enum '{@link queryIT.QuestionType <em>Question Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Question Type</em>'.
	 * @see queryIT.QuestionType
	 * @generated
	 */
	EEnum getQuestionType();

	/**
	 * Returns the meta object for enum '{@link queryIT.TitleLocation <em>Title Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Title Location</em>'.
	 * @see queryIT.TitleLocation
	 * @generated
	 */
	EEnum getTitleLocation();

	/**
	 * Returns the meta object for enum '{@link queryIT.ProgressBarLocation <em>Progress Bar Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Progress Bar Location</em>'.
	 * @see queryIT.ProgressBarLocation
	 * @generated
	 */
	EEnum getProgressBarLocation();

	/**
	 * Returns the meta object for enum '{@link queryIT.TextInputType <em>Text Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Input Type</em>'.
	 * @see queryIT.TextInputType
	 * @generated
	 */
	EEnum getTextInputType();

	/**
	 * Returns the meta object for enum '{@link queryIT.On_off <em>On off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On off</em>'.
	 * @see queryIT.On_off
	 * @generated
	 */
	EEnum getOn_off();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryITFactory getQueryITFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link queryIT.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.impl.SurveyImpl
		 * @see queryIT.impl.QueryITPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__AUTHOR = eINSTANCE.getSurvey_Author();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__TITLE = eINSTANCE.getSurvey_Title();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__PAGES = eINSTANCE.getSurvey_Pages();

		/**
		 * The meta object literal for the '<em><b>Time Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__TIME_LIMIT = eINSTANCE.getSurvey_TimeLimit();

		/**
		 * The meta object literal for the '<em><b>Completed Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__COMPLETED_MESSAGE = eINSTANCE.getSurvey_CompletedMessage();

		/**
		 * The meta object literal for the '<em><b>Page Next Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__PAGE_NEXT_TEXT = eINSTANCE.getSurvey_PageNextText();

		/**
		 * The meta object literal for the '<em><b>Page Prev Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__PAGE_PREV_TEXT = eINSTANCE.getSurvey_PagePrevText();

		/**
		 * The meta object literal for the '<em><b>Complete Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__COMPLETE_TEXT = eINSTANCE.getSurvey_CompleteText();

		/**
		 * The meta object literal for the '<em><b>Question Title Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__QUESTION_TITLE_LOCATION = eINSTANCE.getSurvey_QuestionTitleLocation();

		/**
		 * The meta object literal for the '<em><b>Hide Navigation Buttons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__HIDE_NAVIGATION_BUTTONS = eINSTANCE.getSurvey_HideNavigationButtons();

		/**
		 * The meta object literal for the '<em><b>Hide Page Titles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__HIDE_PAGE_TITLES = eINSTANCE.getSurvey_HidePageTitles();

		/**
		 * The meta object literal for the '<em><b>Show Progress Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__SHOW_PROGRESS_BAR = eINSTANCE.getSurvey_ShowProgressBar();

		/**
		 * The meta object literal for the '<em><b>Hide Question Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__HIDE_QUESTION_NUMBERS = eINSTANCE.getSurvey_HideQuestionNumbers();

		/**
		 * The meta object literal for the '<em><b>Hide Page Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__HIDE_PAGE_NUMBERS = eINSTANCE.getSurvey_HidePageNumbers();

		/**
		 * The meta object literal for the '{@link queryIT.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.impl.QuestionImpl
		 * @see queryIT.impl.QueryITPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TYPE = eINSTANCE.getQuestion_Type();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TITLE = eINSTANCE.getQuestion_Title();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__IS_REQUIRED = eINSTANCE.getQuestion_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Range Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__RANGE_START = eINSTANCE.getQuestion_RangeStart();

		/**
		 * The meta object literal for the '<em><b>Range End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__RANGE_END = eINSTANCE.getQuestion_RangeEnd();

		/**
		 * The meta object literal for the '<em><b>Input Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__INPUT_TYPE = eINSTANCE.getQuestion_InputType();

		/**
		 * The meta object literal for the '<em><b>Visible If</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__VISIBLE_IF = eINSTANCE.getQuestion_VisibleIf();

		/**
		 * The meta object literal for the '<em><b>Placeholder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__PLACEHOLDER = eINSTANCE.getQuestion_Placeholder();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__CHOICES = eINSTANCE.getQuestion_Choices();

		/**
		 * The meta object literal for the '<em><b>Col Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__COL_COUNT = eINSTANCE.getQuestion_ColCount();

		/**
		 * The meta object literal for the '<em><b>Matrix Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__MATRIX_ROWS = eINSTANCE.getQuestion_MatrixRows();

		/**
		 * The meta object literal for the '<em><b>Multi Text Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__MULTI_TEXT_ITEMS = eINSTANCE.getQuestion_MultiTextItems();

		/**
		 * The meta object literal for the '<em><b>Question Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION_NAME = eINSTANCE.getQuestion_QuestionName();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ROWS = eINSTANCE.getQuestion_Rows();

		/**
		 * The meta object literal for the '<em><b>Mininum Rate Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__MININUM_RATE_DESCRIPTION = eINSTANCE.getQuestion_MininumRateDescription();

		/**
		 * The meta object literal for the '<em><b>Maximum Rate Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__MAXIMUM_RATE_DESCRIPTION = eINSTANCE.getQuestion_MaximumRateDescription();

		/**
		 * The meta object literal for the '<em><b>Matrix Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__MATRIX_COLUMNS = eINSTANCE.getQuestion_MatrixColumns();

		/**
		 * The meta object literal for the '{@link queryIT.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.impl.PageImpl
		 * @see queryIT.impl.QueryITPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__QUESTIONS = eINSTANCE.getPage_Questions();

		/**
		 * The meta object literal for the '<em><b>Visible If</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__VISIBLE_IF = eINSTANCE.getPage_VisibleIf();

		/**
		 * The meta object literal for the '{@link queryIT.impl.TextValueImpl <em>Text Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.impl.TextValueImpl
		 * @see queryIT.impl.QueryITPackageImpl#getTextValue()
		 * @generated
		 */
		EClass TEXT_VALUE = eINSTANCE.getTextValue();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE__TEXT = eINSTANCE.getTextValue_Text();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_VALUE__VALUE = eINSTANCE.getTextValue_Value();

		/**
		 * The meta object literal for the '{@link queryIT.impl.MultiTextItemImpl <em>Multi Text Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.impl.MultiTextItemImpl
		 * @see queryIT.impl.QueryITPackageImpl#getMultiTextItem()
		 * @generated
		 */
		EClass MULTI_TEXT_ITEM = eINSTANCE.getMultiTextItem();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_TEXT_ITEM__TITLE = eINSTANCE.getMultiTextItem_Title();

		/**
		 * The meta object literal for the '{@link queryIT.QuestionType <em>Question Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.QuestionType
		 * @see queryIT.impl.QueryITPackageImpl#getQuestionType()
		 * @generated
		 */
		EEnum QUESTION_TYPE = eINSTANCE.getQuestionType();

		/**
		 * The meta object literal for the '{@link queryIT.TitleLocation <em>Title Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.TitleLocation
		 * @see queryIT.impl.QueryITPackageImpl#getTitleLocation()
		 * @generated
		 */
		EEnum TITLE_LOCATION = eINSTANCE.getTitleLocation();

		/**
		 * The meta object literal for the '{@link queryIT.ProgressBarLocation <em>Progress Bar Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.ProgressBarLocation
		 * @see queryIT.impl.QueryITPackageImpl#getProgressBarLocation()
		 * @generated
		 */
		EEnum PROGRESS_BAR_LOCATION = eINSTANCE.getProgressBarLocation();

		/**
		 * The meta object literal for the '{@link queryIT.TextInputType <em>Text Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.TextInputType
		 * @see queryIT.impl.QueryITPackageImpl#getTextInputType()
		 * @generated
		 */
		EEnum TEXT_INPUT_TYPE = eINSTANCE.getTextInputType();

		/**
		 * The meta object literal for the '{@link queryIT.On_off <em>On off</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryIT.On_off
		 * @see queryIT.impl.QueryITPackageImpl#getOn_off()
		 * @generated
		 */
		EEnum ON_OFF = eINSTANCE.getOn_off();

	}

} //QueryITPackage
