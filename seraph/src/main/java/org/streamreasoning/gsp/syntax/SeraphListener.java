// Generated from /Users/rictomm/_Projects/seraph/src/main/java/ee/ut/dsg/seraph/neo4j/org.streamreasoning.gsp.syntax/org.streamreasoning.gsp.engine.Seraph.g4 by ANTLR 4.9.1
package org.streamreasoning.gsp.syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SeraphParser}.
 */
public interface SeraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Seraph}.
	 * @param ctx the parse tree
	 */
	void enterOC_Seraph(SeraphParser.OC_SeraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Seraph}.
	 * @param ctx the parse tree
	 */
	void exitOC_Seraph(SeraphParser.OC_SeraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_S2R}.
	 * @param ctx the parse tree
	 */
	void enterOS_S2R(SeraphParser.OS_S2RContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_S2R}.
	 * @param ctx the parse tree
	 */
	void exitOS_S2R(SeraphParser.OS_S2RContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_R2S}.
	 * @param ctx the parse tree
	 */
	void enterOS_R2S(SeraphParser.OS_R2SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_R2S}.
	 * @param ctx the parse tree
	 */
	void exitOS_R2S(SeraphParser.OS_R2SContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_StreamOp}.
	 * @param ctx the parse tree
	 */
	void enterOS_StreamOp(SeraphParser.OS_StreamOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_StreamOp}.
	 * @param ctx the parse tree
	 */
	void exitOS_StreamOp(SeraphParser.OS_StreamOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_Duration}.
	 * @param ctx the parse tree
	 */
	void enterOS_Duration(SeraphParser.OS_DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_Duration}.
	 * @param ctx the parse tree
	 */
	void exitOS_Duration(SeraphParser.OS_DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_Period}.
	 * @param ctx the parse tree
	 */
	void enterOS_Period(SeraphParser.OS_PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_Period}.
	 * @param ctx the parse tree
	 */
	void exitOS_Period(SeraphParser.OS_PeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_EventRange}.
	 * @param ctx the parse tree
	 */
	void enterOS_EventRange(SeraphParser.OS_EventRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_EventRange}.
	 * @param ctx the parse tree
	 */
	void exitOS_EventRange(SeraphParser.OS_EventRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_time_instant}.
	 * @param ctx the parse tree
	 */
	void enterOS_time_instant(SeraphParser.OS_time_instantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_time_instant}.
	 * @param ctx the parse tree
	 */
	void exitOS_time_instant(SeraphParser.OS_time_instantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Cypher}.
	 * @param ctx the parse tree
	 */
	void enterOC_Cypher(SeraphParser.OC_CypherContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Cypher}.
	 * @param ctx the parse tree
	 */
	void exitOC_Cypher(SeraphParser.OC_CypherContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oS_R2R}.
	 * @param ctx the parse tree
	 */
	void enterOS_R2R(SeraphParser.OS_R2RContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oS_R2R}.
	 * @param ctx the parse tree
	 */
	void exitOS_R2R(SeraphParser.OS_R2RContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Statement}.
	 * @param ctx the parse tree
	 */
	void enterOC_Statement(SeraphParser.OC_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Statement}.
	 * @param ctx the parse tree
	 */
	void exitOC_Statement(SeraphParser.OC_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Query}.
	 * @param ctx the parse tree
	 */
	void enterOC_Query(SeraphParser.OC_QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Query}.
	 * @param ctx the parse tree
	 */
	void exitOC_Query(SeraphParser.OC_QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RegularQuery}.
	 * @param ctx the parse tree
	 */
	void enterOC_RegularQuery(SeraphParser.OC_RegularQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RegularQuery}.
	 * @param ctx the parse tree
	 */
	void exitOC_RegularQuery(SeraphParser.OC_RegularQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Union}.
	 * @param ctx the parse tree
	 */
	void enterOC_Union(SeraphParser.OC_UnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Union}.
	 * @param ctx the parse tree
	 */
	void exitOC_Union(SeraphParser.OC_UnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_SingleQuery}.
	 * @param ctx the parse tree
	 */
	void enterOC_SingleQuery(SeraphParser.OC_SingleQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_SingleQuery}.
	 * @param ctx the parse tree
	 */
	void exitOC_SingleQuery(SeraphParser.OC_SingleQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_SinglePartQuery}.
	 * @param ctx the parse tree
	 */
	void enterOC_SinglePartQuery(SeraphParser.OC_SinglePartQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_SinglePartQuery}.
	 * @param ctx the parse tree
	 */
	void exitOC_SinglePartQuery(SeraphParser.OC_SinglePartQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_MultiPartQuery}.
	 * @param ctx the parse tree
	 */
	void enterOC_MultiPartQuery(SeraphParser.OC_MultiPartQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_MultiPartQuery}.
	 * @param ctx the parse tree
	 */
	void exitOC_MultiPartQuery(SeraphParser.OC_MultiPartQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_UpdatingClause}.
	 * @param ctx the parse tree
	 */
	void enterOC_UpdatingClause(SeraphParser.OC_UpdatingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_UpdatingClause}.
	 * @param ctx the parse tree
	 */
	void exitOC_UpdatingClause(SeraphParser.OC_UpdatingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ReadingClause}.
	 * @param ctx the parse tree
	 */
	void enterOC_ReadingClause(SeraphParser.OC_ReadingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ReadingClause}.
	 * @param ctx the parse tree
	 */
	void exitOC_ReadingClause(SeraphParser.OC_ReadingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Match}.
	 * @param ctx the parse tree
	 */
	void enterOC_Match(SeraphParser.OC_MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Match}.
	 * @param ctx the parse tree
	 */
	void exitOC_Match(SeraphParser.OC_MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Unwind}.
	 * @param ctx the parse tree
	 */
	void enterOC_Unwind(SeraphParser.OC_UnwindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Unwind}.
	 * @param ctx the parse tree
	 */
	void exitOC_Unwind(SeraphParser.OC_UnwindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Merge}.
	 * @param ctx the parse tree
	 */
	void enterOC_Merge(SeraphParser.OC_MergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Merge}.
	 * @param ctx the parse tree
	 */
	void exitOC_Merge(SeraphParser.OC_MergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_MergeAction}.
	 * @param ctx the parse tree
	 */
	void enterOC_MergeAction(SeraphParser.OC_MergeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_MergeAction}.
	 * @param ctx the parse tree
	 */
	void exitOC_MergeAction(SeraphParser.OC_MergeActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Create}.
	 * @param ctx the parse tree
	 */
	void enterOC_Create(SeraphParser.OC_CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Create}.
	 * @param ctx the parse tree
	 */
	void exitOC_Create(SeraphParser.OC_CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Set}.
	 * @param ctx the parse tree
	 */
	void enterOC_Set(SeraphParser.OC_SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Set}.
	 * @param ctx the parse tree
	 */
	void exitOC_Set(SeraphParser.OC_SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_SetItem}.
	 * @param ctx the parse tree
	 */
	void enterOC_SetItem(SeraphParser.OC_SetItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_SetItem}.
	 * @param ctx the parse tree
	 */
	void exitOC_SetItem(SeraphParser.OC_SetItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Delete}.
	 * @param ctx the parse tree
	 */
	void enterOC_Delete(SeraphParser.OC_DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Delete}.
	 * @param ctx the parse tree
	 */
	void exitOC_Delete(SeraphParser.OC_DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Remove}.
	 * @param ctx the parse tree
	 */
	void enterOC_Remove(SeraphParser.OC_RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Remove}.
	 * @param ctx the parse tree
	 */
	void exitOC_Remove(SeraphParser.OC_RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RemoveItem}.
	 * @param ctx the parse tree
	 */
	void enterOC_RemoveItem(SeraphParser.OC_RemoveItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RemoveItem}.
	 * @param ctx the parse tree
	 */
	void exitOC_RemoveItem(SeraphParser.OC_RemoveItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_InQueryCall}.
	 * @param ctx the parse tree
	 */
	void enterOC_InQueryCall(SeraphParser.OC_InQueryCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_InQueryCall}.
	 * @param ctx the parse tree
	 */
	void exitOC_InQueryCall(SeraphParser.OC_InQueryCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_StandaloneCall}.
	 * @param ctx the parse tree
	 */
	void enterOC_StandaloneCall(SeraphParser.OC_StandaloneCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_StandaloneCall}.
	 * @param ctx the parse tree
	 */
	void exitOC_StandaloneCall(SeraphParser.OC_StandaloneCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_YieldItems}.
	 * @param ctx the parse tree
	 */
	void enterOC_YieldItems(SeraphParser.OC_YieldItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_YieldItems}.
	 * @param ctx the parse tree
	 */
	void exitOC_YieldItems(SeraphParser.OC_YieldItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_YieldItem}.
	 * @param ctx the parse tree
	 */
	void enterOC_YieldItem(SeraphParser.OC_YieldItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_YieldItem}.
	 * @param ctx the parse tree
	 */
	void exitOC_YieldItem(SeraphParser.OC_YieldItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_With}.
	 * @param ctx the parse tree
	 */
	void enterOC_With(SeraphParser.OC_WithContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_With}.
	 * @param ctx the parse tree
	 */
	void exitOC_With(SeraphParser.OC_WithContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Return}.
	 * @param ctx the parse tree
	 */
	void enterOC_Return(SeraphParser.OC_ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Return}.
	 * @param ctx the parse tree
	 */
	void exitOC_Return(SeraphParser.OC_ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ProjectionBody}.
	 * @param ctx the parse tree
	 */
	void enterOC_ProjectionBody(SeraphParser.OC_ProjectionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ProjectionBody}.
	 * @param ctx the parse tree
	 */
	void exitOC_ProjectionBody(SeraphParser.OC_ProjectionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ProjectionItems}.
	 * @param ctx the parse tree
	 */
	void enterOC_ProjectionItems(SeraphParser.OC_ProjectionItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ProjectionItems}.
	 * @param ctx the parse tree
	 */
	void exitOC_ProjectionItems(SeraphParser.OC_ProjectionItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ProjectionItem}.
	 * @param ctx the parse tree
	 */
	void enterOC_ProjectionItem(SeraphParser.OC_ProjectionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ProjectionItem}.
	 * @param ctx the parse tree
	 */
	void exitOC_ProjectionItem(SeraphParser.OC_ProjectionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Order}.
	 * @param ctx the parse tree
	 */
	void enterOC_Order(SeraphParser.OC_OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Order}.
	 * @param ctx the parse tree
	 */
	void exitOC_Order(SeraphParser.OC_OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Skip}.
	 * @param ctx the parse tree
	 */
	void enterOC_Skip(SeraphParser.OC_SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Skip}.
	 * @param ctx the parse tree
	 */
	void exitOC_Skip(SeraphParser.OC_SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Limit}.
	 * @param ctx the parse tree
	 */
	void enterOC_Limit(SeraphParser.OC_LimitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Limit}.
	 * @param ctx the parse tree
	 */
	void exitOC_Limit(SeraphParser.OC_LimitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_SortItem}.
	 * @param ctx the parse tree
	 */
	void enterOC_SortItem(SeraphParser.OC_SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_SortItem}.
	 * @param ctx the parse tree
	 */
	void exitOC_SortItem(SeraphParser.OC_SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Where}.
	 * @param ctx the parse tree
	 */
	void enterOC_Where(SeraphParser.OC_WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Where}.
	 * @param ctx the parse tree
	 */
	void exitOC_Where(SeraphParser.OC_WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Pattern}.
	 * @param ctx the parse tree
	 */
	void enterOC_Pattern(SeraphParser.OC_PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Pattern}.
	 * @param ctx the parse tree
	 */
	void exitOC_Pattern(SeraphParser.OC_PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PatternPart}.
	 * @param ctx the parse tree
	 */
	void enterOC_PatternPart(SeraphParser.OC_PatternPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PatternPart}.
	 * @param ctx the parse tree
	 */
	void exitOC_PatternPart(SeraphParser.OC_PatternPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_AnonymousPatternPart}.
	 * @param ctx the parse tree
	 */
	void enterOC_AnonymousPatternPart(SeraphParser.OC_AnonymousPatternPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_AnonymousPatternPart}.
	 * @param ctx the parse tree
	 */
	void exitOC_AnonymousPatternPart(SeraphParser.OC_AnonymousPatternPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PatternElement}.
	 * @param ctx the parse tree
	 */
	void enterOC_PatternElement(SeraphParser.OC_PatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PatternElement}.
	 * @param ctx the parse tree
	 */
	void exitOC_PatternElement(SeraphParser.OC_PatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_NodePattern}.
	 * @param ctx the parse tree
	 */
	void enterOC_NodePattern(SeraphParser.OC_NodePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_NodePattern}.
	 * @param ctx the parse tree
	 */
	void exitOC_NodePattern(SeraphParser.OC_NodePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PatternElementChain}.
	 * @param ctx the parse tree
	 */
	void enterOC_PatternElementChain(SeraphParser.OC_PatternElementChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PatternElementChain}.
	 * @param ctx the parse tree
	 */
	void exitOC_PatternElementChain(SeraphParser.OC_PatternElementChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RelationshipPattern}.
	 * @param ctx the parse tree
	 */
	void enterOC_RelationshipPattern(SeraphParser.OC_RelationshipPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RelationshipPattern}.
	 * @param ctx the parse tree
	 */
	void exitOC_RelationshipPattern(SeraphParser.OC_RelationshipPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RelationshipDetail}.
	 * @param ctx the parse tree
	 */
	void enterOC_RelationshipDetail(SeraphParser.OC_RelationshipDetailContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RelationshipDetail}.
	 * @param ctx the parse tree
	 */
	void exitOC_RelationshipDetail(SeraphParser.OC_RelationshipDetailContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Properties}.
	 * @param ctx the parse tree
	 */
	void enterOC_Properties(SeraphParser.OC_PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Properties}.
	 * @param ctx the parse tree
	 */
	void exitOC_Properties(SeraphParser.OC_PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RelationshipTypes}.
	 * @param ctx the parse tree
	 */
	void enterOC_RelationshipTypes(SeraphParser.OC_RelationshipTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RelationshipTypes}.
	 * @param ctx the parse tree
	 */
	void exitOC_RelationshipTypes(SeraphParser.OC_RelationshipTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_NodeLabels}.
	 * @param ctx the parse tree
	 */
	void enterOC_NodeLabels(SeraphParser.OC_NodeLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_NodeLabels}.
	 * @param ctx the parse tree
	 */
	void exitOC_NodeLabels(SeraphParser.OC_NodeLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_NodeLabel}.
	 * @param ctx the parse tree
	 */
	void enterOC_NodeLabel(SeraphParser.OC_NodeLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_NodeLabel}.
	 * @param ctx the parse tree
	 */
	void exitOC_NodeLabel(SeraphParser.OC_NodeLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RangeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOC_RangeLiteral(SeraphParser.OC_RangeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RangeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOC_RangeLiteral(SeraphParser.OC_RangeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_LabelName}.
	 * @param ctx the parse tree
	 */
	void enterOC_LabelName(SeraphParser.OC_LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_LabelName}.
	 * @param ctx the parse tree
	 */
	void exitOC_LabelName(SeraphParser.OC_LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RelTypeName}.
	 * @param ctx the parse tree
	 */
	void enterOC_RelTypeName(SeraphParser.OC_RelTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RelTypeName}.
	 * @param ctx the parse tree
	 */
	void exitOC_RelTypeName(SeraphParser.OC_RelTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Expression}.
	 * @param ctx the parse tree
	 */
	void enterOC_Expression(SeraphParser.OC_ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Expression}.
	 * @param ctx the parse tree
	 */
	void exitOC_Expression(SeraphParser.OC_ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_OrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_OrExpression(SeraphParser.OC_OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_OrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_OrExpression(SeraphParser.OC_OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_XorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_XorExpression(SeraphParser.OC_XorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_XorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_XorExpression(SeraphParser.OC_XorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_AndExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_AndExpression(SeraphParser.OC_AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_AndExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_AndExpression(SeraphParser.OC_AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_NotExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_NotExpression(SeraphParser.OC_NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_NotExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_NotExpression(SeraphParser.OC_NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_ComparisonExpression(SeraphParser.OC_ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_ComparisonExpression(SeraphParser.OC_ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_AddOrSubtractExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_AddOrSubtractExpression(SeraphParser.OC_AddOrSubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_AddOrSubtractExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_AddOrSubtractExpression(SeraphParser.OC_AddOrSubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_MultiplyDivideModuloExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_MultiplyDivideModuloExpression(SeraphParser.OC_MultiplyDivideModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_MultiplyDivideModuloExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_MultiplyDivideModuloExpression(SeraphParser.OC_MultiplyDivideModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PowerOfExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_PowerOfExpression(SeraphParser.OC_PowerOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PowerOfExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_PowerOfExpression(SeraphParser.OC_PowerOfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_UnaryAddOrSubtractExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_UnaryAddOrSubtractExpression(SeraphParser.OC_UnaryAddOrSubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_UnaryAddOrSubtractExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_UnaryAddOrSubtractExpression(SeraphParser.OC_UnaryAddOrSubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_StringListNullOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_StringListNullOperatorExpression(SeraphParser.OC_StringListNullOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_StringListNullOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_StringListNullOperatorExpression(SeraphParser.OC_StringListNullOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ListOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_ListOperatorExpression(SeraphParser.OC_ListOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ListOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_ListOperatorExpression(SeraphParser.OC_ListOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_StringOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_StringOperatorExpression(SeraphParser.OC_StringOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_StringOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_StringOperatorExpression(SeraphParser.OC_StringOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_NullOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_NullOperatorExpression(SeraphParser.OC_NullOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_NullOperatorExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_NullOperatorExpression(SeraphParser.OC_NullOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PropertyOrLabelsExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_PropertyOrLabelsExpression(SeraphParser.OC_PropertyOrLabelsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PropertyOrLabelsExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_PropertyOrLabelsExpression(SeraphParser.OC_PropertyOrLabelsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Atom}.
	 * @param ctx the parse tree
	 */
	void enterOC_Atom(SeraphParser.OC_AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Atom}.
	 * @param ctx the parse tree
	 */
	void exitOC_Atom(SeraphParser.OC_AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Literal}.
	 * @param ctx the parse tree
	 */
	void enterOC_Literal(SeraphParser.OC_LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Literal}.
	 * @param ctx the parse tree
	 */
	void exitOC_Literal(SeraphParser.OC_LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_BooleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOC_BooleanLiteral(SeraphParser.OC_BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_BooleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOC_BooleanLiteral(SeraphParser.OC_BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ListLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOC_ListLiteral(SeraphParser.OC_ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ListLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOC_ListLiteral(SeraphParser.OC_ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PartialComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_PartialComparisonExpression(SeraphParser.OC_PartialComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PartialComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_PartialComparisonExpression(SeraphParser.OC_PartialComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ParenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_ParenthesizedExpression(SeraphParser.OC_ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ParenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_ParenthesizedExpression(SeraphParser.OC_ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RelationshipsPattern}.
	 * @param ctx the parse tree
	 */
	void enterOC_RelationshipsPattern(SeraphParser.OC_RelationshipsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RelationshipsPattern}.
	 * @param ctx the parse tree
	 */
	void exitOC_RelationshipsPattern(SeraphParser.OC_RelationshipsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_FilterExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_FilterExpression(SeraphParser.OC_FilterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_FilterExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_FilterExpression(SeraphParser.OC_FilterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_IdInColl}.
	 * @param ctx the parse tree
	 */
	void enterOC_IdInColl(SeraphParser.OC_IdInCollContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_IdInColl}.
	 * @param ctx the parse tree
	 */
	void exitOC_IdInColl(SeraphParser.OC_IdInCollContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_FunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterOC_FunctionInvocation(SeraphParser.OC_FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_FunctionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitOC_FunctionInvocation(SeraphParser.OC_FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_FunctionName}.
	 * @param ctx the parse tree
	 */
	void enterOC_FunctionName(SeraphParser.OC_FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_FunctionName}.
	 * @param ctx the parse tree
	 */
	void exitOC_FunctionName(SeraphParser.OC_FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ExplicitProcedureInvocation}.
	 * @param ctx the parse tree
	 */
	void enterOC_ExplicitProcedureInvocation(SeraphParser.OC_ExplicitProcedureInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ExplicitProcedureInvocation}.
	 * @param ctx the parse tree
	 */
	void exitOC_ExplicitProcedureInvocation(SeraphParser.OC_ExplicitProcedureInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ImplicitProcedureInvocation}.
	 * @param ctx the parse tree
	 */
	void enterOC_ImplicitProcedureInvocation(SeraphParser.OC_ImplicitProcedureInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ImplicitProcedureInvocation}.
	 * @param ctx the parse tree
	 */
	void exitOC_ImplicitProcedureInvocation(SeraphParser.OC_ImplicitProcedureInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ProcedureResultField}.
	 * @param ctx the parse tree
	 */
	void enterOC_ProcedureResultField(SeraphParser.OC_ProcedureResultFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ProcedureResultField}.
	 * @param ctx the parse tree
	 */
	void exitOC_ProcedureResultField(SeraphParser.OC_ProcedureResultFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ProcedureName}.
	 * @param ctx the parse tree
	 */
	void enterOC_ProcedureName(SeraphParser.OC_ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ProcedureName}.
	 * @param ctx the parse tree
	 */
	void exitOC_ProcedureName(SeraphParser.OC_ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Namespace}.
	 * @param ctx the parse tree
	 */
	void enterOC_Namespace(SeraphParser.OC_NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Namespace}.
	 * @param ctx the parse tree
	 */
	void exitOC_Namespace(SeraphParser.OC_NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ListComprehension}.
	 * @param ctx the parse tree
	 */
	void enterOC_ListComprehension(SeraphParser.OC_ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ListComprehension}.
	 * @param ctx the parse tree
	 */
	void exitOC_ListComprehension(SeraphParser.OC_ListComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PatternComprehension}.
	 * @param ctx the parse tree
	 */
	void enterOC_PatternComprehension(SeraphParser.OC_PatternComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PatternComprehension}.
	 * @param ctx the parse tree
	 */
	void exitOC_PatternComprehension(SeraphParser.OC_PatternComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PropertyLookup}.
	 * @param ctx the parse tree
	 */
	void enterOC_PropertyLookup(SeraphParser.OC_PropertyLookupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PropertyLookup}.
	 * @param ctx the parse tree
	 */
	void exitOC_PropertyLookup(SeraphParser.OC_PropertyLookupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_CaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_CaseExpression(SeraphParser.OC_CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_CaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_CaseExpression(SeraphParser.OC_CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_CaseAlternatives}.
	 * @param ctx the parse tree
	 */
	void enterOC_CaseAlternatives(SeraphParser.OC_CaseAlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_CaseAlternatives}.
	 * @param ctx the parse tree
	 */
	void exitOC_CaseAlternatives(SeraphParser.OC_CaseAlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Variable}.
	 * @param ctx the parse tree
	 */
	void enterOC_Variable(SeraphParser.OC_VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Variable}.
	 * @param ctx the parse tree
	 */
	void exitOC_Variable(SeraphParser.OC_VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_NumberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOC_NumberLiteral(SeraphParser.OC_NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_NumberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOC_NumberLiteral(SeraphParser.OC_NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_MapLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOC_MapLiteral(SeraphParser.OC_MapLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_MapLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOC_MapLiteral(SeraphParser.OC_MapLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Parameter}.
	 * @param ctx the parse tree
	 */
	void enterOC_Parameter(SeraphParser.OC_ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Parameter}.
	 * @param ctx the parse tree
	 */
	void exitOC_Parameter(SeraphParser.OC_ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PropertyExpression}.
	 * @param ctx the parse tree
	 */
	void enterOC_PropertyExpression(SeraphParser.OC_PropertyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PropertyExpression}.
	 * @param ctx the parse tree
	 */
	void exitOC_PropertyExpression(SeraphParser.OC_PropertyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_PropertyKeyName}.
	 * @param ctx the parse tree
	 */
	void enterOC_PropertyKeyName(SeraphParser.OC_PropertyKeyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_PropertyKeyName}.
	 * @param ctx the parse tree
	 */
	void exitOC_PropertyKeyName(SeraphParser.OC_PropertyKeyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_IntegerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOC_IntegerLiteral(SeraphParser.OC_IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_IntegerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOC_IntegerLiteral(SeraphParser.OC_IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_DoubleLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOC_DoubleLiteral(SeraphParser.OC_DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_DoubleLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOC_DoubleLiteral(SeraphParser.OC_DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_SchemaName}.
	 * @param ctx the parse tree
	 */
	void enterOC_SchemaName(SeraphParser.OC_SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_SchemaName}.
	 * @param ctx the parse tree
	 */
	void exitOC_SchemaName(SeraphParser.OC_SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_ReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterOC_ReservedWord(SeraphParser.OC_ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_ReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitOC_ReservedWord(SeraphParser.OC_ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_SymbolicName}.
	 * @param ctx the parse tree
	 */
	void enterOC_SymbolicName(SeraphParser.OC_SymbolicNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_SymbolicName}.
	 * @param ctx the parse tree
	 */
	void exitOC_SymbolicName(SeraphParser.OC_SymbolicNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_LeftArrowHead}.
	 * @param ctx the parse tree
	 */
	void enterOC_LeftArrowHead(SeraphParser.OC_LeftArrowHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_LeftArrowHead}.
	 * @param ctx the parse tree
	 */
	void exitOC_LeftArrowHead(SeraphParser.OC_LeftArrowHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_RightArrowHead}.
	 * @param ctx the parse tree
	 */
	void enterOC_RightArrowHead(SeraphParser.OC_RightArrowHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_RightArrowHead}.
	 * @param ctx the parse tree
	 */
	void exitOC_RightArrowHead(SeraphParser.OC_RightArrowHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SeraphParser#oC_Dash}.
	 * @param ctx the parse tree
	 */
	void enterOC_Dash(SeraphParser.OC_DashContext ctx);
	/**
	 * Exit a parse tree produced by {@link SeraphParser#oC_Dash}.
	 * @param ctx the parse tree
	 */
	void exitOC_Dash(SeraphParser.OC_DashContext ctx);
}