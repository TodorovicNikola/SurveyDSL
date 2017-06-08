/**
 */
package queryIT.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import queryIT.MultiTextItem;
import queryIT.On_off;
import queryIT.Page;
import queryIT.ProgressBarLocation;
import queryIT.QueryITFactory;
import queryIT.QueryITPackage;
import queryIT.Question;
import queryIT.QuestionType;
import queryIT.Survey;
import queryIT.TextInputType;
import queryIT.TextValue;
import queryIT.TitleLocation;

import queryIT.util.QueryITValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryITPackageImpl extends EPackageImpl implements QueryITPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiTextItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum titleLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum progressBarLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textInputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum on_offEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see queryIT.QueryITPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueryITPackageImpl() {
		super(eNS_URI, QueryITFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QueryITPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueryITPackage init() {
		if (isInited) return (QueryITPackage)EPackage.Registry.INSTANCE.getEPackage(QueryITPackage.eNS_URI);

		// Obtain or create and register package
		QueryITPackageImpl theQueryITPackage = (QueryITPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QueryITPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QueryITPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQueryITPackage.createPackageContents();

		// Initialize created meta-data
		theQueryITPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQueryITPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return QueryITValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQueryITPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueryITPackage.eNS_URI, theQueryITPackage);
		return theQueryITPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurvey() {
		return surveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_Author() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_Title() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurvey_Pages() {
		return (EReference)surveyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_TimeLimit() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_CompletedMessage() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_PageNextText() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_PagePrevText() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_CompleteText() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_QuestionTitleLocation() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_HideNavigationButtons() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_HidePageTitles() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_ShowProgressBar() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_HideQuestionNumbers() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurvey_HidePageNumbers() {
		return (EAttribute)surveyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Type() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Title() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_IsRequired() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_RangeStart() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_RangeEnd() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_InputType() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_VisibleIf() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Placeholder() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Choices() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_ColCount() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_MatrixRows() {
		return (EReference)questionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_MultiTextItems() {
		return (EReference)questionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_QuestionName() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Rows() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_MininumRateDescription() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_MaximumRateDescription() {
		return (EAttribute)questionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_MatrixColumns() {
		return (EReference)questionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Title() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Questions() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_VisibleIf() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextValue() {
		return textValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextValue_Text() {
		return (EAttribute)textValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextValue_Value() {
		return (EAttribute)textValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiTextItem() {
		return multiTextItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiTextItem_Title() {
		return (EAttribute)multiTextItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionType() {
		return questionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTitleLocation() {
		return titleLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProgressBarLocation() {
		return progressBarLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextInputType() {
		return textInputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOn_off() {
		return on_offEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryITFactory getQueryITFactory() {
		return (QueryITFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		surveyEClass = createEClass(SURVEY);
		createEAttribute(surveyEClass, SURVEY__AUTHOR);
		createEAttribute(surveyEClass, SURVEY__TITLE);
		createEReference(surveyEClass, SURVEY__PAGES);
		createEAttribute(surveyEClass, SURVEY__TIME_LIMIT);
		createEAttribute(surveyEClass, SURVEY__COMPLETED_MESSAGE);
		createEAttribute(surveyEClass, SURVEY__PAGE_NEXT_TEXT);
		createEAttribute(surveyEClass, SURVEY__PAGE_PREV_TEXT);
		createEAttribute(surveyEClass, SURVEY__COMPLETE_TEXT);
		createEAttribute(surveyEClass, SURVEY__QUESTION_TITLE_LOCATION);
		createEAttribute(surveyEClass, SURVEY__HIDE_NAVIGATION_BUTTONS);
		createEAttribute(surveyEClass, SURVEY__HIDE_PAGE_TITLES);
		createEAttribute(surveyEClass, SURVEY__SHOW_PROGRESS_BAR);
		createEAttribute(surveyEClass, SURVEY__HIDE_QUESTION_NUMBERS);
		createEAttribute(surveyEClass, SURVEY__HIDE_PAGE_NUMBERS);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__TYPE);
		createEAttribute(questionEClass, QUESTION__TITLE);
		createEAttribute(questionEClass, QUESTION__IS_REQUIRED);
		createEAttribute(questionEClass, QUESTION__RANGE_START);
		createEAttribute(questionEClass, QUESTION__RANGE_END);
		createEAttribute(questionEClass, QUESTION__INPUT_TYPE);
		createEAttribute(questionEClass, QUESTION__VISIBLE_IF);
		createEAttribute(questionEClass, QUESTION__PLACEHOLDER);
		createEAttribute(questionEClass, QUESTION__CHOICES);
		createEAttribute(questionEClass, QUESTION__COL_COUNT);
		createEReference(questionEClass, QUESTION__MATRIX_ROWS);
		createEReference(questionEClass, QUESTION__MULTI_TEXT_ITEMS);
		createEAttribute(questionEClass, QUESTION__QUESTION_NAME);
		createEAttribute(questionEClass, QUESTION__ROWS);
		createEAttribute(questionEClass, QUESTION__MININUM_RATE_DESCRIPTION);
		createEAttribute(questionEClass, QUESTION__MAXIMUM_RATE_DESCRIPTION);
		createEReference(questionEClass, QUESTION__MATRIX_COLUMNS);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__TITLE);
		createEReference(pageEClass, PAGE__QUESTIONS);
		createEAttribute(pageEClass, PAGE__VISIBLE_IF);

		textValueEClass = createEClass(TEXT_VALUE);
		createEAttribute(textValueEClass, TEXT_VALUE__TEXT);
		createEAttribute(textValueEClass, TEXT_VALUE__VALUE);

		multiTextItemEClass = createEClass(MULTI_TEXT_ITEM);
		createEAttribute(multiTextItemEClass, MULTI_TEXT_ITEM__TITLE);

		// Create enums
		questionTypeEEnum = createEEnum(QUESTION_TYPE);
		titleLocationEEnum = createEEnum(TITLE_LOCATION);
		progressBarLocationEEnum = createEEnum(PROGRESS_BAR_LOCATION);
		textInputTypeEEnum = createEEnum(TEXT_INPUT_TYPE);
		on_offEEnum = createEEnum(ON_OFF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(surveyEClass, Survey.class, "Survey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurvey_Author(), ecorePackage.getEString(), "author", null, 0, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_Title(), ecorePackage.getEString(), "title", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurvey_Pages(), this.getPage(), null, "pages", null, 1, -1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_TimeLimit(), ecorePackage.getEInt(), "timeLimit", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_CompletedMessage(), ecorePackage.getEString(), "completedMessage", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_PageNextText(), ecorePackage.getEString(), "pageNextText", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_PagePrevText(), ecorePackage.getEString(), "pagePrevText", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_CompleteText(), ecorePackage.getEString(), "completeText", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_QuestionTitleLocation(), this.getTitleLocation(), "questionTitleLocation", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_HideNavigationButtons(), ecorePackage.getEBoolean(), "hideNavigationButtons", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_HidePageTitles(), ecorePackage.getEBoolean(), "hidePageTitles", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_ShowProgressBar(), this.getProgressBarLocation(), "showProgressBar", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_HideQuestionNumbers(), ecorePackage.getEBoolean(), "hideQuestionNumbers", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSurvey_HidePageNumbers(), ecorePackage.getEBoolean(), "hidePageNumbers", null, 0, 1, Survey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Type(), this.getQuestionType(), "type", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Title(), ecorePackage.getEString(), "title", null, 1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_RangeStart(), ecorePackage.getEInt(), "rangeStart", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_RangeEnd(), ecorePackage.getEInt(), "rangeEnd", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_InputType(), this.getTextInputType(), "inputType", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_VisibleIf(), ecorePackage.getEString(), "visibleIf", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Placeholder(), ecorePackage.getEString(), "placeholder", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Choices(), ecorePackage.getEString(), "choices", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_ColCount(), ecorePackage.getEInt(), "colCount", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_MatrixRows(), this.getTextValue(), null, "matrixRows", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_MultiTextItems(), this.getMultiTextItem(), null, "multiTextItems", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_QuestionName(), ecorePackage.getEString(), "questionName", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Rows(), ecorePackage.getEInt(), "rows", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_MininumRateDescription(), ecorePackage.getEString(), "mininumRateDescription", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_MaximumRateDescription(), ecorePackage.getEString(), "maximumRateDescription", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_MatrixColumns(), this.getTextValue(), null, "matrixColumns", null, 0, -1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Questions(), this.getQuestion(), null, "questions", null, 1, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPage_VisibleIf(), ecorePackage.getEString(), "visibleIf", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textValueEClass, TextValue.class, "TextValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextValue_Text(), ecorePackage.getEString(), "text", null, 1, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiTextItemEClass, MultiTextItem.class, "MultiTextItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiTextItem_Title(), ecorePackage.getEString(), "title", null, 1, 1, MultiTextItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(questionTypeEEnum, QuestionType.class, "QuestionType");
		addEEnumLiteral(questionTypeEEnum, QuestionType.TEXT_LITERAL);
		addEEnumLiteral(questionTypeEEnum, QuestionType.RADIOGROUP_LITERAL);
		addEEnumLiteral(questionTypeEEnum, QuestionType.CHECKBOX_LITERAL);
		addEEnumLiteral(questionTypeEEnum, QuestionType.DROPDOWN_LITERAL);
		addEEnumLiteral(questionTypeEEnum, QuestionType.COMMENT_LITERAL);
		addEEnumLiteral(questionTypeEEnum, QuestionType.MATRIX_LITERAL);
		addEEnumLiteral(questionTypeEEnum, QuestionType.MULTIPLE_TEXT_LITERAL);
		addEEnumLiteral(questionTypeEEnum, QuestionType.RATING_LITERAL);

		initEEnum(titleLocationEEnum, TitleLocation.class, "TitleLocation");
		addEEnumLiteral(titleLocationEEnum, TitleLocation.TOP_LITERAL);
		addEEnumLiteral(titleLocationEEnum, TitleLocation.BOTTOM_LITERAL);

		initEEnum(progressBarLocationEEnum, ProgressBarLocation.class, "ProgressBarLocation");
		addEEnumLiteral(progressBarLocationEEnum, ProgressBarLocation.TOP_LITERAL);
		addEEnumLiteral(progressBarLocationEEnum, ProgressBarLocation.OFF_LITERAL);
		addEEnumLiteral(progressBarLocationEEnum, ProgressBarLocation.BOTTOM_LITERAL);

		initEEnum(textInputTypeEEnum, TextInputType.class, "TextInputType");
		addEEnumLiteral(textInputTypeEEnum, TextInputType.TEXT_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.TIME_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.RANGE_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.COLOR_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.DATE_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.DATETIME_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.EMAIL_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.MONTH_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.NUMBER_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.PASSWORD_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.TEL_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.URL_LITERAL);
		addEEnumLiteral(textInputTypeEEnum, TextInputType.WEEK_LITERAL);

		initEEnum(on_offEEnum, On_off.class, "On_off");
		addEEnumLiteral(on_offEEnum, On_off.ON_LITERAL);
		addEEnumLiteral(on_offEEnum, On_off.OFF_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });					
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (surveyEClass, 
		   source, 
		   new String[] {
			 "constraints", "timeLimitNotNegativeS"
		   });			
		addAnnotation
		  (questionEClass, 
		   source, 
		   new String[] {
			 "constraints", "rangeInvalid matrixHasRowsAndCols multipleTextHasItems choicesUseless choicesNeeded inputType"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (surveyEClass, 
		   source, 
		   new String[] {
			 "timeLimitNotNegativeS", "\n\t\t\ttimeLimit >= 0",
			 "timeLimitNotNegativeS$message", "\'Time Limit cannot be negative!\'"
		   });			
		addAnnotation
		  (questionEClass, 
		   source, 
		   new String[] {
			 "rangeInvalid", "\n\t\t\tif(type = QuestionType::text and inputType = TextInputType::range) then\n\t\t\t\trangeStart <> rangeEnd\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif",
			 "rangeInvalid$message", "\'Range Start and Range End cannot be equal.\'",
			 "matrixHasRowsAndCols", "\n\t\t\tif(type = QuestionType::matrix) then\n\t\t\t\tmatrixRows->size() > 0 and matrixColumns->size() > 0\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif",
			 "matrixHasRowsAndCols$message", "\'matrixRows and matrixColumns must be declared for the Question of type \\\'Matrix\\\'\'",
			 "multipleTextHasItems", "\n\t\t\tif(type = QuestionType::multipleText) then\n\t\t\t\tmultiTextItems->size() > 0\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif",
			 "multipleTextHasItems$message", "\'Question of type \\\'MultipleText\\\' must have atleast one multiTextItem declared\'",
			 "choicesUseless", "\n\t\t\tif(type <> QuestionType::radiogroup and type <> QuestionType::dropdown and type <> QuestionType::checkbox) then\n\t\t\t\tchoices-> isEmpty() = true\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif",
			 "choicesUseless$message", "\'Choices are useless for the seleced type of Question\'",
			 "choicesNeeded", "\n\t\t\tif(type = QuestionType::radiogroup or type = QuestionType::dropdown or type = QuestionType::checkbox) then\n\t\t\t\tchoices-> isEmpty() = false\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif",
			 "choicesNeeded$message", "\'Choices are needed for the seleced type of Question\'",
			 "inputType", "\n\t\t\tif(type <> QuestionType::text) then\n\t\t\t\tinputType = TextInputType::text\n\t\t\telse\n\t\t\t\ttrue\n\t\t\tendif",
			 "inputType$message", "\'InputType is used only for questions of type \\\'Text\\\'\'"
		   });
	}

} //QueryITPackageImpl
