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

import queryIT.MultiTextItem;
import queryIT.QueryITPackage;
import queryIT.Question;
import queryIT.QuestionType;
import queryIT.TextInputType;
import queryIT.TextValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link queryIT.impl.QuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#isIsRequired <em>Is Required</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getRangeStart <em>Range Start</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getRangeEnd <em>Range End</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getVisibleIf <em>Visible If</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getPlaceholder <em>Placeholder</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getChoices <em>Choices</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getColCount <em>Col Count</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getMatrixRows <em>Matrix Rows</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getMultiTextItems <em>Multi Text Items</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getQuestionName <em>Question Name</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getMininumRateDescription <em>Mininum Rate Description</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getMaximumRateDescription <em>Maximum Rate Description</em>}</li>
 *   <li>{@link queryIT.impl.QuestionImpl#getMatrixColumns <em>Matrix Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QuestionType TYPE_EDEFAULT = QuestionType.TEXT_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QuestionType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean isRequired = IS_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeStart() <em>Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeStart()
	 * @generated
	 * @ordered
	 */
	protected static final int RANGE_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRangeStart() <em>Range Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeStart()
	 * @generated
	 * @ordered
	 */
	protected int rangeStart = RANGE_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeEnd() <em>Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int RANGE_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRangeEnd() <em>Range End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeEnd()
	 * @generated
	 * @ordered
	 */
	protected int rangeEnd = RANGE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected static final TextInputType INPUT_TYPE_EDEFAULT = TextInputType.TEXT_LITERAL;

	/**
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
	protected TextInputType inputType = INPUT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleIf() <em>Visible If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleIf()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleIf() <em>Visible If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleIf()
	 * @generated
	 * @ordered
	 */
	protected String visibleIf = VISIBLE_IF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final String PLACEHOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected String placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoices() <em>Choices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoices()
	 * @generated
	 * @ordered
	 */
	protected EList choices;

	/**
	 * The default value of the '{@link #getColCount() <em>Col Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColCount() <em>Col Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColCount()
	 * @generated
	 * @ordered
	 */
	protected int colCount = COL_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatrixRows() <em>Matrix Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixRows()
	 * @generated
	 * @ordered
	 */
	protected EList matrixRows;

	/**
	 * The cached value of the '{@link #getMultiTextItems() <em>Multi Text Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiTextItems()
	 * @generated
	 * @ordered
	 */
	protected EList multiTextItems;

	/**
	 * The default value of the '{@link #getQuestionName() <em>Question Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionName() <em>Question Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionName()
	 * @generated
	 * @ordered
	 */
	protected String questionName = QUESTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMininumRateDescription() <em>Mininum Rate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMininumRateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MININUM_RATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMininumRateDescription() <em>Mininum Rate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMininumRateDescription()
	 * @generated
	 * @ordered
	 */
	protected String mininumRateDescription = MININUM_RATE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRateDescription() <em>Maximum Rate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_RATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRateDescription() <em>Maximum Rate Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRateDescription()
	 * @generated
	 * @ordered
	 */
	protected String maximumRateDescription = MAXIMUM_RATE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatrixColumns() <em>Matrix Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixColumns()
	 * @generated
	 * @ordered
	 */
	protected EList matrixColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryITPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QuestionType newType) {
		QuestionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRequired(boolean newIsRequired) {
		boolean oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__IS_REQUIRED, oldIsRequired, isRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRangeStart() {
		return rangeStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeStart(int newRangeStart) {
		int oldRangeStart = rangeStart;
		rangeStart = newRangeStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__RANGE_START, oldRangeStart, rangeStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRangeEnd() {
		return rangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeEnd(int newRangeEnd) {
		int oldRangeEnd = rangeEnd;
		rangeEnd = newRangeEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__RANGE_END, oldRangeEnd, rangeEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType getInputType() {
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputType(TextInputType newInputType) {
		TextInputType oldInputType = inputType;
		inputType = newInputType == null ? INPUT_TYPE_EDEFAULT : newInputType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__INPUT_TYPE, oldInputType, inputType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleIf() {
		return visibleIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleIf(String newVisibleIf) {
		String oldVisibleIf = visibleIf;
		visibleIf = newVisibleIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__VISIBLE_IF, oldVisibleIf, visibleIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(String newPlaceholder) {
		String oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getChoices() {
		if (choices == null) {
			choices = new EDataTypeUniqueEList(String.class, this, QueryITPackage.QUESTION__CHOICES);
		}
		return choices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColCount() {
		return colCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColCount(int newColCount) {
		int oldColCount = colCount;
		colCount = newColCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__COL_COUNT, oldColCount, colCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMatrixRows() {
		if (matrixRows == null) {
			matrixRows = new EObjectContainmentEList(TextValue.class, this, QueryITPackage.QUESTION__MATRIX_ROWS);
		}
		return matrixRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMultiTextItems() {
		if (multiTextItems == null) {
			multiTextItems = new EObjectContainmentEList(MultiTextItem.class, this, QueryITPackage.QUESTION__MULTI_TEXT_ITEMS);
		}
		return multiTextItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionName() {
		return questionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionName(String newQuestionName) {
		String oldQuestionName = questionName;
		questionName = newQuestionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__QUESTION_NAME, oldQuestionName, questionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(int newRows) {
		int oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMininumRateDescription() {
		return mininumRateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMininumRateDescription(String newMininumRateDescription) {
		String oldMininumRateDescription = mininumRateDescription;
		mininumRateDescription = newMininumRateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__MININUM_RATE_DESCRIPTION, oldMininumRateDescription, mininumRateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumRateDescription() {
		return maximumRateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRateDescription(String newMaximumRateDescription) {
		String oldMaximumRateDescription = maximumRateDescription;
		maximumRateDescription = newMaximumRateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.QUESTION__MAXIMUM_RATE_DESCRIPTION, oldMaximumRateDescription, maximumRateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMatrixColumns() {
		if (matrixColumns == null) {
			matrixColumns = new EObjectContainmentEList(TextValue.class, this, QueryITPackage.QUESTION__MATRIX_COLUMNS);
		}
		return matrixColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryITPackage.QUESTION__MATRIX_ROWS:
				return ((InternalEList)getMatrixRows()).basicRemove(otherEnd, msgs);
			case QueryITPackage.QUESTION__MULTI_TEXT_ITEMS:
				return ((InternalEList)getMultiTextItems()).basicRemove(otherEnd, msgs);
			case QueryITPackage.QUESTION__MATRIX_COLUMNS:
				return ((InternalEList)getMatrixColumns()).basicRemove(otherEnd, msgs);
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
			case QueryITPackage.QUESTION__TYPE:
				return getType();
			case QueryITPackage.QUESTION__TITLE:
				return getTitle();
			case QueryITPackage.QUESTION__IS_REQUIRED:
				return isIsRequired() ? Boolean.TRUE : Boolean.FALSE;
			case QueryITPackage.QUESTION__RANGE_START:
				return new Integer(getRangeStart());
			case QueryITPackage.QUESTION__RANGE_END:
				return new Integer(getRangeEnd());
			case QueryITPackage.QUESTION__INPUT_TYPE:
				return getInputType();
			case QueryITPackage.QUESTION__VISIBLE_IF:
				return getVisibleIf();
			case QueryITPackage.QUESTION__PLACEHOLDER:
				return getPlaceholder();
			case QueryITPackage.QUESTION__CHOICES:
				return getChoices();
			case QueryITPackage.QUESTION__COL_COUNT:
				return new Integer(getColCount());
			case QueryITPackage.QUESTION__MATRIX_ROWS:
				return getMatrixRows();
			case QueryITPackage.QUESTION__MULTI_TEXT_ITEMS:
				return getMultiTextItems();
			case QueryITPackage.QUESTION__QUESTION_NAME:
				return getQuestionName();
			case QueryITPackage.QUESTION__ROWS:
				return new Integer(getRows());
			case QueryITPackage.QUESTION__MININUM_RATE_DESCRIPTION:
				return getMininumRateDescription();
			case QueryITPackage.QUESTION__MAXIMUM_RATE_DESCRIPTION:
				return getMaximumRateDescription();
			case QueryITPackage.QUESTION__MATRIX_COLUMNS:
				return getMatrixColumns();
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
			case QueryITPackage.QUESTION__TYPE:
				setType((QuestionType)newValue);
				return;
			case QueryITPackage.QUESTION__TITLE:
				setTitle((String)newValue);
				return;
			case QueryITPackage.QUESTION__IS_REQUIRED:
				setIsRequired(((Boolean)newValue).booleanValue());
				return;
			case QueryITPackage.QUESTION__RANGE_START:
				setRangeStart(((Integer)newValue).intValue());
				return;
			case QueryITPackage.QUESTION__RANGE_END:
				setRangeEnd(((Integer)newValue).intValue());
				return;
			case QueryITPackage.QUESTION__INPUT_TYPE:
				setInputType((TextInputType)newValue);
				return;
			case QueryITPackage.QUESTION__VISIBLE_IF:
				setVisibleIf((String)newValue);
				return;
			case QueryITPackage.QUESTION__PLACEHOLDER:
				setPlaceholder((String)newValue);
				return;
			case QueryITPackage.QUESTION__CHOICES:
				getChoices().clear();
				getChoices().addAll((Collection)newValue);
				return;
			case QueryITPackage.QUESTION__COL_COUNT:
				setColCount(((Integer)newValue).intValue());
				return;
			case QueryITPackage.QUESTION__MATRIX_ROWS:
				getMatrixRows().clear();
				getMatrixRows().addAll((Collection)newValue);
				return;
			case QueryITPackage.QUESTION__MULTI_TEXT_ITEMS:
				getMultiTextItems().clear();
				getMultiTextItems().addAll((Collection)newValue);
				return;
			case QueryITPackage.QUESTION__QUESTION_NAME:
				setQuestionName((String)newValue);
				return;
			case QueryITPackage.QUESTION__ROWS:
				setRows(((Integer)newValue).intValue());
				return;
			case QueryITPackage.QUESTION__MININUM_RATE_DESCRIPTION:
				setMininumRateDescription((String)newValue);
				return;
			case QueryITPackage.QUESTION__MAXIMUM_RATE_DESCRIPTION:
				setMaximumRateDescription((String)newValue);
				return;
			case QueryITPackage.QUESTION__MATRIX_COLUMNS:
				getMatrixColumns().clear();
				getMatrixColumns().addAll((Collection)newValue);
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
			case QueryITPackage.QUESTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__IS_REQUIRED:
				setIsRequired(IS_REQUIRED_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__RANGE_START:
				setRangeStart(RANGE_START_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__RANGE_END:
				setRangeEnd(RANGE_END_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__INPUT_TYPE:
				setInputType(INPUT_TYPE_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__VISIBLE_IF:
				setVisibleIf(VISIBLE_IF_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__CHOICES:
				getChoices().clear();
				return;
			case QueryITPackage.QUESTION__COL_COUNT:
				setColCount(COL_COUNT_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__MATRIX_ROWS:
				getMatrixRows().clear();
				return;
			case QueryITPackage.QUESTION__MULTI_TEXT_ITEMS:
				getMultiTextItems().clear();
				return;
			case QueryITPackage.QUESTION__QUESTION_NAME:
				setQuestionName(QUESTION_NAME_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__MININUM_RATE_DESCRIPTION:
				setMininumRateDescription(MININUM_RATE_DESCRIPTION_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__MAXIMUM_RATE_DESCRIPTION:
				setMaximumRateDescription(MAXIMUM_RATE_DESCRIPTION_EDEFAULT);
				return;
			case QueryITPackage.QUESTION__MATRIX_COLUMNS:
				getMatrixColumns().clear();
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
			case QueryITPackage.QUESTION__TYPE:
				return type != TYPE_EDEFAULT;
			case QueryITPackage.QUESTION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case QueryITPackage.QUESTION__IS_REQUIRED:
				return isRequired != IS_REQUIRED_EDEFAULT;
			case QueryITPackage.QUESTION__RANGE_START:
				return rangeStart != RANGE_START_EDEFAULT;
			case QueryITPackage.QUESTION__RANGE_END:
				return rangeEnd != RANGE_END_EDEFAULT;
			case QueryITPackage.QUESTION__INPUT_TYPE:
				return inputType != INPUT_TYPE_EDEFAULT;
			case QueryITPackage.QUESTION__VISIBLE_IF:
				return VISIBLE_IF_EDEFAULT == null ? visibleIf != null : !VISIBLE_IF_EDEFAULT.equals(visibleIf);
			case QueryITPackage.QUESTION__PLACEHOLDER:
				return PLACEHOLDER_EDEFAULT == null ? placeholder != null : !PLACEHOLDER_EDEFAULT.equals(placeholder);
			case QueryITPackage.QUESTION__CHOICES:
				return choices != null && !choices.isEmpty();
			case QueryITPackage.QUESTION__COL_COUNT:
				return colCount != COL_COUNT_EDEFAULT;
			case QueryITPackage.QUESTION__MATRIX_ROWS:
				return matrixRows != null && !matrixRows.isEmpty();
			case QueryITPackage.QUESTION__MULTI_TEXT_ITEMS:
				return multiTextItems != null && !multiTextItems.isEmpty();
			case QueryITPackage.QUESTION__QUESTION_NAME:
				return QUESTION_NAME_EDEFAULT == null ? questionName != null : !QUESTION_NAME_EDEFAULT.equals(questionName);
			case QueryITPackage.QUESTION__ROWS:
				return rows != ROWS_EDEFAULT;
			case QueryITPackage.QUESTION__MININUM_RATE_DESCRIPTION:
				return MININUM_RATE_DESCRIPTION_EDEFAULT == null ? mininumRateDescription != null : !MININUM_RATE_DESCRIPTION_EDEFAULT.equals(mininumRateDescription);
			case QueryITPackage.QUESTION__MAXIMUM_RATE_DESCRIPTION:
				return MAXIMUM_RATE_DESCRIPTION_EDEFAULT == null ? maximumRateDescription != null : !MAXIMUM_RATE_DESCRIPTION_EDEFAULT.equals(maximumRateDescription);
			case QueryITPackage.QUESTION__MATRIX_COLUMNS:
				return matrixColumns != null && !matrixColumns.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", title: ");
		result.append(title);
		result.append(", isRequired: ");
		result.append(isRequired);
		result.append(", rangeStart: ");
		result.append(rangeStart);
		result.append(", rangeEnd: ");
		result.append(rangeEnd);
		result.append(", inputType: ");
		result.append(inputType);
		result.append(", visibleIf: ");
		result.append(visibleIf);
		result.append(", placeholder: ");
		result.append(placeholder);
		result.append(", choices: ");
		result.append(choices);
		result.append(", colCount: ");
		result.append(colCount);
		result.append(", questionName: ");
		result.append(questionName);
		result.append(", rows: ");
		result.append(rows);
		result.append(", mininumRateDescription: ");
		result.append(mininumRateDescription);
		result.append(", maximumRateDescription: ");
		result.append(maximumRateDescription);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
