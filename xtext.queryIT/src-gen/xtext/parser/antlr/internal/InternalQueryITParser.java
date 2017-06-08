package xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.QueryITGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryITParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_63", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_58", "KEYWORD_59", "KEYWORD_57", "KEYWORD_56", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_48", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_43", "KEYWORD_44", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_28", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int KEYWORD_3=65;
    public static final int KEYWORD_2=64;
    public static final int KEYWORD_5=59;
    public static final int KEYWORD_4=66;
    public static final int KEYWORD_1=63;
    public static final int KEYWORD_29=32;
    public static final int KEYWORD_28=39;
    public static final int KEYWORD_27=45;
    public static final int KEYWORD_26=44;
    public static final int KEYWORD_25=43;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_23=41;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_21=52;
    public static final int KEYWORD_20=51;
    public static final int KEYWORD_63=4;
    public static final int KEYWORD_62=7;
    public static final int KEYWORD_61=6;
    public static final int KEYWORD_60=5;
    public static final int RULE_ID=67;
    public static final int KEYWORD_19=50;
    public static final int KEYWORD_18=49;
    public static final int KEYWORD_17=48;
    public static final int KEYWORD_16=47;
    public static final int KEYWORD_59=9;
    public static final int KEYWORD_15=46;
    public static final int KEYWORD_58=8;
    public static final int KEYWORD_14=58;
    public static final int RULE_INT=68;
    public static final int KEYWORD_57=10;
    public static final int KEYWORD_13=57;
    public static final int KEYWORD_56=11;
    public static final int KEYWORD_12=56;
    public static final int RULE_ML_COMMENT=70;
    public static final int KEYWORD_55=15;
    public static final int KEYWORD_11=55;
    public static final int KEYWORD_54=14;
    public static final int KEYWORD_10=54;
    public static final int KEYWORD_53=13;
    public static final int KEYWORD_52=12;
    public static final int KEYWORD_51=18;
    public static final int KEYWORD_50=17;
    public static final int RULE_STRING=69;
    public static final int RULE_SL_COMMENT=71;
    public static final int KEYWORD_49=16;
    public static final int KEYWORD_48=19;
    public static final int KEYWORD_47=22;
    public static final int KEYWORD_46=21;
    public static final int KEYWORD_45=20;
    public static final int KEYWORD_44=24;
    public static final int KEYWORD_43=23;
    public static final int KEYWORD_42=28;
    public static final int KEYWORD_41=27;
    public static final int EOF=-1;
    public static final int KEYWORD_40=26;
    public static final int RULE_WS=72;
    public static final int RULE_ANY_OTHER=73;
    public static final int KEYWORD_39=25;
    public static final int KEYWORD_38=31;
    public static final int KEYWORD_37=30;
    public static final int KEYWORD_36=29;
    public static final int KEYWORD_35=38;
    public static final int KEYWORD_34=37;
    public static final int KEYWORD_33=36;
    public static final int KEYWORD_32=35;
    public static final int KEYWORD_31=34;
    public static final int KEYWORD_30=33;
    public static final int KEYWORD_7=61;
    public static final int KEYWORD_6=60;
    public static final int KEYWORD_9=53;
    public static final int KEYWORD_8=62;

    // delegates
    // delegators


        public InternalQueryITParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryITParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryITParser.tokenNames; }
    public String getGrammarFileName() { return "../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g"; }




    	private QueryITGrammarAccess grammarAccess;
    	 	
    	public InternalQueryITParser(TokenStream input, QueryITGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Survey";	
    	} 
    	   	   	
    	@Override
    	protected QueryITGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleSurvey"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:62:1: entryRuleSurvey returns [EObject current=null] : iv_ruleSurvey= ruleSurvey EOF ;
    public final EObject entryRuleSurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSurvey = null;


        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:63:2: (iv_ruleSurvey= ruleSurvey EOF )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:64:2: iv_ruleSurvey= ruleSurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey67);
            iv_ruleSurvey=ruleSurvey();

            state._fsp--;

             current =iv_ruleSurvey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:71:1: ruleSurvey returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) ) ) ( (lv_pages_25_0= rulePage ) ) ( (lv_pages_26_0= rulePage ) )* ) ;
    public final EObject ruleSurvey() throws RecognitionException {
        EObject current = null;

        Token lv_hideNavigationButtons_1_0=null;
        Token lv_hidePageTitles_2_0=null;
        Token lv_hideQuestionNumbers_3_0=null;
        Token lv_hidePageNumbers_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_author_6_0 = null;

        AntlrDatatypeRuleToken lv_author_8_0 = null;

        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_timeLimit_12_0 = null;

        AntlrDatatypeRuleToken lv_completedMessage_14_0 = null;

        AntlrDatatypeRuleToken lv_pageNextText_16_0 = null;

        AntlrDatatypeRuleToken lv_pagePrevText_18_0 = null;

        AntlrDatatypeRuleToken lv_completeText_20_0 = null;

        Enumerator lv_questionTitleLocation_22_0 = null;

        Enumerator lv_showProgressBar_24_0 = null;

        EObject lv_pages_25_0 = null;

        EObject lv_pages_26_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:74:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) ) ) ( (lv_pages_25_0= rulePage ) ) ( (lv_pages_26_0= rulePage ) )* ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:75:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) ) ) ( (lv_pages_25_0= rulePage ) ) ( (lv_pages_26_0= rulePage ) )* )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:75:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) ) ) ( (lv_pages_25_0= rulePage ) ) ( (lv_pages_26_0= rulePage ) )* )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:75:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) ) ) ( (lv_pages_25_0= rulePage ) ) ( (lv_pages_26_0= rulePage ) )*
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:75:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:77:1: ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:77:1: ( ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:78:2: ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:81:2: ( ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )* )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:82:3: ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )*
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:82:3: ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )*
            loop2:
            do {
                int alt2=14;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:84:4: ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:84:4: ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:85:5: {...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:85:103: ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:86:6: ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:89:6: ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:89:7: {...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:89:16: ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:90:1: (lv_hideNavigationButtons_1_0= KEYWORD_60 )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:90:1: (lv_hideNavigationButtons_1_0= KEYWORD_60 )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:91:3: lv_hideNavigationButtons_1_0= KEYWORD_60
            	    {
            	    lv_hideNavigationButtons_1_0=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_ruleSurvey166); 

            	            newLeafNode(lv_hideNavigationButtons_1_0, grammarAccess.getSurveyAccess().getHideNavigationButtonsHideNavigationButtonsKeyword_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSurveyRule());
            	    	        }
            	           		setWithLastConsumed(current, "hideNavigationButtons", true, "hideNavigationButtons");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:112:4: ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:112:4: ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:113:5: {...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:113:103: ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:114:6: ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:117:6: ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:117:7: {...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:117:16: ( (lv_hidePageTitles_2_0= KEYWORD_49 ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:118:1: (lv_hidePageTitles_2_0= KEYWORD_49 )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:118:1: (lv_hidePageTitles_2_0= KEYWORD_49 )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:119:3: lv_hidePageTitles_2_0= KEYWORD_49
            	    {
            	    lv_hidePageTitles_2_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleSurvey250); 

            	            newLeafNode(lv_hidePageTitles_2_0, grammarAccess.getSurveyAccess().getHidePageTitlesHidePageTitlesKeyword_0_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSurveyRule());
            	    	        }
            	           		setWithLastConsumed(current, "hidePageTitles", true, "hidePageTitles");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:140:4: ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:140:4: ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:141:5: {...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:141:103: ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:142:6: ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:145:6: ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:145:7: {...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:145:16: ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:146:1: (lv_hideQuestionNumbers_3_0= KEYWORD_57 )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:146:1: (lv_hideQuestionNumbers_3_0= KEYWORD_57 )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:147:3: lv_hideQuestionNumbers_3_0= KEYWORD_57
            	    {
            	    lv_hideQuestionNumbers_3_0=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleSurvey334); 

            	            newLeafNode(lv_hideQuestionNumbers_3_0, grammarAccess.getSurveyAccess().getHideQuestionNumbersHideQuestionNumbersKeyword_0_2_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSurveyRule());
            	    	        }
            	           		setWithLastConsumed(current, "hideQuestionNumbers", true, "hideQuestionNumbers");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:168:4: ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:168:4: ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:169:5: {...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:169:103: ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:170:6: ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:173:6: ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:173:7: {...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:173:16: ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:174:1: (lv_hidePageNumbers_4_0= KEYWORD_54 )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:174:1: (lv_hidePageNumbers_4_0= KEYWORD_54 )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:175:3: lv_hidePageNumbers_4_0= KEYWORD_54
            	    {
            	    lv_hidePageNumbers_4_0=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleSurvey418); 

            	            newLeafNode(lv_hidePageNumbers_4_0, grammarAccess.getSurveyAccess().getHidePageNumbersHidePageNumbersKeyword_0_3_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSurveyRule());
            	    	        }
            	           		setWithLastConsumed(current, "hidePageNumbers", true, "hidePageNumbers");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:196:4: ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:196:4: ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:197:5: {...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:197:103: ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:198:6: ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:201:6: ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:201:7: {...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:201:16: (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:202:2: otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleSurvey497); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSurveyAccess().getAuthorSKeyword_0_4_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:206:1: ( (lv_author_6_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:207:1: (lv_author_6_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:207:1: (lv_author_6_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:208:3: lv_author_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getAuthorEStringParserRuleCall_0_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleSurvey517);
            	    lv_author_6_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"author",
            	            		lv_author_6_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:224:2: (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==KEYWORD_3) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:225:2: otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleSurvey531); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getSurveyAccess().getCommaKeyword_0_4_2_0());
            	    	        
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:229:1: ( (lv_author_8_0= ruleEString ) )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:230:1: (lv_author_8_0= ruleEString )
            	    	    {
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:230:1: (lv_author_8_0= ruleEString )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:231:3: lv_author_8_0= ruleEString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSurveyAccess().getAuthorEStringParserRuleCall_0_4_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleEString_in_ruleSurvey551);
            	    	    lv_author_8_0=ruleEString();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"author",
            	    	            		lv_author_8_0, 
            	    	            		"EString");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:254:4: ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:254:4: ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:255:5: {...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:255:103: ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:256:6: ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:259:6: ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:259:7: {...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:259:16: (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:260:2: otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleSurvey622); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSurveyAccess().getTitleKeyword_0_5_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:264:1: ( (lv_title_10_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:265:1: (lv_title_10_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:265:1: (lv_title_10_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:266:3: lv_title_10_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_0_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleSurvey642);
            	    lv_title_10_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_10_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:289:4: ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:289:4: ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:290:5: {...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:290:103: ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:291:6: ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:294:6: ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:294:7: {...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:294:16: (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:295:2: otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleSurvey711); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSurveyAccess().getTimeLimitKeyword_0_6_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:299:1: ( (lv_timeLimit_12_0= ruleEInt ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:300:1: (lv_timeLimit_12_0= ruleEInt )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:300:1: (lv_timeLimit_12_0= ruleEInt )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:301:3: lv_timeLimit_12_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getTimeLimitEIntParserRuleCall_0_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEInt_in_ruleSurvey731);
            	    lv_timeLimit_12_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"timeLimit",
            	            		lv_timeLimit_12_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:324:4: ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:324:4: ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:325:5: {...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:325:103: ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:326:6: ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:329:6: ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:329:7: {...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:329:16: (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:330:2: otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleSurvey800); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSurveyAccess().getCompletedMessageKeyword_0_7_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:334:1: ( (lv_completedMessage_14_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:335:1: (lv_completedMessage_14_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:335:1: (lv_completedMessage_14_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:336:3: lv_completedMessage_14_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getCompletedMessageEStringParserRuleCall_0_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleSurvey820);
            	    lv_completedMessage_14_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"completedMessage",
            	            		lv_completedMessage_14_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:359:4: ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:359:4: ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:360:5: {...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:360:103: ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:361:6: ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:364:6: ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:364:7: {...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:364:16: (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:365:2: otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleSurvey889); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSurveyAccess().getButtonNextTextKeyword_0_8_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:369:1: ( (lv_pageNextText_16_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:370:1: (lv_pageNextText_16_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:370:1: (lv_pageNextText_16_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:371:3: lv_pageNextText_16_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPageNextTextEStringParserRuleCall_0_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleSurvey909);
            	    lv_pageNextText_16_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pageNextText",
            	            		lv_pageNextText_16_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:394:4: ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:394:4: ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:395:5: {...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:395:103: ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:396:6: ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:399:6: ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:399:7: {...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:399:16: (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:400:2: otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) )
            	    {
            	    otherlv_17=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_ruleSurvey978); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSurveyAccess().getButtonPrevTextKeyword_0_9_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:404:1: ( (lv_pagePrevText_18_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:405:1: (lv_pagePrevText_18_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:405:1: (lv_pagePrevText_18_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:406:3: lv_pagePrevText_18_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagePrevTextEStringParserRuleCall_0_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleSurvey998);
            	    lv_pagePrevText_18_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pagePrevText",
            	            		lv_pagePrevText_18_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:429:4: ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:429:4: ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:430:5: {...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:430:104: ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:431:6: ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:434:6: ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:434:7: {...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:434:16: (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:435:2: otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleSurvey1067); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSurveyAccess().getButtonCompletedTextKeyword_0_10_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:439:1: ( (lv_completeText_20_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:440:1: (lv_completeText_20_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:440:1: (lv_completeText_20_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:441:3: lv_completeText_20_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getCompleteTextEStringParserRuleCall_0_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleSurvey1087);
            	    lv_completeText_20_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"completeText",
            	            		lv_completeText_20_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:464:4: ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:464:4: ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:465:5: {...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:465:104: ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:466:6: ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:469:6: ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:469:7: {...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:469:16: (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:470:2: otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) )
            	    {
            	    otherlv_21=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleSurvey1156); 

            	        	newLeafNode(otherlv_21, grammarAccess.getSurveyAccess().getQuestionTitleLocationKeyword_0_11_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:474:1: ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:475:1: (lv_questionTitleLocation_22_0= ruleTitleLocation )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:475:1: (lv_questionTitleLocation_22_0= ruleTitleLocation )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:476:3: lv_questionTitleLocation_22_0= ruleTitleLocation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getQuestionTitleLocationTitleLocationEnumRuleCall_0_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTitleLocation_in_ruleSurvey1176);
            	    lv_questionTitleLocation_22_0=ruleTitleLocation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"questionTitleLocation",
            	            		lv_questionTitleLocation_22_0, 
            	            		"TitleLocation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:499:4: ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:499:4: ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:500:5: {...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:500:104: ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:501:6: ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:504:6: ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:504:7: {...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSurvey", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:504:16: (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:505:2: otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) )
            	    {
            	    otherlv_23=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleSurvey1245); 

            	        	newLeafNode(otherlv_23, grammarAccess.getSurveyAccess().getProgressBarLocationKeyword_0_12_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:509:1: ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:510:1: (lv_showProgressBar_24_0= ruleProgressBarLocation )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:510:1: (lv_showProgressBar_24_0= ruleProgressBarLocation )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:511:3: lv_showProgressBar_24_0= ruleProgressBarLocation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getShowProgressBarProgressBarLocationEnumRuleCall_0_12_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProgressBarLocation_in_ruleSurvey1265);
            	    lv_showProgressBar_24_0=ruleProgressBarLocation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"showProgressBar",
            	            		lv_showProgressBar_24_0, 
            	            		"ProgressBarLocation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	

            }

            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:541:2: ( (lv_pages_25_0= rulePage ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:542:1: (lv_pages_25_0= rulePage )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:542:1: (lv_pages_25_0= rulePage )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:543:3: lv_pages_25_0= rulePage
            {
             
            	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePage_in_ruleSurvey1327);
            lv_pages_25_0=rulePage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	        }
                   		add(
                   			current, 
                   			"pages",
                    		lv_pages_25_0, 
                    		"Page");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:559:2: ( (lv_pages_26_0= rulePage ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==KEYWORD_9) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:560:1: (lv_pages_26_0= rulePage )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:560:1: (lv_pages_26_0= rulePage )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:561:3: lv_pages_26_0= rulePage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePage_in_ruleSurvey1348);
            	    lv_pages_26_0=rulePage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pages",
            	            		lv_pages_26_0, 
            	            		"Page");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleEString"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:585:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:586:1: (iv_ruleEString= ruleEString EOF )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:587:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1385);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1396); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:594:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:598:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:599:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:599:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:599:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1436); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:607:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1462); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePage"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:622:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:623:2: (iv_rulePage= rulePage EOF )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:624:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage1506);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage1516); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:631:1: rulePage returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_visibleIf_5_0 = null;

        EObject lv_questions_6_0 = null;

        EObject lv_questions_7_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:634:28: ( (otherlv_0= KEYWORD_9 ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:635:1: (otherlv_0= KEYWORD_9 ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:635:1: (otherlv_0= KEYWORD_9 ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )* )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:636:2: otherlv_0= KEYWORD_9 ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) ) ) ( (lv_questions_6_0= ruleQuestion ) ) ( (lv_questions_7_0= ruleQuestion ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePage1554); 

                	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:640:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:642:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:642:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:643:2: ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPageAccess().getUnorderedGroup_1());
            	
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:646:2: ( ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )* )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:647:3: ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )*
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:647:3: ( ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( LA5_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:649:4: ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:649:4: ({...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:650:5: {...}? => ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:650:101: ( ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:651:6: ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:654:6: ({...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:654:7: {...}? => (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:654:16: (otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:655:2: otherlv_2= KEYWORD_26 ( (lv_title_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rulePage1612); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getTitleKeyword_1_0_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:659:1: ( (lv_title_3_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:660:1: (lv_title_3_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:660:1: (lv_title_3_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:661:3: lv_title_3_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_rulePage1632);
            	    lv_title_3_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_3_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:684:4: ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:684:4: ({...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:685:5: {...}? => ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePage", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:685:101: ( ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:686:6: ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:689:6: ({...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:689:7: {...}? => (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePage", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:689:16: (otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:690:2: otherlv_4= KEYWORD_42 ( (lv_visibleIf_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rulePage1701); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getVisibleIfKeyword_1_1_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:694:1: ( (lv_visibleIf_5_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:695:1: (lv_visibleIf_5_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:695:1: (lv_visibleIf_5_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:696:3: lv_visibleIf_5_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getVisibleIfEStringParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_rulePage1721);
            	    lv_visibleIf_5_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"visibleIf",
            	            		lv_visibleIf_5_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPageAccess().getUnorderedGroup_1());
            	

            }

            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:726:2: ( (lv_questions_6_0= ruleQuestion ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:727:1: (lv_questions_6_0= ruleQuestion )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:727:1: (lv_questions_6_0= ruleQuestion )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:728:3: lv_questions_6_0= ruleQuestion
            {
             
            	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQuestion_in_rulePage1783);
            lv_questions_6_0=ruleQuestion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPageRule());
            	        }
                   		add(
                   			current, 
                   			"questions",
                    		lv_questions_6_0, 
                    		"Question");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:744:2: ( (lv_questions_7_0= ruleQuestion ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==KEYWORD_29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:745:1: (lv_questions_7_0= ruleQuestion )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:745:1: (lv_questions_7_0= ruleQuestion )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:746:3: lv_questions_7_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePage1804);
            	    lv_questions_7_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_7_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleEInt"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:770:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:771:1: (iv_ruleEInt= ruleEInt EOF )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:772:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt1841);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt1852); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:779:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_4 )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:783:6: ( ( (kw= KEYWORD_4 )? this_INT_1= RULE_INT ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:784:1: ( (kw= KEYWORD_4 )? this_INT_1= RULE_INT )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:784:1: ( (kw= KEYWORD_4 )? this_INT_1= RULE_INT )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:784:2: (kw= KEYWORD_4 )? this_INT_1= RULE_INT
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:784:2: (kw= KEYWORD_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_4) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:785:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleEInt1891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEInt1908); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQuestion"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:807:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:808:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:809:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion1954);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion1964); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:816:1: ruleQuestion returns [EObject current=null] : (otherlv_0= KEYWORD_29 ( ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_isRequired_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_rangeStart_8_0 = null;

        AntlrDatatypeRuleToken lv_rangeEnd_10_0 = null;

        Enumerator lv_inputType_12_0 = null;

        AntlrDatatypeRuleToken lv_visibleIf_14_0 = null;

        AntlrDatatypeRuleToken lv_placeholder_16_0 = null;

        AntlrDatatypeRuleToken lv_choices_18_0 = null;

        AntlrDatatypeRuleToken lv_choices_20_0 = null;

        AntlrDatatypeRuleToken lv_colCount_22_0 = null;

        AntlrDatatypeRuleToken lv_questionName_24_0 = null;

        AntlrDatatypeRuleToken lv_rows_26_0 = null;

        AntlrDatatypeRuleToken lv_mininumRateDescription_28_0 = null;

        AntlrDatatypeRuleToken lv_maximumRateDescription_30_0 = null;

        EObject lv_matrixRows_33_0 = null;

        EObject lv_matrixRows_35_0 = null;

        EObject lv_multiTextItems_37_0 = null;

        EObject lv_multiTextItems_38_0 = null;

        EObject lv_matrixColumns_40_0 = null;

        EObject lv_matrixColumns_42_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:819:28: ( (otherlv_0= KEYWORD_29 ( ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) ) ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:820:1: (otherlv_0= KEYWORD_29 ( ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) ) ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:820:1: (otherlv_0= KEYWORD_29 ( ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:821:2: otherlv_0= KEYWORD_29 ( ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleQuestion2002); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:825:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:827:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:827:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:828:2: ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:831:2: ( ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:832:3: ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:832:3: ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=15;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:834:4: ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:834:4: ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:835:5: {...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:835:105: ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:836:6: ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:839:6: ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:839:7: {...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:839:16: ( (lv_isRequired_2_0= KEYWORD_35 ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:840:1: (lv_isRequired_2_0= KEYWORD_35 )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:840:1: (lv_isRequired_2_0= KEYWORD_35 )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:841:3: lv_isRequired_2_0= KEYWORD_35
            	    {
            	    lv_isRequired_2_0=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleQuestion2065); 

            	            newLeafNode(lv_isRequired_2_0, grammarAccess.getQuestionAccess().getIsRequiredRequiredKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQuestionRule());
            	    	        }
            	           		setWithLastConsumed(current, "isRequired", true, "required");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:862:4: ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:862:4: ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:863:5: {...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:863:105: ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:864:6: ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:867:6: ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:867:7: {...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:867:16: (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:868:2: otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) )
            	    {
            	    otherlv_3=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleQuestion2144); 

            	        	newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getTypeKeyword_1_1_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:872:1: ( (lv_type_4_0= ruleQuestionType ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:873:1: (lv_type_4_0= ruleQuestionType )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:873:1: (lv_type_4_0= ruleQuestionType )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:874:3: lv_type_4_0= ruleQuestionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeQuestionTypeEnumRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestionType_in_ruleQuestion2164);
            	    lv_type_4_0=ruleQuestionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"type",
            	            		lv_type_4_0, 
            	            		"QuestionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:897:4: ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:897:4: ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:898:5: {...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:898:105: ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:899:6: ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:902:6: ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:902:7: {...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:902:16: (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:903:2: otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleQuestion2233); 

            	        	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getTitleKeyword_1_2_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:907:1: ( (lv_title_6_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:908:1: (lv_title_6_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:908:1: (lv_title_6_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:909:3: lv_title_6_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getTitleEStringParserRuleCall_1_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion2253);
            	    lv_title_6_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_6_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:932:4: ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:932:4: ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:933:5: {...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:933:105: ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:934:6: ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:937:6: ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:937:7: {...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:937:16: (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:938:2: otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) )
            	    {
            	    otherlv_7=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleQuestion2322); 

            	        	newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getRangeStartKeyword_1_3_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:942:1: ( (lv_rangeStart_8_0= ruleEInt ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:943:1: (lv_rangeStart_8_0= ruleEInt )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:943:1: (lv_rangeStart_8_0= ruleEInt )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:944:3: lv_rangeStart_8_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getRangeStartEIntParserRuleCall_1_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEInt_in_ruleQuestion2342);
            	    lv_rangeStart_8_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rangeStart",
            	            		lv_rangeStart_8_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:967:4: ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:967:4: ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:968:5: {...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:968:105: ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:969:6: ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:972:6: ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:972:7: {...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:972:16: (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:973:2: otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) )
            	    {
            	    otherlv_9=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleQuestion2411); 

            	        	newLeafNode(otherlv_9, grammarAccess.getQuestionAccess().getRangeEndKeyword_1_4_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:977:1: ( (lv_rangeEnd_10_0= ruleEInt ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:978:1: (lv_rangeEnd_10_0= ruleEInt )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:978:1: (lv_rangeEnd_10_0= ruleEInt )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:979:3: lv_rangeEnd_10_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getRangeEndEIntParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEInt_in_ruleQuestion2431);
            	    lv_rangeEnd_10_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rangeEnd",
            	            		lv_rangeEnd_10_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1002:4: ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1002:4: ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1003:5: {...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1003:105: ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1004:6: ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1007:6: ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1007:7: {...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1007:16: (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1008:2: otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) )
            	    {
            	    otherlv_11=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleQuestion2500); 

            	        	newLeafNode(otherlv_11, grammarAccess.getQuestionAccess().getTextInputTypeKeyword_1_5_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1012:1: ( (lv_inputType_12_0= ruleTextInputType ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1013:1: (lv_inputType_12_0= ruleTextInputType )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1013:1: (lv_inputType_12_0= ruleTextInputType )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1014:3: lv_inputType_12_0= ruleTextInputType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getInputTypeTextInputTypeEnumRuleCall_1_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextInputType_in_ruleQuestion2520);
            	    lv_inputType_12_0=ruleTextInputType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"inputType",
            	            		lv_inputType_12_0, 
            	            		"TextInputType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1037:4: ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1037:4: ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1038:5: {...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1038:105: ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1039:6: ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1042:6: ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1042:7: {...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1042:16: (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1043:2: otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleQuestion2589); 

            	        	newLeafNode(otherlv_13, grammarAccess.getQuestionAccess().getVisibleIfKeyword_1_6_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1047:1: ( (lv_visibleIf_14_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1048:1: (lv_visibleIf_14_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1048:1: (lv_visibleIf_14_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1049:3: lv_visibleIf_14_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getVisibleIfEStringParserRuleCall_1_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion2609);
            	    lv_visibleIf_14_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"visibleIf",
            	            		lv_visibleIf_14_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1072:4: ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1072:4: ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1073:5: {...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1073:105: ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1074:6: ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1077:6: ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1077:7: {...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1077:16: (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1078:2: otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleQuestion2678); 

            	        	newLeafNode(otherlv_15, grammarAccess.getQuestionAccess().getPlaceholderKeyword_1_7_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1082:1: ( (lv_placeholder_16_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1083:1: (lv_placeholder_16_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1083:1: (lv_placeholder_16_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1084:3: lv_placeholder_16_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getPlaceholderEStringParserRuleCall_1_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion2698);
            	    lv_placeholder_16_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"placeholder",
            	            		lv_placeholder_16_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1107:4: ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1107:4: ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1108:5: {...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1108:105: ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1109:6: ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1112:6: ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1112:7: {...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1112:16: (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1113:2: otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleQuestion2767); 

            	        	newLeafNode(otherlv_17, grammarAccess.getQuestionAccess().getChoicesKeyword_1_8_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1117:1: ( (lv_choices_18_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1118:1: (lv_choices_18_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1118:1: (lv_choices_18_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1119:3: lv_choices_18_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getChoicesEStringParserRuleCall_1_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion2787);
            	    lv_choices_18_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"choices",
            	            		lv_choices_18_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1135:2: (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==KEYWORD_3) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1136:2: otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleQuestion2801); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getQuestionAccess().getCommaKeyword_1_8_2_0());
            	    	        
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1140:1: ( (lv_choices_20_0= ruleEString ) )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1141:1: (lv_choices_20_0= ruleEString )
            	    	    {
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1141:1: (lv_choices_20_0= ruleEString )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1142:3: lv_choices_20_0= ruleEString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getChoicesEStringParserRuleCall_1_8_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion2821);
            	    	    lv_choices_20_0=ruleEString();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"choices",
            	    	            		lv_choices_20_0, 
            	    	            		"EString");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1165:4: ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1165:4: ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1166:5: {...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1166:105: ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1167:6: ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1170:6: ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1170:7: {...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1170:16: (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1171:2: otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) )
            	    {
            	    otherlv_21=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleQuestion2892); 

            	        	newLeafNode(otherlv_21, grammarAccess.getQuestionAccess().getColCountKeyword_1_9_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1175:1: ( (lv_colCount_22_0= ruleEInt ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1176:1: (lv_colCount_22_0= ruleEInt )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1176:1: (lv_colCount_22_0= ruleEInt )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1177:3: lv_colCount_22_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getColCountEIntParserRuleCall_1_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEInt_in_ruleQuestion2912);
            	    lv_colCount_22_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"colCount",
            	            		lv_colCount_22_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1200:4: ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1200:4: ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1201:5: {...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1201:106: ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1202:6: ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1205:6: ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1205:7: {...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1205:16: (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1206:2: otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) )
            	    {
            	    otherlv_23=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleQuestion2981); 

            	        	newLeafNode(otherlv_23, grammarAccess.getQuestionAccess().getQuestionNameKeyword_1_10_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1210:1: ( (lv_questionName_24_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1211:1: (lv_questionName_24_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1211:1: (lv_questionName_24_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1212:3: lv_questionName_24_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getQuestionNameEStringParserRuleCall_1_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion3001);
            	    lv_questionName_24_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"questionName",
            	            		lv_questionName_24_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1235:4: ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1235:4: ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1236:5: {...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1236:106: ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1237:6: ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1240:6: ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1240:7: {...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1240:16: (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1241:2: otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) )
            	    {
            	    otherlv_25=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleQuestion3070); 

            	        	newLeafNode(otherlv_25, grammarAccess.getQuestionAccess().getCommentRowsKeyword_1_11_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1245:1: ( (lv_rows_26_0= ruleEInt ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1246:1: (lv_rows_26_0= ruleEInt )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1246:1: (lv_rows_26_0= ruleEInt )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1247:3: lv_rows_26_0= ruleEInt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getRowsEIntParserRuleCall_1_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEInt_in_ruleQuestion3090);
            	    lv_rows_26_0=ruleEInt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rows",
            	            		lv_rows_26_0, 
            	            		"EInt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1270:4: ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1270:4: ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1271:5: {...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1271:106: ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1272:6: ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1275:6: ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1275:7: {...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1275:16: (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1276:2: otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) )
            	    {
            	    otherlv_27=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleQuestion3159); 

            	        	newLeafNode(otherlv_27, grammarAccess.getQuestionAccess().getRatingMinDescriptionKeyword_1_12_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1280:1: ( (lv_mininumRateDescription_28_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1281:1: (lv_mininumRateDescription_28_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1281:1: (lv_mininumRateDescription_28_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1282:3: lv_mininumRateDescription_28_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMininumRateDescriptionEStringParserRuleCall_1_12_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion3179);
            	    lv_mininumRateDescription_28_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mininumRateDescription",
            	            		lv_mininumRateDescription_28_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1305:4: ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1305:4: ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1306:5: {...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1306:106: ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1307:6: ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1310:6: ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1310:7: {...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1310:16: (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1311:2: otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) )
            	    {
            	    otherlv_29=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleQuestion3248); 

            	        	newLeafNode(otherlv_29, grammarAccess.getQuestionAccess().getRatingMaxDescriptionKeyword_1_13_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1315:1: ( (lv_maximumRateDescription_30_0= ruleEString ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1316:1: (lv_maximumRateDescription_30_0= ruleEString )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1316:1: (lv_maximumRateDescription_30_0= ruleEString )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1317:3: lv_maximumRateDescription_30_0= ruleEString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMaximumRateDescriptionEStringParserRuleCall_1_13_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleQuestion3268);
            	    lv_maximumRateDescription_30_0=ruleEString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"maximumRateDescription",
            	            		lv_maximumRateDescription_30_0, 
            	            		"EString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getQuestionAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canLeave(grammarAccess.getQuestionAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	

            }

            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1348:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1350:1: ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1350:1: ( ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1351:2: ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            	
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1354:2: ( ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )* )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1355:3: ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )*
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1355:3: ( ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==KEYWORD_43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==KEYWORD_55 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==KEYWORD_50 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1357:4: ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1357:4: ({...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1358:5: {...}? => ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1358:105: ( ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1359:6: ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1362:6: ({...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1362:7: {...}? => (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1362:16: (otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )* )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1363:2: otherlv_32= KEYWORD_43 ( (lv_matrixRows_33_0= ruleTextValue ) ) (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )*
            	    {
            	    otherlv_32=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleQuestion3374); 

            	        	newLeafNode(otherlv_32, grammarAccess.getQuestionAccess().getMatrixRowsKeyword_2_0_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1367:1: ( (lv_matrixRows_33_0= ruleTextValue ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1368:1: (lv_matrixRows_33_0= ruleTextValue )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1368:1: (lv_matrixRows_33_0= ruleTextValue )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1369:3: lv_matrixRows_33_0= ruleTextValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMatrixRowsTextValueParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextValue_in_ruleQuestion3394);
            	    lv_matrixRows_33_0=ruleTextValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"matrixRows",
            	            		lv_matrixRows_33_0, 
            	            		"TextValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1385:2: (otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==KEYWORD_3) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1386:2: otherlv_34= KEYWORD_3 ( (lv_matrixRows_35_0= ruleTextValue ) )
            	    	    {
            	    	    otherlv_34=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleQuestion3408); 

            	    	        	newLeafNode(otherlv_34, grammarAccess.getQuestionAccess().getCommaKeyword_2_0_2_0());
            	    	        
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1390:1: ( (lv_matrixRows_35_0= ruleTextValue ) )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1391:1: (lv_matrixRows_35_0= ruleTextValue )
            	    	    {
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1391:1: (lv_matrixRows_35_0= ruleTextValue )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1392:3: lv_matrixRows_35_0= ruleTextValue
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMatrixRowsTextValueParserRuleCall_2_0_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleTextValue_in_ruleQuestion3428);
            	    	    lv_matrixRows_35_0=ruleTextValue();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"matrixRows",
            	    	            		lv_matrixRows_35_0, 
            	    	            		"TextValue");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1415:4: ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1415:4: ({...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1416:5: {...}? => ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1416:105: ( ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1417:6: ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1420:6: ({...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1420:7: {...}? => (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1420:16: (otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )* )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1421:2: otherlv_36= KEYWORD_55 ( (lv_multiTextItems_37_0= ruleMultiTextItem ) ) ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )*
            	    {
            	    otherlv_36=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleQuestion3499); 

            	        	newLeafNode(otherlv_36, grammarAccess.getQuestionAccess().getMultiTextItemsKeyword_2_1_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1425:1: ( (lv_multiTextItems_37_0= ruleMultiTextItem ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1426:1: (lv_multiTextItems_37_0= ruleMultiTextItem )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1426:1: (lv_multiTextItems_37_0= ruleMultiTextItem )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1427:3: lv_multiTextItems_37_0= ruleMultiTextItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMultiTextItemsMultiTextItemParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiTextItem_in_ruleQuestion3519);
            	    lv_multiTextItems_37_0=ruleMultiTextItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"multiTextItems",
            	            		lv_multiTextItems_37_0, 
            	            		"MultiTextItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1443:2: ( (lv_multiTextItems_38_0= ruleMultiTextItem ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==KEYWORD_38) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1444:1: (lv_multiTextItems_38_0= ruleMultiTextItem )
            	    	    {
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1444:1: (lv_multiTextItems_38_0= ruleMultiTextItem )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1445:3: lv_multiTextItems_38_0= ruleMultiTextItem
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMultiTextItemsMultiTextItemParserRuleCall_2_1_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMultiTextItem_in_ruleQuestion3540);
            	    	    lv_multiTextItems_38_0=ruleMultiTextItem();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"multiTextItems",
            	    	            		lv_multiTextItems_38_0, 
            	    	            		"MultiTextItem");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1468:4: ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1468:4: ({...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1469:5: {...}? => ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1469:105: ( ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1470:6: ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1473:6: ({...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1473:7: {...}? => (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQuestion", "true");
            	    }
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1473:16: (otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )* )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1474:2: otherlv_39= KEYWORD_50 ( (lv_matrixColumns_40_0= ruleTextValue ) ) (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )*
            	    {
            	    otherlv_39=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleQuestion3610); 

            	        	newLeafNode(otherlv_39, grammarAccess.getQuestionAccess().getMatrixColumnsKeyword_2_2_0());
            	        
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1478:1: ( (lv_matrixColumns_40_0= ruleTextValue ) )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1479:1: (lv_matrixColumns_40_0= ruleTextValue )
            	    {
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1479:1: (lv_matrixColumns_40_0= ruleTextValue )
            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1480:3: lv_matrixColumns_40_0= ruleTextValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMatrixColumnsTextValueParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTextValue_in_ruleQuestion3630);
            	    lv_matrixColumns_40_0=ruleTextValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"matrixColumns",
            	            		lv_matrixColumns_40_0, 
            	            		"TextValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1496:2: (otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==KEYWORD_3) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1497:2: otherlv_41= KEYWORD_3 ( (lv_matrixColumns_42_0= ruleTextValue ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleQuestion3644); 

            	    	        	newLeafNode(otherlv_41, grammarAccess.getQuestionAccess().getCommaKeyword_2_2_2_0());
            	    	        
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1501:1: ( (lv_matrixColumns_42_0= ruleTextValue ) )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1502:1: (lv_matrixColumns_42_0= ruleTextValue )
            	    	    {
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1502:1: (lv_matrixColumns_42_0= ruleTextValue )
            	    	    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1503:3: lv_matrixColumns_42_0= ruleTextValue
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQuestionAccess().getMatrixColumnsTextValueParserRuleCall_2_2_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleTextValue_in_ruleQuestion3664);
            	    	    lv_matrixColumns_42_0=ruleTextValue();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"matrixColumns",
            	    	            		lv_matrixColumns_42_0, 
            	    	            		"TextValue");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            	

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleTextValue"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1541:1: entryRuleTextValue returns [EObject current=null] : iv_ruleTextValue= ruleTextValue EOF ;
    public final EObject entryRuleTextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextValue = null;


        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1542:2: (iv_ruleTextValue= ruleTextValue EOF )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1543:2: iv_ruleTextValue= ruleTextValue EOF
            {
             newCompositeNode(grammarAccess.getTextValueRule()); 
            pushFollow(FOLLOW_ruleTextValue_in_entryRuleTextValue3742);
            iv_ruleTextValue=ruleTextValue();

            state._fsp--;

             current =iv_ruleTextValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextValue3752); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextValue"


    // $ANTLR start "ruleTextValue"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1550:1: ruleTextValue returns [EObject current=null] : (otherlv_0= KEYWORD_1 otherlv_1= KEYWORD_20 ( (lv_text_2_0= ruleEString ) ) (otherlv_3= KEYWORD_27 ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= KEYWORD_2 ) ;
    public final EObject ruleTextValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1553:28: ( (otherlv_0= KEYWORD_1 otherlv_1= KEYWORD_20 ( (lv_text_2_0= ruleEString ) ) (otherlv_3= KEYWORD_27 ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= KEYWORD_2 ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1554:1: (otherlv_0= KEYWORD_1 otherlv_1= KEYWORD_20 ( (lv_text_2_0= ruleEString ) ) (otherlv_3= KEYWORD_27 ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= KEYWORD_2 )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1554:1: (otherlv_0= KEYWORD_1 otherlv_1= KEYWORD_20 ( (lv_text_2_0= ruleEString ) ) (otherlv_3= KEYWORD_27 ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= KEYWORD_2 )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1555:2: otherlv_0= KEYWORD_1 otherlv_1= KEYWORD_20 ( (lv_text_2_0= ruleEString ) ) (otherlv_3= KEYWORD_27 ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleTextValue3790); 

                	newLeafNode(otherlv_0, grammarAccess.getTextValueAccess().getLeftParenthesisKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleTextValue3802); 

                	newLeafNode(otherlv_1, grammarAccess.getTextValueAccess().getTextKeyword_1());
                
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1564:1: ( (lv_text_2_0= ruleEString ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1565:1: (lv_text_2_0= ruleEString )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1565:1: (lv_text_2_0= ruleEString )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1566:3: lv_text_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTextValueAccess().getTextEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTextValue3822);
            lv_text_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextValueRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1582:2: (otherlv_3= KEYWORD_27 ( (lv_value_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1583:2: otherlv_3= KEYWORD_27 ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleTextValue3836); 

                        	newLeafNode(otherlv_3, grammarAccess.getTextValueAccess().getValueKeyword_3_0());
                        
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1587:1: ( (lv_value_4_0= ruleEString ) )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1588:1: (lv_value_4_0= ruleEString )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1588:1: (lv_value_4_0= ruleEString )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1589:3: lv_value_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextValueAccess().getValueEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTextValue3856);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleTextValue3871); 

                	newLeafNode(otherlv_5, grammarAccess.getTextValueAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextValue"


    // $ANTLR start "entryRuleMultiTextItem"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1618:1: entryRuleMultiTextItem returns [EObject current=null] : iv_ruleMultiTextItem= ruleMultiTextItem EOF ;
    public final EObject entryRuleMultiTextItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiTextItem = null;


        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1619:2: (iv_ruleMultiTextItem= ruleMultiTextItem EOF )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1620:2: iv_ruleMultiTextItem= ruleMultiTextItem EOF
            {
             newCompositeNode(grammarAccess.getMultiTextItemRule()); 
            pushFollow(FOLLOW_ruleMultiTextItem_in_entryRuleMultiTextItem3905);
            iv_ruleMultiTextItem=ruleMultiTextItem();

            state._fsp--;

             current =iv_ruleMultiTextItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiTextItem3915); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiTextItem"


    // $ANTLR start "ruleMultiTextItem"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1627:1: ruleMultiTextItem returns [EObject current=null] : (otherlv_0= KEYWORD_38 ( (lv_title_1_0= ruleEString ) ) ) ;
    public final EObject ruleMultiTextItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;


         enterRule(); 
            
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1630:28: ( (otherlv_0= KEYWORD_38 ( (lv_title_1_0= ruleEString ) ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1631:1: (otherlv_0= KEYWORD_38 ( (lv_title_1_0= ruleEString ) ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1631:1: (otherlv_0= KEYWORD_38 ( (lv_title_1_0= ruleEString ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1632:2: otherlv_0= KEYWORD_38 ( (lv_title_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleMultiTextItem3953); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiTextItemAccess().getSubtitleKeyword_0());
                
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1636:1: ( (lv_title_1_0= ruleEString ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1637:1: (lv_title_1_0= ruleEString )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1637:1: (lv_title_1_0= ruleEString )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1638:3: lv_title_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMultiTextItemAccess().getTitleEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleMultiTextItem3973);
            lv_title_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiTextItemRule());
            	        }
                   		set(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiTextItem"


    // $ANTLR start "ruleTitleLocation"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1662:1: ruleTitleLocation returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_22 ) ) ;
    public final Enumerator ruleTitleLocation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1664:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_22 ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1665:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_22 ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1665:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_22 ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_7) ) {
                alt15=1;
            }
            else if ( (LA15_0==KEYWORD_22) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1665:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1665:2: (enumLiteral_0= KEYWORD_7 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1665:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleTitleLocation4026); 

                            current = grammarAccess.getTitleLocationAccess().getTopEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTitleLocationAccess().getTopEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1671:6: (enumLiteral_1= KEYWORD_22 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1671:6: (enumLiteral_1= KEYWORD_22 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1671:11: enumLiteral_1= KEYWORD_22
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleTitleLocation4048); 

                            current = grammarAccess.getTitleLocationAccess().getBottomEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTitleLocationAccess().getBottomEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitleLocation"


    // $ANTLR start "ruleProgressBarLocation"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1681:1: ruleProgressBarLocation returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_5 ) | (enumLiteral_2= KEYWORD_22 ) ) ;
    public final Enumerator ruleProgressBarLocation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1683:28: ( ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_5 ) | (enumLiteral_2= KEYWORD_22 ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1684:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_5 ) | (enumLiteral_2= KEYWORD_22 ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1684:1: ( (enumLiteral_0= KEYWORD_7 ) | (enumLiteral_1= KEYWORD_5 ) | (enumLiteral_2= KEYWORD_22 ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt16=1;
                }
                break;
            case KEYWORD_5:
                {
                alt16=2;
                }
                break;
            case KEYWORD_22:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1684:2: (enumLiteral_0= KEYWORD_7 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1684:2: (enumLiteral_0= KEYWORD_7 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1684:7: enumLiteral_0= KEYWORD_7
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleProgressBarLocation4098); 

                            current = grammarAccess.getProgressBarLocationAccess().getTopEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getProgressBarLocationAccess().getTopEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1690:6: (enumLiteral_1= KEYWORD_5 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1690:6: (enumLiteral_1= KEYWORD_5 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1690:11: enumLiteral_1= KEYWORD_5
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleProgressBarLocation4120); 

                            current = grammarAccess.getProgressBarLocationAccess().getOffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getProgressBarLocationAccess().getOffEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1696:6: (enumLiteral_2= KEYWORD_22 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1696:6: (enumLiteral_2= KEYWORD_22 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1696:11: enumLiteral_2= KEYWORD_22
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleProgressBarLocation4142); 

                            current = grammarAccess.getProgressBarLocationAccess().getBottomEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getProgressBarLocationAccess().getBottomEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgressBarLocation"


    // $ANTLR start "ruleQuestionType"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1706:1: ruleQuestionType returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_40 ) | (enumLiteral_2= KEYWORD_30 ) | (enumLiteral_3= KEYWORD_33 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_23 ) | (enumLiteral_6= KEYWORD_46 ) | (enumLiteral_7= KEYWORD_25 ) ) ;
    public final Enumerator ruleQuestionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1708:28: ( ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_40 ) | (enumLiteral_2= KEYWORD_30 ) | (enumLiteral_3= KEYWORD_33 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_23 ) | (enumLiteral_6= KEYWORD_46 ) | (enumLiteral_7= KEYWORD_25 ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1709:1: ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_40 ) | (enumLiteral_2= KEYWORD_30 ) | (enumLiteral_3= KEYWORD_33 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_23 ) | (enumLiteral_6= KEYWORD_46 ) | (enumLiteral_7= KEYWORD_25 ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1709:1: ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_40 ) | (enumLiteral_2= KEYWORD_30 ) | (enumLiteral_3= KEYWORD_33 ) | (enumLiteral_4= KEYWORD_28 ) | (enumLiteral_5= KEYWORD_23 ) | (enumLiteral_6= KEYWORD_46 ) | (enumLiteral_7= KEYWORD_25 ) )
            int alt17=8;
            switch ( input.LA(1) ) {
            case KEYWORD_11:
                {
                alt17=1;
                }
                break;
            case KEYWORD_40:
                {
                alt17=2;
                }
                break;
            case KEYWORD_30:
                {
                alt17=3;
                }
                break;
            case KEYWORD_33:
                {
                alt17=4;
                }
                break;
            case KEYWORD_28:
                {
                alt17=5;
                }
                break;
            case KEYWORD_23:
                {
                alt17=6;
                }
                break;
            case KEYWORD_46:
                {
                alt17=7;
                }
                break;
            case KEYWORD_25:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1709:2: (enumLiteral_0= KEYWORD_11 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1709:2: (enumLiteral_0= KEYWORD_11 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1709:7: enumLiteral_0= KEYWORD_11
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleQuestionType4192); 

                            current = grammarAccess.getQuestionTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQuestionTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1715:6: (enumLiteral_1= KEYWORD_40 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1715:6: (enumLiteral_1= KEYWORD_40 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1715:11: enumLiteral_1= KEYWORD_40
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleQuestionType4214); 

                            current = grammarAccess.getQuestionTypeAccess().getRadiogroupEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQuestionTypeAccess().getRadiogroupEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1721:6: (enumLiteral_2= KEYWORD_30 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1721:6: (enumLiteral_2= KEYWORD_30 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1721:11: enumLiteral_2= KEYWORD_30
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleQuestionType4236); 

                            current = grammarAccess.getQuestionTypeAccess().getCheckboxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQuestionTypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1727:6: (enumLiteral_3= KEYWORD_33 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1727:6: (enumLiteral_3= KEYWORD_33 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1727:11: enumLiteral_3= KEYWORD_33
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleQuestionType4258); 

                            current = grammarAccess.getQuestionTypeAccess().getDropdownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQuestionTypeAccess().getDropdownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1733:6: (enumLiteral_4= KEYWORD_28 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1733:6: (enumLiteral_4= KEYWORD_28 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1733:11: enumLiteral_4= KEYWORD_28
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleQuestionType4280); 

                            current = grammarAccess.getQuestionTypeAccess().getCommentEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQuestionTypeAccess().getCommentEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1739:6: (enumLiteral_5= KEYWORD_23 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1739:6: (enumLiteral_5= KEYWORD_23 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1739:11: enumLiteral_5= KEYWORD_23
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleQuestionType4302); 

                            current = grammarAccess.getQuestionTypeAccess().getMatrixEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQuestionTypeAccess().getMatrixEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1745:6: (enumLiteral_6= KEYWORD_46 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1745:6: (enumLiteral_6= KEYWORD_46 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1745:11: enumLiteral_6= KEYWORD_46
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleQuestionType4324); 

                            current = grammarAccess.getQuestionTypeAccess().getMultipleTextEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getQuestionTypeAccess().getMultipleTextEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1751:6: (enumLiteral_7= KEYWORD_25 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1751:6: (enumLiteral_7= KEYWORD_25 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1751:11: enumLiteral_7= KEYWORD_25
                    {
                    enumLiteral_7=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleQuestionType4346); 

                            current = grammarAccess.getQuestionTypeAccess().getRatingEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getQuestionTypeAccess().getRatingEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionType"


    // $ANTLR start "ruleTextInputType"
    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1761:1: ruleTextInputType returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_19 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_10 ) | (enumLiteral_5= KEYWORD_32 ) | (enumLiteral_6= KEYWORD_16 ) | (enumLiteral_7= KEYWORD_18 ) | (enumLiteral_8= KEYWORD_24 ) | (enumLiteral_9= KEYWORD_34 ) | (enumLiteral_10= KEYWORD_6 ) | (enumLiteral_11= KEYWORD_8 ) | (enumLiteral_12= KEYWORD_14 ) ) ;
    public final Enumerator ruleTextInputType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;

         enterRule(); 
        try {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1763:28: ( ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_19 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_10 ) | (enumLiteral_5= KEYWORD_32 ) | (enumLiteral_6= KEYWORD_16 ) | (enumLiteral_7= KEYWORD_18 ) | (enumLiteral_8= KEYWORD_24 ) | (enumLiteral_9= KEYWORD_34 ) | (enumLiteral_10= KEYWORD_6 ) | (enumLiteral_11= KEYWORD_8 ) | (enumLiteral_12= KEYWORD_14 ) ) )
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1764:1: ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_19 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_10 ) | (enumLiteral_5= KEYWORD_32 ) | (enumLiteral_6= KEYWORD_16 ) | (enumLiteral_7= KEYWORD_18 ) | (enumLiteral_8= KEYWORD_24 ) | (enumLiteral_9= KEYWORD_34 ) | (enumLiteral_10= KEYWORD_6 ) | (enumLiteral_11= KEYWORD_8 ) | (enumLiteral_12= KEYWORD_14 ) )
            {
            // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1764:1: ( (enumLiteral_0= KEYWORD_11 ) | (enumLiteral_1= KEYWORD_12 ) | (enumLiteral_2= KEYWORD_19 ) | (enumLiteral_3= KEYWORD_15 ) | (enumLiteral_4= KEYWORD_10 ) | (enumLiteral_5= KEYWORD_32 ) | (enumLiteral_6= KEYWORD_16 ) | (enumLiteral_7= KEYWORD_18 ) | (enumLiteral_8= KEYWORD_24 ) | (enumLiteral_9= KEYWORD_34 ) | (enumLiteral_10= KEYWORD_6 ) | (enumLiteral_11= KEYWORD_8 ) | (enumLiteral_12= KEYWORD_14 ) )
            int alt18=13;
            switch ( input.LA(1) ) {
            case KEYWORD_11:
                {
                alt18=1;
                }
                break;
            case KEYWORD_12:
                {
                alt18=2;
                }
                break;
            case KEYWORD_19:
                {
                alt18=3;
                }
                break;
            case KEYWORD_15:
                {
                alt18=4;
                }
                break;
            case KEYWORD_10:
                {
                alt18=5;
                }
                break;
            case KEYWORD_32:
                {
                alt18=6;
                }
                break;
            case KEYWORD_16:
                {
                alt18=7;
                }
                break;
            case KEYWORD_18:
                {
                alt18=8;
                }
                break;
            case KEYWORD_24:
                {
                alt18=9;
                }
                break;
            case KEYWORD_34:
                {
                alt18=10;
                }
                break;
            case KEYWORD_6:
                {
                alt18=11;
                }
                break;
            case KEYWORD_8:
                {
                alt18=12;
                }
                break;
            case KEYWORD_14:
                {
                alt18=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1764:2: (enumLiteral_0= KEYWORD_11 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1764:2: (enumLiteral_0= KEYWORD_11 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1764:7: enumLiteral_0= KEYWORD_11
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleTextInputType4396); 

                            current = grammarAccess.getTextInputTypeAccess().getTextEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTextInputTypeAccess().getTextEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1770:6: (enumLiteral_1= KEYWORD_12 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1770:6: (enumLiteral_1= KEYWORD_12 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1770:11: enumLiteral_1= KEYWORD_12
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleTextInputType4418); 

                            current = grammarAccess.getTextInputTypeAccess().getTimeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTextInputTypeAccess().getTimeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1776:6: (enumLiteral_2= KEYWORD_19 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1776:6: (enumLiteral_2= KEYWORD_19 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1776:11: enumLiteral_2= KEYWORD_19
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleTextInputType4440); 

                            current = grammarAccess.getTextInputTypeAccess().getRangeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTextInputTypeAccess().getRangeEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1782:6: (enumLiteral_3= KEYWORD_15 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1782:6: (enumLiteral_3= KEYWORD_15 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1782:11: enumLiteral_3= KEYWORD_15
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleTextInputType4462); 

                            current = grammarAccess.getTextInputTypeAccess().getColorEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTextInputTypeAccess().getColorEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1788:6: (enumLiteral_4= KEYWORD_10 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1788:6: (enumLiteral_4= KEYWORD_10 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1788:11: enumLiteral_4= KEYWORD_10
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleTextInputType4484); 

                            current = grammarAccess.getTextInputTypeAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTextInputTypeAccess().getDateEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1794:6: (enumLiteral_5= KEYWORD_32 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1794:6: (enumLiteral_5= KEYWORD_32 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1794:11: enumLiteral_5= KEYWORD_32
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleTextInputType4506); 

                            current = grammarAccess.getTextInputTypeAccess().getDatetimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTextInputTypeAccess().getDatetimeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1800:6: (enumLiteral_6= KEYWORD_16 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1800:6: (enumLiteral_6= KEYWORD_16 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1800:11: enumLiteral_6= KEYWORD_16
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleTextInputType4528); 

                            current = grammarAccess.getTextInputTypeAccess().getEmailEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTextInputTypeAccess().getEmailEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1806:6: (enumLiteral_7= KEYWORD_18 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1806:6: (enumLiteral_7= KEYWORD_18 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1806:11: enumLiteral_7= KEYWORD_18
                    {
                    enumLiteral_7=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleTextInputType4550); 

                            current = grammarAccess.getTextInputTypeAccess().getMonthEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTextInputTypeAccess().getMonthEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1812:6: (enumLiteral_8= KEYWORD_24 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1812:6: (enumLiteral_8= KEYWORD_24 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1812:11: enumLiteral_8= KEYWORD_24
                    {
                    enumLiteral_8=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleTextInputType4572); 

                            current = grammarAccess.getTextInputTypeAccess().getNumberEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTextInputTypeAccess().getNumberEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1818:6: (enumLiteral_9= KEYWORD_34 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1818:6: (enumLiteral_9= KEYWORD_34 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1818:11: enumLiteral_9= KEYWORD_34
                    {
                    enumLiteral_9=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleTextInputType4594); 

                            current = grammarAccess.getTextInputTypeAccess().getPasswordEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getTextInputTypeAccess().getPasswordEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1824:6: (enumLiteral_10= KEYWORD_6 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1824:6: (enumLiteral_10= KEYWORD_6 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1824:11: enumLiteral_10= KEYWORD_6
                    {
                    enumLiteral_10=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleTextInputType4616); 

                            current = grammarAccess.getTextInputTypeAccess().getTelEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getTextInputTypeAccess().getTelEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1830:6: (enumLiteral_11= KEYWORD_8 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1830:6: (enumLiteral_11= KEYWORD_8 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1830:11: enumLiteral_11= KEYWORD_8
                    {
                    enumLiteral_11=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleTextInputType4638); 

                            current = grammarAccess.getTextInputTypeAccess().getUrlEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getTextInputTypeAccess().getUrlEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1836:6: (enumLiteral_12= KEYWORD_14 )
                    {
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1836:6: (enumLiteral_12= KEYWORD_14 )
                    // ../xtext.queryIT/src-gen/xtext/parser/antlr/internal/InternalQueryITParser.g:1836:11: enumLiteral_12= KEYWORD_14
                    {
                    enumLiteral_12=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleTextInputType4660); 

                            current = grammarAccess.getTextInputTypeAccess().getWeekEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getTextInputTypeAccess().getWeekEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextInputType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\4\16\uffff";
    static final String DFA2_maxS =
        "\1\65\16\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15";
    static final String DFA2_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\15\1\2\2\uffff\1\14\1\16\1\4\1\11\1\12\1\13\1\5\1\uffff"+
            "\1\3\10\uffff\1\6\1\uffff\1\10\20\uffff\1\7\10\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 82:3: ( ({...}? => ( ({...}? => ( (lv_hideNavigationButtons_1_0= KEYWORD_60 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageTitles_2_0= KEYWORD_49 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hideQuestionNumbers_3_0= KEYWORD_57 ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_hidePageNumbers_4_0= KEYWORD_54 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_39 ( (lv_author_6_0= ruleEString ) ) (otherlv_7= KEYWORD_3 ( (lv_author_8_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_26 ( (lv_title_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_41 ( (lv_timeLimit_12_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_56 ( (lv_completedMessage_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_52 ( (lv_pageNextText_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_53 ( (lv_pagePrevText_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= KEYWORD_58 ( (lv_completeText_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_63 ( (lv_questionTitleLocation_22_0= ruleTitleLocation ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_59 ( (lv_showProgressBar_24_0= ruleProgressBarLocation ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_0 = input.LA(1);

                         
                        int index2_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA2_0==KEYWORD_9) ) {s = 1;}

                        else if ( LA2_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 2;}

                        else if ( LA2_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 3;}

                        else if ( LA2_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 4;}

                        else if ( LA2_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 5;}

                        else if ( LA2_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 6;}

                        else if ( LA2_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 7;}

                        else if ( LA2_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 8;}

                        else if ( LA2_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 9;}

                        else if ( LA2_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 10;}

                        else if ( LA2_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 11;}

                        else if ( LA2_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 12;}

                        else if ( LA2_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 13;}

                        else if ( LA2_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 14;}

                         
                        input.seek(index2_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\20\uffff";
    static final String DFA9_eofS =
        "\1\1\17\uffff";
    static final String DFA9_minS =
        "\1\6\17\uffff";
    static final String DFA9_maxS =
        "\1\65\17\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\17\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16";
    static final String DFA9_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\17\1\16\7\uffff\1\1\1\uffff\1\1\1\7\1\14\1\15\1\uffff\1"+
            "\11\1\1\1\5\3\uffff\1\10\1\13\1\6\1\uffff\1\1\1\uffff\1\12\3"+
            "\uffff\1\2\5\uffff\1\4\7\uffff\1\3\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()+ loopback of 832:3: ( ({...}? => ( ({...}? => ( (lv_isRequired_2_0= KEYWORD_35 ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= KEYWORD_21 ( (lv_type_4_0= ruleQuestionType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= KEYWORD_26 ( (lv_title_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= KEYWORD_44 ( (lv_rangeStart_8_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= KEYWORD_37 ( (lv_rangeEnd_10_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= KEYWORD_51 ( (lv_inputType_12_0= ruleTextInputType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= KEYWORD_42 ( (lv_visibleIf_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= KEYWORD_47 ( (lv_placeholder_16_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= KEYWORD_31 ( (lv_choices_18_0= ruleEString ) ) (otherlv_19= KEYWORD_3 ( (lv_choices_20_0= ruleEString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= KEYWORD_36 ( (lv_colCount_22_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= KEYWORD_48 ( (lv_questionName_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= KEYWORD_45 ( (lv_rows_26_0= ruleEInt ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= KEYWORD_62 ( (lv_mininumRateDescription_28_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= KEYWORD_61 ( (lv_maximumRateDescription_30_0= ruleEString ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0==EOF||LA9_0==KEYWORD_55||LA9_0==KEYWORD_50||LA9_0==KEYWORD_43||LA9_0==KEYWORD_29||LA9_0==KEYWORD_9) ) {s = 1;}

                        else if ( LA9_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 2;}

                        else if ( LA9_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 3;}

                        else if ( LA9_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 4;}

                        else if ( LA9_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 5;}

                        else if ( LA9_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 6;}

                        else if ( LA9_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 7;}

                        else if ( LA9_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 8;}

                        else if ( LA9_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 9;}

                        else if ( LA9_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 10;}

                        else if ( LA9_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 11;}

                        else if ( LA9_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 12;}

                        else if ( LA9_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 13;}

                        else if ( LA9_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 14;}

                        else if ( LA9_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 15;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_ruleSurvey166 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleSurvey250 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleSurvey334 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleSurvey418 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleSurvey497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSurvey517 = new BitSet(new long[]{0x002010000A017F30L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleSurvey531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSurvey551 = new BitSet(new long[]{0x002010000A017F30L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleSurvey622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSurvey642 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleSurvey711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleSurvey731 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleSurvey800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSurvey820 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleSurvey889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSurvey909 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_53_in_ruleSurvey978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSurvey998 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleSurvey1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSurvey1087 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleSurvey1156 = new BitSet(new long[]{0x2000010000000000L});
    public static final BitSet FOLLOW_ruleTitleLocation_in_ruleSurvey1176 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleSurvey1245 = new BitSet(new long[]{0x2800010000000000L});
    public static final BitSet FOLLOW_ruleProgressBarLocation_in_ruleSurvey1265 = new BitSet(new long[]{0x002010000A017F30L});
    public static final BitSet FOLLOW_rulePage_in_ruleSurvey1327 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rulePage_in_ruleSurvey1348 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePage1554 = new BitSet(new long[]{0x0000100110000000L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rulePage1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_rulePage1632 = new BitSet(new long[]{0x0000100110000000L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rulePage1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_rulePage1721 = new BitSet(new long[]{0x0000100110000000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage1783 = new BitSet(new long[]{0x0000100110000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePage1804 = new BitSet(new long[]{0x0000100110000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleEInt1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleQuestion2002 = new BitSet(new long[]{0x00101044715C00C0L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleQuestion2065 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleQuestion2144 = new BitSet(new long[]{0x00800A9204200000L});
    public static final BitSet FOLLOW_ruleQuestionType_in_ruleQuestion2164 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleQuestion2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion2253 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleQuestion2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleQuestion2342 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleQuestion2411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleQuestion2431 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleQuestion2500 = new BitSet(new long[]{0x55C6C42800000000L});
    public static final BitSet FOLLOW_ruleTextInputType_in_ruleQuestion2520 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleQuestion2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion2609 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleQuestion2678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion2698 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleQuestion2767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion2787 = new BitSet(new long[]{0x0010104471DE80C2L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleQuestion2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion2821 = new BitSet(new long[]{0x0010104471DE80C2L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleQuestion2892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleQuestion2912 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleQuestion2981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion3001 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleQuestion3070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_ruleEInt_in_ruleQuestion3090 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleQuestion3159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion3179 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleQuestion3248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleQuestion3268 = new BitSet(new long[]{0x0010104471DE80C2L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleQuestion3374 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleQuestion3394 = new BitSet(new long[]{0x0000000000828002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleQuestion3408 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleQuestion3428 = new BitSet(new long[]{0x0000000000828002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleQuestion3499 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleMultiTextItem_in_ruleQuestion3519 = new BitSet(new long[]{0x0000000080828002L});
    public static final BitSet FOLLOW_ruleMultiTextItem_in_ruleQuestion3540 = new BitSet(new long[]{0x0000000080828002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleQuestion3610 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleQuestion3630 = new BitSet(new long[]{0x0000000000828002L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleQuestion3644 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleTextValue_in_ruleQuestion3664 = new BitSet(new long[]{0x0000000000828002L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_entryRuleTextValue3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextValue3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleTextValue3790 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleTextValue3802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTextValue3822 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleTextValue3836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTextValue3856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleTextValue3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiTextItem_in_entryRuleMultiTextItem3905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiTextItem3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleMultiTextItem3953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_ruleEString_in_ruleMultiTextItem3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleTitleLocation4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleTitleLocation4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleProgressBarLocation4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleProgressBarLocation4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleProgressBarLocation4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleQuestionType4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleQuestionType4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleQuestionType4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleQuestionType4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleQuestionType4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleQuestionType4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleQuestionType4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleQuestionType4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleTextInputType4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleTextInputType4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleTextInputType4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleTextInputType4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleTextInputType4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleTextInputType4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleTextInputType4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleTextInputType4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleTextInputType4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleTextInputType4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleTextInputType4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleTextInputType4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleTextInputType4660 = new BitSet(new long[]{0x0000000000000002L});

}
