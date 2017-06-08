package xtext.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class QueryITAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {

		if( "'Page'".equals(tokenName) ) {
			return "Page";
		} else
		if( "'Question'".equals(tokenName) ) {
			return "Question";
		} else
		if( "'text'".equals(tokenName) || "'radiogroup'".equals(tokenName) || "'checkbox'".equals(tokenName) || "'dropdown'".equals(tokenName) 
				|| "'comment'".equals(tokenName) || "'matrix'".equals(tokenName) || "'multipleText'".equals(tokenName) || "'rating'".equals(tokenName)
				|| "'time'".equals(tokenName) || "'range'".equals(tokenName) || "'color'".equals(tokenName) || "'date'".equals(tokenName) || "'datetime'".equals(tokenName) || "'email'".equals(tokenName) || "'month'".equals(tokenName) || "'number'".equals(tokenName) || "'password'".equals(tokenName) || "'tel'".equals(tokenName) || "'url'".equals(tokenName) || "'week'".equals(tokenName)
				|| "'top'".equals(tokenName) || "'off'".equals(tokenName) || "'bottom'".equals(tokenName)) {
			return "Enumeration";
			
		}

		return super.calculateId(tokenName, tokenType);
	}
	 
	protected boolean checkNumeric (String s) {
			for (int i=0;i<s.length();i++) {
				if(s.charAt(i)<'0' || s.charAt(i)>'9')
					return false;
			}
			return true;
	}

}
