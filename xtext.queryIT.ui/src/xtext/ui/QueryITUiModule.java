/*
 * generated by Xtext
 */
package xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class QueryITUiModule extends xtext.ui.AbstractQueryITUiModule {
	public QueryITUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends DefaultHighlightingConfiguration> bindDefaultHighlightingConfiguration () {
		 return QueryITHighlightingConfiguration.class;
	}
	
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return QueryITAntlrTokenToAttributeIdMapper.class ;
	}
}
