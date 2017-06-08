/**
 */
package queryIT.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import queryIT.Page;
import queryIT.ProgressBarLocation;
import queryIT.QueryITPackage;
import queryIT.Survey;
import queryIT.TitleLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link queryIT.impl.SurveyImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getCompletedMessage <em>Completed Message</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getPageNextText <em>Page Next Text</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getPagePrevText <em>Page Prev Text</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getCompleteText <em>Complete Text</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getQuestionTitleLocation <em>Question Title Location</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#isHideNavigationButtons <em>Hide Navigation Buttons</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#isHidePageTitles <em>Hide Page Titles</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#getShowProgressBar <em>Show Progress Bar</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#isHideQuestionNumbers <em>Hide Question Numbers</em>}</li>
 *   <li>{@link queryIT.impl.SurveyImpl#isHidePageNumbers <em>Hide Page Numbers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurveyImpl extends MinimalEObjectImpl.Container implements Survey {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList author;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList pages;

	/**
	 * The default value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeLimit() <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimit()
	 * @generated
	 * @ordered
	 */
	protected int timeLimit = TIME_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletedMessage() <em>Completed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETED_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompletedMessage() <em>Completed Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedMessage()
	 * @generated
	 * @ordered
	 */
	protected String completedMessage = COMPLETED_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageNextText() <em>Page Next Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNextText()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_NEXT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageNextText() <em>Page Next Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageNextText()
	 * @generated
	 * @ordered
	 */
	protected String pageNextText = PAGE_NEXT_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPagePrevText() <em>Page Prev Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagePrevText()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_PREV_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPagePrevText() <em>Page Prev Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagePrevText()
	 * @generated
	 * @ordered
	 */
	protected String pagePrevText = PAGE_PREV_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteText() <em>Complete Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteText()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLETE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompleteText() <em>Complete Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteText()
	 * @generated
	 * @ordered
	 */
	protected String completeText = COMPLETE_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuestionTitleLocation() <em>Question Title Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionTitleLocation()
	 * @generated
	 * @ordered
	 */
	protected static final TitleLocation QUESTION_TITLE_LOCATION_EDEFAULT = TitleLocation.TOP_LITERAL;

	/**
	 * The cached value of the '{@link #getQuestionTitleLocation() <em>Question Title Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionTitleLocation()
	 * @generated
	 * @ordered
	 */
	protected TitleLocation questionTitleLocation = QUESTION_TITLE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideNavigationButtons() <em>Hide Navigation Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideNavigationButtons()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_NAVIGATION_BUTTONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideNavigationButtons() <em>Hide Navigation Buttons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideNavigationButtons()
	 * @generated
	 * @ordered
	 */
	protected boolean hideNavigationButtons = HIDE_NAVIGATION_BUTTONS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidePageTitles() <em>Hide Page Titles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidePageTitles()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_PAGE_TITLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidePageTitles() <em>Hide Page Titles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidePageTitles()
	 * @generated
	 * @ordered
	 */
	protected boolean hidePageTitles = HIDE_PAGE_TITLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowProgressBar() <em>Show Progress Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowProgressBar()
	 * @generated
	 * @ordered
	 */
	protected static final ProgressBarLocation SHOW_PROGRESS_BAR_EDEFAULT = ProgressBarLocation.TOP_LITERAL;

	/**
	 * The cached value of the '{@link #getShowProgressBar() <em>Show Progress Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowProgressBar()
	 * @generated
	 * @ordered
	 */
	protected ProgressBarLocation showProgressBar = SHOW_PROGRESS_BAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isHideQuestionNumbers() <em>Hide Question Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideQuestionNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_QUESTION_NUMBERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideQuestionNumbers() <em>Hide Question Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideQuestionNumbers()
	 * @generated
	 * @ordered
	 */
	protected boolean hideQuestionNumbers = HIDE_QUESTION_NUMBERS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHidePageNumbers() <em>Hide Page Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidePageNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_PAGE_NUMBERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHidePageNumbers() <em>Hide Page Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHidePageNumbers()
	 * @generated
	 * @ordered
	 */
	protected boolean hidePageNumbers = HIDE_PAGE_NUMBERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryITPackage.Literals.SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuthor() {
		if (author == null) {
			author = new EDataTypeUniqueEList(String.class, this, QueryITPackage.SURVEY__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList(Page.class, this, QueryITPackage.SURVEY__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeLimit() {
		return timeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLimit(int newTimeLimit) {
		int oldTimeLimit = timeLimit;
		timeLimit = newTimeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__TIME_LIMIT, oldTimeLimit, timeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompletedMessage() {
		return completedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletedMessage(String newCompletedMessage) {
		String oldCompletedMessage = completedMessage;
		completedMessage = newCompletedMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__COMPLETED_MESSAGE, oldCompletedMessage, completedMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPageNextText() {
		return pageNextText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageNextText(String newPageNextText) {
		String oldPageNextText = pageNextText;
		pageNextText = newPageNextText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__PAGE_NEXT_TEXT, oldPageNextText, pageNextText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPagePrevText() {
		return pagePrevText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagePrevText(String newPagePrevText) {
		String oldPagePrevText = pagePrevText;
		pagePrevText = newPagePrevText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__PAGE_PREV_TEXT, oldPagePrevText, pagePrevText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompleteText() {
		return completeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteText(String newCompleteText) {
		String oldCompleteText = completeText;
		completeText = newCompleteText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__COMPLETE_TEXT, oldCompleteText, completeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleLocation getQuestionTitleLocation() {
		return questionTitleLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionTitleLocation(TitleLocation newQuestionTitleLocation) {
		TitleLocation oldQuestionTitleLocation = questionTitleLocation;
		questionTitleLocation = newQuestionTitleLocation == null ? QUESTION_TITLE_LOCATION_EDEFAULT : newQuestionTitleLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__QUESTION_TITLE_LOCATION, oldQuestionTitleLocation, questionTitleLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideNavigationButtons() {
		return hideNavigationButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideNavigationButtons(boolean newHideNavigationButtons) {
		boolean oldHideNavigationButtons = hideNavigationButtons;
		hideNavigationButtons = newHideNavigationButtons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__HIDE_NAVIGATION_BUTTONS, oldHideNavigationButtons, hideNavigationButtons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidePageTitles() {
		return hidePageTitles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidePageTitles(boolean newHidePageTitles) {
		boolean oldHidePageTitles = hidePageTitles;
		hidePageTitles = newHidePageTitles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__HIDE_PAGE_TITLES, oldHidePageTitles, hidePageTitles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBarLocation getShowProgressBar() {
		return showProgressBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowProgressBar(ProgressBarLocation newShowProgressBar) {
		ProgressBarLocation oldShowProgressBar = showProgressBar;
		showProgressBar = newShowProgressBar == null ? SHOW_PROGRESS_BAR_EDEFAULT : newShowProgressBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__SHOW_PROGRESS_BAR, oldShowProgressBar, showProgressBar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideQuestionNumbers() {
		return hideQuestionNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideQuestionNumbers(boolean newHideQuestionNumbers) {
		boolean oldHideQuestionNumbers = hideQuestionNumbers;
		hideQuestionNumbers = newHideQuestionNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__HIDE_QUESTION_NUMBERS, oldHideQuestionNumbers, hideQuestionNumbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHidePageNumbers() {
		return hidePageNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidePageNumbers(boolean newHidePageNumbers) {
		boolean oldHidePageNumbers = hidePageNumbers;
		hidePageNumbers = newHidePageNumbers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.SURVEY__HIDE_PAGE_NUMBERS, oldHidePageNumbers, hidePageNumbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryITPackage.SURVEY__PAGES:
				return ((InternalEList)getPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryITPackage.SURVEY__AUTHOR:
				return getAuthor();
			case QueryITPackage.SURVEY__TITLE:
				return getTitle();
			case QueryITPackage.SURVEY__PAGES:
				return getPages();
			case QueryITPackage.SURVEY__TIME_LIMIT:
				return new Integer(getTimeLimit());
			case QueryITPackage.SURVEY__COMPLETED_MESSAGE:
				return getCompletedMessage();
			case QueryITPackage.SURVEY__PAGE_NEXT_TEXT:
				return getPageNextText();
			case QueryITPackage.SURVEY__PAGE_PREV_TEXT:
				return getPagePrevText();
			case QueryITPackage.SURVEY__COMPLETE_TEXT:
				return getCompleteText();
			case QueryITPackage.SURVEY__QUESTION_TITLE_LOCATION:
				return getQuestionTitleLocation();
			case QueryITPackage.SURVEY__HIDE_NAVIGATION_BUTTONS:
				return isHideNavigationButtons() ? Boolean.TRUE : Boolean.FALSE;
			case QueryITPackage.SURVEY__HIDE_PAGE_TITLES:
				return isHidePageTitles() ? Boolean.TRUE : Boolean.FALSE;
			case QueryITPackage.SURVEY__SHOW_PROGRESS_BAR:
				return getShowProgressBar();
			case QueryITPackage.SURVEY__HIDE_QUESTION_NUMBERS:
				return isHideQuestionNumbers() ? Boolean.TRUE : Boolean.FALSE;
			case QueryITPackage.SURVEY__HIDE_PAGE_NUMBERS:
				return isHidePageNumbers() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryITPackage.SURVEY__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection)newValue);
				return;
			case QueryITPackage.SURVEY__TITLE:
				setTitle((String)newValue);
				return;
			case QueryITPackage.SURVEY__PAGES:
				getPages().clear();
				getPages().addAll((Collection)newValue);
				return;
			case QueryITPackage.SURVEY__TIME_LIMIT:
				setTimeLimit(((Integer)newValue).intValue());
				return;
			case QueryITPackage.SURVEY__COMPLETED_MESSAGE:
				setCompletedMessage((String)newValue);
				return;
			case QueryITPackage.SURVEY__PAGE_NEXT_TEXT:
				setPageNextText((String)newValue);
				return;
			case QueryITPackage.SURVEY__PAGE_PREV_TEXT:
				setPagePrevText((String)newValue);
				return;
			case QueryITPackage.SURVEY__COMPLETE_TEXT:
				setCompleteText((String)newValue);
				return;
			case QueryITPackage.SURVEY__QUESTION_TITLE_LOCATION:
				setQuestionTitleLocation((TitleLocation)newValue);
				return;
			case QueryITPackage.SURVEY__HIDE_NAVIGATION_BUTTONS:
				setHideNavigationButtons(((Boolean)newValue).booleanValue());
				return;
			case QueryITPackage.SURVEY__HIDE_PAGE_TITLES:
				setHidePageTitles(((Boolean)newValue).booleanValue());
				return;
			case QueryITPackage.SURVEY__SHOW_PROGRESS_BAR:
				setShowProgressBar((ProgressBarLocation)newValue);
				return;
			case QueryITPackage.SURVEY__HIDE_QUESTION_NUMBERS:
				setHideQuestionNumbers(((Boolean)newValue).booleanValue());
				return;
			case QueryITPackage.SURVEY__HIDE_PAGE_NUMBERS:
				setHidePageNumbers(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryITPackage.SURVEY__AUTHOR:
				getAuthor().clear();
				return;
			case QueryITPackage.SURVEY__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__PAGES:
				getPages().clear();
				return;
			case QueryITPackage.SURVEY__TIME_LIMIT:
				setTimeLimit(TIME_LIMIT_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__COMPLETED_MESSAGE:
				setCompletedMessage(COMPLETED_MESSAGE_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__PAGE_NEXT_TEXT:
				setPageNextText(PAGE_NEXT_TEXT_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__PAGE_PREV_TEXT:
				setPagePrevText(PAGE_PREV_TEXT_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__COMPLETE_TEXT:
				setCompleteText(COMPLETE_TEXT_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__QUESTION_TITLE_LOCATION:
				setQuestionTitleLocation(QUESTION_TITLE_LOCATION_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__HIDE_NAVIGATION_BUTTONS:
				setHideNavigationButtons(HIDE_NAVIGATION_BUTTONS_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__HIDE_PAGE_TITLES:
				setHidePageTitles(HIDE_PAGE_TITLES_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__SHOW_PROGRESS_BAR:
				setShowProgressBar(SHOW_PROGRESS_BAR_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__HIDE_QUESTION_NUMBERS:
				setHideQuestionNumbers(HIDE_QUESTION_NUMBERS_EDEFAULT);
				return;
			case QueryITPackage.SURVEY__HIDE_PAGE_NUMBERS:
				setHidePageNumbers(HIDE_PAGE_NUMBERS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryITPackage.SURVEY__AUTHOR:
				return author != null && !author.isEmpty();
			case QueryITPackage.SURVEY__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case QueryITPackage.SURVEY__PAGES:
				return pages != null && !pages.isEmpty();
			case QueryITPackage.SURVEY__TIME_LIMIT:
				return timeLimit != TIME_LIMIT_EDEFAULT;
			case QueryITPackage.SURVEY__COMPLETED_MESSAGE:
				return COMPLETED_MESSAGE_EDEFAULT == null ? completedMessage != null : !COMPLETED_MESSAGE_EDEFAULT.equals(completedMessage);
			case QueryITPackage.SURVEY__PAGE_NEXT_TEXT:
				return PAGE_NEXT_TEXT_EDEFAULT == null ? pageNextText != null : !PAGE_NEXT_TEXT_EDEFAULT.equals(pageNextText);
			case QueryITPackage.SURVEY__PAGE_PREV_TEXT:
				return PAGE_PREV_TEXT_EDEFAULT == null ? pagePrevText != null : !PAGE_PREV_TEXT_EDEFAULT.equals(pagePrevText);
			case QueryITPackage.SURVEY__COMPLETE_TEXT:
				return COMPLETE_TEXT_EDEFAULT == null ? completeText != null : !COMPLETE_TEXT_EDEFAULT.equals(completeText);
			case QueryITPackage.SURVEY__QUESTION_TITLE_LOCATION:
				return questionTitleLocation != QUESTION_TITLE_LOCATION_EDEFAULT;
			case QueryITPackage.SURVEY__HIDE_NAVIGATION_BUTTONS:
				return hideNavigationButtons != HIDE_NAVIGATION_BUTTONS_EDEFAULT;
			case QueryITPackage.SURVEY__HIDE_PAGE_TITLES:
				return hidePageTitles != HIDE_PAGE_TITLES_EDEFAULT;
			case QueryITPackage.SURVEY__SHOW_PROGRESS_BAR:
				return showProgressBar != SHOW_PROGRESS_BAR_EDEFAULT;
			case QueryITPackage.SURVEY__HIDE_QUESTION_NUMBERS:
				return hideQuestionNumbers != HIDE_QUESTION_NUMBERS_EDEFAULT;
			case QueryITPackage.SURVEY__HIDE_PAGE_NUMBERS:
				return hidePageNumbers != HIDE_PAGE_NUMBERS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (author: ");
		result.append(author);
		result.append(", title: ");
		result.append(title);
		result.append(", timeLimit: ");
		result.append(timeLimit);
		result.append(", completedMessage: ");
		result.append(completedMessage);
		result.append(", pageNextText: ");
		result.append(pageNextText);
		result.append(", pagePrevText: ");
		result.append(pagePrevText);
		result.append(", completeText: ");
		result.append(completeText);
		result.append(", questionTitleLocation: ");
		result.append(questionTitleLocation);
		result.append(", hideNavigationButtons: ");
		result.append(hideNavigationButtons);
		result.append(", hidePageTitles: ");
		result.append(hidePageTitles);
		result.append(", showProgressBar: ");
		result.append(showProgressBar);
		result.append(", hideQuestionNumbers: ");
		result.append(hideQuestionNumbers);
		result.append(", hidePageNumbers: ");
		result.append(hidePageNumbers);
		result.append(')');
		return result.toString();
	}

} //SurveyImpl
