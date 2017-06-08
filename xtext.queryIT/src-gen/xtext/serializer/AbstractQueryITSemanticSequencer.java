package xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import queryIT.MultiTextItem;
import queryIT.Page;
import queryIT.QueryITPackage;
import queryIT.Question;
import queryIT.Survey;
import queryIT.TextValue;
import xtext.services.QueryITGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractQueryITSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QueryITGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QueryITPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QueryITPackage.MULTI_TEXT_ITEM:
				if(context == grammarAccess.getMultiTextItemRule()) {
					sequence_MultiTextItem(context, (MultiTextItem) semanticObject); 
					return; 
				}
				else break;
			case QueryITPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case QueryITPackage.QUESTION:
				if(context == grammarAccess.getQuestionRule()) {
					sequence_Question(context, (Question) semanticObject); 
					return; 
				}
				else break;
			case QueryITPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			case QueryITPackage.TEXT_VALUE:
				if(context == grammarAccess.getTextValueRule()) {
					sequence_TextValue(context, (TextValue) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     title=EString
	 */
	protected void sequence_MultiTextItem(EObject context, MultiTextItem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QueryITPackage.Literals.MULTI_TEXT_ITEM__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QueryITPackage.Literals.MULTI_TEXT_ITEM__TITLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiTextItemAccess().getTitleEStringParserRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString? visibleIf=EString? questions+=Question questions+=Question*)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isRequired?='required'? 
	 *         type=QuestionType 
	 *         title=EString 
	 *         rangeStart=EInt? 
	 *         rangeEnd=EInt? 
	 *         inputType=TextInputType? 
	 *         visibleIf=EString? 
	 *         placeholder=EString? 
	 *         (choices+=EString choices+=EString*)? 
	 *         colCount=EInt? 
	 *         questionName=EString? 
	 *         rows=EInt? 
	 *         mininumRateDescription=EString? 
	 *         maximumRateDescription=EString? 
	 *         (matrixRows+=TextValue matrixRows+=TextValue*)? 
	 *         (multiTextItems+=MultiTextItem multiTextItems+=MultiTextItem*)? 
	 *         (matrixColumns+=TextValue matrixColumns+=TextValue*)?
	 *     )
	 */
	protected void sequence_Question(EObject context, Question semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         hideNavigationButtons?='hideNavigationButtons'? 
	 *         hidePageTitles?='hidePageTitles'? 
	 *         hideQuestionNumbers?='hideQuestionNumbers'? 
	 *         hidePageNumbers?='hidePageNumbers'? 
	 *         (author+=EString author+=EString*)? 
	 *         title=EString? 
	 *         timeLimit=EInt? 
	 *         completedMessage=EString? 
	 *         pageNextText=EString? 
	 *         pagePrevText=EString? 
	 *         completeText=EString? 
	 *         questionTitleLocation=TitleLocation? 
	 *         showProgressBar=ProgressBarLocation? 
	 *         pages+=Page 
	 *         pages+=Page*
	 *     )
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (text=EString value=EString?)
	 */
	protected void sequence_TextValue(EObject context, TextValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
