// Generated from /Users/rictomm/_Projects/seraph/src/main/java/ee/ut/dsg/seraph/neo4j/org.streamreasoning.gsp.syntax/org.streamreasoning.gsp.engine.Seraph.g4 by ANTLR 4.9.1
package org.streamreasoning.gsp.syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SeraphParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SeraphVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Seraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Seraph(SeraphParser.OC_SeraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_S2R}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_S2R(SeraphParser.OS_S2RContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_R2S}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_R2S(SeraphParser.OS_R2SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_StreamOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_StreamOp(SeraphParser.OS_StreamOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_Duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_Duration(SeraphParser.OS_DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_Period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_Period(SeraphParser.OS_PeriodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_EventRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_EventRange(SeraphParser.OS_EventRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_time_instant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_time_instant(SeraphParser.OS_time_instantContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Cypher}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Cypher(SeraphParser.OC_CypherContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oS_R2R}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOS_R2R(SeraphParser.OS_R2RContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Statement(SeraphParser.OC_StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Query(SeraphParser.OC_QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RegularQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RegularQuery(SeraphParser.OC_RegularQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Union(SeraphParser.OC_UnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_SingleQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_SingleQuery(SeraphParser.OC_SingleQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_SinglePartQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_SinglePartQuery(SeraphParser.OC_SinglePartQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_MultiPartQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_MultiPartQuery(SeraphParser.OC_MultiPartQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_UpdatingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_UpdatingClause(SeraphParser.OC_UpdatingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ReadingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ReadingClause(SeraphParser.OC_ReadingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Match(SeraphParser.OC_MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Unwind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Unwind(SeraphParser.OC_UnwindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Merge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Merge(SeraphParser.OC_MergeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_MergeAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_MergeAction(SeraphParser.OC_MergeActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Create(SeraphParser.OC_CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Set(SeraphParser.OC_SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_SetItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_SetItem(SeraphParser.OC_SetItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Delete(SeraphParser.OC_DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Remove(SeraphParser.OC_RemoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RemoveItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RemoveItem(SeraphParser.OC_RemoveItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_InQueryCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_InQueryCall(SeraphParser.OC_InQueryCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_StandaloneCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_StandaloneCall(SeraphParser.OC_StandaloneCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_YieldItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_YieldItems(SeraphParser.OC_YieldItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_YieldItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_YieldItem(SeraphParser.OC_YieldItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_With}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_With(SeraphParser.OC_WithContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Return(SeraphParser.OC_ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ProjectionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ProjectionBody(SeraphParser.OC_ProjectionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ProjectionItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ProjectionItems(SeraphParser.OC_ProjectionItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ProjectionItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ProjectionItem(SeraphParser.OC_ProjectionItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Order(SeraphParser.OC_OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Skip(SeraphParser.OC_SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Limit(SeraphParser.OC_LimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_SortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_SortItem(SeraphParser.OC_SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Where(SeraphParser.OC_WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Pattern(SeraphParser.OC_PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PatternPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PatternPart(SeraphParser.OC_PatternPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_AnonymousPatternPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_AnonymousPatternPart(SeraphParser.OC_AnonymousPatternPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PatternElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PatternElement(SeraphParser.OC_PatternElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_NodePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_NodePattern(SeraphParser.OC_NodePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PatternElementChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PatternElementChain(SeraphParser.OC_PatternElementChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RelationshipPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RelationshipPattern(SeraphParser.OC_RelationshipPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RelationshipDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RelationshipDetail(SeraphParser.OC_RelationshipDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Properties(SeraphParser.OC_PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RelationshipTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RelationshipTypes(SeraphParser.OC_RelationshipTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_NodeLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_NodeLabels(SeraphParser.OC_NodeLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_NodeLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_NodeLabel(SeraphParser.OC_NodeLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RangeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RangeLiteral(SeraphParser.OC_RangeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_LabelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_LabelName(SeraphParser.OC_LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RelTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RelTypeName(SeraphParser.OC_RelTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Expression(SeraphParser.OC_ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_OrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_OrExpression(SeraphParser.OC_OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_XorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_XorExpression(SeraphParser.OC_XorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_AndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_AndExpression(SeraphParser.OC_AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_NotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_NotExpression(SeraphParser.OC_NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ComparisonExpression(SeraphParser.OC_ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_AddOrSubtractExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_AddOrSubtractExpression(SeraphParser.OC_AddOrSubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_MultiplyDivideModuloExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_MultiplyDivideModuloExpression(SeraphParser.OC_MultiplyDivideModuloExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PowerOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PowerOfExpression(SeraphParser.OC_PowerOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_UnaryAddOrSubtractExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_UnaryAddOrSubtractExpression(SeraphParser.OC_UnaryAddOrSubtractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_StringListNullOperatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_StringListNullOperatorExpression(SeraphParser.OC_StringListNullOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ListOperatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ListOperatorExpression(SeraphParser.OC_ListOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_StringOperatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_StringOperatorExpression(SeraphParser.OC_StringOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_NullOperatorExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_NullOperatorExpression(SeraphParser.OC_NullOperatorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PropertyOrLabelsExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PropertyOrLabelsExpression(SeraphParser.OC_PropertyOrLabelsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Atom(SeraphParser.OC_AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Literal(SeraphParser.OC_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_BooleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_BooleanLiteral(SeraphParser.OC_BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ListLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ListLiteral(SeraphParser.OC_ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PartialComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PartialComparisonExpression(SeraphParser.OC_PartialComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ParenthesizedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ParenthesizedExpression(SeraphParser.OC_ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RelationshipsPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RelationshipsPattern(SeraphParser.OC_RelationshipsPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_FilterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_FilterExpression(SeraphParser.OC_FilterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_IdInColl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_IdInColl(SeraphParser.OC_IdInCollContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_FunctionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_FunctionInvocation(SeraphParser.OC_FunctionInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_FunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_FunctionName(SeraphParser.OC_FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ExplicitProcedureInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ExplicitProcedureInvocation(SeraphParser.OC_ExplicitProcedureInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ImplicitProcedureInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ImplicitProcedureInvocation(SeraphParser.OC_ImplicitProcedureInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ProcedureResultField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ProcedureResultField(SeraphParser.OC_ProcedureResultFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ProcedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ProcedureName(SeraphParser.OC_ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Namespace(SeraphParser.OC_NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ListComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ListComprehension(SeraphParser.OC_ListComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PatternComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PatternComprehension(SeraphParser.OC_PatternComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PropertyLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PropertyLookup(SeraphParser.OC_PropertyLookupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_CaseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_CaseExpression(SeraphParser.OC_CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_CaseAlternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_CaseAlternatives(SeraphParser.OC_CaseAlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Variable(SeraphParser.OC_VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_NumberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_NumberLiteral(SeraphParser.OC_NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_MapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_MapLiteral(SeraphParser.OC_MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Parameter(SeraphParser.OC_ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PropertyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PropertyExpression(SeraphParser.OC_PropertyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_PropertyKeyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_PropertyKeyName(SeraphParser.OC_PropertyKeyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_IntegerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_IntegerLiteral(SeraphParser.OC_IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_DoubleLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_DoubleLiteral(SeraphParser.OC_DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_SchemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_SchemaName(SeraphParser.OC_SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_ReservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_ReservedWord(SeraphParser.OC_ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_SymbolicName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_SymbolicName(SeraphParser.OC_SymbolicNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_LeftArrowHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_LeftArrowHead(SeraphParser.OC_LeftArrowHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_RightArrowHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_RightArrowHead(SeraphParser.OC_RightArrowHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link SeraphParser#oC_Dash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOC_Dash(SeraphParser.OC_DashContext ctx);
}