package gsl.generate.generator

import queryIT.Survey
import queryIT.TitleLocation
import queryIT.Page
import java.util.ArrayList
import queryIT.Question
import queryIT.TextValue
import queryIT.MultiTextItem

class JQueryGenerator {

	var pages = new ArrayList<Page>();
	var questions = new ArrayList<Question>();
	var choices = new ArrayList<String>();
	var columns = new ArrayList<TextValue>();
	var rows = new ArrayList<TextValue>();
	var multiTextItems = new ArrayList<MultiTextItem>();
	var nameCounter = 0;

	def initializePages(Survey survey) {
		var size = survey.pages.size();
		var i = 0;
		
		while (i < size){
			pages.add((survey.pages.get(i) as Page));
			i = i+1;
			
		}
		
    }
    
    def initializeQuestions(Page page){
    	questions.clear();
    	
    	var size = page.questions.size();
    	var i = 0;
    	while (i < size){
			questions.add((page.questions.get(i) as Question));
			i = i+1;
			
		}
    	
    }
    
    def initializeColumns(Question question){
    	columns.clear();
    	
    	var size = question.matrixColumns.size();
    	var i = 0;
    	
    	while(i < size){
    		columns.add((question.matrixColumns.get(i) as TextValue))
    		i = i + 1;
    		
    	}
    	
    }
    
    def initializeRows(Question question){
    	rows.clear();
    	
    	var size = question.matrixRows.size();
    	var i = 0;
    	
    	while(i < size){
    		rows.add((question.matrixRows.get(i) as TextValue))
    		i = i + 1;
    		
    	}
    	
    }
    
    def initializeMultiTextItems(Question question){
    	multiTextItems.clear();
    	
    	var size = question.multiTextItems.size();
    	var i = 0;
    	
    	while(i < size){
    		multiTextItems.add((question.multiTextItems.get(i) as MultiTextItem))
    		i = i + 1;
    		
    	}
    	
    }
    
    def initialzeChoices(Question question){
    	choices.clear();
    	
    	var size = question.choices.size();
    	var i = 0;
    	
    	while(i < size){
    		choices.add((question.choices.get(i) as String))
    		i = i + 1;
    		
    	}
    	
    }
  
  	def incNameCounter(){
  		nameCounter = nameCounter + 1;
  		
  	}
	
	 def generate(Survey survey) {
    '''
$( document ).ready(function() {
	Survey.defaultBootstrapCss.navigationButton = "btn btn-primary";
	Survey.Survey.cssType = "bootstrap";
	
	var survey = new Survey.Model({
		«IF survey.title != null»title: "«survey.title»",«ENDIF»
		«IF survey.completedMessage != null»completedMessage: "«survey.completedMessage»",«ENDIF»
		«IF survey.pageNextText != null»pageNextText: "«survey.pageNextText»",«ENDIF»
		«IF survey.pagePrevText != null»pagePrevText: "«survey.pagePrevText»",«ENDIF»
		«IF survey.completeText != null»pagePrevText: "«survey.completeText»",«ENDIF»
		«IF survey.hideNavigationButtons == true»showNavigationButtons: false,«ENDIF»
		«IF survey.hidePageNumbers == true»showPageNumbers: false,«ENDIF»
		«IF survey.hidePageTitles == true»showPageTitles: false,«ENDIF»
		«IF survey.hideQuestionNumbers == true»showQuestionNumbers: "off",«ENDIF»
		«IF survey.showProgressBar.name.toLowerCase.equals("off")»showProgressBar: "off",
		«ELSEIF survey.showProgressBar.name.toLowerCase.equals("bottom")»showProgressBar: "bottom",
		«ELSE»showProgressBar: "top",
		«ENDIF»
		«IF survey.questionTitleLocation == TitleLocation.BOTTOM»questionTitleLocation: "bottom",
		«ELSE»questionTitleLocation: "top",
		«ENDIF»
		«initializePages(survey)»
		pages: [
			«FOR Page p : pages SEPARATOR ","»
				«processPage(p)»
			«ENDFOR»
		]
	});
	
	$("#surveyElement").Survey({model:survey});
	
});
    '''
    
    
 }
	
	def processPage(Page p){
		'''
		{
			«IF p.title != null»title: "«p.title»",«ENDIF»
			«IF p.visibleIf != null»visibleIf: ",«p.visibleIf»"«ENDIF»
			
			«initializeQuestions(p)»
			questions: [
			«FOR Question q : questions SEPARATOR ","»
				«processQuestion(q)»
			«ENDFOR»
				
			]
		}
		'''
	}
	
	def processQuestion(Question q){
		'''
		{
			«IF q.isRequired == true»isRequired: true,«ENDIF»
			«IF q.inputType.name.toLowerCase().equals("text").operator_not()»inputType: "«q.inputType»",«ENDIF»
			«IF q.visibleIf != null»visibleIf: "«q.visibleIf»",«ENDIF»
			«IF q.placeholder != null»placeholder: "«q.placeholder»",«ENDIF»
			«IF q.choices.empty.operator_not() && q.choices.size > 0»choices: [
				«initialzeChoices(q)»
				«FOR String c : choices SEPARATOR ","»
				"«c»"
				«ENDFOR»
			],
			«ENDIF»
			«IF q.colCount != 0»colCount: «q.colCount»,«ENDIF»
			«IF q.questionName != null»name: "«q.questionName»",«ELSE»name: "fakeName«incNameCounter()»",«ENDIF»
			«IF q.rows != 0»rows: «q.rows»,«ENDIF»
			«IF q.mininumRateDescription != null»mininumRateDescription: "«q.mininumRateDescription»",«ENDIF»
			«IF q.maximumRateDescription != null»maximumRateDescription: "«q.maximumRateDescription»",«ENDIF»
			«IF q.matrixRows.empty.operator_not()»rows: [
				«initializeRows(q)»
				«FOR TextValue tv : rows  SEPARATOR ","»
				{
					text: "«tv.text»",
					«IF tv.value != null»value: "«tv.value»"«ENDIF»
				}
				«ENDFOR»
			],
			«ENDIF»
			«IF q.matrixColumns.empty.operator_not()»columns: [
			«initializeColumns(q)»
				«FOR TextValue tv : columns  SEPARATOR ","»
				{
					text: "«tv.text»",
					«IF tv.value != null»value: "«tv.value»"«ENDIF»
				}
				«ENDFOR»
			],
			«ENDIF»
			«IF q.multiTextItems.empty.operator_not() »items: [
			«initializeMultiTextItems(q)»
				«FOR MultiTextItem mti : multiTextItems  SEPARATOR ","»
				{
					title: "«mti.title»",
					name: "fakeName«incNameCounter()»"
				}
				«ENDFOR»
			],
			«ENDIF»
			title: "«q.title»",
			type: "«q.type.name.toLowerCase()»"
		}
		'''
	}
  
 }