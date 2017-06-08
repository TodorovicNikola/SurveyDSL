package xtext.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class QueryITHighlightingConfiguration extends
		DefaultHighlightingConfiguration {

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		// TODO Auto-generated method stub
		super.configure(acceptor);
		addType(acceptor, "Page", 100, 100, 100, SWT.BOLD);
		addType(acceptor, "Question", 150, 150, 150, SWT.BOLD);
		addType(acceptor, "Enumeration", 0, 185, 185, SWT.BOLD);
	}
	
	public void addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style )
	 {
		 TextStyle textStyle = new TextStyle();
		 textStyle.setBackgroundColor(new RGB(255, 255, 255));
		 textStyle.setColor(new RGB(r, g, b));
		 textStyle.setStyle(style);
		 //textStyle.setFontData(new FontData("courier", 14, style));
		 acceptor.acceptDefaultHighlighting(s, s, textStyle);
	 }

}

