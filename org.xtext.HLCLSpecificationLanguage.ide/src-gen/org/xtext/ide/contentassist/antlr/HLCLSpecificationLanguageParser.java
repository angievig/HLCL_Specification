/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalHLCLSpecificationLanguageParser;
import org.xtext.services.HLCLSpecificationLanguageGrammarAccess;

public class HLCLSpecificationLanguageParser extends AbstractContentAssistParser {

	@Inject
	private HLCLSpecificationLanguageGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalHLCLSpecificationLanguageParser createParser() {
		InternalHLCLSpecificationLanguageParser result = new InternalHLCLSpecificationLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getVariantDeclarationAccess().getAlternatives(), "rule__VariantDeclaration__Alternatives");
					put(grammarAccess.getEnumerationAccess().getAlternatives(), "rule__Enumeration__Alternatives");
					put(grammarAccess.getConsExpressionAccess().getAlternatives(), "rule__ConsExpression__Alternatives");
					put(grammarAccess.getTerminalExpAccess().getAlternatives(), "rule__TerminalExp__Alternatives");
					put(grammarAccess.getRefinementAccess().getAlternatives(), "rule__Refinement__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getVarTypeAccess().getAlternatives(), "rule__VarType__Alternatives");
					put(grammarAccess.getSPLopAccess().getAlternatives(), "rule__SPLop__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getVarDeclarationAccess().getGroup_1(), "rule__VarDeclaration__Group_1__0");
					put(grammarAccess.getVariantsIntervalAccess().getGroup(), "rule__VariantsInterval__Group__0");
					put(grammarAccess.getVariantsEnumerationAccess().getGroup(), "rule__VariantsEnumeration__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getTerminalExpAccess().getGroup_0(), "rule__TerminalExp__Group_0__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getVarRefinementAccess().getGroup(), "rule__VarRefinement__Group__0");
					put(grammarAccess.getSetRefinementAccess().getGroup(), "rule__SetRefinement__Group__0");
					put(grammarAccess.getSetRefinementAccess().getGroup_8(), "rule__SetRefinement__Group_8__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getSPLNotationAccess().getGroup(), "rule__SPLNotation__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup(), "rule__ListOfValues__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup_1(), "rule__ListOfValues__Group_1__0");
					put(grammarAccess.getListOfIDsAccess().getGroup(), "rule__ListOfIDs__Group__0");
					put(grammarAccess.getListOfIDsAccess().getGroup_1(), "rule__ListOfIDs__Group_1__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getVarsAssignment_3(), "rule__Model__VarsAssignment_3");
					put(grammarAccess.getModelAccess().getConstraintsAssignment_5(), "rule__Model__ConstraintsAssignment_5");
					put(grammarAccess.getVarDeclarationAccess().getInstantiableAssignment_0(), "rule__VarDeclaration__InstantiableAssignment_0");
					put(grammarAccess.getVarDeclarationAccess().getTypeAssignment_1_0(), "rule__VarDeclaration__TypeAssignment_1_0");
					put(grammarAccess.getVarDeclarationAccess().getNameAssignment_1_1(), "rule__VarDeclaration__NameAssignment_1_1");
					put(grammarAccess.getVarDeclarationAccess().getVariantsAssignment_1_3(), "rule__VarDeclaration__VariantsAssignment_1_3");
					put(grammarAccess.getVariantsIntervalAccess().getStartAssignment_1(), "rule__VariantsInterval__StartAssignment_1");
					put(grammarAccess.getVariantsIntervalAccess().getEndAssignment_3(), "rule__VariantsInterval__EndAssignment_3");
					put(grammarAccess.getVariantsEnumerationAccess().getListAssignment_2(), "rule__VariantsEnumeration__ListAssignment_2");
					put(grammarAccess.getConstraintAccess().getNameAssignment_0(), "rule__Constraint__NameAssignment_0");
					put(grammarAccess.getConstraintAccess().getExpAssignment_2(), "rule__Constraint__ExpAssignment_2");
					put(grammarAccess.getIDConsAccess().getNameAssignment(), "rule__IDCons__NameAssignment");
					put(grammarAccess.getAssignmentAccess().getVarAssignment_0(), "rule__Assignment__VarAssignment_0");
					put(grammarAccess.getAssignmentAccess().getValueAssignment_2(), "rule__Assignment__ValueAssignment_2");
					put(grammarAccess.getVarRefinementAccess().getVarAssignment_0(), "rule__VarRefinement__VarAssignment_0");
					put(grammarAccess.getVarRefinementAccess().getVariantsAssignment_2(), "rule__VarRefinement__VariantsAssignment_2");
					put(grammarAccess.getSetRefinementAccess().getVarsAssignment_1(), "rule__SetRefinement__VarsAssignment_1");
					put(grammarAccess.getSetRefinementAccess().getHeadAssignment_6(), "rule__SetRefinement__HeadAssignment_6");
					put(grammarAccess.getSetRefinementAccess().getTailAssignment_8_2(), "rule__SetRefinement__TailAssignment_8_2");
					put(grammarAccess.getRuleAccess().getConditionAssignment_0(), "rule__Rule__ConditionAssignment_0");
					put(grammarAccess.getRuleAccess().getConsequenceAssignment_2(), "rule__Rule__ConsequenceAssignment_2");
					put(grammarAccess.getSPLNotationAccess().getVar1Assignment_0(), "rule__SPLNotation__Var1Assignment_0");
					put(grammarAccess.getSPLNotationAccess().getOpAssignment_1(), "rule__SPLNotation__OpAssignment_1");
					put(grammarAccess.getSPLNotationAccess().getVar2Assignment_2(), "rule__SPLNotation__Var2Assignment_2");
					put(grammarAccess.getVarDeclarationAccess().getUnorderedGroup(), "rule__VarDeclaration__UnorderedGroup");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HLCLSpecificationLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HLCLSpecificationLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
