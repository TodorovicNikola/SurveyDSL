/**
 */
package queryIT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link queryIT.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link queryIT.Page#getQuestions <em>Questions</em>}</li>
 *   <li>{@link queryIT.Page#getVisibleIf <em>Visible If</em>}</li>
 * </ul>
 * </p>
 *
 * @see queryIT.QueryITPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
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
	 * @see queryIT.QueryITPackage#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link queryIT.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link queryIT.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see queryIT.QueryITPackage#getPage_Questions()
	 * @model type="queryIT.Question" containment="true" required="true"
	 * @generated
	 */
	EList getQuestions();

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
	 * @see queryIT.QueryITPackage#getPage_VisibleIf()
	 * @model
	 * @generated
	 */
	String getVisibleIf();

	/**
	 * Sets the value of the '{@link queryIT.Page#getVisibleIf <em>Visible If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible If</em>' attribute.
	 * @see #getVisibleIf()
	 * @generated
	 */
	void setVisibleIf(String value);

} // Page
