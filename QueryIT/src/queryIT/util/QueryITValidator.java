/**
 */
package queryIT.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import queryIT.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see queryIT.QueryITPackage
 * @generated
 */
public class QueryITValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QueryITValidator INSTANCE = new QueryITValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "queryIT";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryITValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackage getEPackage() {
	  return QueryITPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map context) {
		switch (classifierID) {
			case QueryITPackage.SURVEY:
				return validateSurvey((Survey)value, diagnostics, context);
			case QueryITPackage.QUESTION:
				return validateQuestion((Question)value, diagnostics, context);
			case QueryITPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case QueryITPackage.TEXT_VALUE:
				return validateTextValue((TextValue)value, diagnostics, context);
			case QueryITPackage.MULTI_TEXT_ITEM:
				return validateMultiTextItem((MultiTextItem)value, diagnostics, context);
			case QueryITPackage.QUESTION_TYPE:
				return validateQuestionType((QuestionType)value, diagnostics, context);
			case QueryITPackage.TITLE_LOCATION:
				return validateTitleLocation((TitleLocation)value, diagnostics, context);
			case QueryITPackage.PROGRESS_BAR_LOCATION:
				return validateProgressBarLocation((ProgressBarLocation)value, diagnostics, context);
			case QueryITPackage.TEXT_INPUT_TYPE:
				return validateTextInputType((TextInputType)value, diagnostics, context);
			case QueryITPackage.ON_OFF:
				return validateOn_off((On_off)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurvey(Survey survey, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(survey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(survey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(survey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(survey, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(survey, diagnostics, context);
		if (result || diagnostics != null) result &= validateSurvey_timeLimitNotNegativeS(survey, diagnostics, context);
		return result;
	}

	/**
	 * Validates the timeLimitNotNegativeS constraint of '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSurvey_timeLimitNotNegativeS(Survey survey, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "timeLimitNotNegativeS", getObjectLabel(survey, context) }),
						 new Object[] { survey }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map context) {
		boolean result = validate_EveryMultiplicityConforms(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(question, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_rangeInvalid(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_matrixHasRowsAndCols(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_multipleTextHasItems(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_choicesUseless(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_choicesNeeded(question, diagnostics, context);
		if (result || diagnostics != null) result &= validateQuestion_inputType(question, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rangeInvalid constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_rangeInvalid(Question question, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "rangeInvalid", getObjectLabel(question, context) }),
						 new Object[] { question }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the matrixHasRowsAndCols constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_matrixHasRowsAndCols(Question question, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "matrixHasRowsAndCols", getObjectLabel(question, context) }),
						 new Object[] { question }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the multipleTextHasItems constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_multipleTextHasItems(Question question, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "multipleTextHasItems", getObjectLabel(question, context) }),
						 new Object[] { question }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the choicesUseless constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_choicesUseless(Question question, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "choicesUseless", getObjectLabel(question, context) }),
						 new Object[] { question }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the choicesNeeded constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_choicesNeeded(Question question, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "choicesNeeded", getObjectLabel(question, context) }),
						 new Object[] { question }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the inputType constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_inputType(Question question, DiagnosticChain diagnostics, Map context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "inputType", getObjectLabel(question, context) }),
						 new Object[] { question }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextValue(TextValue textValue, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(textValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiTextItem(MultiTextItem multiTextItem, DiagnosticChain diagnostics, Map context) {
		return validate_EveryDefaultConstraint(multiTextItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionType(QuestionType questionType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleLocation(TitleLocation titleLocation, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressBarLocation(ProgressBarLocation progressBarLocation, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextInputType(TextInputType textInputType, DiagnosticChain diagnostics, Map context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOn_off(On_off on_off, DiagnosticChain diagnostics, Map context) {
		return true;
	}

} //QueryITValidator
