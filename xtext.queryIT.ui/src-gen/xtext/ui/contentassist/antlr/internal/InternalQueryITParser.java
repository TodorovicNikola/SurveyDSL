package xtext.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import xtext.services.QueryITGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryITParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g"; }


     
     	private QueryITGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("KEYWORD_1", "'('");
    		tokenNameToValue.put("KEYWORD_2", "')'");
    		tokenNameToValue.put("KEYWORD_3", "','");
    		tokenNameToValue.put("KEYWORD_4", "'-'");
    		tokenNameToValue.put("KEYWORD_5", "'off'");
    		tokenNameToValue.put("KEYWORD_6", "'tel'");
    		tokenNameToValue.put("KEYWORD_7", "'top'");
    		tokenNameToValue.put("KEYWORD_8", "'url'");
    		tokenNameToValue.put("KEYWORD_9", "'Page'");
    		tokenNameToValue.put("KEYWORD_10", "'date'");
    		tokenNameToValue.put("KEYWORD_11", "'text'");
    		tokenNameToValue.put("KEYWORD_12", "'time'");
    		tokenNameToValue.put("KEYWORD_14", "'week'");
    		tokenNameToValue.put("KEYWORD_15", "'color'");
    		tokenNameToValue.put("KEYWORD_16", "'email'");
    		tokenNameToValue.put("KEYWORD_18", "'month'");
    		tokenNameToValue.put("KEYWORD_19", "'range'");
    		tokenNameToValue.put("KEYWORD_20", "'text:'");
    		tokenNameToValue.put("KEYWORD_21", "'type:'");
    		tokenNameToValue.put("KEYWORD_22", "'bottom'");
    		tokenNameToValue.put("KEYWORD_23", "'matrix'");
    		tokenNameToValue.put("KEYWORD_24", "'number'");
    		tokenNameToValue.put("KEYWORD_25", "'rating'");
    		tokenNameToValue.put("KEYWORD_26", "'title:'");
    		tokenNameToValue.put("KEYWORD_27", "'value:'");
    		tokenNameToValue.put("KEYWORD_28", "'comment'");
    		tokenNameToValue.put("KEYWORD_29", "'Question'");
    		tokenNameToValue.put("KEYWORD_30", "'checkbox'");
    		tokenNameToValue.put("KEYWORD_31", "'choices:'");
    		tokenNameToValue.put("KEYWORD_32", "'datetime'");
    		tokenNameToValue.put("KEYWORD_33", "'dropdown'");
    		tokenNameToValue.put("KEYWORD_34", "'password'");
    		tokenNameToValue.put("KEYWORD_35", "'required'");
    		tokenNameToValue.put("KEYWORD_36", "'colCount:'");
    		tokenNameToValue.put("KEYWORD_37", "'rangeEnd:'");
    		tokenNameToValue.put("KEYWORD_38", "'subtitle:'");
    		tokenNameToValue.put("KEYWORD_39", "'author(s):'");
    		tokenNameToValue.put("KEYWORD_40", "'radiogroup'");
    		tokenNameToValue.put("KEYWORD_41", "'timeLimit:'");
    		tokenNameToValue.put("KEYWORD_42", "'visibleIf:'");
    		tokenNameToValue.put("KEYWORD_43", "'matrixRows:'");
    		tokenNameToValue.put("KEYWORD_44", "'rangeStart:'");
    		tokenNameToValue.put("KEYWORD_45", "'commentRows:'");
    		tokenNameToValue.put("KEYWORD_46", "'multipleText'");
    		tokenNameToValue.put("KEYWORD_47", "'placeholder:'");
    		tokenNameToValue.put("KEYWORD_48", "'questionName:'");
    		tokenNameToValue.put("KEYWORD_49", "'hidePageTitles'");
    		tokenNameToValue.put("KEYWORD_50", "'matrixColumns:'");
    		tokenNameToValue.put("KEYWORD_51", "'textInputType:'");
    		tokenNameToValue.put("KEYWORD_52", "'buttonNextText:'");
    		tokenNameToValue.put("KEYWORD_53", "'buttonPrevText:'");
    		tokenNameToValue.put("KEYWORD_54", "'hidePageNumbers'");
    		tokenNameToValue.put("KEYWORD_55", "'multiTextItems:'");
    		tokenNameToValue.put("KEYWORD_56", "'completedMessage:'");
    		tokenNameToValue.put("KEYWORD_57", "'hideQuestionNumbers'");
    		tokenNameToValue.put("KEYWORD_58", "'buttonCompletedText:'");
    		tokenNameToValue.put("KEYWORD_59", "'progressBarLocation:'");
    		tokenNameToValue.put("KEYWORD_60", "'hideNavigationButtons'");
    		tokenNameToValue.put("KEYWORD_61", "'ratingMaxDescription:'");
    		tokenNameToValue.put("KEYWORD_62", "'ratingMinDescription:'");
    		tokenNameToValue.put("KEYWORD_63", "'questionTitleLocation:'");
     	}
     	
        public void setGrammarAccess(QueryITGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleSurvey"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:124:1: entryRuleSurvey : ruleSurvey EOF ;
    public final void entryRuleSurvey() throws RecognitionException {
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:125:1: ( ruleSurvey EOF )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:126:1: ruleSurvey EOF
            {
             before(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_ruleSurvey_in_entryRuleSurvey54);
            ruleSurvey();

            state._fsp--;

             after(grammarAccess.getSurveyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSurvey61); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSurvey"


    // $ANTLR start "ruleSurvey"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:133:1: ruleSurvey : ( ( rule__Survey__Group__0 ) ) ;
    public final void ruleSurvey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:137:5: ( ( ( rule__Survey__Group__0 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:138:1: ( ( rule__Survey__Group__0 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:138:1: ( ( rule__Survey__Group__0 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:139:1: ( rule__Survey__Group__0 )
            {
             before(grammarAccess.getSurveyAccess().getGroup()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:140:1: ( rule__Survey__Group__0 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:140:2: rule__Survey__Group__0
            {
            pushFollow(FOLLOW_rule__Survey__Group__0_in_ruleSurvey91);
            rule__Survey__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSurvey"


    // $ANTLR start "entryRuleEString"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:152:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:153:1: ( ruleEString EOF )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:154:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString118);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString125); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:161:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:165:5: ( ( ( rule__EString__Alternatives ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:166:1: ( ( rule__EString__Alternatives ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:166:1: ( ( rule__EString__Alternatives ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:167:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:168:1: ( rule__EString__Alternatives )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:168:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString155);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePage"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:180:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:181:1: ( rulePage EOF )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:182:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_rulePage_in_entryRulePage182);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePage189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:189:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:193:5: ( ( ( rule__Page__Group__0 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:194:1: ( ( rule__Page__Group__0 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:194:1: ( ( rule__Page__Group__0 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:195:1: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:196:1: ( rule__Page__Group__0 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:196:2: rule__Page__Group__0
            {
            pushFollow(FOLLOW_rule__Page__Group__0_in_rulePage219);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleEInt"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:208:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:209:1: ( ruleEInt EOF )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:210:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_ruleEInt_in_entryRuleEInt246);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEInt253); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:217:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:221:5: ( ( ( rule__EInt__Group__0 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:222:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:222:1: ( ( rule__EInt__Group__0 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:223:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:224:1: ( rule__EInt__Group__0 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:224:2: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_rule__EInt__Group__0_in_ruleEInt283);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQuestion"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:238:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:239:1: ( ruleQuestion EOF )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:240:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion312);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion319); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:247:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:251:5: ( ( ( rule__Question__Group__0 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:252:1: ( ( rule__Question__Group__0 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:252:1: ( ( rule__Question__Group__0 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:253:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:254:1: ( rule__Question__Group__0 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:254:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion349);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleTextValue"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:266:1: entryRuleTextValue : ruleTextValue EOF ;
    public final void entryRuleTextValue() throws RecognitionException {
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:267:1: ( ruleTextValue EOF )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:268:1: ruleTextValue EOF
            {
             before(grammarAccess.getTextValueRule()); 
            pushFollow(FOLLOW_ruleTextValue_in_entryRuleTextValue376);
            ruleTextValue();

            state._fsp--;

             after(grammarAccess.getTextValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextValue383); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextValue"


    // $ANTLR start "ruleTextValue"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:275:1: ruleTextValue : ( ( rule__TextValue__Group__0 ) ) ;
    public final void ruleTextValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:279:5: ( ( ( rule__TextValue__Group__0 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:280:1: ( ( rule__TextValue__Group__0 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:280:1: ( ( rule__TextValue__Group__0 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:281:1: ( rule__TextValue__Group__0 )
            {
             before(grammarAccess.getTextValueAccess().getGroup()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:282:1: ( rule__TextValue__Group__0 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:282:2: rule__TextValue__Group__0
            {
            pushFollow(FOLLOW_rule__TextValue__Group__0_in_ruleTextValue413);
            rule__TextValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextValue"


    // $ANTLR start "entryRuleMultiTextItem"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:294:1: entryRuleMultiTextItem : ruleMultiTextItem EOF ;
    public final void entryRuleMultiTextItem() throws RecognitionException {
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:295:1: ( ruleMultiTextItem EOF )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:296:1: ruleMultiTextItem EOF
            {
             before(grammarAccess.getMultiTextItemRule()); 
            pushFollow(FOLLOW_ruleMultiTextItem_in_entryRuleMultiTextItem440);
            ruleMultiTextItem();

            state._fsp--;

             after(grammarAccess.getMultiTextItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiTextItem447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiTextItem"


    // $ANTLR start "ruleMultiTextItem"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:303:1: ruleMultiTextItem : ( ( rule__MultiTextItem__Group__0 ) ) ;
    public final void ruleMultiTextItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:307:5: ( ( ( rule__MultiTextItem__Group__0 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:308:1: ( ( rule__MultiTextItem__Group__0 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:308:1: ( ( rule__MultiTextItem__Group__0 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:309:1: ( rule__MultiTextItem__Group__0 )
            {
             before(grammarAccess.getMultiTextItemAccess().getGroup()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:310:1: ( rule__MultiTextItem__Group__0 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:310:2: rule__MultiTextItem__Group__0
            {
            pushFollow(FOLLOW_rule__MultiTextItem__Group__0_in_ruleMultiTextItem477);
            rule__MultiTextItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiTextItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiTextItem"


    // $ANTLR start "ruleTitleLocation"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:323:1: ruleTitleLocation : ( ( rule__TitleLocation__Alternatives ) ) ;
    public final void ruleTitleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:327:1: ( ( ( rule__TitleLocation__Alternatives ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:328:1: ( ( rule__TitleLocation__Alternatives ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:328:1: ( ( rule__TitleLocation__Alternatives ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:329:1: ( rule__TitleLocation__Alternatives )
            {
             before(grammarAccess.getTitleLocationAccess().getAlternatives()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:330:1: ( rule__TitleLocation__Alternatives )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:330:2: rule__TitleLocation__Alternatives
            {
            pushFollow(FOLLOW_rule__TitleLocation__Alternatives_in_ruleTitleLocation514);
            rule__TitleLocation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTitleLocationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitleLocation"


    // $ANTLR start "ruleProgressBarLocation"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:342:1: ruleProgressBarLocation : ( ( rule__ProgressBarLocation__Alternatives ) ) ;
    public final void ruleProgressBarLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:346:1: ( ( ( rule__ProgressBarLocation__Alternatives ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:347:1: ( ( rule__ProgressBarLocation__Alternatives ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:347:1: ( ( rule__ProgressBarLocation__Alternatives ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:348:1: ( rule__ProgressBarLocation__Alternatives )
            {
             before(grammarAccess.getProgressBarLocationAccess().getAlternatives()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:349:1: ( rule__ProgressBarLocation__Alternatives )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:349:2: rule__ProgressBarLocation__Alternatives
            {
            pushFollow(FOLLOW_rule__ProgressBarLocation__Alternatives_in_ruleProgressBarLocation550);
            rule__ProgressBarLocation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProgressBarLocationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgressBarLocation"


    // $ANTLR start "ruleQuestionType"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:361:1: ruleQuestionType : ( ( rule__QuestionType__Alternatives ) ) ;
    public final void ruleQuestionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:365:1: ( ( ( rule__QuestionType__Alternatives ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:366:1: ( ( rule__QuestionType__Alternatives ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:366:1: ( ( rule__QuestionType__Alternatives ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:367:1: ( rule__QuestionType__Alternatives )
            {
             before(grammarAccess.getQuestionTypeAccess().getAlternatives()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:368:1: ( rule__QuestionType__Alternatives )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:368:2: rule__QuestionType__Alternatives
            {
            pushFollow(FOLLOW_rule__QuestionType__Alternatives_in_ruleQuestionType586);
            rule__QuestionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionType"


    // $ANTLR start "ruleTextInputType"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:380:1: ruleTextInputType : ( ( rule__TextInputType__Alternatives ) ) ;
    public final void ruleTextInputType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:384:1: ( ( ( rule__TextInputType__Alternatives ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:385:1: ( ( rule__TextInputType__Alternatives ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:385:1: ( ( rule__TextInputType__Alternatives ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:386:1: ( rule__TextInputType__Alternatives )
            {
             before(grammarAccess.getTextInputTypeAccess().getAlternatives()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:387:1: ( rule__TextInputType__Alternatives )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:387:2: rule__TextInputType__Alternatives
            {
            pushFollow(FOLLOW_rule__TextInputType__Alternatives_in_ruleTextInputType622);
            rule__TextInputType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextInputTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextInputType"


    // $ANTLR start "rule__EString__Alternatives"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:398:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:402:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:403:1: ( RULE_STRING )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:403:1: ( RULE_STRING )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:404:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives657); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:409:6: ( RULE_ID )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:409:6: ( RULE_ID )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:410:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives674); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TitleLocation__Alternatives"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:421:1: rule__TitleLocation__Alternatives : ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_22 ) ) );
    public final void rule__TitleLocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:425:1: ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_22 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_7) ) {
                alt2=1;
            }
            else if ( (LA2_0==KEYWORD_22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:426:1: ( ( KEYWORD_7 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:426:1: ( ( KEYWORD_7 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:427:1: ( KEYWORD_7 )
                    {
                     before(grammarAccess.getTitleLocationAccess().getTopEnumLiteralDeclaration_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:428:1: ( KEYWORD_7 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:428:3: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__TitleLocation__Alternatives708); 

                    }

                     after(grammarAccess.getTitleLocationAccess().getTopEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:433:6: ( ( KEYWORD_22 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:433:6: ( ( KEYWORD_22 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:434:1: ( KEYWORD_22 )
                    {
                     before(grammarAccess.getTitleLocationAccess().getBottomEnumLiteralDeclaration_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:435:1: ( KEYWORD_22 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:435:3: KEYWORD_22
                    {
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__TitleLocation__Alternatives728); 

                    }

                     after(grammarAccess.getTitleLocationAccess().getBottomEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleLocation__Alternatives"


    // $ANTLR start "rule__ProgressBarLocation__Alternatives"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:445:1: rule__ProgressBarLocation__Alternatives : ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_5 ) ) | ( ( KEYWORD_22 ) ) );
    public final void rule__ProgressBarLocation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:449:1: ( ( ( KEYWORD_7 ) ) | ( ( KEYWORD_5 ) ) | ( ( KEYWORD_22 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case KEYWORD_7:
                {
                alt3=1;
                }
                break;
            case KEYWORD_5:
                {
                alt3=2;
                }
                break;
            case KEYWORD_22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:450:1: ( ( KEYWORD_7 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:450:1: ( ( KEYWORD_7 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:451:1: ( KEYWORD_7 )
                    {
                     before(grammarAccess.getProgressBarLocationAccess().getTopEnumLiteralDeclaration_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:452:1: ( KEYWORD_7 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:452:3: KEYWORD_7
                    {
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__ProgressBarLocation__Alternatives763); 

                    }

                     after(grammarAccess.getProgressBarLocationAccess().getTopEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:457:6: ( ( KEYWORD_5 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:457:6: ( ( KEYWORD_5 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:458:1: ( KEYWORD_5 )
                    {
                     before(grammarAccess.getProgressBarLocationAccess().getOffEnumLiteralDeclaration_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:459:1: ( KEYWORD_5 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:459:3: KEYWORD_5
                    {
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__ProgressBarLocation__Alternatives783); 

                    }

                     after(grammarAccess.getProgressBarLocationAccess().getOffEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:464:6: ( ( KEYWORD_22 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:464:6: ( ( KEYWORD_22 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:465:1: ( KEYWORD_22 )
                    {
                     before(grammarAccess.getProgressBarLocationAccess().getBottomEnumLiteralDeclaration_2()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:466:1: ( KEYWORD_22 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:466:3: KEYWORD_22
                    {
                    match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__ProgressBarLocation__Alternatives803); 

                    }

                     after(grammarAccess.getProgressBarLocationAccess().getBottomEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProgressBarLocation__Alternatives"


    // $ANTLR start "rule__QuestionType__Alternatives"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:476:1: rule__QuestionType__Alternatives : ( ( ( KEYWORD_11 ) ) | ( ( KEYWORD_40 ) ) | ( ( KEYWORD_30 ) ) | ( ( KEYWORD_33 ) ) | ( ( KEYWORD_28 ) ) | ( ( KEYWORD_23 ) ) | ( ( KEYWORD_46 ) ) | ( ( KEYWORD_25 ) ) );
    public final void rule__QuestionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:480:1: ( ( ( KEYWORD_11 ) ) | ( ( KEYWORD_40 ) ) | ( ( KEYWORD_30 ) ) | ( ( KEYWORD_33 ) ) | ( ( KEYWORD_28 ) ) | ( ( KEYWORD_23 ) ) | ( ( KEYWORD_46 ) ) | ( ( KEYWORD_25 ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case KEYWORD_11:
                {
                alt4=1;
                }
                break;
            case KEYWORD_40:
                {
                alt4=2;
                }
                break;
            case KEYWORD_30:
                {
                alt4=3;
                }
                break;
            case KEYWORD_33:
                {
                alt4=4;
                }
                break;
            case KEYWORD_28:
                {
                alt4=5;
                }
                break;
            case KEYWORD_23:
                {
                alt4=6;
                }
                break;
            case KEYWORD_46:
                {
                alt4=7;
                }
                break;
            case KEYWORD_25:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:481:1: ( ( KEYWORD_11 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:481:1: ( ( KEYWORD_11 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:482:1: ( KEYWORD_11 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getTextEnumLiteralDeclaration_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:483:1: ( KEYWORD_11 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:483:3: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__QuestionType__Alternatives838); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getTextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:488:6: ( ( KEYWORD_40 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:488:6: ( ( KEYWORD_40 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:489:1: ( KEYWORD_40 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getRadiogroupEnumLiteralDeclaration_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:490:1: ( KEYWORD_40 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:490:3: KEYWORD_40
                    {
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__QuestionType__Alternatives858); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getRadiogroupEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:495:6: ( ( KEYWORD_30 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:495:6: ( ( KEYWORD_30 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:496:1: ( KEYWORD_30 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getCheckboxEnumLiteralDeclaration_2()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:497:1: ( KEYWORD_30 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:497:3: KEYWORD_30
                    {
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__QuestionType__Alternatives878); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getCheckboxEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:502:6: ( ( KEYWORD_33 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:502:6: ( ( KEYWORD_33 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:503:1: ( KEYWORD_33 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getDropdownEnumLiteralDeclaration_3()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:504:1: ( KEYWORD_33 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:504:3: KEYWORD_33
                    {
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__QuestionType__Alternatives898); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getDropdownEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:509:6: ( ( KEYWORD_28 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:509:6: ( ( KEYWORD_28 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:510:1: ( KEYWORD_28 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getCommentEnumLiteralDeclaration_4()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:511:1: ( KEYWORD_28 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:511:3: KEYWORD_28
                    {
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__QuestionType__Alternatives918); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getCommentEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:516:6: ( ( KEYWORD_23 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:516:6: ( ( KEYWORD_23 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:517:1: ( KEYWORD_23 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getMatrixEnumLiteralDeclaration_5()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:518:1: ( KEYWORD_23 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:518:3: KEYWORD_23
                    {
                    match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__QuestionType__Alternatives938); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getMatrixEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:523:6: ( ( KEYWORD_46 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:523:6: ( ( KEYWORD_46 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:524:1: ( KEYWORD_46 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getMultipleTextEnumLiteralDeclaration_6()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:525:1: ( KEYWORD_46 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:525:3: KEYWORD_46
                    {
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rule__QuestionType__Alternatives958); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getMultipleTextEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:530:6: ( ( KEYWORD_25 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:530:6: ( ( KEYWORD_25 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:531:1: ( KEYWORD_25 )
                    {
                     before(grammarAccess.getQuestionTypeAccess().getRatingEnumLiteralDeclaration_7()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:532:1: ( KEYWORD_25 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:532:3: KEYWORD_25
                    {
                    match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__QuestionType__Alternatives978); 

                    }

                     after(grammarAccess.getQuestionTypeAccess().getRatingEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionType__Alternatives"


    // $ANTLR start "rule__TextInputType__Alternatives"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:542:1: rule__TextInputType__Alternatives : ( ( ( KEYWORD_11 ) ) | ( ( KEYWORD_12 ) ) | ( ( KEYWORD_19 ) ) | ( ( KEYWORD_15 ) ) | ( ( KEYWORD_10 ) ) | ( ( KEYWORD_32 ) ) | ( ( KEYWORD_16 ) ) | ( ( KEYWORD_18 ) ) | ( ( KEYWORD_24 ) ) | ( ( KEYWORD_34 ) ) | ( ( KEYWORD_6 ) ) | ( ( KEYWORD_8 ) ) | ( ( KEYWORD_14 ) ) );
    public final void rule__TextInputType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:546:1: ( ( ( KEYWORD_11 ) ) | ( ( KEYWORD_12 ) ) | ( ( KEYWORD_19 ) ) | ( ( KEYWORD_15 ) ) | ( ( KEYWORD_10 ) ) | ( ( KEYWORD_32 ) ) | ( ( KEYWORD_16 ) ) | ( ( KEYWORD_18 ) ) | ( ( KEYWORD_24 ) ) | ( ( KEYWORD_34 ) ) | ( ( KEYWORD_6 ) ) | ( ( KEYWORD_8 ) ) | ( ( KEYWORD_14 ) ) )
            int alt5=13;
            switch ( input.LA(1) ) {
            case KEYWORD_11:
                {
                alt5=1;
                }
                break;
            case KEYWORD_12:
                {
                alt5=2;
                }
                break;
            case KEYWORD_19:
                {
                alt5=3;
                }
                break;
            case KEYWORD_15:
                {
                alt5=4;
                }
                break;
            case KEYWORD_10:
                {
                alt5=5;
                }
                break;
            case KEYWORD_32:
                {
                alt5=6;
                }
                break;
            case KEYWORD_16:
                {
                alt5=7;
                }
                break;
            case KEYWORD_18:
                {
                alt5=8;
                }
                break;
            case KEYWORD_24:
                {
                alt5=9;
                }
                break;
            case KEYWORD_34:
                {
                alt5=10;
                }
                break;
            case KEYWORD_6:
                {
                alt5=11;
                }
                break;
            case KEYWORD_8:
                {
                alt5=12;
                }
                break;
            case KEYWORD_14:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:547:1: ( ( KEYWORD_11 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:547:1: ( ( KEYWORD_11 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:548:1: ( KEYWORD_11 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getTextEnumLiteralDeclaration_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:549:1: ( KEYWORD_11 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:549:3: KEYWORD_11
                    {
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__TextInputType__Alternatives1013); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getTextEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:554:6: ( ( KEYWORD_12 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:554:6: ( ( KEYWORD_12 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:555:1: ( KEYWORD_12 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getTimeEnumLiteralDeclaration_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:556:1: ( KEYWORD_12 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:556:3: KEYWORD_12
                    {
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__TextInputType__Alternatives1033); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getTimeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:561:6: ( ( KEYWORD_19 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:561:6: ( ( KEYWORD_19 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:562:1: ( KEYWORD_19 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getRangeEnumLiteralDeclaration_2()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:563:1: ( KEYWORD_19 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:563:3: KEYWORD_19
                    {
                    match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__TextInputType__Alternatives1053); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getRangeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:568:6: ( ( KEYWORD_15 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:568:6: ( ( KEYWORD_15 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:569:1: ( KEYWORD_15 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getColorEnumLiteralDeclaration_3()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:570:1: ( KEYWORD_15 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:570:3: KEYWORD_15
                    {
                    match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__TextInputType__Alternatives1073); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getColorEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:575:6: ( ( KEYWORD_10 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:575:6: ( ( KEYWORD_10 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:576:1: ( KEYWORD_10 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:577:1: ( KEYWORD_10 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:577:3: KEYWORD_10
                    {
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__TextInputType__Alternatives1093); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:582:6: ( ( KEYWORD_32 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:582:6: ( ( KEYWORD_32 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:583:1: ( KEYWORD_32 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getDatetimeEnumLiteralDeclaration_5()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:584:1: ( KEYWORD_32 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:584:3: KEYWORD_32
                    {
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rule__TextInputType__Alternatives1113); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getDatetimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:589:6: ( ( KEYWORD_16 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:589:6: ( ( KEYWORD_16 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:590:1: ( KEYWORD_16 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getEmailEnumLiteralDeclaration_6()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:591:1: ( KEYWORD_16 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:591:3: KEYWORD_16
                    {
                    match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__TextInputType__Alternatives1133); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getEmailEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:596:6: ( ( KEYWORD_18 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:596:6: ( ( KEYWORD_18 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:597:1: ( KEYWORD_18 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getMonthEnumLiteralDeclaration_7()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:598:1: ( KEYWORD_18 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:598:3: KEYWORD_18
                    {
                    match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__TextInputType__Alternatives1153); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getMonthEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:603:6: ( ( KEYWORD_24 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:603:6: ( ( KEYWORD_24 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:604:1: ( KEYWORD_24 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getNumberEnumLiteralDeclaration_8()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:605:1: ( KEYWORD_24 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:605:3: KEYWORD_24
                    {
                    match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__TextInputType__Alternatives1173); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getNumberEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:610:6: ( ( KEYWORD_34 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:610:6: ( ( KEYWORD_34 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:611:1: ( KEYWORD_34 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getPasswordEnumLiteralDeclaration_9()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:612:1: ( KEYWORD_34 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:612:3: KEYWORD_34
                    {
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rule__TextInputType__Alternatives1193); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getPasswordEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:617:6: ( ( KEYWORD_6 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:617:6: ( ( KEYWORD_6 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:618:1: ( KEYWORD_6 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getTelEnumLiteralDeclaration_10()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:619:1: ( KEYWORD_6 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:619:3: KEYWORD_6
                    {
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__TextInputType__Alternatives1213); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getTelEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:624:6: ( ( KEYWORD_8 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:624:6: ( ( KEYWORD_8 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:625:1: ( KEYWORD_8 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getUrlEnumLiteralDeclaration_11()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:626:1: ( KEYWORD_8 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:626:3: KEYWORD_8
                    {
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__TextInputType__Alternatives1233); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getUrlEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:631:6: ( ( KEYWORD_14 ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:631:6: ( ( KEYWORD_14 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:632:1: ( KEYWORD_14 )
                    {
                     before(grammarAccess.getTextInputTypeAccess().getWeekEnumLiteralDeclaration_12()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:633:1: ( KEYWORD_14 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:633:3: KEYWORD_14
                    {
                    match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__TextInputType__Alternatives1253); 

                    }

                     after(grammarAccess.getTextInputTypeAccess().getWeekEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextInputType__Alternatives"


    // $ANTLR start "rule__Survey__Group__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:645:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:649:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:650:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01285);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01288);
            rule__Survey__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0"


    // $ANTLR start "rule__Survey__Group__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:657:1: rule__Survey__Group__0__Impl : ( ( rule__Survey__UnorderedGroup_0 ) ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:661:1: ( ( ( rule__Survey__UnorderedGroup_0 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:662:1: ( ( rule__Survey__UnorderedGroup_0 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:662:1: ( ( rule__Survey__UnorderedGroup_0 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:663:1: ( rule__Survey__UnorderedGroup_0 )
            {
             before(grammarAccess.getSurveyAccess().getUnorderedGroup_0()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:664:1: ( rule__Survey__UnorderedGroup_0 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:664:2: rule__Survey__UnorderedGroup_0
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0_in_rule__Survey__Group__0__Impl1315);
            rule__Survey__UnorderedGroup_0();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getUnorderedGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__0__Impl"


    // $ANTLR start "rule__Survey__Group__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:674:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:678:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:679:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11345);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11348);
            rule__Survey__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1"


    // $ANTLR start "rule__Survey__Group__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:686:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__PagesAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:690:1: ( ( ( rule__Survey__PagesAssignment_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:691:1: ( ( rule__Survey__PagesAssignment_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:691:1: ( ( rule__Survey__PagesAssignment_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:692:1: ( rule__Survey__PagesAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:693:1: ( rule__Survey__PagesAssignment_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:693:2: rule__Survey__PagesAssignment_1
            {
            pushFollow(FOLLOW_rule__Survey__PagesAssignment_1_in_rule__Survey__Group__1__Impl1375);
            rule__Survey__PagesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getPagesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__1__Impl"


    // $ANTLR start "rule__Survey__Group__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:703:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:707:1: ( rule__Survey__Group__2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:708:2: rule__Survey__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21405);
            rule__Survey__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2"


    // $ANTLR start "rule__Survey__Group__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:714:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__PagesAssignment_2 )* ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:718:1: ( ( ( rule__Survey__PagesAssignment_2 )* ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:719:1: ( ( rule__Survey__PagesAssignment_2 )* )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:719:1: ( ( rule__Survey__PagesAssignment_2 )* )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:720:1: ( rule__Survey__PagesAssignment_2 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:721:1: ( rule__Survey__PagesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==KEYWORD_9) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:721:2: rule__Survey__PagesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Survey__PagesAssignment_2_in_rule__Survey__Group__2__Impl1432);
            	    rule__Survey__PagesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getPagesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group__2__Impl"


    // $ANTLR start "rule__Survey__Group_0_4__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:737:1: rule__Survey__Group_0_4__0 : rule__Survey__Group_0_4__0__Impl rule__Survey__Group_0_4__1 ;
    public final void rule__Survey__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:741:1: ( rule__Survey__Group_0_4__0__Impl rule__Survey__Group_0_4__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:742:2: rule__Survey__Group_0_4__0__Impl rule__Survey__Group_0_4__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_4__0__Impl_in_rule__Survey__Group_0_4__01469);
            rule__Survey__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_4__1_in_rule__Survey__Group_0_4__01472);
            rule__Survey__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4__0"


    // $ANTLR start "rule__Survey__Group_0_4__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:749:1: rule__Survey__Group_0_4__0__Impl : ( KEYWORD_39 ) ;
    public final void rule__Survey__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:753:1: ( ( KEYWORD_39 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:754:1: ( KEYWORD_39 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:754:1: ( KEYWORD_39 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:755:1: KEYWORD_39
            {
             before(grammarAccess.getSurveyAccess().getAuthorSKeyword_0_4_0()); 
            match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__Survey__Group_0_4__0__Impl1500); 
             after(grammarAccess.getSurveyAccess().getAuthorSKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_4__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:768:1: rule__Survey__Group_0_4__1 : rule__Survey__Group_0_4__1__Impl rule__Survey__Group_0_4__2 ;
    public final void rule__Survey__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:772:1: ( rule__Survey__Group_0_4__1__Impl rule__Survey__Group_0_4__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:773:2: rule__Survey__Group_0_4__1__Impl rule__Survey__Group_0_4__2
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_4__1__Impl_in_rule__Survey__Group_0_4__11531);
            rule__Survey__Group_0_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_4__2_in_rule__Survey__Group_0_4__11534);
            rule__Survey__Group_0_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4__1"


    // $ANTLR start "rule__Survey__Group_0_4__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:780:1: rule__Survey__Group_0_4__1__Impl : ( ( rule__Survey__AuthorAssignment_0_4_1 ) ) ;
    public final void rule__Survey__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:784:1: ( ( ( rule__Survey__AuthorAssignment_0_4_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:785:1: ( ( rule__Survey__AuthorAssignment_0_4_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:785:1: ( ( rule__Survey__AuthorAssignment_0_4_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:786:1: ( rule__Survey__AuthorAssignment_0_4_1 )
            {
             before(grammarAccess.getSurveyAccess().getAuthorAssignment_0_4_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:787:1: ( rule__Survey__AuthorAssignment_0_4_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:787:2: rule__Survey__AuthorAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__Survey__AuthorAssignment_0_4_1_in_rule__Survey__Group_0_4__1__Impl1561);
            rule__Survey__AuthorAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getAuthorAssignment_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_4__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:797:1: rule__Survey__Group_0_4__2 : rule__Survey__Group_0_4__2__Impl ;
    public final void rule__Survey__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:801:1: ( rule__Survey__Group_0_4__2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:802:2: rule__Survey__Group_0_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_4__2__Impl_in_rule__Survey__Group_0_4__21591);
            rule__Survey__Group_0_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4__2"


    // $ANTLR start "rule__Survey__Group_0_4__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:808:1: rule__Survey__Group_0_4__2__Impl : ( ( rule__Survey__Group_0_4_2__0 )* ) ;
    public final void rule__Survey__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:812:1: ( ( ( rule__Survey__Group_0_4_2__0 )* ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:813:1: ( ( rule__Survey__Group_0_4_2__0 )* )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:813:1: ( ( rule__Survey__Group_0_4_2__0 )* )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:814:1: ( rule__Survey__Group_0_4_2__0 )*
            {
             before(grammarAccess.getSurveyAccess().getGroup_0_4_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:815:1: ( rule__Survey__Group_0_4_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KEYWORD_3) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:815:2: rule__Survey__Group_0_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Survey__Group_0_4_2__0_in_rule__Survey__Group_0_4__2__Impl1618);
            	    rule__Survey__Group_0_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getGroup_0_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4__2__Impl"


    // $ANTLR start "rule__Survey__Group_0_4_2__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:831:1: rule__Survey__Group_0_4_2__0 : rule__Survey__Group_0_4_2__0__Impl rule__Survey__Group_0_4_2__1 ;
    public final void rule__Survey__Group_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:835:1: ( rule__Survey__Group_0_4_2__0__Impl rule__Survey__Group_0_4_2__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:836:2: rule__Survey__Group_0_4_2__0__Impl rule__Survey__Group_0_4_2__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_4_2__0__Impl_in_rule__Survey__Group_0_4_2__01655);
            rule__Survey__Group_0_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_4_2__1_in_rule__Survey__Group_0_4_2__01658);
            rule__Survey__Group_0_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4_2__0"


    // $ANTLR start "rule__Survey__Group_0_4_2__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:843:1: rule__Survey__Group_0_4_2__0__Impl : ( KEYWORD_3 ) ;
    public final void rule__Survey__Group_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:847:1: ( ( KEYWORD_3 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:848:1: ( KEYWORD_3 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:848:1: ( KEYWORD_3 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:849:1: KEYWORD_3
            {
             before(grammarAccess.getSurveyAccess().getCommaKeyword_0_4_2_0()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__Survey__Group_0_4_2__0__Impl1686); 
             after(grammarAccess.getSurveyAccess().getCommaKeyword_0_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4_2__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_4_2__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:862:1: rule__Survey__Group_0_4_2__1 : rule__Survey__Group_0_4_2__1__Impl ;
    public final void rule__Survey__Group_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:866:1: ( rule__Survey__Group_0_4_2__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:867:2: rule__Survey__Group_0_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_4_2__1__Impl_in_rule__Survey__Group_0_4_2__11717);
            rule__Survey__Group_0_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4_2__1"


    // $ANTLR start "rule__Survey__Group_0_4_2__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:873:1: rule__Survey__Group_0_4_2__1__Impl : ( ( rule__Survey__AuthorAssignment_0_4_2_1 ) ) ;
    public final void rule__Survey__Group_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:877:1: ( ( ( rule__Survey__AuthorAssignment_0_4_2_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:878:1: ( ( rule__Survey__AuthorAssignment_0_4_2_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:878:1: ( ( rule__Survey__AuthorAssignment_0_4_2_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:879:1: ( rule__Survey__AuthorAssignment_0_4_2_1 )
            {
             before(grammarAccess.getSurveyAccess().getAuthorAssignment_0_4_2_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:880:1: ( rule__Survey__AuthorAssignment_0_4_2_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:880:2: rule__Survey__AuthorAssignment_0_4_2_1
            {
            pushFollow(FOLLOW_rule__Survey__AuthorAssignment_0_4_2_1_in_rule__Survey__Group_0_4_2__1__Impl1744);
            rule__Survey__AuthorAssignment_0_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getAuthorAssignment_0_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_4_2__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_5__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:894:1: rule__Survey__Group_0_5__0 : rule__Survey__Group_0_5__0__Impl rule__Survey__Group_0_5__1 ;
    public final void rule__Survey__Group_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:898:1: ( rule__Survey__Group_0_5__0__Impl rule__Survey__Group_0_5__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:899:2: rule__Survey__Group_0_5__0__Impl rule__Survey__Group_0_5__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_5__0__Impl_in_rule__Survey__Group_0_5__01778);
            rule__Survey__Group_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_5__1_in_rule__Survey__Group_0_5__01781);
            rule__Survey__Group_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_5__0"


    // $ANTLR start "rule__Survey__Group_0_5__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:906:1: rule__Survey__Group_0_5__0__Impl : ( KEYWORD_26 ) ;
    public final void rule__Survey__Group_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:910:1: ( ( KEYWORD_26 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:911:1: ( KEYWORD_26 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:911:1: ( KEYWORD_26 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:912:1: KEYWORD_26
            {
             before(grammarAccess.getSurveyAccess().getTitleKeyword_0_5_0()); 
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__Survey__Group_0_5__0__Impl1809); 
             after(grammarAccess.getSurveyAccess().getTitleKeyword_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_5__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_5__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:925:1: rule__Survey__Group_0_5__1 : rule__Survey__Group_0_5__1__Impl ;
    public final void rule__Survey__Group_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:929:1: ( rule__Survey__Group_0_5__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:930:2: rule__Survey__Group_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_5__1__Impl_in_rule__Survey__Group_0_5__11840);
            rule__Survey__Group_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_5__1"


    // $ANTLR start "rule__Survey__Group_0_5__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:936:1: rule__Survey__Group_0_5__1__Impl : ( ( rule__Survey__TitleAssignment_0_5_1 ) ) ;
    public final void rule__Survey__Group_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:940:1: ( ( ( rule__Survey__TitleAssignment_0_5_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:941:1: ( ( rule__Survey__TitleAssignment_0_5_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:941:1: ( ( rule__Survey__TitleAssignment_0_5_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:942:1: ( rule__Survey__TitleAssignment_0_5_1 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_0_5_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:943:1: ( rule__Survey__TitleAssignment_0_5_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:943:2: rule__Survey__TitleAssignment_0_5_1
            {
            pushFollow(FOLLOW_rule__Survey__TitleAssignment_0_5_1_in_rule__Survey__Group_0_5__1__Impl1867);
            rule__Survey__TitleAssignment_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTitleAssignment_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_5__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_6__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:957:1: rule__Survey__Group_0_6__0 : rule__Survey__Group_0_6__0__Impl rule__Survey__Group_0_6__1 ;
    public final void rule__Survey__Group_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:961:1: ( rule__Survey__Group_0_6__0__Impl rule__Survey__Group_0_6__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:962:2: rule__Survey__Group_0_6__0__Impl rule__Survey__Group_0_6__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_6__0__Impl_in_rule__Survey__Group_0_6__01901);
            rule__Survey__Group_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_6__1_in_rule__Survey__Group_0_6__01904);
            rule__Survey__Group_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_6__0"


    // $ANTLR start "rule__Survey__Group_0_6__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:969:1: rule__Survey__Group_0_6__0__Impl : ( KEYWORD_41 ) ;
    public final void rule__Survey__Group_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:973:1: ( ( KEYWORD_41 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:974:1: ( KEYWORD_41 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:974:1: ( KEYWORD_41 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:975:1: KEYWORD_41
            {
             before(grammarAccess.getSurveyAccess().getTimeLimitKeyword_0_6_0()); 
            match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__Survey__Group_0_6__0__Impl1932); 
             after(grammarAccess.getSurveyAccess().getTimeLimitKeyword_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_6__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_6__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:988:1: rule__Survey__Group_0_6__1 : rule__Survey__Group_0_6__1__Impl ;
    public final void rule__Survey__Group_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:992:1: ( rule__Survey__Group_0_6__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:993:2: rule__Survey__Group_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_6__1__Impl_in_rule__Survey__Group_0_6__11963);
            rule__Survey__Group_0_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_6__1"


    // $ANTLR start "rule__Survey__Group_0_6__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:999:1: rule__Survey__Group_0_6__1__Impl : ( ( rule__Survey__TimeLimitAssignment_0_6_1 ) ) ;
    public final void rule__Survey__Group_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1003:1: ( ( ( rule__Survey__TimeLimitAssignment_0_6_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1004:1: ( ( rule__Survey__TimeLimitAssignment_0_6_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1004:1: ( ( rule__Survey__TimeLimitAssignment_0_6_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1005:1: ( rule__Survey__TimeLimitAssignment_0_6_1 )
            {
             before(grammarAccess.getSurveyAccess().getTimeLimitAssignment_0_6_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1006:1: ( rule__Survey__TimeLimitAssignment_0_6_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1006:2: rule__Survey__TimeLimitAssignment_0_6_1
            {
            pushFollow(FOLLOW_rule__Survey__TimeLimitAssignment_0_6_1_in_rule__Survey__Group_0_6__1__Impl1990);
            rule__Survey__TimeLimitAssignment_0_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTimeLimitAssignment_0_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_6__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_7__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1020:1: rule__Survey__Group_0_7__0 : rule__Survey__Group_0_7__0__Impl rule__Survey__Group_0_7__1 ;
    public final void rule__Survey__Group_0_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1024:1: ( rule__Survey__Group_0_7__0__Impl rule__Survey__Group_0_7__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1025:2: rule__Survey__Group_0_7__0__Impl rule__Survey__Group_0_7__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_7__0__Impl_in_rule__Survey__Group_0_7__02024);
            rule__Survey__Group_0_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_7__1_in_rule__Survey__Group_0_7__02027);
            rule__Survey__Group_0_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_7__0"


    // $ANTLR start "rule__Survey__Group_0_7__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1032:1: rule__Survey__Group_0_7__0__Impl : ( KEYWORD_56 ) ;
    public final void rule__Survey__Group_0_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1036:1: ( ( KEYWORD_56 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1037:1: ( KEYWORD_56 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1037:1: ( KEYWORD_56 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1038:1: KEYWORD_56
            {
             before(grammarAccess.getSurveyAccess().getCompletedMessageKeyword_0_7_0()); 
            match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_rule__Survey__Group_0_7__0__Impl2055); 
             after(grammarAccess.getSurveyAccess().getCompletedMessageKeyword_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_7__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_7__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1051:1: rule__Survey__Group_0_7__1 : rule__Survey__Group_0_7__1__Impl ;
    public final void rule__Survey__Group_0_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1055:1: ( rule__Survey__Group_0_7__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1056:2: rule__Survey__Group_0_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_7__1__Impl_in_rule__Survey__Group_0_7__12086);
            rule__Survey__Group_0_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_7__1"


    // $ANTLR start "rule__Survey__Group_0_7__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1062:1: rule__Survey__Group_0_7__1__Impl : ( ( rule__Survey__CompletedMessageAssignment_0_7_1 ) ) ;
    public final void rule__Survey__Group_0_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1066:1: ( ( ( rule__Survey__CompletedMessageAssignment_0_7_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1067:1: ( ( rule__Survey__CompletedMessageAssignment_0_7_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1067:1: ( ( rule__Survey__CompletedMessageAssignment_0_7_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1068:1: ( rule__Survey__CompletedMessageAssignment_0_7_1 )
            {
             before(grammarAccess.getSurveyAccess().getCompletedMessageAssignment_0_7_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1069:1: ( rule__Survey__CompletedMessageAssignment_0_7_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1069:2: rule__Survey__CompletedMessageAssignment_0_7_1
            {
            pushFollow(FOLLOW_rule__Survey__CompletedMessageAssignment_0_7_1_in_rule__Survey__Group_0_7__1__Impl2113);
            rule__Survey__CompletedMessageAssignment_0_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getCompletedMessageAssignment_0_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_7__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_8__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1083:1: rule__Survey__Group_0_8__0 : rule__Survey__Group_0_8__0__Impl rule__Survey__Group_0_8__1 ;
    public final void rule__Survey__Group_0_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1087:1: ( rule__Survey__Group_0_8__0__Impl rule__Survey__Group_0_8__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1088:2: rule__Survey__Group_0_8__0__Impl rule__Survey__Group_0_8__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_8__0__Impl_in_rule__Survey__Group_0_8__02147);
            rule__Survey__Group_0_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_8__1_in_rule__Survey__Group_0_8__02150);
            rule__Survey__Group_0_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_8__0"


    // $ANTLR start "rule__Survey__Group_0_8__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1095:1: rule__Survey__Group_0_8__0__Impl : ( KEYWORD_52 ) ;
    public final void rule__Survey__Group_0_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1099:1: ( ( KEYWORD_52 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1100:1: ( KEYWORD_52 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1100:1: ( KEYWORD_52 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1101:1: KEYWORD_52
            {
             before(grammarAccess.getSurveyAccess().getButtonNextTextKeyword_0_8_0()); 
            match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rule__Survey__Group_0_8__0__Impl2178); 
             after(grammarAccess.getSurveyAccess().getButtonNextTextKeyword_0_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_8__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_8__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1114:1: rule__Survey__Group_0_8__1 : rule__Survey__Group_0_8__1__Impl ;
    public final void rule__Survey__Group_0_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1118:1: ( rule__Survey__Group_0_8__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1119:2: rule__Survey__Group_0_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_8__1__Impl_in_rule__Survey__Group_0_8__12209);
            rule__Survey__Group_0_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_8__1"


    // $ANTLR start "rule__Survey__Group_0_8__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1125:1: rule__Survey__Group_0_8__1__Impl : ( ( rule__Survey__PageNextTextAssignment_0_8_1 ) ) ;
    public final void rule__Survey__Group_0_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1129:1: ( ( ( rule__Survey__PageNextTextAssignment_0_8_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1130:1: ( ( rule__Survey__PageNextTextAssignment_0_8_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1130:1: ( ( rule__Survey__PageNextTextAssignment_0_8_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1131:1: ( rule__Survey__PageNextTextAssignment_0_8_1 )
            {
             before(grammarAccess.getSurveyAccess().getPageNextTextAssignment_0_8_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1132:1: ( rule__Survey__PageNextTextAssignment_0_8_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1132:2: rule__Survey__PageNextTextAssignment_0_8_1
            {
            pushFollow(FOLLOW_rule__Survey__PageNextTextAssignment_0_8_1_in_rule__Survey__Group_0_8__1__Impl2236);
            rule__Survey__PageNextTextAssignment_0_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getPageNextTextAssignment_0_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_8__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_9__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1146:1: rule__Survey__Group_0_9__0 : rule__Survey__Group_0_9__0__Impl rule__Survey__Group_0_9__1 ;
    public final void rule__Survey__Group_0_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1150:1: ( rule__Survey__Group_0_9__0__Impl rule__Survey__Group_0_9__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1151:2: rule__Survey__Group_0_9__0__Impl rule__Survey__Group_0_9__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_9__0__Impl_in_rule__Survey__Group_0_9__02270);
            rule__Survey__Group_0_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_9__1_in_rule__Survey__Group_0_9__02273);
            rule__Survey__Group_0_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_9__0"


    // $ANTLR start "rule__Survey__Group_0_9__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1158:1: rule__Survey__Group_0_9__0__Impl : ( KEYWORD_53 ) ;
    public final void rule__Survey__Group_0_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1162:1: ( ( KEYWORD_53 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1163:1: ( KEYWORD_53 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1163:1: ( KEYWORD_53 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1164:1: KEYWORD_53
            {
             before(grammarAccess.getSurveyAccess().getButtonPrevTextKeyword_0_9_0()); 
            match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rule__Survey__Group_0_9__0__Impl2301); 
             after(grammarAccess.getSurveyAccess().getButtonPrevTextKeyword_0_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_9__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_9__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1177:1: rule__Survey__Group_0_9__1 : rule__Survey__Group_0_9__1__Impl ;
    public final void rule__Survey__Group_0_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1181:1: ( rule__Survey__Group_0_9__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1182:2: rule__Survey__Group_0_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_9__1__Impl_in_rule__Survey__Group_0_9__12332);
            rule__Survey__Group_0_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_9__1"


    // $ANTLR start "rule__Survey__Group_0_9__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1188:1: rule__Survey__Group_0_9__1__Impl : ( ( rule__Survey__PagePrevTextAssignment_0_9_1 ) ) ;
    public final void rule__Survey__Group_0_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1192:1: ( ( ( rule__Survey__PagePrevTextAssignment_0_9_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1193:1: ( ( rule__Survey__PagePrevTextAssignment_0_9_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1193:1: ( ( rule__Survey__PagePrevTextAssignment_0_9_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1194:1: ( rule__Survey__PagePrevTextAssignment_0_9_1 )
            {
             before(grammarAccess.getSurveyAccess().getPagePrevTextAssignment_0_9_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1195:1: ( rule__Survey__PagePrevTextAssignment_0_9_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1195:2: rule__Survey__PagePrevTextAssignment_0_9_1
            {
            pushFollow(FOLLOW_rule__Survey__PagePrevTextAssignment_0_9_1_in_rule__Survey__Group_0_9__1__Impl2359);
            rule__Survey__PagePrevTextAssignment_0_9_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getPagePrevTextAssignment_0_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_9__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_10__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1209:1: rule__Survey__Group_0_10__0 : rule__Survey__Group_0_10__0__Impl rule__Survey__Group_0_10__1 ;
    public final void rule__Survey__Group_0_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1213:1: ( rule__Survey__Group_0_10__0__Impl rule__Survey__Group_0_10__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1214:2: rule__Survey__Group_0_10__0__Impl rule__Survey__Group_0_10__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_10__0__Impl_in_rule__Survey__Group_0_10__02393);
            rule__Survey__Group_0_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_10__1_in_rule__Survey__Group_0_10__02396);
            rule__Survey__Group_0_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_10__0"


    // $ANTLR start "rule__Survey__Group_0_10__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1221:1: rule__Survey__Group_0_10__0__Impl : ( KEYWORD_58 ) ;
    public final void rule__Survey__Group_0_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1225:1: ( ( KEYWORD_58 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1226:1: ( KEYWORD_58 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1226:1: ( KEYWORD_58 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1227:1: KEYWORD_58
            {
             before(grammarAccess.getSurveyAccess().getButtonCompletedTextKeyword_0_10_0()); 
            match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_rule__Survey__Group_0_10__0__Impl2424); 
             after(grammarAccess.getSurveyAccess().getButtonCompletedTextKeyword_0_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_10__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_10__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1240:1: rule__Survey__Group_0_10__1 : rule__Survey__Group_0_10__1__Impl ;
    public final void rule__Survey__Group_0_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1244:1: ( rule__Survey__Group_0_10__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1245:2: rule__Survey__Group_0_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_10__1__Impl_in_rule__Survey__Group_0_10__12455);
            rule__Survey__Group_0_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_10__1"


    // $ANTLR start "rule__Survey__Group_0_10__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1251:1: rule__Survey__Group_0_10__1__Impl : ( ( rule__Survey__CompleteTextAssignment_0_10_1 ) ) ;
    public final void rule__Survey__Group_0_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1255:1: ( ( ( rule__Survey__CompleteTextAssignment_0_10_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1256:1: ( ( rule__Survey__CompleteTextAssignment_0_10_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1256:1: ( ( rule__Survey__CompleteTextAssignment_0_10_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1257:1: ( rule__Survey__CompleteTextAssignment_0_10_1 )
            {
             before(grammarAccess.getSurveyAccess().getCompleteTextAssignment_0_10_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1258:1: ( rule__Survey__CompleteTextAssignment_0_10_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1258:2: rule__Survey__CompleteTextAssignment_0_10_1
            {
            pushFollow(FOLLOW_rule__Survey__CompleteTextAssignment_0_10_1_in_rule__Survey__Group_0_10__1__Impl2482);
            rule__Survey__CompleteTextAssignment_0_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getCompleteTextAssignment_0_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_10__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_11__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1272:1: rule__Survey__Group_0_11__0 : rule__Survey__Group_0_11__0__Impl rule__Survey__Group_0_11__1 ;
    public final void rule__Survey__Group_0_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1276:1: ( rule__Survey__Group_0_11__0__Impl rule__Survey__Group_0_11__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1277:2: rule__Survey__Group_0_11__0__Impl rule__Survey__Group_0_11__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_11__0__Impl_in_rule__Survey__Group_0_11__02516);
            rule__Survey__Group_0_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_11__1_in_rule__Survey__Group_0_11__02519);
            rule__Survey__Group_0_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_11__0"


    // $ANTLR start "rule__Survey__Group_0_11__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1284:1: rule__Survey__Group_0_11__0__Impl : ( KEYWORD_63 ) ;
    public final void rule__Survey__Group_0_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1288:1: ( ( KEYWORD_63 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1289:1: ( KEYWORD_63 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1289:1: ( KEYWORD_63 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1290:1: KEYWORD_63
            {
             before(grammarAccess.getSurveyAccess().getQuestionTitleLocationKeyword_0_11_0()); 
            match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_rule__Survey__Group_0_11__0__Impl2547); 
             after(grammarAccess.getSurveyAccess().getQuestionTitleLocationKeyword_0_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_11__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_11__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1303:1: rule__Survey__Group_0_11__1 : rule__Survey__Group_0_11__1__Impl ;
    public final void rule__Survey__Group_0_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1307:1: ( rule__Survey__Group_0_11__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1308:2: rule__Survey__Group_0_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_11__1__Impl_in_rule__Survey__Group_0_11__12578);
            rule__Survey__Group_0_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_11__1"


    // $ANTLR start "rule__Survey__Group_0_11__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1314:1: rule__Survey__Group_0_11__1__Impl : ( ( rule__Survey__QuestionTitleLocationAssignment_0_11_1 ) ) ;
    public final void rule__Survey__Group_0_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1318:1: ( ( ( rule__Survey__QuestionTitleLocationAssignment_0_11_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1319:1: ( ( rule__Survey__QuestionTitleLocationAssignment_0_11_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1319:1: ( ( rule__Survey__QuestionTitleLocationAssignment_0_11_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1320:1: ( rule__Survey__QuestionTitleLocationAssignment_0_11_1 )
            {
             before(grammarAccess.getSurveyAccess().getQuestionTitleLocationAssignment_0_11_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1321:1: ( rule__Survey__QuestionTitleLocationAssignment_0_11_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1321:2: rule__Survey__QuestionTitleLocationAssignment_0_11_1
            {
            pushFollow(FOLLOW_rule__Survey__QuestionTitleLocationAssignment_0_11_1_in_rule__Survey__Group_0_11__1__Impl2605);
            rule__Survey__QuestionTitleLocationAssignment_0_11_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getQuestionTitleLocationAssignment_0_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_11__1__Impl"


    // $ANTLR start "rule__Survey__Group_0_12__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1335:1: rule__Survey__Group_0_12__0 : rule__Survey__Group_0_12__0__Impl rule__Survey__Group_0_12__1 ;
    public final void rule__Survey__Group_0_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1339:1: ( rule__Survey__Group_0_12__0__Impl rule__Survey__Group_0_12__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1340:2: rule__Survey__Group_0_12__0__Impl rule__Survey__Group_0_12__1
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_12__0__Impl_in_rule__Survey__Group_0_12__02639);
            rule__Survey__Group_0_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Survey__Group_0_12__1_in_rule__Survey__Group_0_12__02642);
            rule__Survey__Group_0_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_12__0"


    // $ANTLR start "rule__Survey__Group_0_12__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1347:1: rule__Survey__Group_0_12__0__Impl : ( KEYWORD_59 ) ;
    public final void rule__Survey__Group_0_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1351:1: ( ( KEYWORD_59 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1352:1: ( KEYWORD_59 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1352:1: ( KEYWORD_59 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1353:1: KEYWORD_59
            {
             before(grammarAccess.getSurveyAccess().getProgressBarLocationKeyword_0_12_0()); 
            match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rule__Survey__Group_0_12__0__Impl2670); 
             after(grammarAccess.getSurveyAccess().getProgressBarLocationKeyword_0_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_12__0__Impl"


    // $ANTLR start "rule__Survey__Group_0_12__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1366:1: rule__Survey__Group_0_12__1 : rule__Survey__Group_0_12__1__Impl ;
    public final void rule__Survey__Group_0_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1370:1: ( rule__Survey__Group_0_12__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1371:2: rule__Survey__Group_0_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Survey__Group_0_12__1__Impl_in_rule__Survey__Group_0_12__12701);
            rule__Survey__Group_0_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_12__1"


    // $ANTLR start "rule__Survey__Group_0_12__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1377:1: rule__Survey__Group_0_12__1__Impl : ( ( rule__Survey__ShowProgressBarAssignment_0_12_1 ) ) ;
    public final void rule__Survey__Group_0_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1381:1: ( ( ( rule__Survey__ShowProgressBarAssignment_0_12_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1382:1: ( ( rule__Survey__ShowProgressBarAssignment_0_12_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1382:1: ( ( rule__Survey__ShowProgressBarAssignment_0_12_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1383:1: ( rule__Survey__ShowProgressBarAssignment_0_12_1 )
            {
             before(grammarAccess.getSurveyAccess().getShowProgressBarAssignment_0_12_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1384:1: ( rule__Survey__ShowProgressBarAssignment_0_12_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1384:2: rule__Survey__ShowProgressBarAssignment_0_12_1
            {
            pushFollow(FOLLOW_rule__Survey__ShowProgressBarAssignment_0_12_1_in_rule__Survey__Group_0_12__1__Impl2728);
            rule__Survey__ShowProgressBarAssignment_0_12_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getShowProgressBarAssignment_0_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_0_12__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1398:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1402:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1403:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02762);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02765);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1410:1: rule__Page__Group__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1414:1: ( ( KEYWORD_9 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1415:1: ( KEYWORD_9 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1415:1: ( KEYWORD_9 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1416:1: KEYWORD_9
            {
             before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__Page__Group__0__Impl2793); 
             after(grammarAccess.getPageAccess().getPageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1429:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1433:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1434:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12824);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12827);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1441:1: rule__Page__Group__1__Impl : ( ( rule__Page__UnorderedGroup_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1445:1: ( ( ( rule__Page__UnorderedGroup_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1446:1: ( ( rule__Page__UnorderedGroup_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1446:1: ( ( rule__Page__UnorderedGroup_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1447:1: ( rule__Page__UnorderedGroup_1 )
            {
             before(grammarAccess.getPageAccess().getUnorderedGroup_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1448:1: ( rule__Page__UnorderedGroup_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1448:2: rule__Page__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Page__UnorderedGroup_1_in_rule__Page__Group__1__Impl2854);
            rule__Page__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1458:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1462:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1463:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22884);
            rule__Page__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22887);
            rule__Page__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1470:1: rule__Page__Group__2__Impl : ( ( rule__Page__QuestionsAssignment_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1474:1: ( ( ( rule__Page__QuestionsAssignment_2 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1475:1: ( ( rule__Page__QuestionsAssignment_2 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1475:1: ( ( rule__Page__QuestionsAssignment_2 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1476:1: ( rule__Page__QuestionsAssignment_2 )
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1477:1: ( rule__Page__QuestionsAssignment_2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1477:2: rule__Page__QuestionsAssignment_2
            {
            pushFollow(FOLLOW_rule__Page__QuestionsAssignment_2_in_rule__Page__Group__2__Impl2914);
            rule__Page__QuestionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getQuestionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1487:1: rule__Page__Group__3 : rule__Page__Group__3__Impl ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1491:1: ( rule__Page__Group__3__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1492:2: rule__Page__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32944);
            rule__Page__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1498:1: rule__Page__Group__3__Impl : ( ( rule__Page__QuestionsAssignment_3 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1502:1: ( ( ( rule__Page__QuestionsAssignment_3 )* ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1503:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1503:1: ( ( rule__Page__QuestionsAssignment_3 )* )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1504:1: ( rule__Page__QuestionsAssignment_3 )*
            {
             before(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1505:1: ( rule__Page__QuestionsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==KEYWORD_29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1505:2: rule__Page__QuestionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl2971);
            	    rule__Page__QuestionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPageAccess().getQuestionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group_1_0__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1523:1: rule__Page__Group_1_0__0 : rule__Page__Group_1_0__0__Impl rule__Page__Group_1_0__1 ;
    public final void rule__Page__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1527:1: ( rule__Page__Group_1_0__0__Impl rule__Page__Group_1_0__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1528:2: rule__Page__Group_1_0__0__Impl rule__Page__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Page__Group_1_0__0__Impl_in_rule__Page__Group_1_0__03010);
            rule__Page__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group_1_0__1_in_rule__Page__Group_1_0__03013);
            rule__Page__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_0__0"


    // $ANTLR start "rule__Page__Group_1_0__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1535:1: rule__Page__Group_1_0__0__Impl : ( KEYWORD_26 ) ;
    public final void rule__Page__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1539:1: ( ( KEYWORD_26 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1540:1: ( KEYWORD_26 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1540:1: ( KEYWORD_26 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1541:1: KEYWORD_26
            {
             before(grammarAccess.getPageAccess().getTitleKeyword_1_0_0()); 
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__Page__Group_1_0__0__Impl3041); 
             after(grammarAccess.getPageAccess().getTitleKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_0__0__Impl"


    // $ANTLR start "rule__Page__Group_1_0__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1554:1: rule__Page__Group_1_0__1 : rule__Page__Group_1_0__1__Impl ;
    public final void rule__Page__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1558:1: ( rule__Page__Group_1_0__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1559:2: rule__Page__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_1_0__1__Impl_in_rule__Page__Group_1_0__13072);
            rule__Page__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_0__1"


    // $ANTLR start "rule__Page__Group_1_0__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1565:1: rule__Page__Group_1_0__1__Impl : ( ( rule__Page__TitleAssignment_1_0_1 ) ) ;
    public final void rule__Page__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1569:1: ( ( ( rule__Page__TitleAssignment_1_0_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1570:1: ( ( rule__Page__TitleAssignment_1_0_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1570:1: ( ( rule__Page__TitleAssignment_1_0_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1571:1: ( rule__Page__TitleAssignment_1_0_1 )
            {
             before(grammarAccess.getPageAccess().getTitleAssignment_1_0_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1572:1: ( rule__Page__TitleAssignment_1_0_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1572:2: rule__Page__TitleAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Page__TitleAssignment_1_0_1_in_rule__Page__Group_1_0__1__Impl3099);
            rule__Page__TitleAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getTitleAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_0__1__Impl"


    // $ANTLR start "rule__Page__Group_1_1__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1586:1: rule__Page__Group_1_1__0 : rule__Page__Group_1_1__0__Impl rule__Page__Group_1_1__1 ;
    public final void rule__Page__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1590:1: ( rule__Page__Group_1_1__0__Impl rule__Page__Group_1_1__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1591:2: rule__Page__Group_1_1__0__Impl rule__Page__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Page__Group_1_1__0__Impl_in_rule__Page__Group_1_1__03133);
            rule__Page__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Page__Group_1_1__1_in_rule__Page__Group_1_1__03136);
            rule__Page__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_1__0"


    // $ANTLR start "rule__Page__Group_1_1__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1598:1: rule__Page__Group_1_1__0__Impl : ( KEYWORD_42 ) ;
    public final void rule__Page__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1602:1: ( ( KEYWORD_42 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1603:1: ( KEYWORD_42 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1603:1: ( KEYWORD_42 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1604:1: KEYWORD_42
            {
             before(grammarAccess.getPageAccess().getVisibleIfKeyword_1_1_0()); 
            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__Page__Group_1_1__0__Impl3164); 
             after(grammarAccess.getPageAccess().getVisibleIfKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_1__0__Impl"


    // $ANTLR start "rule__Page__Group_1_1__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1617:1: rule__Page__Group_1_1__1 : rule__Page__Group_1_1__1__Impl ;
    public final void rule__Page__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1621:1: ( rule__Page__Group_1_1__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1622:2: rule__Page__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Page__Group_1_1__1__Impl_in_rule__Page__Group_1_1__13195);
            rule__Page__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_1__1"


    // $ANTLR start "rule__Page__Group_1_1__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1628:1: rule__Page__Group_1_1__1__Impl : ( ( rule__Page__VisibleIfAssignment_1_1_1 ) ) ;
    public final void rule__Page__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1632:1: ( ( ( rule__Page__VisibleIfAssignment_1_1_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1633:1: ( ( rule__Page__VisibleIfAssignment_1_1_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1633:1: ( ( rule__Page__VisibleIfAssignment_1_1_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1634:1: ( rule__Page__VisibleIfAssignment_1_1_1 )
            {
             before(grammarAccess.getPageAccess().getVisibleIfAssignment_1_1_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1635:1: ( rule__Page__VisibleIfAssignment_1_1_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1635:2: rule__Page__VisibleIfAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Page__VisibleIfAssignment_1_1_1_in_rule__Page__Group_1_1__1__Impl3222);
            rule__Page__VisibleIfAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getVisibleIfAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_1_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1649:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1653:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1654:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03256);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03259);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1661:1: rule__EInt__Group__0__Impl : ( ( KEYWORD_4 )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1665:1: ( ( ( KEYWORD_4 )? ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1666:1: ( ( KEYWORD_4 )? )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1666:1: ( ( KEYWORD_4 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1667:1: ( KEYWORD_4 )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1668:1: ( KEYWORD_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_4) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1669:2: KEYWORD_4
                    {
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__EInt__Group__0__Impl3288); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1680:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1684:1: ( rule__EInt__Group__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1685:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13321);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1691:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1695:1: ( ( RULE_INT ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1696:1: ( RULE_INT )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1696:1: ( RULE_INT )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1697:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3348); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1712:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1716:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1717:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__03381);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__03384);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1724:1: rule__Question__Group__0__Impl : ( KEYWORD_29 ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1728:1: ( ( KEYWORD_29 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1729:1: ( KEYWORD_29 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1729:1: ( KEYWORD_29 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1730:1: KEYWORD_29
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__Question__Group__0__Impl3412); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1743:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1747:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1748:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__13443);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__13446);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1755:1: rule__Question__Group__1__Impl : ( ( rule__Question__UnorderedGroup_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1759:1: ( ( ( rule__Question__UnorderedGroup_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1760:1: ( ( rule__Question__UnorderedGroup_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1760:1: ( ( rule__Question__UnorderedGroup_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1761:1: ( rule__Question__UnorderedGroup_1 )
            {
             before(grammarAccess.getQuestionAccess().getUnorderedGroup_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1762:1: ( rule__Question__UnorderedGroup_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1762:2: rule__Question__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1_in_rule__Question__Group__1__Impl3473);
            rule__Question__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1772:1: rule__Question__Group__2 : rule__Question__Group__2__Impl ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1776:1: ( rule__Question__Group__2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1777:2: rule__Question__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__23503);
            rule__Question__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1783:1: rule__Question__Group__2__Impl : ( ( rule__Question__UnorderedGroup_2 ) ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1787:1: ( ( ( rule__Question__UnorderedGroup_2 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1788:1: ( ( rule__Question__UnorderedGroup_2 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1788:1: ( ( rule__Question__UnorderedGroup_2 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1789:1: ( rule__Question__UnorderedGroup_2 )
            {
             before(grammarAccess.getQuestionAccess().getUnorderedGroup_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1790:1: ( rule__Question__UnorderedGroup_2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1790:2: rule__Question__UnorderedGroup_2
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_2_in_rule__Question__Group__2__Impl3530);
            rule__Question__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group_1_1__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1806:1: rule__Question__Group_1_1__0 : rule__Question__Group_1_1__0__Impl rule__Question__Group_1_1__1 ;
    public final void rule__Question__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1810:1: ( rule__Question__Group_1_1__0__Impl rule__Question__Group_1_1__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1811:2: rule__Question__Group_1_1__0__Impl rule__Question__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_1__0__Impl_in_rule__Question__Group_1_1__03566);
            rule__Question__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_1__1_in_rule__Question__Group_1_1__03569);
            rule__Question__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_1__0"


    // $ANTLR start "rule__Question__Group_1_1__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1818:1: rule__Question__Group_1_1__0__Impl : ( KEYWORD_21 ) ;
    public final void rule__Question__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1822:1: ( ( KEYWORD_21 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1823:1: ( KEYWORD_21 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1823:1: ( KEYWORD_21 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1824:1: KEYWORD_21
            {
             before(grammarAccess.getQuestionAccess().getTypeKeyword_1_1_0()); 
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__Question__Group_1_1__0__Impl3597); 
             after(grammarAccess.getQuestionAccess().getTypeKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_1__0__Impl"


    // $ANTLR start "rule__Question__Group_1_1__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1837:1: rule__Question__Group_1_1__1 : rule__Question__Group_1_1__1__Impl ;
    public final void rule__Question__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1841:1: ( rule__Question__Group_1_1__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1842:2: rule__Question__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_1__1__Impl_in_rule__Question__Group_1_1__13628);
            rule__Question__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_1__1"


    // $ANTLR start "rule__Question__Group_1_1__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1848:1: rule__Question__Group_1_1__1__Impl : ( ( rule__Question__TypeAssignment_1_1_1 ) ) ;
    public final void rule__Question__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1852:1: ( ( ( rule__Question__TypeAssignment_1_1_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1853:1: ( ( rule__Question__TypeAssignment_1_1_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1853:1: ( ( rule__Question__TypeAssignment_1_1_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1854:1: ( rule__Question__TypeAssignment_1_1_1 )
            {
             before(grammarAccess.getQuestionAccess().getTypeAssignment_1_1_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1855:1: ( rule__Question__TypeAssignment_1_1_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1855:2: rule__Question__TypeAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Question__TypeAssignment_1_1_1_in_rule__Question__Group_1_1__1__Impl3655);
            rule__Question__TypeAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTypeAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_1__1__Impl"


    // $ANTLR start "rule__Question__Group_1_2__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1869:1: rule__Question__Group_1_2__0 : rule__Question__Group_1_2__0__Impl rule__Question__Group_1_2__1 ;
    public final void rule__Question__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1873:1: ( rule__Question__Group_1_2__0__Impl rule__Question__Group_1_2__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1874:2: rule__Question__Group_1_2__0__Impl rule__Question__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_2__0__Impl_in_rule__Question__Group_1_2__03689);
            rule__Question__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_2__1_in_rule__Question__Group_1_2__03692);
            rule__Question__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_2__0"


    // $ANTLR start "rule__Question__Group_1_2__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1881:1: rule__Question__Group_1_2__0__Impl : ( KEYWORD_26 ) ;
    public final void rule__Question__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1885:1: ( ( KEYWORD_26 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1886:1: ( KEYWORD_26 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1886:1: ( KEYWORD_26 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1887:1: KEYWORD_26
            {
             before(grammarAccess.getQuestionAccess().getTitleKeyword_1_2_0()); 
            match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__Question__Group_1_2__0__Impl3720); 
             after(grammarAccess.getQuestionAccess().getTitleKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_2__0__Impl"


    // $ANTLR start "rule__Question__Group_1_2__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1900:1: rule__Question__Group_1_2__1 : rule__Question__Group_1_2__1__Impl ;
    public final void rule__Question__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1904:1: ( rule__Question__Group_1_2__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1905:2: rule__Question__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_2__1__Impl_in_rule__Question__Group_1_2__13751);
            rule__Question__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_2__1"


    // $ANTLR start "rule__Question__Group_1_2__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1911:1: rule__Question__Group_1_2__1__Impl : ( ( rule__Question__TitleAssignment_1_2_1 ) ) ;
    public final void rule__Question__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1915:1: ( ( ( rule__Question__TitleAssignment_1_2_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1916:1: ( ( rule__Question__TitleAssignment_1_2_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1916:1: ( ( rule__Question__TitleAssignment_1_2_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1917:1: ( rule__Question__TitleAssignment_1_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getTitleAssignment_1_2_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1918:1: ( rule__Question__TitleAssignment_1_2_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1918:2: rule__Question__TitleAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Question__TitleAssignment_1_2_1_in_rule__Question__Group_1_2__1__Impl3778);
            rule__Question__TitleAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTitleAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_2__1__Impl"


    // $ANTLR start "rule__Question__Group_1_3__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1932:1: rule__Question__Group_1_3__0 : rule__Question__Group_1_3__0__Impl rule__Question__Group_1_3__1 ;
    public final void rule__Question__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1936:1: ( rule__Question__Group_1_3__0__Impl rule__Question__Group_1_3__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1937:2: rule__Question__Group_1_3__0__Impl rule__Question__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_3__0__Impl_in_rule__Question__Group_1_3__03812);
            rule__Question__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_3__1_in_rule__Question__Group_1_3__03815);
            rule__Question__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_3__0"


    // $ANTLR start "rule__Question__Group_1_3__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1944:1: rule__Question__Group_1_3__0__Impl : ( KEYWORD_44 ) ;
    public final void rule__Question__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1948:1: ( ( KEYWORD_44 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1949:1: ( KEYWORD_44 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1949:1: ( KEYWORD_44 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1950:1: KEYWORD_44
            {
             before(grammarAccess.getQuestionAccess().getRangeStartKeyword_1_3_0()); 
            match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rule__Question__Group_1_3__0__Impl3843); 
             after(grammarAccess.getQuestionAccess().getRangeStartKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_3__0__Impl"


    // $ANTLR start "rule__Question__Group_1_3__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1963:1: rule__Question__Group_1_3__1 : rule__Question__Group_1_3__1__Impl ;
    public final void rule__Question__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1967:1: ( rule__Question__Group_1_3__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1968:2: rule__Question__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_3__1__Impl_in_rule__Question__Group_1_3__13874);
            rule__Question__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_3__1"


    // $ANTLR start "rule__Question__Group_1_3__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1974:1: rule__Question__Group_1_3__1__Impl : ( ( rule__Question__RangeStartAssignment_1_3_1 ) ) ;
    public final void rule__Question__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1978:1: ( ( ( rule__Question__RangeStartAssignment_1_3_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1979:1: ( ( rule__Question__RangeStartAssignment_1_3_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1979:1: ( ( rule__Question__RangeStartAssignment_1_3_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1980:1: ( rule__Question__RangeStartAssignment_1_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getRangeStartAssignment_1_3_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1981:1: ( rule__Question__RangeStartAssignment_1_3_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1981:2: rule__Question__RangeStartAssignment_1_3_1
            {
            pushFollow(FOLLOW_rule__Question__RangeStartAssignment_1_3_1_in_rule__Question__Group_1_3__1__Impl3901);
            rule__Question__RangeStartAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getRangeStartAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_3__1__Impl"


    // $ANTLR start "rule__Question__Group_1_4__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1995:1: rule__Question__Group_1_4__0 : rule__Question__Group_1_4__0__Impl rule__Question__Group_1_4__1 ;
    public final void rule__Question__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:1999:1: ( rule__Question__Group_1_4__0__Impl rule__Question__Group_1_4__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2000:2: rule__Question__Group_1_4__0__Impl rule__Question__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_4__0__Impl_in_rule__Question__Group_1_4__03935);
            rule__Question__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_4__1_in_rule__Question__Group_1_4__03938);
            rule__Question__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_4__0"


    // $ANTLR start "rule__Question__Group_1_4__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2007:1: rule__Question__Group_1_4__0__Impl : ( KEYWORD_37 ) ;
    public final void rule__Question__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2011:1: ( ( KEYWORD_37 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2012:1: ( KEYWORD_37 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2012:1: ( KEYWORD_37 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2013:1: KEYWORD_37
            {
             before(grammarAccess.getQuestionAccess().getRangeEndKeyword_1_4_0()); 
            match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_rule__Question__Group_1_4__0__Impl3966); 
             after(grammarAccess.getQuestionAccess().getRangeEndKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_4__0__Impl"


    // $ANTLR start "rule__Question__Group_1_4__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2026:1: rule__Question__Group_1_4__1 : rule__Question__Group_1_4__1__Impl ;
    public final void rule__Question__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2030:1: ( rule__Question__Group_1_4__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2031:2: rule__Question__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_4__1__Impl_in_rule__Question__Group_1_4__13997);
            rule__Question__Group_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_4__1"


    // $ANTLR start "rule__Question__Group_1_4__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2037:1: rule__Question__Group_1_4__1__Impl : ( ( rule__Question__RangeEndAssignment_1_4_1 ) ) ;
    public final void rule__Question__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2041:1: ( ( ( rule__Question__RangeEndAssignment_1_4_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2042:1: ( ( rule__Question__RangeEndAssignment_1_4_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2042:1: ( ( rule__Question__RangeEndAssignment_1_4_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2043:1: ( rule__Question__RangeEndAssignment_1_4_1 )
            {
             before(grammarAccess.getQuestionAccess().getRangeEndAssignment_1_4_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2044:1: ( rule__Question__RangeEndAssignment_1_4_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2044:2: rule__Question__RangeEndAssignment_1_4_1
            {
            pushFollow(FOLLOW_rule__Question__RangeEndAssignment_1_4_1_in_rule__Question__Group_1_4__1__Impl4024);
            rule__Question__RangeEndAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getRangeEndAssignment_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_4__1__Impl"


    // $ANTLR start "rule__Question__Group_1_5__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2058:1: rule__Question__Group_1_5__0 : rule__Question__Group_1_5__0__Impl rule__Question__Group_1_5__1 ;
    public final void rule__Question__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2062:1: ( rule__Question__Group_1_5__0__Impl rule__Question__Group_1_5__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2063:2: rule__Question__Group_1_5__0__Impl rule__Question__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_5__0__Impl_in_rule__Question__Group_1_5__04058);
            rule__Question__Group_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_5__1_in_rule__Question__Group_1_5__04061);
            rule__Question__Group_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_5__0"


    // $ANTLR start "rule__Question__Group_1_5__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2070:1: rule__Question__Group_1_5__0__Impl : ( KEYWORD_51 ) ;
    public final void rule__Question__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2074:1: ( ( KEYWORD_51 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2075:1: ( KEYWORD_51 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2075:1: ( KEYWORD_51 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2076:1: KEYWORD_51
            {
             before(grammarAccess.getQuestionAccess().getTextInputTypeKeyword_1_5_0()); 
            match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rule__Question__Group_1_5__0__Impl4089); 
             after(grammarAccess.getQuestionAccess().getTextInputTypeKeyword_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_5__0__Impl"


    // $ANTLR start "rule__Question__Group_1_5__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2089:1: rule__Question__Group_1_5__1 : rule__Question__Group_1_5__1__Impl ;
    public final void rule__Question__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2093:1: ( rule__Question__Group_1_5__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2094:2: rule__Question__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_5__1__Impl_in_rule__Question__Group_1_5__14120);
            rule__Question__Group_1_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_5__1"


    // $ANTLR start "rule__Question__Group_1_5__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2100:1: rule__Question__Group_1_5__1__Impl : ( ( rule__Question__InputTypeAssignment_1_5_1 ) ) ;
    public final void rule__Question__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2104:1: ( ( ( rule__Question__InputTypeAssignment_1_5_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2105:1: ( ( rule__Question__InputTypeAssignment_1_5_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2105:1: ( ( rule__Question__InputTypeAssignment_1_5_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2106:1: ( rule__Question__InputTypeAssignment_1_5_1 )
            {
             before(grammarAccess.getQuestionAccess().getInputTypeAssignment_1_5_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2107:1: ( rule__Question__InputTypeAssignment_1_5_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2107:2: rule__Question__InputTypeAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__Question__InputTypeAssignment_1_5_1_in_rule__Question__Group_1_5__1__Impl4147);
            rule__Question__InputTypeAssignment_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getInputTypeAssignment_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_5__1__Impl"


    // $ANTLR start "rule__Question__Group_1_6__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2121:1: rule__Question__Group_1_6__0 : rule__Question__Group_1_6__0__Impl rule__Question__Group_1_6__1 ;
    public final void rule__Question__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2125:1: ( rule__Question__Group_1_6__0__Impl rule__Question__Group_1_6__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2126:2: rule__Question__Group_1_6__0__Impl rule__Question__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_6__0__Impl_in_rule__Question__Group_1_6__04181);
            rule__Question__Group_1_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_6__1_in_rule__Question__Group_1_6__04184);
            rule__Question__Group_1_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_6__0"


    // $ANTLR start "rule__Question__Group_1_6__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2133:1: rule__Question__Group_1_6__0__Impl : ( KEYWORD_42 ) ;
    public final void rule__Question__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2137:1: ( ( KEYWORD_42 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2138:1: ( KEYWORD_42 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2138:1: ( KEYWORD_42 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2139:1: KEYWORD_42
            {
             before(grammarAccess.getQuestionAccess().getVisibleIfKeyword_1_6_0()); 
            match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__Question__Group_1_6__0__Impl4212); 
             after(grammarAccess.getQuestionAccess().getVisibleIfKeyword_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_6__0__Impl"


    // $ANTLR start "rule__Question__Group_1_6__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2152:1: rule__Question__Group_1_6__1 : rule__Question__Group_1_6__1__Impl ;
    public final void rule__Question__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2156:1: ( rule__Question__Group_1_6__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2157:2: rule__Question__Group_1_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_6__1__Impl_in_rule__Question__Group_1_6__14243);
            rule__Question__Group_1_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_6__1"


    // $ANTLR start "rule__Question__Group_1_6__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2163:1: rule__Question__Group_1_6__1__Impl : ( ( rule__Question__VisibleIfAssignment_1_6_1 ) ) ;
    public final void rule__Question__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2167:1: ( ( ( rule__Question__VisibleIfAssignment_1_6_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2168:1: ( ( rule__Question__VisibleIfAssignment_1_6_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2168:1: ( ( rule__Question__VisibleIfAssignment_1_6_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2169:1: ( rule__Question__VisibleIfAssignment_1_6_1 )
            {
             before(grammarAccess.getQuestionAccess().getVisibleIfAssignment_1_6_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2170:1: ( rule__Question__VisibleIfAssignment_1_6_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2170:2: rule__Question__VisibleIfAssignment_1_6_1
            {
            pushFollow(FOLLOW_rule__Question__VisibleIfAssignment_1_6_1_in_rule__Question__Group_1_6__1__Impl4270);
            rule__Question__VisibleIfAssignment_1_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getVisibleIfAssignment_1_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_6__1__Impl"


    // $ANTLR start "rule__Question__Group_1_7__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2184:1: rule__Question__Group_1_7__0 : rule__Question__Group_1_7__0__Impl rule__Question__Group_1_7__1 ;
    public final void rule__Question__Group_1_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2188:1: ( rule__Question__Group_1_7__0__Impl rule__Question__Group_1_7__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2189:2: rule__Question__Group_1_7__0__Impl rule__Question__Group_1_7__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_7__0__Impl_in_rule__Question__Group_1_7__04304);
            rule__Question__Group_1_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_7__1_in_rule__Question__Group_1_7__04307);
            rule__Question__Group_1_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_7__0"


    // $ANTLR start "rule__Question__Group_1_7__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2196:1: rule__Question__Group_1_7__0__Impl : ( KEYWORD_47 ) ;
    public final void rule__Question__Group_1_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2200:1: ( ( KEYWORD_47 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2201:1: ( KEYWORD_47 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2201:1: ( KEYWORD_47 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2202:1: KEYWORD_47
            {
             before(grammarAccess.getQuestionAccess().getPlaceholderKeyword_1_7_0()); 
            match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rule__Question__Group_1_7__0__Impl4335); 
             after(grammarAccess.getQuestionAccess().getPlaceholderKeyword_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_7__0__Impl"


    // $ANTLR start "rule__Question__Group_1_7__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2215:1: rule__Question__Group_1_7__1 : rule__Question__Group_1_7__1__Impl ;
    public final void rule__Question__Group_1_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2219:1: ( rule__Question__Group_1_7__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2220:2: rule__Question__Group_1_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_7__1__Impl_in_rule__Question__Group_1_7__14366);
            rule__Question__Group_1_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_7__1"


    // $ANTLR start "rule__Question__Group_1_7__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2226:1: rule__Question__Group_1_7__1__Impl : ( ( rule__Question__PlaceholderAssignment_1_7_1 ) ) ;
    public final void rule__Question__Group_1_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2230:1: ( ( ( rule__Question__PlaceholderAssignment_1_7_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2231:1: ( ( rule__Question__PlaceholderAssignment_1_7_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2231:1: ( ( rule__Question__PlaceholderAssignment_1_7_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2232:1: ( rule__Question__PlaceholderAssignment_1_7_1 )
            {
             before(grammarAccess.getQuestionAccess().getPlaceholderAssignment_1_7_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2233:1: ( rule__Question__PlaceholderAssignment_1_7_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2233:2: rule__Question__PlaceholderAssignment_1_7_1
            {
            pushFollow(FOLLOW_rule__Question__PlaceholderAssignment_1_7_1_in_rule__Question__Group_1_7__1__Impl4393);
            rule__Question__PlaceholderAssignment_1_7_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getPlaceholderAssignment_1_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_7__1__Impl"


    // $ANTLR start "rule__Question__Group_1_8__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2247:1: rule__Question__Group_1_8__0 : rule__Question__Group_1_8__0__Impl rule__Question__Group_1_8__1 ;
    public final void rule__Question__Group_1_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2251:1: ( rule__Question__Group_1_8__0__Impl rule__Question__Group_1_8__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2252:2: rule__Question__Group_1_8__0__Impl rule__Question__Group_1_8__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_8__0__Impl_in_rule__Question__Group_1_8__04427);
            rule__Question__Group_1_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_8__1_in_rule__Question__Group_1_8__04430);
            rule__Question__Group_1_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8__0"


    // $ANTLR start "rule__Question__Group_1_8__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2259:1: rule__Question__Group_1_8__0__Impl : ( KEYWORD_31 ) ;
    public final void rule__Question__Group_1_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2263:1: ( ( KEYWORD_31 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2264:1: ( KEYWORD_31 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2264:1: ( KEYWORD_31 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2265:1: KEYWORD_31
            {
             before(grammarAccess.getQuestionAccess().getChoicesKeyword_1_8_0()); 
            match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__Question__Group_1_8__0__Impl4458); 
             after(grammarAccess.getQuestionAccess().getChoicesKeyword_1_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8__0__Impl"


    // $ANTLR start "rule__Question__Group_1_8__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2278:1: rule__Question__Group_1_8__1 : rule__Question__Group_1_8__1__Impl rule__Question__Group_1_8__2 ;
    public final void rule__Question__Group_1_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2282:1: ( rule__Question__Group_1_8__1__Impl rule__Question__Group_1_8__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2283:2: rule__Question__Group_1_8__1__Impl rule__Question__Group_1_8__2
            {
            pushFollow(FOLLOW_rule__Question__Group_1_8__1__Impl_in_rule__Question__Group_1_8__14489);
            rule__Question__Group_1_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_8__2_in_rule__Question__Group_1_8__14492);
            rule__Question__Group_1_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8__1"


    // $ANTLR start "rule__Question__Group_1_8__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2290:1: rule__Question__Group_1_8__1__Impl : ( ( rule__Question__ChoicesAssignment_1_8_1 ) ) ;
    public final void rule__Question__Group_1_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2294:1: ( ( ( rule__Question__ChoicesAssignment_1_8_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2295:1: ( ( rule__Question__ChoicesAssignment_1_8_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2295:1: ( ( rule__Question__ChoicesAssignment_1_8_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2296:1: ( rule__Question__ChoicesAssignment_1_8_1 )
            {
             before(grammarAccess.getQuestionAccess().getChoicesAssignment_1_8_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2297:1: ( rule__Question__ChoicesAssignment_1_8_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2297:2: rule__Question__ChoicesAssignment_1_8_1
            {
            pushFollow(FOLLOW_rule__Question__ChoicesAssignment_1_8_1_in_rule__Question__Group_1_8__1__Impl4519);
            rule__Question__ChoicesAssignment_1_8_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getChoicesAssignment_1_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8__1__Impl"


    // $ANTLR start "rule__Question__Group_1_8__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2307:1: rule__Question__Group_1_8__2 : rule__Question__Group_1_8__2__Impl ;
    public final void rule__Question__Group_1_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2311:1: ( rule__Question__Group_1_8__2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2312:2: rule__Question__Group_1_8__2__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_8__2__Impl_in_rule__Question__Group_1_8__24549);
            rule__Question__Group_1_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8__2"


    // $ANTLR start "rule__Question__Group_1_8__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2318:1: rule__Question__Group_1_8__2__Impl : ( ( rule__Question__Group_1_8_2__0 )* ) ;
    public final void rule__Question__Group_1_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2322:1: ( ( ( rule__Question__Group_1_8_2__0 )* ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2323:1: ( ( rule__Question__Group_1_8_2__0 )* )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2323:1: ( ( rule__Question__Group_1_8_2__0 )* )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2324:1: ( rule__Question__Group_1_8_2__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_1_8_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2325:1: ( rule__Question__Group_1_8_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_3) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2325:2: rule__Question__Group_1_8_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Question__Group_1_8_2__0_in_rule__Question__Group_1_8__2__Impl4576);
            	    rule__Question__Group_1_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_1_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8__2__Impl"


    // $ANTLR start "rule__Question__Group_1_8_2__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2341:1: rule__Question__Group_1_8_2__0 : rule__Question__Group_1_8_2__0__Impl rule__Question__Group_1_8_2__1 ;
    public final void rule__Question__Group_1_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2345:1: ( rule__Question__Group_1_8_2__0__Impl rule__Question__Group_1_8_2__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2346:2: rule__Question__Group_1_8_2__0__Impl rule__Question__Group_1_8_2__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_8_2__0__Impl_in_rule__Question__Group_1_8_2__04613);
            rule__Question__Group_1_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_8_2__1_in_rule__Question__Group_1_8_2__04616);
            rule__Question__Group_1_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8_2__0"


    // $ANTLR start "rule__Question__Group_1_8_2__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2353:1: rule__Question__Group_1_8_2__0__Impl : ( KEYWORD_3 ) ;
    public final void rule__Question__Group_1_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2357:1: ( ( KEYWORD_3 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2358:1: ( KEYWORD_3 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2358:1: ( KEYWORD_3 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2359:1: KEYWORD_3
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_1_8_2_0()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__Question__Group_1_8_2__0__Impl4644); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_1_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8_2__0__Impl"


    // $ANTLR start "rule__Question__Group_1_8_2__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2372:1: rule__Question__Group_1_8_2__1 : rule__Question__Group_1_8_2__1__Impl ;
    public final void rule__Question__Group_1_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2376:1: ( rule__Question__Group_1_8_2__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2377:2: rule__Question__Group_1_8_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_8_2__1__Impl_in_rule__Question__Group_1_8_2__14675);
            rule__Question__Group_1_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8_2__1"


    // $ANTLR start "rule__Question__Group_1_8_2__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2383:1: rule__Question__Group_1_8_2__1__Impl : ( ( rule__Question__ChoicesAssignment_1_8_2_1 ) ) ;
    public final void rule__Question__Group_1_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2387:1: ( ( ( rule__Question__ChoicesAssignment_1_8_2_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2388:1: ( ( rule__Question__ChoicesAssignment_1_8_2_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2388:1: ( ( rule__Question__ChoicesAssignment_1_8_2_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2389:1: ( rule__Question__ChoicesAssignment_1_8_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getChoicesAssignment_1_8_2_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2390:1: ( rule__Question__ChoicesAssignment_1_8_2_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2390:2: rule__Question__ChoicesAssignment_1_8_2_1
            {
            pushFollow(FOLLOW_rule__Question__ChoicesAssignment_1_8_2_1_in_rule__Question__Group_1_8_2__1__Impl4702);
            rule__Question__ChoicesAssignment_1_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getChoicesAssignment_1_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_8_2__1__Impl"


    // $ANTLR start "rule__Question__Group_1_9__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2404:1: rule__Question__Group_1_9__0 : rule__Question__Group_1_9__0__Impl rule__Question__Group_1_9__1 ;
    public final void rule__Question__Group_1_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2408:1: ( rule__Question__Group_1_9__0__Impl rule__Question__Group_1_9__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2409:2: rule__Question__Group_1_9__0__Impl rule__Question__Group_1_9__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_9__0__Impl_in_rule__Question__Group_1_9__04736);
            rule__Question__Group_1_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_9__1_in_rule__Question__Group_1_9__04739);
            rule__Question__Group_1_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_9__0"


    // $ANTLR start "rule__Question__Group_1_9__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2416:1: rule__Question__Group_1_9__0__Impl : ( KEYWORD_36 ) ;
    public final void rule__Question__Group_1_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2420:1: ( ( KEYWORD_36 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2421:1: ( KEYWORD_36 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2421:1: ( KEYWORD_36 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2422:1: KEYWORD_36
            {
             before(grammarAccess.getQuestionAccess().getColCountKeyword_1_9_0()); 
            match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__Question__Group_1_9__0__Impl4767); 
             after(grammarAccess.getQuestionAccess().getColCountKeyword_1_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_9__0__Impl"


    // $ANTLR start "rule__Question__Group_1_9__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2435:1: rule__Question__Group_1_9__1 : rule__Question__Group_1_9__1__Impl ;
    public final void rule__Question__Group_1_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2439:1: ( rule__Question__Group_1_9__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2440:2: rule__Question__Group_1_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_9__1__Impl_in_rule__Question__Group_1_9__14798);
            rule__Question__Group_1_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_9__1"


    // $ANTLR start "rule__Question__Group_1_9__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2446:1: rule__Question__Group_1_9__1__Impl : ( ( rule__Question__ColCountAssignment_1_9_1 ) ) ;
    public final void rule__Question__Group_1_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2450:1: ( ( ( rule__Question__ColCountAssignment_1_9_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2451:1: ( ( rule__Question__ColCountAssignment_1_9_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2451:1: ( ( rule__Question__ColCountAssignment_1_9_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2452:1: ( rule__Question__ColCountAssignment_1_9_1 )
            {
             before(grammarAccess.getQuestionAccess().getColCountAssignment_1_9_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2453:1: ( rule__Question__ColCountAssignment_1_9_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2453:2: rule__Question__ColCountAssignment_1_9_1
            {
            pushFollow(FOLLOW_rule__Question__ColCountAssignment_1_9_1_in_rule__Question__Group_1_9__1__Impl4825);
            rule__Question__ColCountAssignment_1_9_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getColCountAssignment_1_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_9__1__Impl"


    // $ANTLR start "rule__Question__Group_1_10__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2467:1: rule__Question__Group_1_10__0 : rule__Question__Group_1_10__0__Impl rule__Question__Group_1_10__1 ;
    public final void rule__Question__Group_1_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2471:1: ( rule__Question__Group_1_10__0__Impl rule__Question__Group_1_10__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2472:2: rule__Question__Group_1_10__0__Impl rule__Question__Group_1_10__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_10__0__Impl_in_rule__Question__Group_1_10__04859);
            rule__Question__Group_1_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_10__1_in_rule__Question__Group_1_10__04862);
            rule__Question__Group_1_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_10__0"


    // $ANTLR start "rule__Question__Group_1_10__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2479:1: rule__Question__Group_1_10__0__Impl : ( KEYWORD_48 ) ;
    public final void rule__Question__Group_1_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2483:1: ( ( KEYWORD_48 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2484:1: ( KEYWORD_48 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2484:1: ( KEYWORD_48 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2485:1: KEYWORD_48
            {
             before(grammarAccess.getQuestionAccess().getQuestionNameKeyword_1_10_0()); 
            match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rule__Question__Group_1_10__0__Impl4890); 
             after(grammarAccess.getQuestionAccess().getQuestionNameKeyword_1_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_10__0__Impl"


    // $ANTLR start "rule__Question__Group_1_10__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2498:1: rule__Question__Group_1_10__1 : rule__Question__Group_1_10__1__Impl ;
    public final void rule__Question__Group_1_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2502:1: ( rule__Question__Group_1_10__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2503:2: rule__Question__Group_1_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_10__1__Impl_in_rule__Question__Group_1_10__14921);
            rule__Question__Group_1_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_10__1"


    // $ANTLR start "rule__Question__Group_1_10__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2509:1: rule__Question__Group_1_10__1__Impl : ( ( rule__Question__QuestionNameAssignment_1_10_1 ) ) ;
    public final void rule__Question__Group_1_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2513:1: ( ( ( rule__Question__QuestionNameAssignment_1_10_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2514:1: ( ( rule__Question__QuestionNameAssignment_1_10_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2514:1: ( ( rule__Question__QuestionNameAssignment_1_10_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2515:1: ( rule__Question__QuestionNameAssignment_1_10_1 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionNameAssignment_1_10_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2516:1: ( rule__Question__QuestionNameAssignment_1_10_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2516:2: rule__Question__QuestionNameAssignment_1_10_1
            {
            pushFollow(FOLLOW_rule__Question__QuestionNameAssignment_1_10_1_in_rule__Question__Group_1_10__1__Impl4948);
            rule__Question__QuestionNameAssignment_1_10_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionNameAssignment_1_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_10__1__Impl"


    // $ANTLR start "rule__Question__Group_1_11__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2530:1: rule__Question__Group_1_11__0 : rule__Question__Group_1_11__0__Impl rule__Question__Group_1_11__1 ;
    public final void rule__Question__Group_1_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2534:1: ( rule__Question__Group_1_11__0__Impl rule__Question__Group_1_11__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2535:2: rule__Question__Group_1_11__0__Impl rule__Question__Group_1_11__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_11__0__Impl_in_rule__Question__Group_1_11__04982);
            rule__Question__Group_1_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_11__1_in_rule__Question__Group_1_11__04985);
            rule__Question__Group_1_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_11__0"


    // $ANTLR start "rule__Question__Group_1_11__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2542:1: rule__Question__Group_1_11__0__Impl : ( KEYWORD_45 ) ;
    public final void rule__Question__Group_1_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2546:1: ( ( KEYWORD_45 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2547:1: ( KEYWORD_45 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2547:1: ( KEYWORD_45 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2548:1: KEYWORD_45
            {
             before(grammarAccess.getQuestionAccess().getCommentRowsKeyword_1_11_0()); 
            match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rule__Question__Group_1_11__0__Impl5013); 
             after(grammarAccess.getQuestionAccess().getCommentRowsKeyword_1_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_11__0__Impl"


    // $ANTLR start "rule__Question__Group_1_11__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2561:1: rule__Question__Group_1_11__1 : rule__Question__Group_1_11__1__Impl ;
    public final void rule__Question__Group_1_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2565:1: ( rule__Question__Group_1_11__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2566:2: rule__Question__Group_1_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_11__1__Impl_in_rule__Question__Group_1_11__15044);
            rule__Question__Group_1_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_11__1"


    // $ANTLR start "rule__Question__Group_1_11__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2572:1: rule__Question__Group_1_11__1__Impl : ( ( rule__Question__RowsAssignment_1_11_1 ) ) ;
    public final void rule__Question__Group_1_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2576:1: ( ( ( rule__Question__RowsAssignment_1_11_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2577:1: ( ( rule__Question__RowsAssignment_1_11_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2577:1: ( ( rule__Question__RowsAssignment_1_11_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2578:1: ( rule__Question__RowsAssignment_1_11_1 )
            {
             before(grammarAccess.getQuestionAccess().getRowsAssignment_1_11_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2579:1: ( rule__Question__RowsAssignment_1_11_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2579:2: rule__Question__RowsAssignment_1_11_1
            {
            pushFollow(FOLLOW_rule__Question__RowsAssignment_1_11_1_in_rule__Question__Group_1_11__1__Impl5071);
            rule__Question__RowsAssignment_1_11_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getRowsAssignment_1_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_11__1__Impl"


    // $ANTLR start "rule__Question__Group_1_12__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2593:1: rule__Question__Group_1_12__0 : rule__Question__Group_1_12__0__Impl rule__Question__Group_1_12__1 ;
    public final void rule__Question__Group_1_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2597:1: ( rule__Question__Group_1_12__0__Impl rule__Question__Group_1_12__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2598:2: rule__Question__Group_1_12__0__Impl rule__Question__Group_1_12__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_12__0__Impl_in_rule__Question__Group_1_12__05105);
            rule__Question__Group_1_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_12__1_in_rule__Question__Group_1_12__05108);
            rule__Question__Group_1_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_12__0"


    // $ANTLR start "rule__Question__Group_1_12__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2605:1: rule__Question__Group_1_12__0__Impl : ( KEYWORD_62 ) ;
    public final void rule__Question__Group_1_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2609:1: ( ( KEYWORD_62 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2610:1: ( KEYWORD_62 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2610:1: ( KEYWORD_62 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2611:1: KEYWORD_62
            {
             before(grammarAccess.getQuestionAccess().getRatingMinDescriptionKeyword_1_12_0()); 
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rule__Question__Group_1_12__0__Impl5136); 
             after(grammarAccess.getQuestionAccess().getRatingMinDescriptionKeyword_1_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_12__0__Impl"


    // $ANTLR start "rule__Question__Group_1_12__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2624:1: rule__Question__Group_1_12__1 : rule__Question__Group_1_12__1__Impl ;
    public final void rule__Question__Group_1_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2628:1: ( rule__Question__Group_1_12__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2629:2: rule__Question__Group_1_12__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_12__1__Impl_in_rule__Question__Group_1_12__15167);
            rule__Question__Group_1_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_12__1"


    // $ANTLR start "rule__Question__Group_1_12__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2635:1: rule__Question__Group_1_12__1__Impl : ( ( rule__Question__MininumRateDescriptionAssignment_1_12_1 ) ) ;
    public final void rule__Question__Group_1_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2639:1: ( ( ( rule__Question__MininumRateDescriptionAssignment_1_12_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2640:1: ( ( rule__Question__MininumRateDescriptionAssignment_1_12_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2640:1: ( ( rule__Question__MininumRateDescriptionAssignment_1_12_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2641:1: ( rule__Question__MininumRateDescriptionAssignment_1_12_1 )
            {
             before(grammarAccess.getQuestionAccess().getMininumRateDescriptionAssignment_1_12_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2642:1: ( rule__Question__MininumRateDescriptionAssignment_1_12_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2642:2: rule__Question__MininumRateDescriptionAssignment_1_12_1
            {
            pushFollow(FOLLOW_rule__Question__MininumRateDescriptionAssignment_1_12_1_in_rule__Question__Group_1_12__1__Impl5194);
            rule__Question__MininumRateDescriptionAssignment_1_12_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMininumRateDescriptionAssignment_1_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_12__1__Impl"


    // $ANTLR start "rule__Question__Group_1_13__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2656:1: rule__Question__Group_1_13__0 : rule__Question__Group_1_13__0__Impl rule__Question__Group_1_13__1 ;
    public final void rule__Question__Group_1_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2660:1: ( rule__Question__Group_1_13__0__Impl rule__Question__Group_1_13__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2661:2: rule__Question__Group_1_13__0__Impl rule__Question__Group_1_13__1
            {
            pushFollow(FOLLOW_rule__Question__Group_1_13__0__Impl_in_rule__Question__Group_1_13__05228);
            rule__Question__Group_1_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_1_13__1_in_rule__Question__Group_1_13__05231);
            rule__Question__Group_1_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_13__0"


    // $ANTLR start "rule__Question__Group_1_13__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2668:1: rule__Question__Group_1_13__0__Impl : ( KEYWORD_61 ) ;
    public final void rule__Question__Group_1_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2672:1: ( ( KEYWORD_61 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2673:1: ( KEYWORD_61 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2673:1: ( KEYWORD_61 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2674:1: KEYWORD_61
            {
             before(grammarAccess.getQuestionAccess().getRatingMaxDescriptionKeyword_1_13_0()); 
            match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_rule__Question__Group_1_13__0__Impl5259); 
             after(grammarAccess.getQuestionAccess().getRatingMaxDescriptionKeyword_1_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_13__0__Impl"


    // $ANTLR start "rule__Question__Group_1_13__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2687:1: rule__Question__Group_1_13__1 : rule__Question__Group_1_13__1__Impl ;
    public final void rule__Question__Group_1_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2691:1: ( rule__Question__Group_1_13__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2692:2: rule__Question__Group_1_13__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_1_13__1__Impl_in_rule__Question__Group_1_13__15290);
            rule__Question__Group_1_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_13__1"


    // $ANTLR start "rule__Question__Group_1_13__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2698:1: rule__Question__Group_1_13__1__Impl : ( ( rule__Question__MaximumRateDescriptionAssignment_1_13_1 ) ) ;
    public final void rule__Question__Group_1_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2702:1: ( ( ( rule__Question__MaximumRateDescriptionAssignment_1_13_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2703:1: ( ( rule__Question__MaximumRateDescriptionAssignment_1_13_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2703:1: ( ( rule__Question__MaximumRateDescriptionAssignment_1_13_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2704:1: ( rule__Question__MaximumRateDescriptionAssignment_1_13_1 )
            {
             before(grammarAccess.getQuestionAccess().getMaximumRateDescriptionAssignment_1_13_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2705:1: ( rule__Question__MaximumRateDescriptionAssignment_1_13_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2705:2: rule__Question__MaximumRateDescriptionAssignment_1_13_1
            {
            pushFollow(FOLLOW_rule__Question__MaximumRateDescriptionAssignment_1_13_1_in_rule__Question__Group_1_13__1__Impl5317);
            rule__Question__MaximumRateDescriptionAssignment_1_13_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMaximumRateDescriptionAssignment_1_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_1_13__1__Impl"


    // $ANTLR start "rule__Question__Group_2_0__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2719:1: rule__Question__Group_2_0__0 : rule__Question__Group_2_0__0__Impl rule__Question__Group_2_0__1 ;
    public final void rule__Question__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2723:1: ( rule__Question__Group_2_0__0__Impl rule__Question__Group_2_0__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2724:2: rule__Question__Group_2_0__0__Impl rule__Question__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Question__Group_2_0__0__Impl_in_rule__Question__Group_2_0__05351);
            rule__Question__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_0__1_in_rule__Question__Group_2_0__05354);
            rule__Question__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0__0"


    // $ANTLR start "rule__Question__Group_2_0__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2731:1: rule__Question__Group_2_0__0__Impl : ( KEYWORD_43 ) ;
    public final void rule__Question__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2735:1: ( ( KEYWORD_43 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2736:1: ( KEYWORD_43 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2736:1: ( KEYWORD_43 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2737:1: KEYWORD_43
            {
             before(grammarAccess.getQuestionAccess().getMatrixRowsKeyword_2_0_0()); 
            match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rule__Question__Group_2_0__0__Impl5382); 
             after(grammarAccess.getQuestionAccess().getMatrixRowsKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0__0__Impl"


    // $ANTLR start "rule__Question__Group_2_0__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2750:1: rule__Question__Group_2_0__1 : rule__Question__Group_2_0__1__Impl rule__Question__Group_2_0__2 ;
    public final void rule__Question__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2754:1: ( rule__Question__Group_2_0__1__Impl rule__Question__Group_2_0__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2755:2: rule__Question__Group_2_0__1__Impl rule__Question__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Question__Group_2_0__1__Impl_in_rule__Question__Group_2_0__15413);
            rule__Question__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_0__2_in_rule__Question__Group_2_0__15416);
            rule__Question__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0__1"


    // $ANTLR start "rule__Question__Group_2_0__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2762:1: rule__Question__Group_2_0__1__Impl : ( ( rule__Question__MatrixRowsAssignment_2_0_1 ) ) ;
    public final void rule__Question__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2766:1: ( ( ( rule__Question__MatrixRowsAssignment_2_0_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2767:1: ( ( rule__Question__MatrixRowsAssignment_2_0_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2767:1: ( ( rule__Question__MatrixRowsAssignment_2_0_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2768:1: ( rule__Question__MatrixRowsAssignment_2_0_1 )
            {
             before(grammarAccess.getQuestionAccess().getMatrixRowsAssignment_2_0_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2769:1: ( rule__Question__MatrixRowsAssignment_2_0_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2769:2: rule__Question__MatrixRowsAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Question__MatrixRowsAssignment_2_0_1_in_rule__Question__Group_2_0__1__Impl5443);
            rule__Question__MatrixRowsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMatrixRowsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0__1__Impl"


    // $ANTLR start "rule__Question__Group_2_0__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2779:1: rule__Question__Group_2_0__2 : rule__Question__Group_2_0__2__Impl ;
    public final void rule__Question__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2783:1: ( rule__Question__Group_2_0__2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2784:2: rule__Question__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_2_0__2__Impl_in_rule__Question__Group_2_0__25473);
            rule__Question__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0__2"


    // $ANTLR start "rule__Question__Group_2_0__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2790:1: rule__Question__Group_2_0__2__Impl : ( ( rule__Question__Group_2_0_2__0 )* ) ;
    public final void rule__Question__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2794:1: ( ( ( rule__Question__Group_2_0_2__0 )* ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2795:1: ( ( rule__Question__Group_2_0_2__0 )* )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2795:1: ( ( rule__Question__Group_2_0_2__0 )* )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2796:1: ( rule__Question__Group_2_0_2__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_2_0_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2797:1: ( rule__Question__Group_2_0_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_3) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2797:2: rule__Question__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Question__Group_2_0_2__0_in_rule__Question__Group_2_0__2__Impl5500);
            	    rule__Question__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0__2__Impl"


    // $ANTLR start "rule__Question__Group_2_0_2__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2813:1: rule__Question__Group_2_0_2__0 : rule__Question__Group_2_0_2__0__Impl rule__Question__Group_2_0_2__1 ;
    public final void rule__Question__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2817:1: ( rule__Question__Group_2_0_2__0__Impl rule__Question__Group_2_0_2__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2818:2: rule__Question__Group_2_0_2__0__Impl rule__Question__Group_2_0_2__1
            {
            pushFollow(FOLLOW_rule__Question__Group_2_0_2__0__Impl_in_rule__Question__Group_2_0_2__05537);
            rule__Question__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_0_2__1_in_rule__Question__Group_2_0_2__05540);
            rule__Question__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0_2__0"


    // $ANTLR start "rule__Question__Group_2_0_2__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2825:1: rule__Question__Group_2_0_2__0__Impl : ( KEYWORD_3 ) ;
    public final void rule__Question__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2829:1: ( ( KEYWORD_3 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2830:1: ( KEYWORD_3 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2830:1: ( KEYWORD_3 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2831:1: KEYWORD_3
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_2_0_2_0()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__Question__Group_2_0_2__0__Impl5568); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__Question__Group_2_0_2__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2844:1: rule__Question__Group_2_0_2__1 : rule__Question__Group_2_0_2__1__Impl ;
    public final void rule__Question__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2848:1: ( rule__Question__Group_2_0_2__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2849:2: rule__Question__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_2_0_2__1__Impl_in_rule__Question__Group_2_0_2__15599);
            rule__Question__Group_2_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0_2__1"


    // $ANTLR start "rule__Question__Group_2_0_2__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2855:1: rule__Question__Group_2_0_2__1__Impl : ( ( rule__Question__MatrixRowsAssignment_2_0_2_1 ) ) ;
    public final void rule__Question__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2859:1: ( ( ( rule__Question__MatrixRowsAssignment_2_0_2_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2860:1: ( ( rule__Question__MatrixRowsAssignment_2_0_2_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2860:1: ( ( rule__Question__MatrixRowsAssignment_2_0_2_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2861:1: ( rule__Question__MatrixRowsAssignment_2_0_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getMatrixRowsAssignment_2_0_2_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2862:1: ( rule__Question__MatrixRowsAssignment_2_0_2_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2862:2: rule__Question__MatrixRowsAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_rule__Question__MatrixRowsAssignment_2_0_2_1_in_rule__Question__Group_2_0_2__1__Impl5626);
            rule__Question__MatrixRowsAssignment_2_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMatrixRowsAssignment_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__Question__Group_2_1__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2876:1: rule__Question__Group_2_1__0 : rule__Question__Group_2_1__0__Impl rule__Question__Group_2_1__1 ;
    public final void rule__Question__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2880:1: ( rule__Question__Group_2_1__0__Impl rule__Question__Group_2_1__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2881:2: rule__Question__Group_2_1__0__Impl rule__Question__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Question__Group_2_1__0__Impl_in_rule__Question__Group_2_1__05660);
            rule__Question__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_1__1_in_rule__Question__Group_2_1__05663);
            rule__Question__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_1__0"


    // $ANTLR start "rule__Question__Group_2_1__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2888:1: rule__Question__Group_2_1__0__Impl : ( KEYWORD_55 ) ;
    public final void rule__Question__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2892:1: ( ( KEYWORD_55 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2893:1: ( KEYWORD_55 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2893:1: ( KEYWORD_55 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2894:1: KEYWORD_55
            {
             before(grammarAccess.getQuestionAccess().getMultiTextItemsKeyword_2_1_0()); 
            match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rule__Question__Group_2_1__0__Impl5691); 
             after(grammarAccess.getQuestionAccess().getMultiTextItemsKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_1__0__Impl"


    // $ANTLR start "rule__Question__Group_2_1__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2907:1: rule__Question__Group_2_1__1 : rule__Question__Group_2_1__1__Impl rule__Question__Group_2_1__2 ;
    public final void rule__Question__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2911:1: ( rule__Question__Group_2_1__1__Impl rule__Question__Group_2_1__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2912:2: rule__Question__Group_2_1__1__Impl rule__Question__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__Question__Group_2_1__1__Impl_in_rule__Question__Group_2_1__15722);
            rule__Question__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_1__2_in_rule__Question__Group_2_1__15725);
            rule__Question__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_1__1"


    // $ANTLR start "rule__Question__Group_2_1__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2919:1: rule__Question__Group_2_1__1__Impl : ( ( rule__Question__MultiTextItemsAssignment_2_1_1 ) ) ;
    public final void rule__Question__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2923:1: ( ( ( rule__Question__MultiTextItemsAssignment_2_1_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2924:1: ( ( rule__Question__MultiTextItemsAssignment_2_1_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2924:1: ( ( rule__Question__MultiTextItemsAssignment_2_1_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2925:1: ( rule__Question__MultiTextItemsAssignment_2_1_1 )
            {
             before(grammarAccess.getQuestionAccess().getMultiTextItemsAssignment_2_1_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2926:1: ( rule__Question__MultiTextItemsAssignment_2_1_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2926:2: rule__Question__MultiTextItemsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Question__MultiTextItemsAssignment_2_1_1_in_rule__Question__Group_2_1__1__Impl5752);
            rule__Question__MultiTextItemsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMultiTextItemsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_1__1__Impl"


    // $ANTLR start "rule__Question__Group_2_1__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2936:1: rule__Question__Group_2_1__2 : rule__Question__Group_2_1__2__Impl ;
    public final void rule__Question__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2940:1: ( rule__Question__Group_2_1__2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2941:2: rule__Question__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_2_1__2__Impl_in_rule__Question__Group_2_1__25782);
            rule__Question__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_1__2"


    // $ANTLR start "rule__Question__Group_2_1__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2947:1: rule__Question__Group_2_1__2__Impl : ( ( rule__Question__MultiTextItemsAssignment_2_1_2 )* ) ;
    public final void rule__Question__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2951:1: ( ( ( rule__Question__MultiTextItemsAssignment_2_1_2 )* ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2952:1: ( ( rule__Question__MultiTextItemsAssignment_2_1_2 )* )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2952:1: ( ( rule__Question__MultiTextItemsAssignment_2_1_2 )* )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2953:1: ( rule__Question__MultiTextItemsAssignment_2_1_2 )*
            {
             before(grammarAccess.getQuestionAccess().getMultiTextItemsAssignment_2_1_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2954:1: ( rule__Question__MultiTextItemsAssignment_2_1_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==KEYWORD_38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2954:2: rule__Question__MultiTextItemsAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_rule__Question__MultiTextItemsAssignment_2_1_2_in_rule__Question__Group_2_1__2__Impl5809);
            	    rule__Question__MultiTextItemsAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getMultiTextItemsAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_1__2__Impl"


    // $ANTLR start "rule__Question__Group_2_2__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2970:1: rule__Question__Group_2_2__0 : rule__Question__Group_2_2__0__Impl rule__Question__Group_2_2__1 ;
    public final void rule__Question__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2974:1: ( rule__Question__Group_2_2__0__Impl rule__Question__Group_2_2__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2975:2: rule__Question__Group_2_2__0__Impl rule__Question__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Question__Group_2_2__0__Impl_in_rule__Question__Group_2_2__05846);
            rule__Question__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_2__1_in_rule__Question__Group_2_2__05849);
            rule__Question__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2__0"


    // $ANTLR start "rule__Question__Group_2_2__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2982:1: rule__Question__Group_2_2__0__Impl : ( KEYWORD_50 ) ;
    public final void rule__Question__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2986:1: ( ( KEYWORD_50 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2987:1: ( KEYWORD_50 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2987:1: ( KEYWORD_50 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:2988:1: KEYWORD_50
            {
             before(grammarAccess.getQuestionAccess().getMatrixColumnsKeyword_2_2_0()); 
            match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rule__Question__Group_2_2__0__Impl5877); 
             after(grammarAccess.getQuestionAccess().getMatrixColumnsKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2__0__Impl"


    // $ANTLR start "rule__Question__Group_2_2__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3001:1: rule__Question__Group_2_2__1 : rule__Question__Group_2_2__1__Impl rule__Question__Group_2_2__2 ;
    public final void rule__Question__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3005:1: ( rule__Question__Group_2_2__1__Impl rule__Question__Group_2_2__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3006:2: rule__Question__Group_2_2__1__Impl rule__Question__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__Question__Group_2_2__1__Impl_in_rule__Question__Group_2_2__15908);
            rule__Question__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_2__2_in_rule__Question__Group_2_2__15911);
            rule__Question__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2__1"


    // $ANTLR start "rule__Question__Group_2_2__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3013:1: rule__Question__Group_2_2__1__Impl : ( ( rule__Question__MatrixColumnsAssignment_2_2_1 ) ) ;
    public final void rule__Question__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3017:1: ( ( ( rule__Question__MatrixColumnsAssignment_2_2_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3018:1: ( ( rule__Question__MatrixColumnsAssignment_2_2_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3018:1: ( ( rule__Question__MatrixColumnsAssignment_2_2_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3019:1: ( rule__Question__MatrixColumnsAssignment_2_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getMatrixColumnsAssignment_2_2_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3020:1: ( rule__Question__MatrixColumnsAssignment_2_2_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3020:2: rule__Question__MatrixColumnsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Question__MatrixColumnsAssignment_2_2_1_in_rule__Question__Group_2_2__1__Impl5938);
            rule__Question__MatrixColumnsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMatrixColumnsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2__1__Impl"


    // $ANTLR start "rule__Question__Group_2_2__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3030:1: rule__Question__Group_2_2__2 : rule__Question__Group_2_2__2__Impl ;
    public final void rule__Question__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3034:1: ( rule__Question__Group_2_2__2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3035:2: rule__Question__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_2_2__2__Impl_in_rule__Question__Group_2_2__25968);
            rule__Question__Group_2_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2__2"


    // $ANTLR start "rule__Question__Group_2_2__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3041:1: rule__Question__Group_2_2__2__Impl : ( ( rule__Question__Group_2_2_2__0 )* ) ;
    public final void rule__Question__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3045:1: ( ( ( rule__Question__Group_2_2_2__0 )* ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3046:1: ( ( rule__Question__Group_2_2_2__0 )* )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3046:1: ( ( rule__Question__Group_2_2_2__0 )* )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3047:1: ( rule__Question__Group_2_2_2__0 )*
            {
             before(grammarAccess.getQuestionAccess().getGroup_2_2_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3048:1: ( rule__Question__Group_2_2_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==KEYWORD_3) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3048:2: rule__Question__Group_2_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Question__Group_2_2_2__0_in_rule__Question__Group_2_2__2__Impl5995);
            	    rule__Question__Group_2_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getGroup_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2__2__Impl"


    // $ANTLR start "rule__Question__Group_2_2_2__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3064:1: rule__Question__Group_2_2_2__0 : rule__Question__Group_2_2_2__0__Impl rule__Question__Group_2_2_2__1 ;
    public final void rule__Question__Group_2_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3068:1: ( rule__Question__Group_2_2_2__0__Impl rule__Question__Group_2_2_2__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3069:2: rule__Question__Group_2_2_2__0__Impl rule__Question__Group_2_2_2__1
            {
            pushFollow(FOLLOW_rule__Question__Group_2_2_2__0__Impl_in_rule__Question__Group_2_2_2__06032);
            rule__Question__Group_2_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group_2_2_2__1_in_rule__Question__Group_2_2_2__06035);
            rule__Question__Group_2_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2_2__0"


    // $ANTLR start "rule__Question__Group_2_2_2__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3076:1: rule__Question__Group_2_2_2__0__Impl : ( KEYWORD_3 ) ;
    public final void rule__Question__Group_2_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3080:1: ( ( KEYWORD_3 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3081:1: ( KEYWORD_3 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3081:1: ( KEYWORD_3 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3082:1: KEYWORD_3
            {
             before(grammarAccess.getQuestionAccess().getCommaKeyword_2_2_2_0()); 
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__Question__Group_2_2_2__0__Impl6063); 
             after(grammarAccess.getQuestionAccess().getCommaKeyword_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2_2__0__Impl"


    // $ANTLR start "rule__Question__Group_2_2_2__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3095:1: rule__Question__Group_2_2_2__1 : rule__Question__Group_2_2_2__1__Impl ;
    public final void rule__Question__Group_2_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3099:1: ( rule__Question__Group_2_2_2__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3100:2: rule__Question__Group_2_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group_2_2_2__1__Impl_in_rule__Question__Group_2_2_2__16094);
            rule__Question__Group_2_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2_2__1"


    // $ANTLR start "rule__Question__Group_2_2_2__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3106:1: rule__Question__Group_2_2_2__1__Impl : ( ( rule__Question__MatrixColumnsAssignment_2_2_2_1 ) ) ;
    public final void rule__Question__Group_2_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3110:1: ( ( ( rule__Question__MatrixColumnsAssignment_2_2_2_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3111:1: ( ( rule__Question__MatrixColumnsAssignment_2_2_2_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3111:1: ( ( rule__Question__MatrixColumnsAssignment_2_2_2_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3112:1: ( rule__Question__MatrixColumnsAssignment_2_2_2_1 )
            {
             before(grammarAccess.getQuestionAccess().getMatrixColumnsAssignment_2_2_2_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3113:1: ( rule__Question__MatrixColumnsAssignment_2_2_2_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3113:2: rule__Question__MatrixColumnsAssignment_2_2_2_1
            {
            pushFollow(FOLLOW_rule__Question__MatrixColumnsAssignment_2_2_2_1_in_rule__Question__Group_2_2_2__1__Impl6121);
            rule__Question__MatrixColumnsAssignment_2_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getMatrixColumnsAssignment_2_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group_2_2_2__1__Impl"


    // $ANTLR start "rule__TextValue__Group__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3127:1: rule__TextValue__Group__0 : rule__TextValue__Group__0__Impl rule__TextValue__Group__1 ;
    public final void rule__TextValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3131:1: ( rule__TextValue__Group__0__Impl rule__TextValue__Group__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3132:2: rule__TextValue__Group__0__Impl rule__TextValue__Group__1
            {
            pushFollow(FOLLOW_rule__TextValue__Group__0__Impl_in_rule__TextValue__Group__06155);
            rule__TextValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextValue__Group__1_in_rule__TextValue__Group__06158);
            rule__TextValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__0"


    // $ANTLR start "rule__TextValue__Group__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3139:1: rule__TextValue__Group__0__Impl : ( KEYWORD_1 ) ;
    public final void rule__TextValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3143:1: ( ( KEYWORD_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3144:1: ( KEYWORD_1 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3144:1: ( KEYWORD_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3145:1: KEYWORD_1
            {
             before(grammarAccess.getTextValueAccess().getLeftParenthesisKeyword_0()); 
            match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__TextValue__Group__0__Impl6186); 
             after(grammarAccess.getTextValueAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__0__Impl"


    // $ANTLR start "rule__TextValue__Group__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3158:1: rule__TextValue__Group__1 : rule__TextValue__Group__1__Impl rule__TextValue__Group__2 ;
    public final void rule__TextValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3162:1: ( rule__TextValue__Group__1__Impl rule__TextValue__Group__2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3163:2: rule__TextValue__Group__1__Impl rule__TextValue__Group__2
            {
            pushFollow(FOLLOW_rule__TextValue__Group__1__Impl_in_rule__TextValue__Group__16217);
            rule__TextValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextValue__Group__2_in_rule__TextValue__Group__16220);
            rule__TextValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__1"


    // $ANTLR start "rule__TextValue__Group__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3170:1: rule__TextValue__Group__1__Impl : ( KEYWORD_20 ) ;
    public final void rule__TextValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3174:1: ( ( KEYWORD_20 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3175:1: ( KEYWORD_20 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3175:1: ( KEYWORD_20 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3176:1: KEYWORD_20
            {
             before(grammarAccess.getTextValueAccess().getTextKeyword_1()); 
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__TextValue__Group__1__Impl6248); 
             after(grammarAccess.getTextValueAccess().getTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__1__Impl"


    // $ANTLR start "rule__TextValue__Group__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3189:1: rule__TextValue__Group__2 : rule__TextValue__Group__2__Impl rule__TextValue__Group__3 ;
    public final void rule__TextValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3193:1: ( rule__TextValue__Group__2__Impl rule__TextValue__Group__3 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3194:2: rule__TextValue__Group__2__Impl rule__TextValue__Group__3
            {
            pushFollow(FOLLOW_rule__TextValue__Group__2__Impl_in_rule__TextValue__Group__26279);
            rule__TextValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextValue__Group__3_in_rule__TextValue__Group__26282);
            rule__TextValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__2"


    // $ANTLR start "rule__TextValue__Group__2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3201:1: rule__TextValue__Group__2__Impl : ( ( rule__TextValue__TextAssignment_2 ) ) ;
    public final void rule__TextValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3205:1: ( ( ( rule__TextValue__TextAssignment_2 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3206:1: ( ( rule__TextValue__TextAssignment_2 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3206:1: ( ( rule__TextValue__TextAssignment_2 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3207:1: ( rule__TextValue__TextAssignment_2 )
            {
             before(grammarAccess.getTextValueAccess().getTextAssignment_2()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3208:1: ( rule__TextValue__TextAssignment_2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3208:2: rule__TextValue__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__TextValue__TextAssignment_2_in_rule__TextValue__Group__2__Impl6309);
            rule__TextValue__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextValueAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__2__Impl"


    // $ANTLR start "rule__TextValue__Group__3"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3218:1: rule__TextValue__Group__3 : rule__TextValue__Group__3__Impl rule__TextValue__Group__4 ;
    public final void rule__TextValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3222:1: ( rule__TextValue__Group__3__Impl rule__TextValue__Group__4 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3223:2: rule__TextValue__Group__3__Impl rule__TextValue__Group__4
            {
            pushFollow(FOLLOW_rule__TextValue__Group__3__Impl_in_rule__TextValue__Group__36339);
            rule__TextValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextValue__Group__4_in_rule__TextValue__Group__36342);
            rule__TextValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__3"


    // $ANTLR start "rule__TextValue__Group__3__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3230:1: rule__TextValue__Group__3__Impl : ( ( rule__TextValue__Group_3__0 )? ) ;
    public final void rule__TextValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3234:1: ( ( ( rule__TextValue__Group_3__0 )? ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3235:1: ( ( rule__TextValue__Group_3__0 )? )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3235:1: ( ( rule__TextValue__Group_3__0 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3236:1: ( rule__TextValue__Group_3__0 )?
            {
             before(grammarAccess.getTextValueAccess().getGroup_3()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3237:1: ( rule__TextValue__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3237:2: rule__TextValue__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TextValue__Group_3__0_in_rule__TextValue__Group__3__Impl6369);
                    rule__TextValue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextValueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__3__Impl"


    // $ANTLR start "rule__TextValue__Group__4"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3247:1: rule__TextValue__Group__4 : rule__TextValue__Group__4__Impl ;
    public final void rule__TextValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3251:1: ( rule__TextValue__Group__4__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3252:2: rule__TextValue__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TextValue__Group__4__Impl_in_rule__TextValue__Group__46400);
            rule__TextValue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__4"


    // $ANTLR start "rule__TextValue__Group__4__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3258:1: rule__TextValue__Group__4__Impl : ( KEYWORD_2 ) ;
    public final void rule__TextValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3262:1: ( ( KEYWORD_2 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3263:1: ( KEYWORD_2 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3263:1: ( KEYWORD_2 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3264:1: KEYWORD_2
            {
             before(grammarAccess.getTextValueAccess().getRightParenthesisKeyword_4()); 
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__TextValue__Group__4__Impl6428); 
             after(grammarAccess.getTextValueAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group__4__Impl"


    // $ANTLR start "rule__TextValue__Group_3__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3287:1: rule__TextValue__Group_3__0 : rule__TextValue__Group_3__0__Impl rule__TextValue__Group_3__1 ;
    public final void rule__TextValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3291:1: ( rule__TextValue__Group_3__0__Impl rule__TextValue__Group_3__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3292:2: rule__TextValue__Group_3__0__Impl rule__TextValue__Group_3__1
            {
            pushFollow(FOLLOW_rule__TextValue__Group_3__0__Impl_in_rule__TextValue__Group_3__06469);
            rule__TextValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextValue__Group_3__1_in_rule__TextValue__Group_3__06472);
            rule__TextValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group_3__0"


    // $ANTLR start "rule__TextValue__Group_3__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3299:1: rule__TextValue__Group_3__0__Impl : ( KEYWORD_27 ) ;
    public final void rule__TextValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3303:1: ( ( KEYWORD_27 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3304:1: ( KEYWORD_27 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3304:1: ( KEYWORD_27 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3305:1: KEYWORD_27
            {
             before(grammarAccess.getTextValueAccess().getValueKeyword_3_0()); 
            match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__TextValue__Group_3__0__Impl6500); 
             after(grammarAccess.getTextValueAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group_3__0__Impl"


    // $ANTLR start "rule__TextValue__Group_3__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3318:1: rule__TextValue__Group_3__1 : rule__TextValue__Group_3__1__Impl ;
    public final void rule__TextValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3322:1: ( rule__TextValue__Group_3__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3323:2: rule__TextValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TextValue__Group_3__1__Impl_in_rule__TextValue__Group_3__16531);
            rule__TextValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group_3__1"


    // $ANTLR start "rule__TextValue__Group_3__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3329:1: rule__TextValue__Group_3__1__Impl : ( ( rule__TextValue__ValueAssignment_3_1 ) ) ;
    public final void rule__TextValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3333:1: ( ( ( rule__TextValue__ValueAssignment_3_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3334:1: ( ( rule__TextValue__ValueAssignment_3_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3334:1: ( ( rule__TextValue__ValueAssignment_3_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3335:1: ( rule__TextValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTextValueAccess().getValueAssignment_3_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3336:1: ( rule__TextValue__ValueAssignment_3_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3336:2: rule__TextValue__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TextValue__ValueAssignment_3_1_in_rule__TextValue__Group_3__1__Impl6558);
            rule__TextValue__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextValueAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__Group_3__1__Impl"


    // $ANTLR start "rule__MultiTextItem__Group__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3350:1: rule__MultiTextItem__Group__0 : rule__MultiTextItem__Group__0__Impl rule__MultiTextItem__Group__1 ;
    public final void rule__MultiTextItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3354:1: ( rule__MultiTextItem__Group__0__Impl rule__MultiTextItem__Group__1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3355:2: rule__MultiTextItem__Group__0__Impl rule__MultiTextItem__Group__1
            {
            pushFollow(FOLLOW_rule__MultiTextItem__Group__0__Impl_in_rule__MultiTextItem__Group__06592);
            rule__MultiTextItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiTextItem__Group__1_in_rule__MultiTextItem__Group__06595);
            rule__MultiTextItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiTextItem__Group__0"


    // $ANTLR start "rule__MultiTextItem__Group__0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3362:1: rule__MultiTextItem__Group__0__Impl : ( KEYWORD_38 ) ;
    public final void rule__MultiTextItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3366:1: ( ( KEYWORD_38 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3367:1: ( KEYWORD_38 )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3367:1: ( KEYWORD_38 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3368:1: KEYWORD_38
            {
             before(grammarAccess.getMultiTextItemAccess().getSubtitleKeyword_0()); 
            match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__MultiTextItem__Group__0__Impl6623); 
             after(grammarAccess.getMultiTextItemAccess().getSubtitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiTextItem__Group__0__Impl"


    // $ANTLR start "rule__MultiTextItem__Group__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3381:1: rule__MultiTextItem__Group__1 : rule__MultiTextItem__Group__1__Impl ;
    public final void rule__MultiTextItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3385:1: ( rule__MultiTextItem__Group__1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3386:2: rule__MultiTextItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiTextItem__Group__1__Impl_in_rule__MultiTextItem__Group__16654);
            rule__MultiTextItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiTextItem__Group__1"


    // $ANTLR start "rule__MultiTextItem__Group__1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3392:1: rule__MultiTextItem__Group__1__Impl : ( ( rule__MultiTextItem__TitleAssignment_1 ) ) ;
    public final void rule__MultiTextItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3396:1: ( ( ( rule__MultiTextItem__TitleAssignment_1 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3397:1: ( ( rule__MultiTextItem__TitleAssignment_1 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3397:1: ( ( rule__MultiTextItem__TitleAssignment_1 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3398:1: ( rule__MultiTextItem__TitleAssignment_1 )
            {
             before(grammarAccess.getMultiTextItemAccess().getTitleAssignment_1()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3399:1: ( rule__MultiTextItem__TitleAssignment_1 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3399:2: rule__MultiTextItem__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__MultiTextItem__TitleAssignment_1_in_rule__MultiTextItem__Group__1__Impl6681);
            rule__MultiTextItem__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiTextItemAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiTextItem__Group__1__Impl"


    // $ANTLR start "rule__Survey__UnorderedGroup_0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3414:1: rule__Survey__UnorderedGroup_0 : ( rule__Survey__UnorderedGroup_0__0 )? ;
    public final void rule__Survey__UnorderedGroup_0() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3419:1: ( ( rule__Survey__UnorderedGroup_0__0 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3420:2: ( rule__Survey__UnorderedGroup_0__0 )?
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3420:2: ( rule__Survey__UnorderedGroup_0__0 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3420:2: rule__Survey__UnorderedGroup_0__0
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__0_in_rule__Survey__UnorderedGroup_06716);
                    rule__Survey__UnorderedGroup_0__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3430:1: rule__Survey__UnorderedGroup_0__Impl : ( ({...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) ) ) ) ;
    public final void rule__Survey__UnorderedGroup_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3435:1: ( ( ({...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) ) ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3436:3: ( ({...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) ) ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3436:3: ( ({...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) ) ) )
            int alt16=13;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3438:4: ({...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3438:4: ({...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3439:5: {...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3439:103: ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3440:6: ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3446:6: ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3448:7: ( rule__Survey__HideNavigationButtonsAssignment_0_0 )
                    {
                     before(grammarAccess.getSurveyAccess().getHideNavigationButtonsAssignment_0_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3449:7: ( rule__Survey__HideNavigationButtonsAssignment_0_0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3449:8: rule__Survey__HideNavigationButtonsAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Survey__HideNavigationButtonsAssignment_0_0_in_rule__Survey__UnorderedGroup_0__Impl6803);
                    rule__Survey__HideNavigationButtonsAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getHideNavigationButtonsAssignment_0_0()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3458:4: ({...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3458:4: ({...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3459:5: {...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3459:103: ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3460:6: ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3466:6: ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3468:7: ( rule__Survey__HidePageTitlesAssignment_0_1 )
                    {
                     before(grammarAccess.getSurveyAccess().getHidePageTitlesAssignment_0_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3469:7: ( rule__Survey__HidePageTitlesAssignment_0_1 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3469:8: rule__Survey__HidePageTitlesAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Survey__HidePageTitlesAssignment_0_1_in_rule__Survey__UnorderedGroup_0__Impl6901);
                    rule__Survey__HidePageTitlesAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getHidePageTitlesAssignment_0_1()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3478:4: ({...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3478:4: ({...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3479:5: {...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3479:103: ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3480:6: ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3486:6: ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3488:7: ( rule__Survey__HideQuestionNumbersAssignment_0_2 )
                    {
                     before(grammarAccess.getSurveyAccess().getHideQuestionNumbersAssignment_0_2()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3489:7: ( rule__Survey__HideQuestionNumbersAssignment_0_2 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3489:8: rule__Survey__HideQuestionNumbersAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Survey__HideQuestionNumbersAssignment_0_2_in_rule__Survey__UnorderedGroup_0__Impl6999);
                    rule__Survey__HideQuestionNumbersAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getHideQuestionNumbersAssignment_0_2()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3498:4: ({...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3498:4: ({...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3499:5: {...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3499:103: ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3500:6: ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3506:6: ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3508:7: ( rule__Survey__HidePageNumbersAssignment_0_3 )
                    {
                     before(grammarAccess.getSurveyAccess().getHidePageNumbersAssignment_0_3()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3509:7: ( rule__Survey__HidePageNumbersAssignment_0_3 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3509:8: rule__Survey__HidePageNumbersAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__Survey__HidePageNumbersAssignment_0_3_in_rule__Survey__UnorderedGroup_0__Impl7097);
                    rule__Survey__HidePageNumbersAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getHidePageNumbersAssignment_0_3()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3518:4: ({...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3518:4: ({...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3519:5: {...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3519:103: ( ( ( rule__Survey__Group_0_4__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3520:6: ( ( rule__Survey__Group_0_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3526:6: ( ( rule__Survey__Group_0_4__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3528:7: ( rule__Survey__Group_0_4__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_4()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3529:7: ( rule__Survey__Group_0_4__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3529:8: rule__Survey__Group_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_4__0_in_rule__Survey__UnorderedGroup_0__Impl7195);
                    rule__Survey__Group_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_4()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3538:4: ({...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3538:4: ({...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3539:5: {...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3539:103: ( ( ( rule__Survey__Group_0_5__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3540:6: ( ( rule__Survey__Group_0_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3546:6: ( ( rule__Survey__Group_0_5__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3548:7: ( rule__Survey__Group_0_5__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_5()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3549:7: ( rule__Survey__Group_0_5__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3549:8: rule__Survey__Group_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_5__0_in_rule__Survey__UnorderedGroup_0__Impl7293);
                    rule__Survey__Group_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_5()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3558:4: ({...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3558:4: ({...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3559:5: {...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3559:103: ( ( ( rule__Survey__Group_0_6__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3560:6: ( ( rule__Survey__Group_0_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3566:6: ( ( rule__Survey__Group_0_6__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3568:7: ( rule__Survey__Group_0_6__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_6()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3569:7: ( rule__Survey__Group_0_6__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3569:8: rule__Survey__Group_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_6__0_in_rule__Survey__UnorderedGroup_0__Impl7391);
                    rule__Survey__Group_0_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_6()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3578:4: ({...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3578:4: ({...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3579:5: {...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3579:103: ( ( ( rule__Survey__Group_0_7__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3580:6: ( ( rule__Survey__Group_0_7__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3586:6: ( ( rule__Survey__Group_0_7__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3588:7: ( rule__Survey__Group_0_7__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_7()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3589:7: ( rule__Survey__Group_0_7__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3589:8: rule__Survey__Group_0_7__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_7__0_in_rule__Survey__UnorderedGroup_0__Impl7489);
                    rule__Survey__Group_0_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_7()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3598:4: ({...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3598:4: ({...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3599:5: {...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3599:103: ( ( ( rule__Survey__Group_0_8__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3600:6: ( ( rule__Survey__Group_0_8__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3606:6: ( ( rule__Survey__Group_0_8__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3608:7: ( rule__Survey__Group_0_8__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_8()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3609:7: ( rule__Survey__Group_0_8__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3609:8: rule__Survey__Group_0_8__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_8__0_in_rule__Survey__UnorderedGroup_0__Impl7587);
                    rule__Survey__Group_0_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_8()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3618:4: ({...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3618:4: ({...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3619:5: {...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3619:103: ( ( ( rule__Survey__Group_0_9__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3620:6: ( ( rule__Survey__Group_0_9__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3626:6: ( ( rule__Survey__Group_0_9__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3628:7: ( rule__Survey__Group_0_9__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_9()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3629:7: ( rule__Survey__Group_0_9__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3629:8: rule__Survey__Group_0_9__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_9__0_in_rule__Survey__UnorderedGroup_0__Impl7685);
                    rule__Survey__Group_0_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_9()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3638:4: ({...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3638:4: ({...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3639:5: {...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3639:104: ( ( ( rule__Survey__Group_0_10__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3640:6: ( ( rule__Survey__Group_0_10__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3646:6: ( ( rule__Survey__Group_0_10__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3648:7: ( rule__Survey__Group_0_10__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_10()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3649:7: ( rule__Survey__Group_0_10__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3649:8: rule__Survey__Group_0_10__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_10__0_in_rule__Survey__UnorderedGroup_0__Impl7783);
                    rule__Survey__Group_0_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_10()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3658:4: ({...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3658:4: ({...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3659:5: {...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3659:104: ( ( ( rule__Survey__Group_0_11__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3660:6: ( ( rule__Survey__Group_0_11__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3666:6: ( ( rule__Survey__Group_0_11__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3668:7: ( rule__Survey__Group_0_11__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_11()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3669:7: ( rule__Survey__Group_0_11__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3669:8: rule__Survey__Group_0_11__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_11__0_in_rule__Survey__UnorderedGroup_0__Impl7881);
                    rule__Survey__Group_0_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_11()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3678:4: ({...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3678:4: ({...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3679:5: {...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {
                        throw new FailedPredicateException(input, "rule__Survey__UnorderedGroup_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3679:104: ( ( ( rule__Survey__Group_0_12__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3680:6: ( ( rule__Survey__Group_0_12__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3686:6: ( ( rule__Survey__Group_0_12__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3688:7: ( rule__Survey__Group_0_12__0 )
                    {
                     before(grammarAccess.getSurveyAccess().getGroup_0_12()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3689:7: ( rule__Survey__Group_0_12__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3689:8: rule__Survey__Group_0_12__0
                    {
                    pushFollow(FOLLOW_rule__Survey__Group_0_12__0_in_rule__Survey__UnorderedGroup_0__Impl7979);
                    rule__Survey__Group_0_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSurveyAccess().getGroup_0_12()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
                    	 				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSurveyAccess().getUnorderedGroup_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__Impl"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3707:1: rule__Survey__UnorderedGroup_0__0 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__1 )? ;
    public final void rule__Survey__UnorderedGroup_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3711:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__1 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3712:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__1 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__08045);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3713:2: ( rule__Survey__UnorderedGroup_0__1 )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3713:2: rule__Survey__UnorderedGroup_0__1
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__1_in_rule__Survey__UnorderedGroup_0__08048);
                    rule__Survey__UnorderedGroup_0__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__0"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3720:1: rule__Survey__UnorderedGroup_0__1 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__2 )? ;
    public final void rule__Survey__UnorderedGroup_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3724:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__2 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3725:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__2 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__18073);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3726:2: ( rule__Survey__UnorderedGroup_0__2 )?
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3726:2: rule__Survey__UnorderedGroup_0__2
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__2_in_rule__Survey__UnorderedGroup_0__18076);
                    rule__Survey__UnorderedGroup_0__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__1"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3733:1: rule__Survey__UnorderedGroup_0__2 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__3 )? ;
    public final void rule__Survey__UnorderedGroup_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3737:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__3 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3738:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__3 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__28101);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3739:2: ( rule__Survey__UnorderedGroup_0__3 )?
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3739:2: rule__Survey__UnorderedGroup_0__3
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__3_in_rule__Survey__UnorderedGroup_0__28104);
                    rule__Survey__UnorderedGroup_0__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__2"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__3"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3746:1: rule__Survey__UnorderedGroup_0__3 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__4 )? ;
    public final void rule__Survey__UnorderedGroup_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3750:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__4 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3751:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__4 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__38129);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3752:2: ( rule__Survey__UnorderedGroup_0__4 )?
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3752:2: rule__Survey__UnorderedGroup_0__4
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__4_in_rule__Survey__UnorderedGroup_0__38132);
                    rule__Survey__UnorderedGroup_0__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__3"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__4"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3759:1: rule__Survey__UnorderedGroup_0__4 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__5 )? ;
    public final void rule__Survey__UnorderedGroup_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3763:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__5 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3764:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__5 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__48157);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3765:2: ( rule__Survey__UnorderedGroup_0__5 )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3765:2: rule__Survey__UnorderedGroup_0__5
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__5_in_rule__Survey__UnorderedGroup_0__48160);
                    rule__Survey__UnorderedGroup_0__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__4"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__5"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3772:1: rule__Survey__UnorderedGroup_0__5 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__6 )? ;
    public final void rule__Survey__UnorderedGroup_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3776:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__6 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3777:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__6 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__58185);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3778:2: ( rule__Survey__UnorderedGroup_0__6 )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3778:2: rule__Survey__UnorderedGroup_0__6
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__6_in_rule__Survey__UnorderedGroup_0__58188);
                    rule__Survey__UnorderedGroup_0__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__5"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__6"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3785:1: rule__Survey__UnorderedGroup_0__6 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__7 )? ;
    public final void rule__Survey__UnorderedGroup_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3789:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__7 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3790:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__7 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__68213);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3791:2: ( rule__Survey__UnorderedGroup_0__7 )?
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3791:2: rule__Survey__UnorderedGroup_0__7
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__7_in_rule__Survey__UnorderedGroup_0__68216);
                    rule__Survey__UnorderedGroup_0__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__6"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__7"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3798:1: rule__Survey__UnorderedGroup_0__7 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__8 )? ;
    public final void rule__Survey__UnorderedGroup_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3802:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__8 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3803:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__8 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__78241);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3804:2: ( rule__Survey__UnorderedGroup_0__8 )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3804:2: rule__Survey__UnorderedGroup_0__8
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__8_in_rule__Survey__UnorderedGroup_0__78244);
                    rule__Survey__UnorderedGroup_0__8();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__7"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__8"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3811:1: rule__Survey__UnorderedGroup_0__8 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__9 )? ;
    public final void rule__Survey__UnorderedGroup_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3815:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__9 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3816:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__9 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__88269);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3817:2: ( rule__Survey__UnorderedGroup_0__9 )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3817:2: rule__Survey__UnorderedGroup_0__9
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__9_in_rule__Survey__UnorderedGroup_0__88272);
                    rule__Survey__UnorderedGroup_0__9();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__8"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__9"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3824:1: rule__Survey__UnorderedGroup_0__9 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__10 )? ;
    public final void rule__Survey__UnorderedGroup_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3828:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__10 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3829:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__10 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__98297);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3830:2: ( rule__Survey__UnorderedGroup_0__10 )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3830:2: rule__Survey__UnorderedGroup_0__10
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__10_in_rule__Survey__UnorderedGroup_0__98300);
                    rule__Survey__UnorderedGroup_0__10();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__9"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__10"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3837:1: rule__Survey__UnorderedGroup_0__10 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__11 )? ;
    public final void rule__Survey__UnorderedGroup_0__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3841:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__11 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3842:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__11 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__108325);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3843:2: ( rule__Survey__UnorderedGroup_0__11 )?
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3843:2: rule__Survey__UnorderedGroup_0__11
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__11_in_rule__Survey__UnorderedGroup_0__108328);
                    rule__Survey__UnorderedGroup_0__11();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__10"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__11"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3850:1: rule__Survey__UnorderedGroup_0__11 : rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__12 )? ;
    public final void rule__Survey__UnorderedGroup_0__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3854:1: ( rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__12 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3855:2: rule__Survey__UnorderedGroup_0__Impl ( rule__Survey__UnorderedGroup_0__12 )?
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__118353);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3856:2: ( rule__Survey__UnorderedGroup_0__12 )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3856:2: rule__Survey__UnorderedGroup_0__12
                    {
                    pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__12_in_rule__Survey__UnorderedGroup_0__118356);
                    rule__Survey__UnorderedGroup_0__12();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__11"


    // $ANTLR start "rule__Survey__UnorderedGroup_0__12"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3863:1: rule__Survey__UnorderedGroup_0__12 : rule__Survey__UnorderedGroup_0__Impl ;
    public final void rule__Survey__UnorderedGroup_0__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3867:1: ( rule__Survey__UnorderedGroup_0__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3868:2: rule__Survey__UnorderedGroup_0__Impl
            {
            pushFollow(FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__128381);
            rule__Survey__UnorderedGroup_0__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__UnorderedGroup_0__12"


    // $ANTLR start "rule__Page__UnorderedGroup_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3901:1: rule__Page__UnorderedGroup_1 : ( rule__Page__UnorderedGroup_1__0 )? ;
    public final void rule__Page__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPageAccess().getUnorderedGroup_1());
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3906:1: ( ( rule__Page__UnorderedGroup_1__0 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3907:2: ( rule__Page__UnorderedGroup_1__0 )?
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3907:2: ( rule__Page__UnorderedGroup_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3907:2: rule__Page__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_rule__Page__UnorderedGroup_1__0_in_rule__Page__UnorderedGroup_18431);
                    rule__Page__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPageAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_1"


    // $ANTLR start "rule__Page__UnorderedGroup_1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3917:1: rule__Page__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Page__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Page__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__Page__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3922:1: ( ( ({...}? => ( ( ( rule__Page__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Page__Group_1_1__0 ) ) ) ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3923:3: ( ({...}? => ( ( ( rule__Page__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Page__Group_1_1__0 ) ) ) ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3923:3: ( ({...}? => ( ( ( rule__Page__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Page__Group_1_1__0 ) ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3925:4: ({...}? => ( ( ( rule__Page__Group_1_0__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3925:4: ({...}? => ( ( ( rule__Page__Group_1_0__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3926:5: {...}? => ( ( ( rule__Page__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Page__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3926:101: ( ( ( rule__Page__Group_1_0__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3927:6: ( ( rule__Page__Group_1_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3933:6: ( ( rule__Page__Group_1_0__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3935:7: ( rule__Page__Group_1_0__0 )
                    {
                     before(grammarAccess.getPageAccess().getGroup_1_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3936:7: ( rule__Page__Group_1_0__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3936:8: rule__Page__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_1_0__0_in_rule__Page__UnorderedGroup_1__Impl8518);
                    rule__Page__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageAccess().getGroup_1_0()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3945:4: ({...}? => ( ( ( rule__Page__Group_1_1__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3945:4: ({...}? => ( ( ( rule__Page__Group_1_1__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3946:5: {...}? => ( ( ( rule__Page__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Page__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3946:101: ( ( ( rule__Page__Group_1_1__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3947:6: ( ( rule__Page__Group_1_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3953:6: ( ( rule__Page__Group_1_1__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3955:7: ( rule__Page__Group_1_1__0 )
                    {
                     before(grammarAccess.getPageAccess().getGroup_1_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3956:7: ( rule__Page__Group_1_1__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3956:8: rule__Page__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Page__Group_1_1__0_in_rule__Page__UnorderedGroup_1__Impl8616);
                    rule__Page__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPageAccess().getGroup_1_1()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPageAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Page__UnorderedGroup_1__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3974:1: rule__Page__UnorderedGroup_1__0 : rule__Page__UnorderedGroup_1__Impl ( rule__Page__UnorderedGroup_1__1 )? ;
    public final void rule__Page__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3978:1: ( rule__Page__UnorderedGroup_1__Impl ( rule__Page__UnorderedGroup_1__1 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3979:2: rule__Page__UnorderedGroup_1__Impl ( rule__Page__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Page__UnorderedGroup_1__Impl_in_rule__Page__UnorderedGroup_1__08682);
            rule__Page__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3980:2: ( rule__Page__UnorderedGroup_1__1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getPageAccess().getUnorderedGroup_1(), 1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3980:2: rule__Page__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Page__UnorderedGroup_1__1_in_rule__Page__UnorderedGroup_1__08685);
                    rule__Page__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_1__0"


    // $ANTLR start "rule__Page__UnorderedGroup_1__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3987:1: rule__Page__UnorderedGroup_1__1 : rule__Page__UnorderedGroup_1__Impl ;
    public final void rule__Page__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3991:1: ( rule__Page__UnorderedGroup_1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:3992:2: rule__Page__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Page__UnorderedGroup_1__Impl_in_rule__Page__UnorderedGroup_1__18710);
            rule__Page__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__UnorderedGroup_1__1"


    // $ANTLR start "rule__Question__UnorderedGroup_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4003:1: rule__Question__UnorderedGroup_1 : rule__Question__UnorderedGroup_1__0 {...}?;
    public final void rule__Question__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4008:1: ( rule__Question__UnorderedGroup_1__0 {...}?)
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4009:2: rule__Question__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__0_in_rule__Question__UnorderedGroup_18738);
            rule__Question__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getQuestionAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getQuestionAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1"


    // $ANTLR start "rule__Question__UnorderedGroup_1__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4020:1: rule__Question__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_13__0 ) ) ) ) ) ;
    public final void rule__Question__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4025:1: ( ( ({...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_13__0 ) ) ) ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4026:3: ( ({...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_13__0 ) ) ) ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4026:3: ( ({...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_13__0 ) ) ) ) )
            int alt32=14;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4028:4: ({...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4028:4: ({...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4029:5: {...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4029:105: ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4030:6: ( ( rule__Question__IsRequiredAssignment_1_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4036:6: ( ( rule__Question__IsRequiredAssignment_1_0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4038:7: ( rule__Question__IsRequiredAssignment_1_0 )
                    {
                     before(grammarAccess.getQuestionAccess().getIsRequiredAssignment_1_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4039:7: ( rule__Question__IsRequiredAssignment_1_0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4039:8: rule__Question__IsRequiredAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Question__IsRequiredAssignment_1_0_in_rule__Question__UnorderedGroup_1__Impl8827);
                    rule__Question__IsRequiredAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getIsRequiredAssignment_1_0()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4048:4: ({...}? => ( ( ( rule__Question__Group_1_1__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4048:4: ({...}? => ( ( ( rule__Question__Group_1_1__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4049:5: {...}? => ( ( ( rule__Question__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4049:105: ( ( ( rule__Question__Group_1_1__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4050:6: ( ( rule__Question__Group_1_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4056:6: ( ( rule__Question__Group_1_1__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4058:7: ( rule__Question__Group_1_1__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4059:7: ( rule__Question__Group_1_1__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4059:8: rule__Question__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_1__0_in_rule__Question__UnorderedGroup_1__Impl8925);
                    rule__Question__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_1()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4068:4: ({...}? => ( ( ( rule__Question__Group_1_2__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4068:4: ({...}? => ( ( ( rule__Question__Group_1_2__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4069:5: {...}? => ( ( ( rule__Question__Group_1_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4069:105: ( ( ( rule__Question__Group_1_2__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4070:6: ( ( rule__Question__Group_1_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4076:6: ( ( rule__Question__Group_1_2__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4078:7: ( rule__Question__Group_1_2__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_2()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4079:7: ( rule__Question__Group_1_2__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4079:8: rule__Question__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_2__0_in_rule__Question__UnorderedGroup_1__Impl9023);
                    rule__Question__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_2()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4088:4: ({...}? => ( ( ( rule__Question__Group_1_3__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4088:4: ({...}? => ( ( ( rule__Question__Group_1_3__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4089:5: {...}? => ( ( ( rule__Question__Group_1_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4089:105: ( ( ( rule__Question__Group_1_3__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4090:6: ( ( rule__Question__Group_1_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4096:6: ( ( rule__Question__Group_1_3__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4098:7: ( rule__Question__Group_1_3__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_3()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4099:7: ( rule__Question__Group_1_3__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4099:8: rule__Question__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_3__0_in_rule__Question__UnorderedGroup_1__Impl9121);
                    rule__Question__Group_1_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_3()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4108:4: ({...}? => ( ( ( rule__Question__Group_1_4__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4108:4: ({...}? => ( ( ( rule__Question__Group_1_4__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4109:5: {...}? => ( ( ( rule__Question__Group_1_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4109:105: ( ( ( rule__Question__Group_1_4__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4110:6: ( ( rule__Question__Group_1_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4116:6: ( ( rule__Question__Group_1_4__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4118:7: ( rule__Question__Group_1_4__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_4()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4119:7: ( rule__Question__Group_1_4__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4119:8: rule__Question__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_4__0_in_rule__Question__UnorderedGroup_1__Impl9219);
                    rule__Question__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_4()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4128:4: ({...}? => ( ( ( rule__Question__Group_1_5__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4128:4: ({...}? => ( ( ( rule__Question__Group_1_5__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4129:5: {...}? => ( ( ( rule__Question__Group_1_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4129:105: ( ( ( rule__Question__Group_1_5__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4130:6: ( ( rule__Question__Group_1_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4136:6: ( ( rule__Question__Group_1_5__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4138:7: ( rule__Question__Group_1_5__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_5()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4139:7: ( rule__Question__Group_1_5__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4139:8: rule__Question__Group_1_5__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_5__0_in_rule__Question__UnorderedGroup_1__Impl9317);
                    rule__Question__Group_1_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_5()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4148:4: ({...}? => ( ( ( rule__Question__Group_1_6__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4148:4: ({...}? => ( ( ( rule__Question__Group_1_6__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4149:5: {...}? => ( ( ( rule__Question__Group_1_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4149:105: ( ( ( rule__Question__Group_1_6__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4150:6: ( ( rule__Question__Group_1_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4156:6: ( ( rule__Question__Group_1_6__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4158:7: ( rule__Question__Group_1_6__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_6()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4159:7: ( rule__Question__Group_1_6__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4159:8: rule__Question__Group_1_6__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_6__0_in_rule__Question__UnorderedGroup_1__Impl9415);
                    rule__Question__Group_1_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_6()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4168:4: ({...}? => ( ( ( rule__Question__Group_1_7__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4168:4: ({...}? => ( ( ( rule__Question__Group_1_7__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4169:5: {...}? => ( ( ( rule__Question__Group_1_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4169:105: ( ( ( rule__Question__Group_1_7__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4170:6: ( ( rule__Question__Group_1_7__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4176:6: ( ( rule__Question__Group_1_7__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4178:7: ( rule__Question__Group_1_7__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_7()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4179:7: ( rule__Question__Group_1_7__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4179:8: rule__Question__Group_1_7__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_7__0_in_rule__Question__UnorderedGroup_1__Impl9513);
                    rule__Question__Group_1_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_7()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4188:4: ({...}? => ( ( ( rule__Question__Group_1_8__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4188:4: ({...}? => ( ( ( rule__Question__Group_1_8__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4189:5: {...}? => ( ( ( rule__Question__Group_1_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4189:105: ( ( ( rule__Question__Group_1_8__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4190:6: ( ( rule__Question__Group_1_8__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4196:6: ( ( rule__Question__Group_1_8__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4198:7: ( rule__Question__Group_1_8__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_8()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4199:7: ( rule__Question__Group_1_8__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4199:8: rule__Question__Group_1_8__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_8__0_in_rule__Question__UnorderedGroup_1__Impl9611);
                    rule__Question__Group_1_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_8()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4208:4: ({...}? => ( ( ( rule__Question__Group_1_9__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4208:4: ({...}? => ( ( ( rule__Question__Group_1_9__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4209:5: {...}? => ( ( ( rule__Question__Group_1_9__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4209:105: ( ( ( rule__Question__Group_1_9__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4210:6: ( ( rule__Question__Group_1_9__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4216:6: ( ( rule__Question__Group_1_9__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4218:7: ( rule__Question__Group_1_9__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_9()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4219:7: ( rule__Question__Group_1_9__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4219:8: rule__Question__Group_1_9__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_9__0_in_rule__Question__UnorderedGroup_1__Impl9709);
                    rule__Question__Group_1_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_9()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4228:4: ({...}? => ( ( ( rule__Question__Group_1_10__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4228:4: ({...}? => ( ( ( rule__Question__Group_1_10__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4229:5: {...}? => ( ( ( rule__Question__Group_1_10__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4229:106: ( ( ( rule__Question__Group_1_10__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4230:6: ( ( rule__Question__Group_1_10__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4236:6: ( ( rule__Question__Group_1_10__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4238:7: ( rule__Question__Group_1_10__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_10()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4239:7: ( rule__Question__Group_1_10__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4239:8: rule__Question__Group_1_10__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_10__0_in_rule__Question__UnorderedGroup_1__Impl9807);
                    rule__Question__Group_1_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_10()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4248:4: ({...}? => ( ( ( rule__Question__Group_1_11__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4248:4: ({...}? => ( ( ( rule__Question__Group_1_11__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4249:5: {...}? => ( ( ( rule__Question__Group_1_11__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4249:106: ( ( ( rule__Question__Group_1_11__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4250:6: ( ( rule__Question__Group_1_11__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4256:6: ( ( rule__Question__Group_1_11__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4258:7: ( rule__Question__Group_1_11__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_11()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4259:7: ( rule__Question__Group_1_11__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4259:8: rule__Question__Group_1_11__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_11__0_in_rule__Question__UnorderedGroup_1__Impl9905);
                    rule__Question__Group_1_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_11()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4268:4: ({...}? => ( ( ( rule__Question__Group_1_12__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4268:4: ({...}? => ( ( ( rule__Question__Group_1_12__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4269:5: {...}? => ( ( ( rule__Question__Group_1_12__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4269:106: ( ( ( rule__Question__Group_1_12__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4270:6: ( ( rule__Question__Group_1_12__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4276:6: ( ( rule__Question__Group_1_12__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4278:7: ( rule__Question__Group_1_12__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_12()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4279:7: ( rule__Question__Group_1_12__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4279:8: rule__Question__Group_1_12__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_12__0_in_rule__Question__UnorderedGroup_1__Impl10003);
                    rule__Question__Group_1_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_12()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;
                case 14 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4288:4: ({...}? => ( ( ( rule__Question__Group_1_13__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4288:4: ({...}? => ( ( ( rule__Question__Group_1_13__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4289:5: {...}? => ( ( ( rule__Question__Group_1_13__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4289:106: ( ( ( rule__Question__Group_1_13__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4290:6: ( ( rule__Question__Group_1_13__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4296:6: ( ( rule__Question__Group_1_13__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4298:7: ( rule__Question__Group_1_13__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_1_13()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4299:7: ( rule__Question__Group_1_13__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4299:8: rule__Question__Group_1_13__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_1_13__0_in_rule__Question__UnorderedGroup_1__Impl10101);
                    rule__Question__Group_1_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_1_13()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
                    	 				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Question__UnorderedGroup_1__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4317:1: rule__Question__UnorderedGroup_1__0 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__1 )? ;
    public final void rule__Question__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4321:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__1 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4322:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__010167);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4323:2: ( rule__Question__UnorderedGroup_1__1 )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4323:2: rule__Question__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__1_in_rule__Question__UnorderedGroup_1__010170);
                    rule__Question__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__0"


    // $ANTLR start "rule__Question__UnorderedGroup_1__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4330:1: rule__Question__UnorderedGroup_1__1 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__2 )? ;
    public final void rule__Question__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4334:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__2 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4335:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__110195);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4336:2: ( rule__Question__UnorderedGroup_1__2 )?
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4336:2: rule__Question__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__2_in_rule__Question__UnorderedGroup_1__110198);
                    rule__Question__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__1"


    // $ANTLR start "rule__Question__UnorderedGroup_1__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4343:1: rule__Question__UnorderedGroup_1__2 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__3 )? ;
    public final void rule__Question__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4347:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__3 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4348:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__210223);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4349:2: ( rule__Question__UnorderedGroup_1__3 )?
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4349:2: rule__Question__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__3_in_rule__Question__UnorderedGroup_1__210226);
                    rule__Question__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__2"


    // $ANTLR start "rule__Question__UnorderedGroup_1__3"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4356:1: rule__Question__UnorderedGroup_1__3 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__4 )? ;
    public final void rule__Question__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4360:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__4 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4361:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__4 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__310251);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4362:2: ( rule__Question__UnorderedGroup_1__4 )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4362:2: rule__Question__UnorderedGroup_1__4
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__4_in_rule__Question__UnorderedGroup_1__310254);
                    rule__Question__UnorderedGroup_1__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__3"


    // $ANTLR start "rule__Question__UnorderedGroup_1__4"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4369:1: rule__Question__UnorderedGroup_1__4 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__5 )? ;
    public final void rule__Question__UnorderedGroup_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4373:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__5 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4374:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__5 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__410279);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4375:2: ( rule__Question__UnorderedGroup_1__5 )?
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4375:2: rule__Question__UnorderedGroup_1__5
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__5_in_rule__Question__UnorderedGroup_1__410282);
                    rule__Question__UnorderedGroup_1__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__4"


    // $ANTLR start "rule__Question__UnorderedGroup_1__5"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4382:1: rule__Question__UnorderedGroup_1__5 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__6 )? ;
    public final void rule__Question__UnorderedGroup_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4386:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__6 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4387:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__6 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__510307);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4388:2: ( rule__Question__UnorderedGroup_1__6 )?
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4388:2: rule__Question__UnorderedGroup_1__6
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__6_in_rule__Question__UnorderedGroup_1__510310);
                    rule__Question__UnorderedGroup_1__6();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__5"


    // $ANTLR start "rule__Question__UnorderedGroup_1__6"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4395:1: rule__Question__UnorderedGroup_1__6 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__7 )? ;
    public final void rule__Question__UnorderedGroup_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4399:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__7 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4400:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__7 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__610335);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4401:2: ( rule__Question__UnorderedGroup_1__7 )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4401:2: rule__Question__UnorderedGroup_1__7
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__7_in_rule__Question__UnorderedGroup_1__610338);
                    rule__Question__UnorderedGroup_1__7();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__6"


    // $ANTLR start "rule__Question__UnorderedGroup_1__7"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4408:1: rule__Question__UnorderedGroup_1__7 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__8 )? ;
    public final void rule__Question__UnorderedGroup_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4412:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__8 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4413:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__8 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__710363);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4414:2: ( rule__Question__UnorderedGroup_1__8 )?
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4414:2: rule__Question__UnorderedGroup_1__8
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__8_in_rule__Question__UnorderedGroup_1__710366);
                    rule__Question__UnorderedGroup_1__8();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__7"


    // $ANTLR start "rule__Question__UnorderedGroup_1__8"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4421:1: rule__Question__UnorderedGroup_1__8 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__9 )? ;
    public final void rule__Question__UnorderedGroup_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4425:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__9 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4426:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__9 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__810391);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4427:2: ( rule__Question__UnorderedGroup_1__9 )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4427:2: rule__Question__UnorderedGroup_1__9
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__9_in_rule__Question__UnorderedGroup_1__810394);
                    rule__Question__UnorderedGroup_1__9();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__8"


    // $ANTLR start "rule__Question__UnorderedGroup_1__9"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4434:1: rule__Question__UnorderedGroup_1__9 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__10 )? ;
    public final void rule__Question__UnorderedGroup_1__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4438:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__10 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4439:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__10 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__910419);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4440:2: ( rule__Question__UnorderedGroup_1__10 )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4440:2: rule__Question__UnorderedGroup_1__10
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__10_in_rule__Question__UnorderedGroup_1__910422);
                    rule__Question__UnorderedGroup_1__10();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__9"


    // $ANTLR start "rule__Question__UnorderedGroup_1__10"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4447:1: rule__Question__UnorderedGroup_1__10 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__11 )? ;
    public final void rule__Question__UnorderedGroup_1__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4451:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__11 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4452:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__11 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1010447);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4453:2: ( rule__Question__UnorderedGroup_1__11 )?
            int alt43=2;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4453:2: rule__Question__UnorderedGroup_1__11
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__11_in_rule__Question__UnorderedGroup_1__1010450);
                    rule__Question__UnorderedGroup_1__11();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__10"


    // $ANTLR start "rule__Question__UnorderedGroup_1__11"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4460:1: rule__Question__UnorderedGroup_1__11 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__12 )? ;
    public final void rule__Question__UnorderedGroup_1__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4464:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__12 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4465:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__12 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1110475);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4466:2: ( rule__Question__UnorderedGroup_1__12 )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4466:2: rule__Question__UnorderedGroup_1__12
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__12_in_rule__Question__UnorderedGroup_1__1110478);
                    rule__Question__UnorderedGroup_1__12();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__11"


    // $ANTLR start "rule__Question__UnorderedGroup_1__12"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4473:1: rule__Question__UnorderedGroup_1__12 : rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__13 )? ;
    public final void rule__Question__UnorderedGroup_1__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4477:1: ( rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__13 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4478:2: rule__Question__UnorderedGroup_1__Impl ( rule__Question__UnorderedGroup_1__13 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1210503);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4479:2: ( rule__Question__UnorderedGroup_1__13 )?
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4479:2: rule__Question__UnorderedGroup_1__13
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__13_in_rule__Question__UnorderedGroup_1__1210506);
                    rule__Question__UnorderedGroup_1__13();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__12"


    // $ANTLR start "rule__Question__UnorderedGroup_1__13"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4486:1: rule__Question__UnorderedGroup_1__13 : rule__Question__UnorderedGroup_1__Impl ;
    public final void rule__Question__UnorderedGroup_1__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4490:1: ( rule__Question__UnorderedGroup_1__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4491:2: rule__Question__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1310531);
            rule__Question__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_1__13"


    // $ANTLR start "rule__Question__UnorderedGroup_2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4526:1: rule__Question__UnorderedGroup_2 : ( rule__Question__UnorderedGroup_2__0 )? ;
    public final void rule__Question__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4531:1: ( ( rule__Question__UnorderedGroup_2__0 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4532:2: ( rule__Question__UnorderedGroup_2__0 )?
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4532:2: ( rule__Question__UnorderedGroup_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 ==KEYWORD_43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 ==KEYWORD_55 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 ==KEYWORD_50 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4532:2: rule__Question__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_2__0_in_rule__Question__UnorderedGroup_210583);
                    rule__Question__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_2"


    // $ANTLR start "rule__Question__UnorderedGroup_2__Impl"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4542:1: rule__Question__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Question__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_2__0 ) ) ) ) ) ;
    public final void rule__Question__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4547:1: ( ( ({...}? => ( ( ( rule__Question__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_2__0 ) ) ) ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4548:3: ( ({...}? => ( ( ( rule__Question__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_2__0 ) ) ) ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4548:3: ( ({...}? => ( ( ( rule__Question__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_2_2__0 ) ) ) ) )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( LA47_0 ==KEYWORD_43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 ==KEYWORD_55 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1) ) {
                alt47=2;
            }
            else if ( LA47_0 ==KEYWORD_50 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2) ) {
                alt47=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4550:4: ({...}? => ( ( ( rule__Question__Group_2_0__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4550:4: ({...}? => ( ( ( rule__Question__Group_2_0__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4551:5: {...}? => ( ( ( rule__Question__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4551:105: ( ( ( rule__Question__Group_2_0__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4552:6: ( ( rule__Question__Group_2_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4558:6: ( ( rule__Question__Group_2_0__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4560:7: ( rule__Question__Group_2_0__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_2_0()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4561:7: ( rule__Question__Group_2_0__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4561:8: rule__Question__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_2_0__0_in_rule__Question__UnorderedGroup_2__Impl10670);
                    rule__Question__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_2_0()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
                    	 				

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4570:4: ({...}? => ( ( ( rule__Question__Group_2_1__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4570:4: ({...}? => ( ( ( rule__Question__Group_2_1__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4571:5: {...}? => ( ( ( rule__Question__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4571:105: ( ( ( rule__Question__Group_2_1__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4572:6: ( ( rule__Question__Group_2_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4578:6: ( ( rule__Question__Group_2_1__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4580:7: ( rule__Question__Group_2_1__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_2_1()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4581:7: ( rule__Question__Group_2_1__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4581:8: rule__Question__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_2_1__0_in_rule__Question__UnorderedGroup_2__Impl10768);
                    rule__Question__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_2_1()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
                    	 				

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4590:4: ({...}? => ( ( ( rule__Question__Group_2_2__0 ) ) ) )
                    {
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4590:4: ({...}? => ( ( ( rule__Question__Group_2_2__0 ) ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4591:5: {...}? => ( ( ( rule__Question__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Question__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2)");
                    }
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4591:105: ( ( ( rule__Question__Group_2_2__0 ) ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4592:6: ( ( rule__Question__Group_2_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4598:6: ( ( rule__Question__Group_2_2__0 ) )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4600:7: ( rule__Question__Group_2_2__0 )
                    {
                     before(grammarAccess.getQuestionAccess().getGroup_2_2()); 
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4601:7: ( rule__Question__Group_2_2__0 )
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4601:8: rule__Question__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__Question__Group_2_2__0_in_rule__Question__UnorderedGroup_2__Impl10866);
                    rule__Question__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionAccess().getGroup_2_2()); 

                    }

                     
                    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
                    	 				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQuestionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Question__UnorderedGroup_2__0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4619:1: rule__Question__UnorderedGroup_2__0 : rule__Question__UnorderedGroup_2__Impl ( rule__Question__UnorderedGroup_2__1 )? ;
    public final void rule__Question__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4623:1: ( rule__Question__UnorderedGroup_2__Impl ( rule__Question__UnorderedGroup_2__1 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4624:2: rule__Question__UnorderedGroup_2__Impl ( rule__Question__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_2__Impl_in_rule__Question__UnorderedGroup_2__010932);
            rule__Question__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4625:2: ( rule__Question__UnorderedGroup_2__1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 ==KEYWORD_43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 ==KEYWORD_55 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 ==KEYWORD_50 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4625:2: rule__Question__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_2__1_in_rule__Question__UnorderedGroup_2__010935);
                    rule__Question__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_2__0"


    // $ANTLR start "rule__Question__UnorderedGroup_2__1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4632:1: rule__Question__UnorderedGroup_2__1 : rule__Question__UnorderedGroup_2__Impl ( rule__Question__UnorderedGroup_2__2 )? ;
    public final void rule__Question__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4636:1: ( rule__Question__UnorderedGroup_2__Impl ( rule__Question__UnorderedGroup_2__2 )? )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4637:2: rule__Question__UnorderedGroup_2__Impl ( rule__Question__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_2__Impl_in_rule__Question__UnorderedGroup_2__110960);
            rule__Question__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4638:2: ( rule__Question__UnorderedGroup_2__2 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 ==KEYWORD_43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 ==KEYWORD_55 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 1) ) {
                alt49=1;
            }
            else if ( LA49_0 ==KEYWORD_50 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_2(), 2) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4638:2: rule__Question__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_rule__Question__UnorderedGroup_2__2_in_rule__Question__UnorderedGroup_2__110963);
                    rule__Question__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_2__1"


    // $ANTLR start "rule__Question__UnorderedGroup_2__2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4645:1: rule__Question__UnorderedGroup_2__2 : rule__Question__UnorderedGroup_2__Impl ;
    public final void rule__Question__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4649:1: ( rule__Question__UnorderedGroup_2__Impl )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4650:2: rule__Question__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_rule__Question__UnorderedGroup_2__Impl_in_rule__Question__UnorderedGroup_2__210988);
            rule__Question__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__UnorderedGroup_2__2"


    // $ANTLR start "rule__Survey__HideNavigationButtonsAssignment_0_0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4663:1: rule__Survey__HideNavigationButtonsAssignment_0_0 : ( ( KEYWORD_60 ) ) ;
    public final void rule__Survey__HideNavigationButtonsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4667:1: ( ( ( KEYWORD_60 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4668:1: ( ( KEYWORD_60 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4668:1: ( ( KEYWORD_60 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4669:1: ( KEYWORD_60 )
            {
             before(grammarAccess.getSurveyAccess().getHideNavigationButtonsHideNavigationButtonsKeyword_0_0_0()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4670:1: ( KEYWORD_60 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4671:1: KEYWORD_60
            {
             before(grammarAccess.getSurveyAccess().getHideNavigationButtonsHideNavigationButtonsKeyword_0_0_0()); 
            match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rule__Survey__HideNavigationButtonsAssignment_0_011027); 
             after(grammarAccess.getSurveyAccess().getHideNavigationButtonsHideNavigationButtonsKeyword_0_0_0()); 

            }

             after(grammarAccess.getSurveyAccess().getHideNavigationButtonsHideNavigationButtonsKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__HideNavigationButtonsAssignment_0_0"


    // $ANTLR start "rule__Survey__HidePageTitlesAssignment_0_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4686:1: rule__Survey__HidePageTitlesAssignment_0_1 : ( ( KEYWORD_49 ) ) ;
    public final void rule__Survey__HidePageTitlesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4690:1: ( ( ( KEYWORD_49 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4691:1: ( ( KEYWORD_49 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4691:1: ( ( KEYWORD_49 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4692:1: ( KEYWORD_49 )
            {
             before(grammarAccess.getSurveyAccess().getHidePageTitlesHidePageTitlesKeyword_0_1_0()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4693:1: ( KEYWORD_49 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4694:1: KEYWORD_49
            {
             before(grammarAccess.getSurveyAccess().getHidePageTitlesHidePageTitlesKeyword_0_1_0()); 
            match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_rule__Survey__HidePageTitlesAssignment_0_111071); 
             after(grammarAccess.getSurveyAccess().getHidePageTitlesHidePageTitlesKeyword_0_1_0()); 

            }

             after(grammarAccess.getSurveyAccess().getHidePageTitlesHidePageTitlesKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__HidePageTitlesAssignment_0_1"


    // $ANTLR start "rule__Survey__HideQuestionNumbersAssignment_0_2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4709:1: rule__Survey__HideQuestionNumbersAssignment_0_2 : ( ( KEYWORD_57 ) ) ;
    public final void rule__Survey__HideQuestionNumbersAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4713:1: ( ( ( KEYWORD_57 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4714:1: ( ( KEYWORD_57 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4714:1: ( ( KEYWORD_57 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4715:1: ( KEYWORD_57 )
            {
             before(grammarAccess.getSurveyAccess().getHideQuestionNumbersHideQuestionNumbersKeyword_0_2_0()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4716:1: ( KEYWORD_57 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4717:1: KEYWORD_57
            {
             before(grammarAccess.getSurveyAccess().getHideQuestionNumbersHideQuestionNumbersKeyword_0_2_0()); 
            match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_rule__Survey__HideQuestionNumbersAssignment_0_211115); 
             after(grammarAccess.getSurveyAccess().getHideQuestionNumbersHideQuestionNumbersKeyword_0_2_0()); 

            }

             after(grammarAccess.getSurveyAccess().getHideQuestionNumbersHideQuestionNumbersKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__HideQuestionNumbersAssignment_0_2"


    // $ANTLR start "rule__Survey__HidePageNumbersAssignment_0_3"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4732:1: rule__Survey__HidePageNumbersAssignment_0_3 : ( ( KEYWORD_54 ) ) ;
    public final void rule__Survey__HidePageNumbersAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4736:1: ( ( ( KEYWORD_54 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4737:1: ( ( KEYWORD_54 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4737:1: ( ( KEYWORD_54 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4738:1: ( KEYWORD_54 )
            {
             before(grammarAccess.getSurveyAccess().getHidePageNumbersHidePageNumbersKeyword_0_3_0()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4739:1: ( KEYWORD_54 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4740:1: KEYWORD_54
            {
             before(grammarAccess.getSurveyAccess().getHidePageNumbersHidePageNumbersKeyword_0_3_0()); 
            match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rule__Survey__HidePageNumbersAssignment_0_311159); 
             after(grammarAccess.getSurveyAccess().getHidePageNumbersHidePageNumbersKeyword_0_3_0()); 

            }

             after(grammarAccess.getSurveyAccess().getHidePageNumbersHidePageNumbersKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__HidePageNumbersAssignment_0_3"


    // $ANTLR start "rule__Survey__AuthorAssignment_0_4_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4755:1: rule__Survey__AuthorAssignment_0_4_1 : ( ruleEString ) ;
    public final void rule__Survey__AuthorAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4759:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4760:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4760:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4761:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getAuthorEStringParserRuleCall_0_4_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Survey__AuthorAssignment_0_4_111198);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getAuthorEStringParserRuleCall_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__AuthorAssignment_0_4_1"


    // $ANTLR start "rule__Survey__AuthorAssignment_0_4_2_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4770:1: rule__Survey__AuthorAssignment_0_4_2_1 : ( ruleEString ) ;
    public final void rule__Survey__AuthorAssignment_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4774:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4775:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4775:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4776:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getAuthorEStringParserRuleCall_0_4_2_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Survey__AuthorAssignment_0_4_2_111229);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getAuthorEStringParserRuleCall_0_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__AuthorAssignment_0_4_2_1"


    // $ANTLR start "rule__Survey__TitleAssignment_0_5_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4785:1: rule__Survey__TitleAssignment_0_5_1 : ( ruleEString ) ;
    public final void rule__Survey__TitleAssignment_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4789:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4790:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4790:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4791:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_0_5_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_0_5_111260);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__TitleAssignment_0_5_1"


    // $ANTLR start "rule__Survey__TimeLimitAssignment_0_6_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4800:1: rule__Survey__TimeLimitAssignment_0_6_1 : ( ruleEInt ) ;
    public final void rule__Survey__TimeLimitAssignment_0_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4804:1: ( ( ruleEInt ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4805:1: ( ruleEInt )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4805:1: ( ruleEInt )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4806:1: ruleEInt
            {
             before(grammarAccess.getSurveyAccess().getTimeLimitEIntParserRuleCall_0_6_1_0()); 
            pushFollow(FOLLOW_ruleEInt_in_rule__Survey__TimeLimitAssignment_0_6_111291);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getTimeLimitEIntParserRuleCall_0_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__TimeLimitAssignment_0_6_1"


    // $ANTLR start "rule__Survey__CompletedMessageAssignment_0_7_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4815:1: rule__Survey__CompletedMessageAssignment_0_7_1 : ( ruleEString ) ;
    public final void rule__Survey__CompletedMessageAssignment_0_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4819:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4820:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4820:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4821:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getCompletedMessageEStringParserRuleCall_0_7_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Survey__CompletedMessageAssignment_0_7_111322);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getCompletedMessageEStringParserRuleCall_0_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__CompletedMessageAssignment_0_7_1"


    // $ANTLR start "rule__Survey__PageNextTextAssignment_0_8_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4830:1: rule__Survey__PageNextTextAssignment_0_8_1 : ( ruleEString ) ;
    public final void rule__Survey__PageNextTextAssignment_0_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4834:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4835:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4835:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4836:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getPageNextTextEStringParserRuleCall_0_8_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Survey__PageNextTextAssignment_0_8_111353);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPageNextTextEStringParserRuleCall_0_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PageNextTextAssignment_0_8_1"


    // $ANTLR start "rule__Survey__PagePrevTextAssignment_0_9_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4845:1: rule__Survey__PagePrevTextAssignment_0_9_1 : ( ruleEString ) ;
    public final void rule__Survey__PagePrevTextAssignment_0_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4849:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4850:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4850:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4851:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getPagePrevTextEStringParserRuleCall_0_9_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Survey__PagePrevTextAssignment_0_9_111384);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagePrevTextEStringParserRuleCall_0_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PagePrevTextAssignment_0_9_1"


    // $ANTLR start "rule__Survey__CompleteTextAssignment_0_10_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4860:1: rule__Survey__CompleteTextAssignment_0_10_1 : ( ruleEString ) ;
    public final void rule__Survey__CompleteTextAssignment_0_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4864:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4865:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4865:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4866:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getCompleteTextEStringParserRuleCall_0_10_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Survey__CompleteTextAssignment_0_10_111415);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getCompleteTextEStringParserRuleCall_0_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__CompleteTextAssignment_0_10_1"


    // $ANTLR start "rule__Survey__QuestionTitleLocationAssignment_0_11_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4875:1: rule__Survey__QuestionTitleLocationAssignment_0_11_1 : ( ruleTitleLocation ) ;
    public final void rule__Survey__QuestionTitleLocationAssignment_0_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4879:1: ( ( ruleTitleLocation ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4880:1: ( ruleTitleLocation )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4880:1: ( ruleTitleLocation )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4881:1: ruleTitleLocation
            {
             before(grammarAccess.getSurveyAccess().getQuestionTitleLocationTitleLocationEnumRuleCall_0_11_1_0()); 
            pushFollow(FOLLOW_ruleTitleLocation_in_rule__Survey__QuestionTitleLocationAssignment_0_11_111446);
            ruleTitleLocation();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getQuestionTitleLocationTitleLocationEnumRuleCall_0_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__QuestionTitleLocationAssignment_0_11_1"


    // $ANTLR start "rule__Survey__ShowProgressBarAssignment_0_12_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4890:1: rule__Survey__ShowProgressBarAssignment_0_12_1 : ( ruleProgressBarLocation ) ;
    public final void rule__Survey__ShowProgressBarAssignment_0_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4894:1: ( ( ruleProgressBarLocation ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4895:1: ( ruleProgressBarLocation )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4895:1: ( ruleProgressBarLocation )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4896:1: ruleProgressBarLocation
            {
             before(grammarAccess.getSurveyAccess().getShowProgressBarProgressBarLocationEnumRuleCall_0_12_1_0()); 
            pushFollow(FOLLOW_ruleProgressBarLocation_in_rule__Survey__ShowProgressBarAssignment_0_12_111477);
            ruleProgressBarLocation();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getShowProgressBarProgressBarLocationEnumRuleCall_0_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__ShowProgressBarAssignment_0_12_1"


    // $ANTLR start "rule__Survey__PagesAssignment_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4905:1: rule__Survey__PagesAssignment_1 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4909:1: ( ( rulePage ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4910:1: ( rulePage )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4910:1: ( rulePage )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4911:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_111508);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PagesAssignment_1"


    // $ANTLR start "rule__Survey__PagesAssignment_2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4920:1: rule__Survey__PagesAssignment_2 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4924:1: ( ( rulePage ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4925:1: ( rulePage )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4925:1: ( rulePage )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4926:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePage_in_rule__Survey__PagesAssignment_211539);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PagesAssignment_2"


    // $ANTLR start "rule__Page__TitleAssignment_1_0_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4935:1: rule__Page__TitleAssignment_1_0_1 : ( ruleEString ) ;
    public final void rule__Page__TitleAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4939:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4940:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4940:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4941:1: ruleEString
            {
             before(grammarAccess.getPageAccess().getTitleEStringParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Page__TitleAssignment_1_0_111570);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getTitleEStringParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TitleAssignment_1_0_1"


    // $ANTLR start "rule__Page__VisibleIfAssignment_1_1_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4950:1: rule__Page__VisibleIfAssignment_1_1_1 : ( ruleEString ) ;
    public final void rule__Page__VisibleIfAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4954:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4955:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4955:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4956:1: ruleEString
            {
             before(grammarAccess.getPageAccess().getVisibleIfEStringParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Page__VisibleIfAssignment_1_1_111601);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getVisibleIfEStringParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__VisibleIfAssignment_1_1_1"


    // $ANTLR start "rule__Page__QuestionsAssignment_2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4965:1: rule__Page__QuestionsAssignment_2 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4969:1: ( ( ruleQuestion ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4970:1: ( ruleQuestion )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4970:1: ( ruleQuestion )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4971:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_211632);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__QuestionsAssignment_2"


    // $ANTLR start "rule__Page__QuestionsAssignment_3"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4980:1: rule__Page__QuestionsAssignment_3 : ( ruleQuestion ) ;
    public final void rule__Page__QuestionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4984:1: ( ( ruleQuestion ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4985:1: ( ruleQuestion )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4985:1: ( ruleQuestion )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4986:1: ruleQuestion
            {
             before(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_311663);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPageAccess().getQuestionsQuestionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__QuestionsAssignment_3"


    // $ANTLR start "rule__Question__IsRequiredAssignment_1_0"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4995:1: rule__Question__IsRequiredAssignment_1_0 : ( ( KEYWORD_35 ) ) ;
    public final void rule__Question__IsRequiredAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:4999:1: ( ( ( KEYWORD_35 ) ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5000:1: ( ( KEYWORD_35 ) )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5000:1: ( ( KEYWORD_35 ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5001:1: ( KEYWORD_35 )
            {
             before(grammarAccess.getQuestionAccess().getIsRequiredRequiredKeyword_1_0_0()); 
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5002:1: ( KEYWORD_35 )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5003:1: KEYWORD_35
            {
             before(grammarAccess.getQuestionAccess().getIsRequiredRequiredKeyword_1_0_0()); 
            match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__Question__IsRequiredAssignment_1_011699); 
             after(grammarAccess.getQuestionAccess().getIsRequiredRequiredKeyword_1_0_0()); 

            }

             after(grammarAccess.getQuestionAccess().getIsRequiredRequiredKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__IsRequiredAssignment_1_0"


    // $ANTLR start "rule__Question__TypeAssignment_1_1_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5018:1: rule__Question__TypeAssignment_1_1_1 : ( ruleQuestionType ) ;
    public final void rule__Question__TypeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5022:1: ( ( ruleQuestionType ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5023:1: ( ruleQuestionType )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5023:1: ( ruleQuestionType )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5024:1: ruleQuestionType
            {
             before(grammarAccess.getQuestionAccess().getTypeQuestionTypeEnumRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleQuestionType_in_rule__Question__TypeAssignment_1_1_111738);
            ruleQuestionType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTypeQuestionTypeEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TypeAssignment_1_1_1"


    // $ANTLR start "rule__Question__TitleAssignment_1_2_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5033:1: rule__Question__TitleAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Question__TitleAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5037:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5038:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5038:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5039:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getTitleEStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__TitleAssignment_1_2_111769);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTitleEStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TitleAssignment_1_2_1"


    // $ANTLR start "rule__Question__RangeStartAssignment_1_3_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5048:1: rule__Question__RangeStartAssignment_1_3_1 : ( ruleEInt ) ;
    public final void rule__Question__RangeStartAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5052:1: ( ( ruleEInt ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5053:1: ( ruleEInt )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5053:1: ( ruleEInt )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5054:1: ruleEInt
            {
             before(grammarAccess.getQuestionAccess().getRangeStartEIntParserRuleCall_1_3_1_0()); 
            pushFollow(FOLLOW_ruleEInt_in_rule__Question__RangeStartAssignment_1_3_111800);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getRangeStartEIntParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__RangeStartAssignment_1_3_1"


    // $ANTLR start "rule__Question__RangeEndAssignment_1_4_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5063:1: rule__Question__RangeEndAssignment_1_4_1 : ( ruleEInt ) ;
    public final void rule__Question__RangeEndAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5067:1: ( ( ruleEInt ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5068:1: ( ruleEInt )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5068:1: ( ruleEInt )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5069:1: ruleEInt
            {
             before(grammarAccess.getQuestionAccess().getRangeEndEIntParserRuleCall_1_4_1_0()); 
            pushFollow(FOLLOW_ruleEInt_in_rule__Question__RangeEndAssignment_1_4_111831);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getRangeEndEIntParserRuleCall_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__RangeEndAssignment_1_4_1"


    // $ANTLR start "rule__Question__InputTypeAssignment_1_5_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5078:1: rule__Question__InputTypeAssignment_1_5_1 : ( ruleTextInputType ) ;
    public final void rule__Question__InputTypeAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5082:1: ( ( ruleTextInputType ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5083:1: ( ruleTextInputType )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5083:1: ( ruleTextInputType )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5084:1: ruleTextInputType
            {
             before(grammarAccess.getQuestionAccess().getInputTypeTextInputTypeEnumRuleCall_1_5_1_0()); 
            pushFollow(FOLLOW_ruleTextInputType_in_rule__Question__InputTypeAssignment_1_5_111862);
            ruleTextInputType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getInputTypeTextInputTypeEnumRuleCall_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__InputTypeAssignment_1_5_1"


    // $ANTLR start "rule__Question__VisibleIfAssignment_1_6_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5093:1: rule__Question__VisibleIfAssignment_1_6_1 : ( ruleEString ) ;
    public final void rule__Question__VisibleIfAssignment_1_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5097:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5098:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5098:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5099:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getVisibleIfEStringParserRuleCall_1_6_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__VisibleIfAssignment_1_6_111893);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getVisibleIfEStringParserRuleCall_1_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__VisibleIfAssignment_1_6_1"


    // $ANTLR start "rule__Question__PlaceholderAssignment_1_7_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5108:1: rule__Question__PlaceholderAssignment_1_7_1 : ( ruleEString ) ;
    public final void rule__Question__PlaceholderAssignment_1_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5112:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5113:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5113:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5114:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getPlaceholderEStringParserRuleCall_1_7_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__PlaceholderAssignment_1_7_111924);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getPlaceholderEStringParserRuleCall_1_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__PlaceholderAssignment_1_7_1"


    // $ANTLR start "rule__Question__ChoicesAssignment_1_8_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5123:1: rule__Question__ChoicesAssignment_1_8_1 : ( ruleEString ) ;
    public final void rule__Question__ChoicesAssignment_1_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5127:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5128:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5128:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5129:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getChoicesEStringParserRuleCall_1_8_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__ChoicesAssignment_1_8_111955);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getChoicesEStringParserRuleCall_1_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ChoicesAssignment_1_8_1"


    // $ANTLR start "rule__Question__ChoicesAssignment_1_8_2_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5138:1: rule__Question__ChoicesAssignment_1_8_2_1 : ( ruleEString ) ;
    public final void rule__Question__ChoicesAssignment_1_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5142:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5143:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5143:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5144:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getChoicesEStringParserRuleCall_1_8_2_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__ChoicesAssignment_1_8_2_111986);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getChoicesEStringParserRuleCall_1_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ChoicesAssignment_1_8_2_1"


    // $ANTLR start "rule__Question__ColCountAssignment_1_9_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5153:1: rule__Question__ColCountAssignment_1_9_1 : ( ruleEInt ) ;
    public final void rule__Question__ColCountAssignment_1_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5157:1: ( ( ruleEInt ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5158:1: ( ruleEInt )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5158:1: ( ruleEInt )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5159:1: ruleEInt
            {
             before(grammarAccess.getQuestionAccess().getColCountEIntParserRuleCall_1_9_1_0()); 
            pushFollow(FOLLOW_ruleEInt_in_rule__Question__ColCountAssignment_1_9_112017);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getColCountEIntParserRuleCall_1_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ColCountAssignment_1_9_1"


    // $ANTLR start "rule__Question__QuestionNameAssignment_1_10_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5168:1: rule__Question__QuestionNameAssignment_1_10_1 : ( ruleEString ) ;
    public final void rule__Question__QuestionNameAssignment_1_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5172:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5173:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5173:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5174:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getQuestionNameEStringParserRuleCall_1_10_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__QuestionNameAssignment_1_10_112048);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionNameEStringParserRuleCall_1_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionNameAssignment_1_10_1"


    // $ANTLR start "rule__Question__RowsAssignment_1_11_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5183:1: rule__Question__RowsAssignment_1_11_1 : ( ruleEInt ) ;
    public final void rule__Question__RowsAssignment_1_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5187:1: ( ( ruleEInt ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5188:1: ( ruleEInt )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5188:1: ( ruleEInt )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5189:1: ruleEInt
            {
             before(grammarAccess.getQuestionAccess().getRowsEIntParserRuleCall_1_11_1_0()); 
            pushFollow(FOLLOW_ruleEInt_in_rule__Question__RowsAssignment_1_11_112079);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getRowsEIntParserRuleCall_1_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__RowsAssignment_1_11_1"


    // $ANTLR start "rule__Question__MininumRateDescriptionAssignment_1_12_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5198:1: rule__Question__MininumRateDescriptionAssignment_1_12_1 : ( ruleEString ) ;
    public final void rule__Question__MininumRateDescriptionAssignment_1_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5202:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5203:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5203:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5204:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getMininumRateDescriptionEStringParserRuleCall_1_12_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__MininumRateDescriptionAssignment_1_12_112110);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMininumRateDescriptionEStringParserRuleCall_1_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MininumRateDescriptionAssignment_1_12_1"


    // $ANTLR start "rule__Question__MaximumRateDescriptionAssignment_1_13_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5213:1: rule__Question__MaximumRateDescriptionAssignment_1_13_1 : ( ruleEString ) ;
    public final void rule__Question__MaximumRateDescriptionAssignment_1_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5217:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5218:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5218:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5219:1: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getMaximumRateDescriptionEStringParserRuleCall_1_13_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Question__MaximumRateDescriptionAssignment_1_13_112141);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMaximumRateDescriptionEStringParserRuleCall_1_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MaximumRateDescriptionAssignment_1_13_1"


    // $ANTLR start "rule__Question__MatrixRowsAssignment_2_0_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5228:1: rule__Question__MatrixRowsAssignment_2_0_1 : ( ruleTextValue ) ;
    public final void rule__Question__MatrixRowsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5232:1: ( ( ruleTextValue ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5233:1: ( ruleTextValue )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5233:1: ( ruleTextValue )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5234:1: ruleTextValue
            {
             before(grammarAccess.getQuestionAccess().getMatrixRowsTextValueParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleTextValue_in_rule__Question__MatrixRowsAssignment_2_0_112172);
            ruleTextValue();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMatrixRowsTextValueParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MatrixRowsAssignment_2_0_1"


    // $ANTLR start "rule__Question__MatrixRowsAssignment_2_0_2_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5243:1: rule__Question__MatrixRowsAssignment_2_0_2_1 : ( ruleTextValue ) ;
    public final void rule__Question__MatrixRowsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5247:1: ( ( ruleTextValue ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5248:1: ( ruleTextValue )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5248:1: ( ruleTextValue )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5249:1: ruleTextValue
            {
             before(grammarAccess.getQuestionAccess().getMatrixRowsTextValueParserRuleCall_2_0_2_1_0()); 
            pushFollow(FOLLOW_ruleTextValue_in_rule__Question__MatrixRowsAssignment_2_0_2_112203);
            ruleTextValue();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMatrixRowsTextValueParserRuleCall_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MatrixRowsAssignment_2_0_2_1"


    // $ANTLR start "rule__Question__MultiTextItemsAssignment_2_1_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5258:1: rule__Question__MultiTextItemsAssignment_2_1_1 : ( ruleMultiTextItem ) ;
    public final void rule__Question__MultiTextItemsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5262:1: ( ( ruleMultiTextItem ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5263:1: ( ruleMultiTextItem )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5263:1: ( ruleMultiTextItem )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5264:1: ruleMultiTextItem
            {
             before(grammarAccess.getQuestionAccess().getMultiTextItemsMultiTextItemParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiTextItem_in_rule__Question__MultiTextItemsAssignment_2_1_112234);
            ruleMultiTextItem();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMultiTextItemsMultiTextItemParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MultiTextItemsAssignment_2_1_1"


    // $ANTLR start "rule__Question__MultiTextItemsAssignment_2_1_2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5273:1: rule__Question__MultiTextItemsAssignment_2_1_2 : ( ruleMultiTextItem ) ;
    public final void rule__Question__MultiTextItemsAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5277:1: ( ( ruleMultiTextItem ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5278:1: ( ruleMultiTextItem )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5278:1: ( ruleMultiTextItem )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5279:1: ruleMultiTextItem
            {
             before(grammarAccess.getQuestionAccess().getMultiTextItemsMultiTextItemParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_ruleMultiTextItem_in_rule__Question__MultiTextItemsAssignment_2_1_212265);
            ruleMultiTextItem();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMultiTextItemsMultiTextItemParserRuleCall_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MultiTextItemsAssignment_2_1_2"


    // $ANTLR start "rule__Question__MatrixColumnsAssignment_2_2_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5288:1: rule__Question__MatrixColumnsAssignment_2_2_1 : ( ruleTextValue ) ;
    public final void rule__Question__MatrixColumnsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5292:1: ( ( ruleTextValue ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5293:1: ( ruleTextValue )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5293:1: ( ruleTextValue )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5294:1: ruleTextValue
            {
             before(grammarAccess.getQuestionAccess().getMatrixColumnsTextValueParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleTextValue_in_rule__Question__MatrixColumnsAssignment_2_2_112296);
            ruleTextValue();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMatrixColumnsTextValueParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MatrixColumnsAssignment_2_2_1"


    // $ANTLR start "rule__Question__MatrixColumnsAssignment_2_2_2_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5303:1: rule__Question__MatrixColumnsAssignment_2_2_2_1 : ( ruleTextValue ) ;
    public final void rule__Question__MatrixColumnsAssignment_2_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5307:1: ( ( ruleTextValue ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5308:1: ( ruleTextValue )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5308:1: ( ruleTextValue )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5309:1: ruleTextValue
            {
             before(grammarAccess.getQuestionAccess().getMatrixColumnsTextValueParserRuleCall_2_2_2_1_0()); 
            pushFollow(FOLLOW_ruleTextValue_in_rule__Question__MatrixColumnsAssignment_2_2_2_112327);
            ruleTextValue();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getMatrixColumnsTextValueParserRuleCall_2_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__MatrixColumnsAssignment_2_2_2_1"


    // $ANTLR start "rule__TextValue__TextAssignment_2"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5318:1: rule__TextValue__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__TextValue__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5322:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5323:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5323:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5324:1: ruleEString
            {
             before(grammarAccess.getTextValueAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TextValue__TextAssignment_212358);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextValueAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__TextAssignment_2"


    // $ANTLR start "rule__TextValue__ValueAssignment_3_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5333:1: rule__TextValue__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TextValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5337:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5338:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5338:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5339:1: ruleEString
            {
             before(grammarAccess.getTextValueAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TextValue__ValueAssignment_3_112389);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextValueAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextValue__ValueAssignment_3_1"


    // $ANTLR start "rule__MultiTextItem__TitleAssignment_1"
    // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5348:1: rule__MultiTextItem__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__MultiTextItem__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5352:1: ( ( ruleEString ) )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5353:1: ( ruleEString )
            {
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5353:1: ( ruleEString )
            // ../xtext.queryIT.ui/src-gen/xtext/ui/contentassist/antlr/internal/InternalQueryITParser.g:5354:1: ruleEString
            {
             before(grammarAccess.getMultiTextItemAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__MultiTextItem__TitleAssignment_112420);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiTextItemAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiTextItem__TitleAssignment_1"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA15_eotS =
        "\17\uffff";
    static final String DFA15_eofS =
        "\17\uffff";
    static final String DFA15_minS =
        "\1\4\16\uffff";
    static final String DFA15_maxS =
        "\1\65\16\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA15_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "3420:2: ( rule__Survey__UnorderedGroup_0__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                         
                        int index15_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA15_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA15_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA15_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA15_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA15_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA15_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA15_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA15_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA15_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA15_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA15_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA15_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA15_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA15_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index15_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\16\uffff";
    static final String DFA16_eofS =
        "\16\uffff";
    static final String DFA16_minS =
        "\1\4\15\uffff";
    static final String DFA16_maxS =
        "\1\54\15\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA16_specialS =
        "\1\0\15\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "3436:3: ( ({...}? => ( ( ( rule__Survey__HideNavigationButtonsAssignment_0_0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageTitlesAssignment_0_1 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HideQuestionNumbersAssignment_0_2 ) ) ) ) | ({...}? => ( ( ( rule__Survey__HidePageNumbersAssignment_0_3 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Survey__Group_0_12__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA16_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA16_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA16_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA16_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA16_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA16_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA16_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA16_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA16_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA16_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA16_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA16_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA16_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\17\uffff";
    static final String DFA17_eofS =
        "\17\uffff";
    static final String DFA17_minS =
        "\1\4\16\uffff";
    static final String DFA17_maxS =
        "\1\65\16\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA17_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "3713:2: ( rule__Survey__UnorderedGroup_0__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_0 = input.LA(1);

                         
                        int index17_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA17_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA17_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA17_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA17_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA17_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA17_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA17_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA17_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA17_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA17_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA17_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA17_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA17_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA17_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index17_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\17\uffff";
    static final String DFA18_eofS =
        "\17\uffff";
    static final String DFA18_minS =
        "\1\4\16\uffff";
    static final String DFA18_maxS =
        "\1\65\16\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA18_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "3726:2: ( rule__Survey__UnorderedGroup_0__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA18_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA18_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA18_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA18_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA18_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA18_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA18_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA18_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA18_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA18_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA18_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA18_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA18_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA18_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\17\uffff";
    static final String DFA19_eofS =
        "\17\uffff";
    static final String DFA19_minS =
        "\1\4\16\uffff";
    static final String DFA19_maxS =
        "\1\65\16\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA19_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "3739:2: ( rule__Survey__UnorderedGroup_0__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                         
                        int index19_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA19_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA19_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA19_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA19_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA19_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA19_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA19_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA19_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA19_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA19_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA19_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA19_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA19_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA19_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index19_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\17\uffff";
    static final String DFA20_eofS =
        "\17\uffff";
    static final String DFA20_minS =
        "\1\4\16\uffff";
    static final String DFA20_maxS =
        "\1\65\16\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA20_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "3752:2: ( rule__Survey__UnorderedGroup_0__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA20_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA20_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA20_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA20_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA20_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA20_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA20_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA20_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA20_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA20_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA20_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA20_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA20_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA21_eotS =
        "\17\uffff";
    static final String DFA21_eofS =
        "\17\uffff";
    static final String DFA21_minS =
        "\1\4\16\uffff";
    static final String DFA21_maxS =
        "\1\65\16\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA21_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "3765:2: ( rule__Survey__UnorderedGroup_0__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA21_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA21_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA21_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA21_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA21_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA21_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA21_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA21_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA21_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA21_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA21_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA21_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA21_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA21_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\17\uffff";
    static final String DFA22_eofS =
        "\17\uffff";
    static final String DFA22_minS =
        "\1\4\16\uffff";
    static final String DFA22_maxS =
        "\1\65\16\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA22_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "3778:2: ( rule__Survey__UnorderedGroup_0__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA22_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA22_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA22_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA22_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA22_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA22_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA22_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA22_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA22_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA22_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA22_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA22_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA22_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA22_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\17\uffff";
    static final String DFA23_minS =
        "\1\4\16\uffff";
    static final String DFA23_maxS =
        "\1\65\16\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA23_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "3791:2: ( rule__Survey__UnorderedGroup_0__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA23_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA23_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA23_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA23_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA23_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA23_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA23_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA23_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA23_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA23_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA23_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA23_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA23_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA23_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\17\uffff";
    static final String DFA24_eofS =
        "\17\uffff";
    static final String DFA24_minS =
        "\1\4\16\uffff";
    static final String DFA24_maxS =
        "\1\65\16\uffff";
    static final String DFA24_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA24_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "3804:2: ( rule__Survey__UnorderedGroup_0__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA24_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA24_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA24_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA24_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA24_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA24_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA24_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA24_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA24_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA24_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA24_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA24_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA24_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA24_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\17\uffff";
    static final String DFA25_eofS =
        "\17\uffff";
    static final String DFA25_minS =
        "\1\4\16\uffff";
    static final String DFA25_maxS =
        "\1\65\16\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA25_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "3817:2: ( rule__Survey__UnorderedGroup_0__9 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA25_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA25_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA25_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA25_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA25_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA25_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA25_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA25_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA25_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA25_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA25_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA25_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA25_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\17\uffff";
    static final String DFA26_eofS =
        "\17\uffff";
    static final String DFA26_minS =
        "\1\4\16\uffff";
    static final String DFA26_maxS =
        "\1\65\16\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA26_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "3830:2: ( rule__Survey__UnorderedGroup_0__10 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA26_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA26_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA26_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA26_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA26_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA26_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA26_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA26_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA26_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA26_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA26_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA26_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA26_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA26_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\17\uffff";
    static final String DFA27_eofS =
        "\17\uffff";
    static final String DFA27_minS =
        "\1\4\16\uffff";
    static final String DFA27_maxS =
        "\1\65\16\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA27_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "3843:2: ( rule__Survey__UnorderedGroup_0__11 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA27_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA27_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA27_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA27_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA27_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA27_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA27_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA27_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA27_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA27_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA27_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA27_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA27_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA27_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\17\uffff";
    static final String DFA28_eofS =
        "\17\uffff";
    static final String DFA28_minS =
        "\1\4\16\uffff";
    static final String DFA28_maxS =
        "\1\65\16\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\15\1\1\2";
    static final String DFA28_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\14\1\1\2\uffff\1\13\1\15\1\3\1\10\1\11\1\12\1\4\1\uffff"+
            "\1\2\10\uffff\1\5\1\uffff\1\7\20\uffff\1\6\10\uffff\1\16",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "3856:2: ( rule__Survey__UnorderedGroup_0__12 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA28_0 ==KEYWORD_60 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 0) ) {s = 1;}

                        else if ( LA28_0 ==KEYWORD_49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 1) ) {s = 2;}

                        else if ( LA28_0 ==KEYWORD_57 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 2) ) {s = 3;}

                        else if ( LA28_0 ==KEYWORD_54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 3) ) {s = 4;}

                        else if ( LA28_0 ==KEYWORD_39 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 4) ) {s = 5;}

                        else if ( LA28_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 5) ) {s = 6;}

                        else if ( LA28_0 ==KEYWORD_41 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 6) ) {s = 7;}

                        else if ( LA28_0 ==KEYWORD_56 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 7) ) {s = 8;}

                        else if ( LA28_0 ==KEYWORD_52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 8) ) {s = 9;}

                        else if ( LA28_0 ==KEYWORD_53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 9) ) {s = 10;}

                        else if ( LA28_0 ==KEYWORD_58 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 10) ) {s = 11;}

                        else if ( LA28_0 ==KEYWORD_63 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 11) ) {s = 12;}

                        else if ( LA28_0 ==KEYWORD_59 && getUnorderedGroupHelper().canSelect(grammarAccess.getSurveyAccess().getUnorderedGroup_0(), 12) ) {s = 13;}

                        else if ( (LA28_0==KEYWORD_9) ) {s = 14;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\17\uffff";
    static final String DFA32_eofS =
        "\17\uffff";
    static final String DFA32_minS =
        "\1\6\16\uffff";
    static final String DFA32_maxS =
        "\1\64\16\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16";
    static final String DFA32_specialS =
        "\1\0\16\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\16\1\15\12\uffff\1\6\1\13\1\14\1\uffff\1\10\1\uffff\1\4"+
            "\3\uffff\1\7\1\12\1\5\3\uffff\1\11\3\uffff\1\1\5\uffff\1\3\7"+
            "\uffff\1\2",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "4026:3: ( ({...}? => ( ( ( rule__Question__IsRequiredAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_10__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_11__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_12__0 ) ) ) ) | ({...}? => ( ( ( rule__Question__Group_1_13__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA32_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA32_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA32_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA32_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA32_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA32_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA32_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA32_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA32_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA32_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA32_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA32_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA32_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA32_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\20\uffff";
    static final String DFA33_eofS =
        "\1\17\17\uffff";
    static final String DFA33_minS =
        "\1\6\17\uffff";
    static final String DFA33_maxS =
        "\1\65\17\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA33_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "4323:2: ( rule__Question__UnorderedGroup_1__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_0 = input.LA(1);

                         
                        int index33_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA33_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA33_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA33_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA33_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA33_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA33_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA33_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA33_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA33_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA33_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA33_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA33_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA33_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA33_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA33_0==EOF||LA33_0==KEYWORD_55||LA33_0==KEYWORD_50||LA33_0==KEYWORD_43||LA33_0==KEYWORD_29||LA33_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index33_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\20\uffff";
    static final String DFA34_eofS =
        "\1\17\17\uffff";
    static final String DFA34_minS =
        "\1\6\17\uffff";
    static final String DFA34_maxS =
        "\1\65\17\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA34_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "4336:2: ( rule__Question__UnorderedGroup_1__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA34_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA34_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA34_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA34_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA34_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA34_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA34_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA34_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA34_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA34_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA34_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA34_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA34_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA34_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA34_0==EOF||LA34_0==KEYWORD_55||LA34_0==KEYWORD_50||LA34_0==KEYWORD_43||LA34_0==KEYWORD_29||LA34_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\20\uffff";
    static final String DFA35_eofS =
        "\1\17\17\uffff";
    static final String DFA35_minS =
        "\1\6\17\uffff";
    static final String DFA35_maxS =
        "\1\65\17\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA35_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "4349:2: ( rule__Question__UnorderedGroup_1__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_0 = input.LA(1);

                         
                        int index35_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA35_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA35_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA35_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA35_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA35_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA35_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA35_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA35_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA35_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA35_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA35_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA35_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA35_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA35_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA35_0==EOF||LA35_0==KEYWORD_55||LA35_0==KEYWORD_50||LA35_0==KEYWORD_43||LA35_0==KEYWORD_29||LA35_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index35_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\20\uffff";
    static final String DFA36_eofS =
        "\1\17\17\uffff";
    static final String DFA36_minS =
        "\1\6\17\uffff";
    static final String DFA36_maxS =
        "\1\65\17\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA36_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "4362:2: ( rule__Question__UnorderedGroup_1__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA36_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA36_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA36_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA36_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA36_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA36_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA36_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA36_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA36_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA36_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA36_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA36_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA36_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA36_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA36_0==EOF||LA36_0==KEYWORD_55||LA36_0==KEYWORD_50||LA36_0==KEYWORD_43||LA36_0==KEYWORD_29||LA36_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\20\uffff";
    static final String DFA37_eofS =
        "\1\17\17\uffff";
    static final String DFA37_minS =
        "\1\6\17\uffff";
    static final String DFA37_maxS =
        "\1\65\17\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA37_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "4375:2: ( rule__Question__UnorderedGroup_1__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA37_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA37_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA37_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA37_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA37_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA37_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA37_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA37_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA37_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA37_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA37_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA37_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA37_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA37_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA37_0==EOF||LA37_0==KEYWORD_55||LA37_0==KEYWORD_50||LA37_0==KEYWORD_43||LA37_0==KEYWORD_29||LA37_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\20\uffff";
    static final String DFA38_eofS =
        "\1\17\17\uffff";
    static final String DFA38_minS =
        "\1\6\17\uffff";
    static final String DFA38_maxS =
        "\1\65\17\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA38_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "4388:2: ( rule__Question__UnorderedGroup_1__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_0 = input.LA(1);

                         
                        int index38_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA38_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA38_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA38_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA38_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA38_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA38_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA38_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA38_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA38_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA38_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA38_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA38_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA38_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA38_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA38_0==EOF||LA38_0==KEYWORD_55||LA38_0==KEYWORD_50||LA38_0==KEYWORD_43||LA38_0==KEYWORD_29||LA38_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index38_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\20\uffff";
    static final String DFA39_eofS =
        "\1\17\17\uffff";
    static final String DFA39_minS =
        "\1\6\17\uffff";
    static final String DFA39_maxS =
        "\1\65\17\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA39_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "4401:2: ( rule__Question__UnorderedGroup_1__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA39_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA39_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA39_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA39_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA39_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA39_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA39_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA39_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA39_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA39_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA39_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA39_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA39_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA39_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA39_0==EOF||LA39_0==KEYWORD_55||LA39_0==KEYWORD_50||LA39_0==KEYWORD_43||LA39_0==KEYWORD_29||LA39_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\20\uffff";
    static final String DFA40_eofS =
        "\1\17\17\uffff";
    static final String DFA40_minS =
        "\1\6\17\uffff";
    static final String DFA40_maxS =
        "\1\65\17\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA40_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "4414:2: ( rule__Question__UnorderedGroup_1__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA40_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA40_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA40_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA40_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA40_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA40_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA40_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA40_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA40_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA40_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA40_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA40_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA40_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA40_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA40_0==EOF||LA40_0==KEYWORD_55||LA40_0==KEYWORD_50||LA40_0==KEYWORD_43||LA40_0==KEYWORD_29||LA40_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\20\uffff";
    static final String DFA41_eofS =
        "\1\17\17\uffff";
    static final String DFA41_minS =
        "\1\6\17\uffff";
    static final String DFA41_maxS =
        "\1\65\17\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA41_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "4427:2: ( rule__Question__UnorderedGroup_1__9 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA41_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA41_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA41_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA41_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA41_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA41_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA41_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA41_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA41_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA41_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA41_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA41_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA41_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA41_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA41_0==EOF||LA41_0==KEYWORD_55||LA41_0==KEYWORD_50||LA41_0==KEYWORD_43||LA41_0==KEYWORD_29||LA41_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\20\uffff";
    static final String DFA42_eofS =
        "\1\17\17\uffff";
    static final String DFA42_minS =
        "\1\6\17\uffff";
    static final String DFA42_maxS =
        "\1\65\17\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA42_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "4440:2: ( rule__Question__UnorderedGroup_1__10 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA42_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA42_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA42_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA42_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA42_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA42_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA42_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA42_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA42_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA42_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA42_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA42_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA42_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA42_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA42_0==EOF||LA42_0==KEYWORD_55||LA42_0==KEYWORD_50||LA42_0==KEYWORD_43||LA42_0==KEYWORD_29||LA42_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\20\uffff";
    static final String DFA43_eofS =
        "\1\17\17\uffff";
    static final String DFA43_minS =
        "\1\6\17\uffff";
    static final String DFA43_maxS =
        "\1\65\17\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA43_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "4453:2: ( rule__Question__UnorderedGroup_1__11 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA43_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA43_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA43_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA43_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA43_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA43_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA43_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA43_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA43_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA43_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA43_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA43_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA43_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA43_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA43_0==EOF||LA43_0==KEYWORD_55||LA43_0==KEYWORD_50||LA43_0==KEYWORD_43||LA43_0==KEYWORD_29||LA43_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\20\uffff";
    static final String DFA44_eofS =
        "\1\17\17\uffff";
    static final String DFA44_minS =
        "\1\6\17\uffff";
    static final String DFA44_maxS =
        "\1\65\17\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA44_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "4466:2: ( rule__Question__UnorderedGroup_1__12 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA44_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA44_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA44_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA44_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA44_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA44_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA44_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA44_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA44_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA44_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA44_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA44_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA44_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA44_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA44_0==EOF||LA44_0==KEYWORD_55||LA44_0==KEYWORD_50||LA44_0==KEYWORD_43||LA44_0==KEYWORD_29||LA44_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\20\uffff";
    static final String DFA45_eofS =
        "\1\17\17\uffff";
    static final String DFA45_minS =
        "\1\6\17\uffff";
    static final String DFA45_maxS =
        "\1\65\17\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\16\1\1\2";
    static final String DFA45_specialS =
        "\1\0\17\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\16\1\15\7\uffff\1\17\1\uffff\1\17\1\6\1\13\1\14\1\uffff"+
            "\1\10\1\17\1\4\3\uffff\1\7\1\12\1\5\1\uffff\1\17\1\uffff\1\11"+
            "\3\uffff\1\1\5\uffff\1\3\7\uffff\1\2\1\17",
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "4479:2: ( rule__Question__UnorderedGroup_1__13 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_0 = input.LA(1);

                         
                        int index45_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA45_0 ==KEYWORD_35 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 0) ) {s = 1;}

                        else if ( LA45_0 ==KEYWORD_21 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 1) ) {s = 2;}

                        else if ( LA45_0 ==KEYWORD_26 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 2) ) {s = 3;}

                        else if ( LA45_0 ==KEYWORD_44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 3) ) {s = 4;}

                        else if ( LA45_0 ==KEYWORD_37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 4) ) {s = 5;}

                        else if ( LA45_0 ==KEYWORD_51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 5) ) {s = 6;}

                        else if ( LA45_0 ==KEYWORD_42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 6) ) {s = 7;}

                        else if ( LA45_0 ==KEYWORD_47 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 7) ) {s = 8;}

                        else if ( LA45_0 ==KEYWORD_31 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 8) ) {s = 9;}

                        else if ( LA45_0 ==KEYWORD_36 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 9) ) {s = 10;}

                        else if ( LA45_0 ==KEYWORD_48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 10) ) {s = 11;}

                        else if ( LA45_0 ==KEYWORD_45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 11) ) {s = 12;}

                        else if ( LA45_0 ==KEYWORD_62 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 12) ) {s = 13;}

                        else if ( LA45_0 ==KEYWORD_61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQuestionAccess().getUnorderedGroup_1(), 13) ) {s = 14;}

                        else if ( (LA45_0==EOF||LA45_0==KEYWORD_55||LA45_0==KEYWORD_50||LA45_0==KEYWORD_43||LA45_0==KEYWORD_29||LA45_0==KEYWORD_9) ) {s = 15;}

                         
                        input.seek(index45_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleSurvey_in_entryRuleSurvey54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSurvey61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0_in_ruleSurvey91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_entryRulePage182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePage189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEInt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_entryRuleTextValue376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextValue383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group__0_in_ruleTextValue413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiTextItem_in_entryRuleMultiTextItem440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiTextItem447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiTextItem__Group__0_in_ruleMultiTextItem477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleLocation__Alternatives_in_ruleTitleLocation514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProgressBarLocation__Alternatives_in_ruleProgressBarLocation550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionType__Alternatives_in_ruleQuestionType586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextInputType__Alternatives_in_ruleTextInputType622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__TitleLocation__Alternatives708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__TitleLocation__Alternatives728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__ProgressBarLocation__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__ProgressBarLocation__Alternatives783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__ProgressBarLocation__Alternatives803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__QuestionType__Alternatives838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__QuestionType__Alternatives858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__QuestionType__Alternatives878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__QuestionType__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__QuestionType__Alternatives918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__QuestionType__Alternatives938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rule__QuestionType__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__QuestionType__Alternatives978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__TextInputType__Alternatives1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__TextInputType__Alternatives1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__TextInputType__Alternatives1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__TextInputType__Alternatives1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__TextInputType__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rule__TextInputType__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__TextInputType__Alternatives1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__TextInputType__Alternatives1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__TextInputType__Alternatives1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rule__TextInputType__Alternatives1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__TextInputType__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__TextInputType__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__TextInputType__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01285 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0_in_rule__Survey__Group__0__Impl1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11345 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_1_in_rule__Survey__Group__1__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagesAssignment_2_in_rule__Survey__Group__2__Impl1432 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4__0__Impl_in_rule__Survey__Group_0_4__01469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4__1_in_rule__Survey__Group_0_4__01472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__Survey__Group_0_4__0__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4__1__Impl_in_rule__Survey__Group_0_4__11531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4__2_in_rule__Survey__Group_0_4__11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__AuthorAssignment_0_4_1_in_rule__Survey__Group_0_4__1__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4__2__Impl_in_rule__Survey__Group_0_4__21591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4_2__0_in_rule__Survey__Group_0_4__2__Impl1618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4_2__0__Impl_in_rule__Survey__Group_0_4_2__01655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4_2__1_in_rule__Survey__Group_0_4_2__01658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__Survey__Group_0_4_2__0__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4_2__1__Impl_in_rule__Survey__Group_0_4_2__11717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__AuthorAssignment_0_4_2_1_in_rule__Survey__Group_0_4_2__1__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_5__0__Impl_in_rule__Survey__Group_0_5__01778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_5__1_in_rule__Survey__Group_0_5__01781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__Survey__Group_0_5__0__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_5__1__Impl_in_rule__Survey__Group_0_5__11840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TitleAssignment_0_5_1_in_rule__Survey__Group_0_5__1__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_6__0__Impl_in_rule__Survey__Group_0_6__01901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_6__1_in_rule__Survey__Group_0_6__01904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__Survey__Group_0_6__0__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_6__1__Impl_in_rule__Survey__Group_0_6__11963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__TimeLimitAssignment_0_6_1_in_rule__Survey__Group_0_6__1__Impl1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_7__0__Impl_in_rule__Survey__Group_0_7__02024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_7__1_in_rule__Survey__Group_0_7__02027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_rule__Survey__Group_0_7__0__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_7__1__Impl_in_rule__Survey__Group_0_7__12086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__CompletedMessageAssignment_0_7_1_in_rule__Survey__Group_0_7__1__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_8__0__Impl_in_rule__Survey__Group_0_8__02147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_8__1_in_rule__Survey__Group_0_8__02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rule__Survey__Group_0_8__0__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_8__1__Impl_in_rule__Survey__Group_0_8__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PageNextTextAssignment_0_8_1_in_rule__Survey__Group_0_8__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_9__0__Impl_in_rule__Survey__Group_0_9__02270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_9__1_in_rule__Survey__Group_0_9__02273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rule__Survey__Group_0_9__0__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_9__1__Impl_in_rule__Survey__Group_0_9__12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__PagePrevTextAssignment_0_9_1_in_rule__Survey__Group_0_9__1__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_10__0__Impl_in_rule__Survey__Group_0_10__02393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_10__1_in_rule__Survey__Group_0_10__02396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_rule__Survey__Group_0_10__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_10__1__Impl_in_rule__Survey__Group_0_10__12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__CompleteTextAssignment_0_10_1_in_rule__Survey__Group_0_10__1__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_11__0__Impl_in_rule__Survey__Group_0_11__02516 = new BitSet(new long[]{0x2000010000000000L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_11__1_in_rule__Survey__Group_0_11__02519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_rule__Survey__Group_0_11__0__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_11__1__Impl_in_rule__Survey__Group_0_11__12578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__QuestionTitleLocationAssignment_0_11_1_in_rule__Survey__Group_0_11__1__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_12__0__Impl_in_rule__Survey__Group_0_12__02639 = new BitSet(new long[]{0x2800010000000000L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_12__1_in_rule__Survey__Group_0_12__02642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rule__Survey__Group_0_12__0__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_12__1__Impl_in_rule__Survey__Group_0_12__12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__ShowProgressBarAssignment_0_12_1_in_rule__Survey__Group_0_12__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02762 = new BitSet(new long[]{0x0000100010000000L});
    public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__Page__Group__0__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12824 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__UnorderedGroup_1_in_rule__Page__Group__1__Impl2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22884 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_2_in_rule__Page__Group__2__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__QuestionsAssignment_3_in_rule__Page__Group__3__Impl2971 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Page__Group_1_0__0__Impl_in_rule__Page__Group_1_0__03010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Page__Group_1_0__1_in_rule__Page__Group_1_0__03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__Page__Group_1_0__0__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_1_0__1__Impl_in_rule__Page__Group_1_0__13072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__TitleAssignment_1_0_1_in_rule__Page__Group_1_0__1__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_1_1__0__Impl_in_rule__Page__Group_1_1__03133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Page__Group_1_1__1_in_rule__Page__Group_1_1__03136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__Page__Group_1_1__0__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_1_1__1__Impl_in_rule__Page__Group_1_1__13195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__VisibleIfAssignment_1_1_1_in_rule__Page__Group_1_1__1__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__EInt__Group__0__Impl3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__03381 = new BitSet(new long[]{0x00101044715C00C0L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__Question__Group__0__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__13443 = new BitSet(new long[]{0x0000000000828000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__13446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1_in_rule__Question__Group__1__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__23503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_2_in_rule__Question__Group__2__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_1__0__Impl_in_rule__Question__Group_1_1__03566 = new BitSet(new long[]{0x00800A9204200000L});
    public static final BitSet FOLLOW_rule__Question__Group_1_1__1_in_rule__Question__Group_1_1__03569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__Question__Group_1_1__0__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_1__1__Impl_in_rule__Question__Group_1_1__13628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__TypeAssignment_1_1_1_in_rule__Question__Group_1_1__1__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_2__0__Impl_in_rule__Question__Group_1_2__03689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_2__1_in_rule__Question__Group_1_2__03692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__Question__Group_1_2__0__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_2__1__Impl_in_rule__Question__Group_1_2__13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__TitleAssignment_1_2_1_in_rule__Question__Group_1_2__1__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_3__0__Impl_in_rule__Question__Group_1_3__03812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rule__Question__Group_1_3__1_in_rule__Question__Group_1_3__03815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rule__Question__Group_1_3__0__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_3__1__Impl_in_rule__Question__Group_1_3__13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__RangeStartAssignment_1_3_1_in_rule__Question__Group_1_3__1__Impl3901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_4__0__Impl_in_rule__Question__Group_1_4__03935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rule__Question__Group_1_4__1_in_rule__Question__Group_1_4__03938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_rule__Question__Group_1_4__0__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_4__1__Impl_in_rule__Question__Group_1_4__13997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__RangeEndAssignment_1_4_1_in_rule__Question__Group_1_4__1__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_5__0__Impl_in_rule__Question__Group_1_5__04058 = new BitSet(new long[]{0x55C6C42800000000L});
    public static final BitSet FOLLOW_rule__Question__Group_1_5__1_in_rule__Question__Group_1_5__04061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rule__Question__Group_1_5__0__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_5__1__Impl_in_rule__Question__Group_1_5__14120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__InputTypeAssignment_1_5_1_in_rule__Question__Group_1_5__1__Impl4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_6__0__Impl_in_rule__Question__Group_1_6__04181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_6__1_in_rule__Question__Group_1_6__04184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__Question__Group_1_6__0__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_6__1__Impl_in_rule__Question__Group_1_6__14243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__VisibleIfAssignment_1_6_1_in_rule__Question__Group_1_6__1__Impl4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_7__0__Impl_in_rule__Question__Group_1_7__04304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_7__1_in_rule__Question__Group_1_7__04307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rule__Question__Group_1_7__0__Impl4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_7__1__Impl_in_rule__Question__Group_1_7__14366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__PlaceholderAssignment_1_7_1_in_rule__Question__Group_1_7__1__Impl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8__0__Impl_in_rule__Question__Group_1_8__04427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8__1_in_rule__Question__Group_1_8__04430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__Question__Group_1_8__0__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8__1__Impl_in_rule__Question__Group_1_8__14489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8__2_in_rule__Question__Group_1_8__14492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ChoicesAssignment_1_8_1_in_rule__Question__Group_1_8__1__Impl4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8__2__Impl_in_rule__Question__Group_1_8__24549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8_2__0_in_rule__Question__Group_1_8__2__Impl4576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8_2__0__Impl_in_rule__Question__Group_1_8_2__04613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8_2__1_in_rule__Question__Group_1_8_2__04616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__Question__Group_1_8_2__0__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8_2__1__Impl_in_rule__Question__Group_1_8_2__14675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ChoicesAssignment_1_8_2_1_in_rule__Question__Group_1_8_2__1__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_9__0__Impl_in_rule__Question__Group_1_9__04736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rule__Question__Group_1_9__1_in_rule__Question__Group_1_9__04739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__Question__Group_1_9__0__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_9__1__Impl_in_rule__Question__Group_1_9__14798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__ColCountAssignment_1_9_1_in_rule__Question__Group_1_9__1__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_10__0__Impl_in_rule__Question__Group_1_10__04859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_10__1_in_rule__Question__Group_1_10__04862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rule__Question__Group_1_10__0__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_10__1__Impl_in_rule__Question__Group_1_10__14921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__QuestionNameAssignment_1_10_1_in_rule__Question__Group_1_10__1__Impl4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_11__0__Impl_in_rule__Question__Group_1_11__04982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_rule__Question__Group_1_11__1_in_rule__Question__Group_1_11__04985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rule__Question__Group_1_11__0__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_11__1__Impl_in_rule__Question__Group_1_11__15044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__RowsAssignment_1_11_1_in_rule__Question__Group_1_11__1__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_12__0__Impl_in_rule__Question__Group_1_12__05105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_12__1_in_rule__Question__Group_1_12__05108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rule__Question__Group_1_12__0__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_12__1__Impl_in_rule__Question__Group_1_12__15167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MininumRateDescriptionAssignment_1_12_1_in_rule__Question__Group_1_12__1__Impl5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_13__0__Impl_in_rule__Question__Group_1_13__05228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__Question__Group_1_13__1_in_rule__Question__Group_1_13__05231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_rule__Question__Group_1_13__0__Impl5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_13__1__Impl_in_rule__Question__Group_1_13__15290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MaximumRateDescriptionAssignment_1_13_1_in_rule__Question__Group_1_13__1__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0__0__Impl_in_rule__Question__Group_2_0__05351 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0__1_in_rule__Question__Group_2_0__05354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rule__Question__Group_2_0__0__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0__1__Impl_in_rule__Question__Group_2_0__15413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0__2_in_rule__Question__Group_2_0__15416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MatrixRowsAssignment_2_0_1_in_rule__Question__Group_2_0__1__Impl5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0__2__Impl_in_rule__Question__Group_2_0__25473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0_2__0_in_rule__Question__Group_2_0__2__Impl5500 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0_2__0__Impl_in_rule__Question__Group_2_0_2__05537 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0_2__1_in_rule__Question__Group_2_0_2__05540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__Question__Group_2_0_2__0__Impl5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0_2__1__Impl_in_rule__Question__Group_2_0_2__15599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MatrixRowsAssignment_2_0_2_1_in_rule__Question__Group_2_0_2__1__Impl5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_1__0__Impl_in_rule__Question__Group_2_1__05660 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Question__Group_2_1__1_in_rule__Question__Group_2_1__05663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rule__Question__Group_2_1__0__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_1__1__Impl_in_rule__Question__Group_2_1__15722 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Question__Group_2_1__2_in_rule__Question__Group_2_1__15725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MultiTextItemsAssignment_2_1_1_in_rule__Question__Group_2_1__1__Impl5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_1__2__Impl_in_rule__Question__Group_2_1__25782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MultiTextItemsAssignment_2_1_2_in_rule__Question__Group_2_1__2__Impl5809 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2__0__Impl_in_rule__Question__Group_2_2__05846 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2__1_in_rule__Question__Group_2_2__05849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rule__Question__Group_2_2__0__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2__1__Impl_in_rule__Question__Group_2_2__15908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2__2_in_rule__Question__Group_2_2__15911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MatrixColumnsAssignment_2_2_1_in_rule__Question__Group_2_2__1__Impl5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2__2__Impl_in_rule__Question__Group_2_2__25968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2_2__0_in_rule__Question__Group_2_2__2__Impl5995 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2_2__0__Impl_in_rule__Question__Group_2_2_2__06032 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2_2__1_in_rule__Question__Group_2_2_2__06035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__Question__Group_2_2_2__0__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2_2__1__Impl_in_rule__Question__Group_2_2_2__16094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__MatrixColumnsAssignment_2_2_2_1_in_rule__Question__Group_2_2_2__1__Impl6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group__0__Impl_in_rule__TextValue__Group__06155 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__TextValue__Group__1_in_rule__TextValue__Group__06158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__TextValue__Group__0__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group__1__Impl_in_rule__TextValue__Group__16217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__TextValue__Group__2_in_rule__TextValue__Group__16220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__TextValue__Group__1__Impl6248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group__2__Impl_in_rule__TextValue__Group__26279 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__TextValue__Group__3_in_rule__TextValue__Group__26282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__TextAssignment_2_in_rule__TextValue__Group__2__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group__3__Impl_in_rule__TextValue__Group__36339 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__TextValue__Group__4_in_rule__TextValue__Group__36342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group_3__0_in_rule__TextValue__Group__3__Impl6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group__4__Impl_in_rule__TextValue__Group__46400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__TextValue__Group__4__Impl6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group_3__0__Impl_in_rule__TextValue__Group_3__06469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__TextValue__Group_3__1_in_rule__TextValue__Group_3__06472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__TextValue__Group_3__0__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__Group_3__1__Impl_in_rule__TextValue__Group_3__16531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextValue__ValueAssignment_3_1_in_rule__TextValue__Group_3__1__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiTextItem__Group__0__Impl_in_rule__MultiTextItem__Group__06592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_rule__MultiTextItem__Group__1_in_rule__MultiTextItem__Group__06595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__MultiTextItem__Group__0__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiTextItem__Group__1__Impl_in_rule__MultiTextItem__Group__16654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiTextItem__TitleAssignment_1_in_rule__MultiTextItem__Group__1__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__0_in_rule__Survey__UnorderedGroup_06716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__HideNavigationButtonsAssignment_0_0_in_rule__Survey__UnorderedGroup_0__Impl6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__HidePageTitlesAssignment_0_1_in_rule__Survey__UnorderedGroup_0__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__HideQuestionNumbersAssignment_0_2_in_rule__Survey__UnorderedGroup_0__Impl6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__HidePageNumbersAssignment_0_3_in_rule__Survey__UnorderedGroup_0__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_4__0_in_rule__Survey__UnorderedGroup_0__Impl7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_5__0_in_rule__Survey__UnorderedGroup_0__Impl7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_6__0_in_rule__Survey__UnorderedGroup_0__Impl7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_7__0_in_rule__Survey__UnorderedGroup_0__Impl7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_8__0_in_rule__Survey__UnorderedGroup_0__Impl7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_9__0_in_rule__Survey__UnorderedGroup_0__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_10__0_in_rule__Survey__UnorderedGroup_0__Impl7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_11__0_in_rule__Survey__UnorderedGroup_0__Impl7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__Group_0_12__0_in_rule__Survey__UnorderedGroup_0__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__08045 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__1_in_rule__Survey__UnorderedGroup_0__08048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__18073 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__2_in_rule__Survey__UnorderedGroup_0__18076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__28101 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__3_in_rule__Survey__UnorderedGroup_0__28104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__38129 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__4_in_rule__Survey__UnorderedGroup_0__38132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__48157 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__5_in_rule__Survey__UnorderedGroup_0__48160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__58185 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__6_in_rule__Survey__UnorderedGroup_0__58188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__68213 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__7_in_rule__Survey__UnorderedGroup_0__68216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__78241 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__8_in_rule__Survey__UnorderedGroup_0__78244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__88269 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__9_in_rule__Survey__UnorderedGroup_0__88272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__98297 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__10_in_rule__Survey__UnorderedGroup_0__98300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__108325 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__11_in_rule__Survey__UnorderedGroup_0__108328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__118353 = new BitSet(new long[]{0x000010000A017F32L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__12_in_rule__Survey__UnorderedGroup_0__118356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Survey__UnorderedGroup_0__Impl_in_rule__Survey__UnorderedGroup_0__128381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__UnorderedGroup_1__0_in_rule__Page__UnorderedGroup_18431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_1_0__0_in_rule__Page__UnorderedGroup_1__Impl8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__Group_1_1__0_in_rule__Page__UnorderedGroup_1__Impl8616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__UnorderedGroup_1__Impl_in_rule__Page__UnorderedGroup_1__08682 = new BitSet(new long[]{0x0000100010000002L});
    public static final BitSet FOLLOW_rule__Page__UnorderedGroup_1__1_in_rule__Page__UnorderedGroup_1__08685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Page__UnorderedGroup_1__Impl_in_rule__Page__UnorderedGroup_1__18710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__0_in_rule__Question__UnorderedGroup_18738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__IsRequiredAssignment_1_0_in_rule__Question__UnorderedGroup_1__Impl8827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_1__0_in_rule__Question__UnorderedGroup_1__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_2__0_in_rule__Question__UnorderedGroup_1__Impl9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_3__0_in_rule__Question__UnorderedGroup_1__Impl9121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_4__0_in_rule__Question__UnorderedGroup_1__Impl9219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_5__0_in_rule__Question__UnorderedGroup_1__Impl9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_6__0_in_rule__Question__UnorderedGroup_1__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_7__0_in_rule__Question__UnorderedGroup_1__Impl9513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_8__0_in_rule__Question__UnorderedGroup_1__Impl9611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_9__0_in_rule__Question__UnorderedGroup_1__Impl9709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_10__0_in_rule__Question__UnorderedGroup_1__Impl9807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_11__0_in_rule__Question__UnorderedGroup_1__Impl9905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_12__0_in_rule__Question__UnorderedGroup_1__Impl10003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_1_13__0_in_rule__Question__UnorderedGroup_1__Impl10101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__010167 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__1_in_rule__Question__UnorderedGroup_1__010170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__110195 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__2_in_rule__Question__UnorderedGroup_1__110198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__210223 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__3_in_rule__Question__UnorderedGroup_1__210226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__310251 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__4_in_rule__Question__UnorderedGroup_1__310254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__410279 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__5_in_rule__Question__UnorderedGroup_1__410282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__510307 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__6_in_rule__Question__UnorderedGroup_1__510310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__610335 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__7_in_rule__Question__UnorderedGroup_1__610338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__710363 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__8_in_rule__Question__UnorderedGroup_1__710366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__810391 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__9_in_rule__Question__UnorderedGroup_1__810394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__910419 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__10_in_rule__Question__UnorderedGroup_1__910422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1010447 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__11_in_rule__Question__UnorderedGroup_1__1010450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1110475 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__12_in_rule__Question__UnorderedGroup_1__1110478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1210503 = new BitSet(new long[]{0x00101044715C00C2L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__13_in_rule__Question__UnorderedGroup_1__1210506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_1__Impl_in_rule__Question__UnorderedGroup_1__1310531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_2__0_in_rule__Question__UnorderedGroup_210583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_0__0_in_rule__Question__UnorderedGroup_2__Impl10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_1__0_in_rule__Question__UnorderedGroup_2__Impl10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group_2_2__0_in_rule__Question__UnorderedGroup_2__Impl10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_2__Impl_in_rule__Question__UnorderedGroup_2__010932 = new BitSet(new long[]{0x0000000000828002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_2__1_in_rule__Question__UnorderedGroup_2__010935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_2__Impl_in_rule__Question__UnorderedGroup_2__110960 = new BitSet(new long[]{0x0000000000828002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_2__2_in_rule__Question__UnorderedGroup_2__110963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__UnorderedGroup_2__Impl_in_rule__Question__UnorderedGroup_2__210988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_rule__Survey__HideNavigationButtonsAssignment_0_011027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_rule__Survey__HidePageTitlesAssignment_0_111071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_rule__Survey__HideQuestionNumbersAssignment_0_211115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rule__Survey__HidePageNumbersAssignment_0_311159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Survey__AuthorAssignment_0_4_111198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Survey__AuthorAssignment_0_4_2_111229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_0_5_111260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Survey__TimeLimitAssignment_0_6_111291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Survey__CompletedMessageAssignment_0_7_111322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Survey__PageNextTextAssignment_0_8_111353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Survey__PagePrevTextAssignment_0_9_111384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Survey__CompleteTextAssignment_0_10_111415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleLocation_in_rule__Survey__QuestionTitleLocationAssignment_0_11_111446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProgressBarLocation_in_rule__Survey__ShowProgressBarAssignment_0_12_111477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_111508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_211539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Page__TitleAssignment_1_0_111570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Page__VisibleIfAssignment_1_1_111601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_211632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__Page__QuestionsAssignment_311663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__Question__IsRequiredAssignment_1_011699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestionType_in_rule__Question__TypeAssignment_1_1_111738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__TitleAssignment_1_2_111769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Question__RangeStartAssignment_1_3_111800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Question__RangeEndAssignment_1_4_111831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextInputType_in_rule__Question__InputTypeAssignment_1_5_111862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__VisibleIfAssignment_1_6_111893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__PlaceholderAssignment_1_7_111924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__ChoicesAssignment_1_8_111955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__ChoicesAssignment_1_8_2_111986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Question__ColCountAssignment_1_9_112017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__QuestionNameAssignment_1_10_112048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEInt_in_rule__Question__RowsAssignment_1_11_112079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__MininumRateDescriptionAssignment_1_12_112110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Question__MaximumRateDescriptionAssignment_1_13_112141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_rule__Question__MatrixRowsAssignment_2_0_112172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_rule__Question__MatrixRowsAssignment_2_0_2_112203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiTextItem_in_rule__Question__MultiTextItemsAssignment_2_1_112234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiTextItem_in_rule__Question__MultiTextItemsAssignment_2_1_212265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_rule__Question__MatrixColumnsAssignment_2_2_112296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextValue_in_rule__Question__MatrixColumnsAssignment_2_2_2_112327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TextValue__TextAssignment_212358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TextValue__ValueAssignment_3_112389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__MultiTextItem__TitleAssignment_112420 = new BitSet(new long[]{0x0000000000000002L});

}
