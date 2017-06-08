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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import queryIT.Page;
import queryIT.QueryITPackage;
import queryIT.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link queryIT.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link queryIT.impl.PageImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link queryIT.impl.PageImpl#getVisibleIf <em>Visible If</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
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
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList questions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QueryITPackage.Literals.PAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList(Question.class, this, QueryITPackage.PAGE__QUESTIONS);
		}
		return questions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QueryITPackage.PAGE__VISIBLE_IF, oldVisibleIf, visibleIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryITPackage.PAGE__QUESTIONS:
				return ((InternalEList)getQuestions()).basicRemove(otherEnd, msgs);
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
			case QueryITPackage.PAGE__TITLE:
				return getTitle();
			case QueryITPackage.PAGE__QUESTIONS:
				return getQuestions();
			case QueryITPackage.PAGE__VISIBLE_IF:
				return getVisibleIf();
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
			case QueryITPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case QueryITPackage.PAGE__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection)newValue);
				return;
			case QueryITPackage.PAGE__VISIBLE_IF:
				setVisibleIf((String)newValue);
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
			case QueryITPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case QueryITPackage.PAGE__QUESTIONS:
				getQuestions().clear();
				return;
			case QueryITPackage.PAGE__VISIBLE_IF:
				setVisibleIf(VISIBLE_IF_EDEFAULT);
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
			case QueryITPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case QueryITPackage.PAGE__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case QueryITPackage.PAGE__VISIBLE_IF:
				return VISIBLE_IF_EDEFAULT == null ? visibleIf != null : !VISIBLE_IF_EDEFAULT.equals(visibleIf);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", visibleIf: ");
		result.append(visibleIf);
		result.append(')');
		return result.toString();
	}

} //PageImpl
