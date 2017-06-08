/**
 */
package queryIT.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import queryIT.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryITFactoryImpl extends EFactoryImpl implements QueryITFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryITFactory init() {
		try {
			QueryITFactory theQueryITFactory = (QueryITFactory)EPackage.Registry.INSTANCE.getEFactory(QueryITPackage.eNS_URI);
			if (theQueryITFactory != null) {
				return theQueryITFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryITFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryITFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QueryITPackage.SURVEY: return createSurvey();
			case QueryITPackage.QUESTION: return createQuestion();
			case QueryITPackage.PAGE: return createPage();
			case QueryITPackage.TEXT_VALUE: return createTextValue();
			case QueryITPackage.MULTI_TEXT_ITEM: return createMultiTextItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QueryITPackage.QUESTION_TYPE:
				return createQuestionTypeFromString(eDataType, initialValue);
			case QueryITPackage.TITLE_LOCATION:
				return createTitleLocationFromString(eDataType, initialValue);
			case QueryITPackage.PROGRESS_BAR_LOCATION:
				return createProgressBarLocationFromString(eDataType, initialValue);
			case QueryITPackage.TEXT_INPUT_TYPE:
				return createTextInputTypeFromString(eDataType, initialValue);
			case QueryITPackage.ON_OFF:
				return createOn_offFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QueryITPackage.QUESTION_TYPE:
				return convertQuestionTypeToString(eDataType, instanceValue);
			case QueryITPackage.TITLE_LOCATION:
				return convertTitleLocationToString(eDataType, instanceValue);
			case QueryITPackage.PROGRESS_BAR_LOCATION:
				return convertProgressBarLocationToString(eDataType, instanceValue);
			case QueryITPackage.TEXT_INPUT_TYPE:
				return convertTextInputTypeToString(eDataType, instanceValue);
			case QueryITPackage.ON_OFF:
				return convertOn_offToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextValue createTextValue() {
		TextValueImpl textValue = new TextValueImpl();
		return textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiTextItem createMultiTextItem() {
		MultiTextItemImpl multiTextItem = new MultiTextItemImpl();
		return multiTextItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionType createQuestionTypeFromString(EDataType eDataType, String initialValue) {
		QuestionType result = QuestionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuestionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleLocation createTitleLocationFromString(EDataType eDataType, String initialValue) {
		TitleLocation result = TitleLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTitleLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBarLocation createProgressBarLocationFromString(EDataType eDataType, String initialValue) {
		ProgressBarLocation result = ProgressBarLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgressBarLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputType createTextInputTypeFromString(EDataType eDataType, String initialValue) {
		TextInputType result = TextInputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public On_off createOn_offFromString(EDataType eDataType, String initialValue) {
		On_off result = On_off.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOn_offToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryITPackage getQueryITPackage() {
		return (QueryITPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static QueryITPackage getPackage() {
		return QueryITPackage.eINSTANCE;
	}

} //QueryITFactoryImpl
