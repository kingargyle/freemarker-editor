/*
* generated by Xtext
*/
package org.github.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.github.services.FreemarkerEditorGrammarAccess;

public class FreemarkerEditorParser extends AbstractContentAssistParser {
	
	@Inject
	private FreemarkerEditorGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.github.ui.contentassist.antlr.internal.InternalFreemarkerEditorParser createParser() {
		org.github.ui.contentassist.antlr.internal.InternalFreemarkerEditorParser result = new org.github.ui.contentassist.antlr.internal.InternalFreemarkerEditorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getPrintContentAccess().getAlternatives(), "rule__PrintContent__Alternatives");
					put(grammarAccess.getTagPartAccess().getAlternatives(), "rule__TagPart__Alternatives");
					put(grammarAccess.getTagContentAccess().getAlternatives(), "rule__TagContent__Alternatives");
					put(grammarAccess.getTextContentAccess().getAlternatives_0(), "rule__TextContent__Alternatives_0");
					put(grammarAccess.getCommentContentAccess().getAlternatives(), "rule__CommentContent__Alternatives");
					put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
					put(grammarAccess.getTagAccess().getGroup(), "rule__Tag__Group__0");
					put(grammarAccess.getOpenTagAccess().getGroup(), "rule__OpenTag__Group__0");
					put(grammarAccess.getCloseTagAccess().getGroup(), "rule__CloseTag__Group__0");
					put(grammarAccess.getTextContentAccess().getGroup(), "rule__TextContent__Group__0");
					put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
					put(grammarAccess.getFreemarkerAccess().getElementsAssignment(), "rule__Freemarker__ElementsAssignment");
					put(grammarAccess.getPrintAccess().getExpressionAssignment_1(), "rule__Print__ExpressionAssignment_1");
					put(grammarAccess.getTagAccess().getOpenTagAssignment_0(), "rule__Tag__OpenTagAssignment_0");
					put(grammarAccess.getTagAccess().getElementsAssignment_1(), "rule__Tag__ElementsAssignment_1");
					put(grammarAccess.getTagAccess().getCloseTagAssignment_2(), "rule__Tag__CloseTagAssignment_2");
					put(grammarAccess.getOpenTagAccess().getContentAssignment_1(), "rule__OpenTag__ContentAssignment_1");
					put(grammarAccess.getCloseTagAccess().getContentAssignment_1(), "rule__CloseTag__ContentAssignment_1");
					put(grammarAccess.getTextAccess().getTextAssignment(), "rule__Text__TextAssignment");
					put(grammarAccess.getCommentAccess().getTextAssignment_2(), "rule__Comment__TextAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.github.ui.contentassist.antlr.internal.InternalFreemarkerEditorParser typedParser = (org.github.ui.contentassist.antlr.internal.InternalFreemarkerEditorParser) parser;
			typedParser.entryRuleFreemarker();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}
	
	public FreemarkerEditorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FreemarkerEditorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
