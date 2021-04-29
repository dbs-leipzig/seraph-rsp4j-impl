// Generated from /Users/rictomm/_Projects/seraph/src/main/java/ee/ut/dsg/seraph/neo4j/org.streamreasoning.gsp.syntax/org.streamreasoning.gsp.engine.Seraph.g4 by ANTLR 4.9.1
package org.streamreasoning.gsp.syntax;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SeraphParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		REGISTER=46, FROM=47, INTO=48, STREAM=49, WINDOW=50, EMIT=51, GRAPH=52, 
		RANGE=53, EVERY=54, CONSTRUCT=55, STARTING=56, ENTERING=57, SNAPSHOT=58, 
		EXIT=59, IRIREF=60, Duration=61, EVENTS=62, EARLIEST=63, LATEST=64, UNION=65, 
		ALL=66, OPTIONAL=67, MATCH=68, UNWIND=69, AS=70, MERGE=71, ON=72, CREATE=73, 
		SET=74, DETACH=75, DELETE=76, REMOVE=77, CALL=78, YIELD=79, WITH=80, RETURN=81, 
		DISTINCT=82, ORDER=83, BY=84, L_SKIP=85, LIMIT=86, ASCENDING=87, ASC=88, 
		DESCENDING=89, DESC=90, WHERE=91, OR=92, XOR=93, AND=94, NOT=95, IN=96, 
		STARTS=97, ENDS=98, CONTAINS=99, IS=100, NULL=101, COUNT=102, ANY=103, 
		NONE=104, SINGLE=105, TRUE=106, FALSE=107, EXISTS=108, CASE=109, ELSE=110, 
		END=111, WHEN=112, THEN=113, StringLiteral=114, EscapedChar=115, HexInteger=116, 
		DecimalInteger=117, OctalInteger=118, HexLetter=119, HexDigit=120, Digit=121, 
		NonZeroDigit=122, NonZeroOctDigit=123, OctDigit=124, ZeroDigit=125, ExponentDecimalReal=126, 
		RegularDecimalReal=127, CONSTRAINT=128, DO=129, FOR=130, REQUIRE=131, 
		UNIQUE=132, MANDATORY=133, SCALAR=134, OF=135, ADD=136, DROP=137, FILTER=138, 
		EXTRACT=139, UnescapedSymbolicName=140, IdentifierStart=141, IdentifierPart=142, 
		EscapedSymbolicName=143, SP=144, WHITESPACE=145, Comment=146;
	public static final int
		RULE_oC_Seraph = 0, RULE_oS_S2R = 1, RULE_oS_R2S = 2, RULE_oS_StreamOp = 3, 
		RULE_oS_Duration = 4, RULE_oS_Period = 5, RULE_oS_EventRange = 6, RULE_oS_time_instant = 7, 
		RULE_oC_Cypher = 8, RULE_oS_R2R = 9, RULE_oC_Statement = 10, RULE_oC_Query = 11, 
		RULE_oC_RegularQuery = 12, RULE_oC_Union = 13, RULE_oC_SingleQuery = 14, 
		RULE_oC_SinglePartQuery = 15, RULE_oC_MultiPartQuery = 16, RULE_oC_UpdatingClause = 17, 
		RULE_oC_ReadingClause = 18, RULE_oC_Match = 19, RULE_oC_Unwind = 20, RULE_oC_Merge = 21, 
		RULE_oC_MergeAction = 22, RULE_oC_Create = 23, RULE_oC_Set = 24, RULE_oC_SetItem = 25, 
		RULE_oC_Delete = 26, RULE_oC_Remove = 27, RULE_oC_RemoveItem = 28, RULE_oC_InQueryCall = 29, 
		RULE_oC_StandaloneCall = 30, RULE_oC_YieldItems = 31, RULE_oC_YieldItem = 32, 
		RULE_oC_With = 33, RULE_oC_Return = 34, RULE_oC_ProjectionBody = 35, RULE_oC_ProjectionItems = 36, 
		RULE_oC_ProjectionItem = 37, RULE_oC_Order = 38, RULE_oC_Skip = 39, RULE_oC_Limit = 40, 
		RULE_oC_SortItem = 41, RULE_oC_Where = 42, RULE_oC_Pattern = 43, RULE_oC_PatternPart = 44, 
		RULE_oC_AnonymousPatternPart = 45, RULE_oC_PatternElement = 46, RULE_oC_NodePattern = 47, 
		RULE_oC_PatternElementChain = 48, RULE_oC_RelationshipPattern = 49, RULE_oC_RelationshipDetail = 50, 
		RULE_oC_Properties = 51, RULE_oC_RelationshipTypes = 52, RULE_oC_NodeLabels = 53, 
		RULE_oC_NodeLabel = 54, RULE_oC_RangeLiteral = 55, RULE_oC_LabelName = 56, 
		RULE_oC_RelTypeName = 57, RULE_oC_Expression = 58, RULE_oC_OrExpression = 59, 
		RULE_oC_XorExpression = 60, RULE_oC_AndExpression = 61, RULE_oC_NotExpression = 62, 
		RULE_oC_ComparisonExpression = 63, RULE_oC_AddOrSubtractExpression = 64, 
		RULE_oC_MultiplyDivideModuloExpression = 65, RULE_oC_PowerOfExpression = 66, 
		RULE_oC_UnaryAddOrSubtractExpression = 67, RULE_oC_StringListNullOperatorExpression = 68, 
		RULE_oC_ListOperatorExpression = 69, RULE_oC_StringOperatorExpression = 70, 
		RULE_oC_NullOperatorExpression = 71, RULE_oC_PropertyOrLabelsExpression = 72, 
		RULE_oC_Atom = 73, RULE_oC_Literal = 74, RULE_oC_BooleanLiteral = 75, 
		RULE_oC_ListLiteral = 76, RULE_oC_PartialComparisonExpression = 77, RULE_oC_ParenthesizedExpression = 78, 
		RULE_oC_RelationshipsPattern = 79, RULE_oC_FilterExpression = 80, RULE_oC_IdInColl = 81, 
		RULE_oC_FunctionInvocation = 82, RULE_oC_FunctionName = 83, RULE_oC_ExplicitProcedureInvocation = 84, 
		RULE_oC_ImplicitProcedureInvocation = 85, RULE_oC_ProcedureResultField = 86, 
		RULE_oC_ProcedureName = 87, RULE_oC_Namespace = 88, RULE_oC_ListComprehension = 89, 
		RULE_oC_PatternComprehension = 90, RULE_oC_PropertyLookup = 91, RULE_oC_CaseExpression = 92, 
		RULE_oC_CaseAlternatives = 93, RULE_oC_Variable = 94, RULE_oC_NumberLiteral = 95, 
		RULE_oC_MapLiteral = 96, RULE_oC_Parameter = 97, RULE_oC_PropertyExpression = 98, 
		RULE_oC_PropertyKeyName = 99, RULE_oC_IntegerLiteral = 100, RULE_oC_DoubleLiteral = 101, 
		RULE_oC_SchemaName = 102, RULE_oC_ReservedWord = 103, RULE_oC_SymbolicName = 104, 
		RULE_oC_LeftArrowHead = 105, RULE_oC_RightArrowHead = 106, RULE_oC_Dash = 107;
	private static String[] makeRuleNames() {
		return new String[] {
			"oC_Seraph", "oS_S2R", "oS_R2S", "oS_StreamOp", "oS_Duration", "oS_Period", 
			"oS_EventRange", "oS_time_instant", "oC_Cypher", "oS_R2R", "oC_Statement", 
			"oC_Query", "oC_RegularQuery", "oC_Union", "oC_SingleQuery", "oC_SinglePartQuery", 
			"oC_MultiPartQuery", "oC_UpdatingClause", "oC_ReadingClause", "oC_Match", 
			"oC_Unwind", "oC_Merge", "oC_MergeAction", "oC_Create", "oC_Set", "oC_SetItem", 
			"oC_Delete", "oC_Remove", "oC_RemoveItem", "oC_InQueryCall", "oC_StandaloneCall", 
			"oC_YieldItems", "oC_YieldItem", "oC_With", "oC_Return", "oC_ProjectionBody", 
			"oC_ProjectionItems", "oC_ProjectionItem", "oC_Order", "oC_Skip", "oC_Limit", 
			"oC_SortItem", "oC_Where", "oC_Pattern", "oC_PatternPart", "oC_AnonymousPatternPart", 
			"oC_PatternElement", "oC_NodePattern", "oC_PatternElementChain", "oC_RelationshipPattern", 
			"oC_RelationshipDetail", "oC_Properties", "oC_RelationshipTypes", "oC_NodeLabels", 
			"oC_NodeLabel", "oC_RangeLiteral", "oC_LabelName", "oC_RelTypeName", 
			"oC_Expression", "oC_OrExpression", "oC_XorExpression", "oC_AndExpression", 
			"oC_NotExpression", "oC_ComparisonExpression", "oC_AddOrSubtractExpression", 
			"oC_MultiplyDivideModuloExpression", "oC_PowerOfExpression", "oC_UnaryAddOrSubtractExpression", 
			"oC_StringListNullOperatorExpression", "oC_ListOperatorExpression", "oC_StringOperatorExpression", 
			"oC_NullOperatorExpression", "oC_PropertyOrLabelsExpression", "oC_Atom", 
			"oC_Literal", "oC_BooleanLiteral", "oC_ListLiteral", "oC_PartialComparisonExpression", 
			"oC_ParenthesizedExpression", "oC_RelationshipsPattern", "oC_FilterExpression", 
			"oC_IdInColl", "oC_FunctionInvocation", "oC_FunctionName", "oC_ExplicitProcedureInvocation", 
			"oC_ImplicitProcedureInvocation", "oC_ProcedureResultField", "oC_ProcedureName", 
			"oC_Namespace", "oC_ListComprehension", "oC_PatternComprehension", "oC_PropertyLookup", 
			"oC_CaseExpression", "oC_CaseAlternatives", "oC_Variable", "oC_NumberLiteral", 
			"oC_MapLiteral", "oC_Parameter", "oC_PropertyExpression", "oC_PropertyKeyName", 
			"oC_IntegerLiteral", "oC_DoubleLiteral", "oC_SchemaName", "oC_ReservedWord", 
			"oC_SymbolicName", "oC_LeftArrowHead", "oC_RightArrowHead", "oC_Dash"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "','", "'='", "'+='", "'*'", "':'", "'('", 
			"')'", "'['", "']'", "'|'", "'..'", "'+'", "'-'", "'/'", "'%'", "'^'", 
			"'<>'", "'<'", "'>'", "'<='", "'>='", "'.'", "'$'", "'\u27E8'", "'\u3008'", 
			"'\uFE64'", "'\uFF1C'", "'\u27E9'", "'\u3009'", "'\uFE65'", "'\uFF1E'", 
			"'\u00AD'", "'\u2010'", "'\u2011'", "'\u2012'", "'\u2013'", "'\u2014'", 
			"'\u2015'", "'\u2212'", "'\uFE58'", "'\uFE63'", "'\uFF0D'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'0'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "REGISTER", 
			"FROM", "INTO", "STREAM", "WINDOW", "EMIT", "GRAPH", "RANGE", "EVERY", 
			"CONSTRUCT", "STARTING", "ENTERING", "SNAPSHOT", "EXIT", "IRIREF", "Duration", 
			"EVENTS", "EARLIEST", "LATEST", "UNION", "ALL", "OPTIONAL", "MATCH", 
			"UNWIND", "AS", "MERGE", "ON", "CREATE", "SET", "DETACH", "DELETE", "REMOVE", 
			"CALL", "YIELD", "WITH", "RETURN", "DISTINCT", "ORDER", "BY", "L_SKIP", 
			"LIMIT", "ASCENDING", "ASC", "DESCENDING", "DESC", "WHERE", "OR", "XOR", 
			"AND", "NOT", "IN", "STARTS", "ENDS", "CONTAINS", "IS", "NULL", "COUNT", 
			"ANY", "NONE", "SINGLE", "TRUE", "FALSE", "EXISTS", "CASE", "ELSE", "END", 
			"WHEN", "THEN", "StringLiteral", "EscapedChar", "HexInteger", "DecimalInteger", 
			"OctalInteger", "HexLetter", "HexDigit", "Digit", "NonZeroDigit", "NonZeroOctDigit", 
			"OctDigit", "ZeroDigit", "ExponentDecimalReal", "RegularDecimalReal", 
			"CONSTRAINT", "DO", "FOR", "REQUIRE", "UNIQUE", "MANDATORY", "SCALAR", 
			"OF", "ADD", "DROP", "FILTER", "EXTRACT", "UnescapedSymbolicName", "IdentifierStart", 
			"IdentifierPart", "EscapedSymbolicName", "SP", "WHITESPACE", "Comment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "org.streamreasoning.gsp.engine.Seraph.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SeraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OC_SeraphContext extends ParserRuleContext {
		public Token id;
		public OC_CypherContext oC_Cypher() {
			return getRuleContext(OC_CypherContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(SeraphParser.REGISTER, 0); }
		public OS_S2RContext oS_S2R() {
			return getRuleContext(OS_S2RContext.class,0);
		}
		public OS_R2RContext oS_R2R() {
			return getRuleContext(OS_R2RContext.class,0);
		}
		public OS_R2SContext oS_R2S() {
			return getRuleContext(OS_R2SContext.class,0);
		}
		public TerminalNode IRIREF() { return getToken(SeraphParser.IRIREF, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_SeraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Seraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Seraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Seraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Seraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SeraphContext oC_Seraph() throws RecognitionException {
		OC_SeraphContext _localctx = new OC_SeraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_oC_Seraph);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL:
			case MATCH:
			case UNWIND:
			case MERGE:
			case CREATE:
			case SET:
			case DETACH:
			case DELETE:
			case REMOVE:
			case CALL:
			case WITH:
			case RETURN:
			case SP:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				oC_Cypher();
				}
				break;
			case REGISTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(REGISTER);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(218);
					match(SP);
					}
				}

				setState(221);
				((OC_SeraphContext)_localctx).id = match(IRIREF);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(222);
					match(SP);
					}
				}

				setState(225);
				match(T__0);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(226);
					match(SP);
					}
				}

				setState(229);
				oS_S2R();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(230);
					match(SP);
					}
					break;
				}
				setState(233);
				oS_R2R();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(234);
					match(SP);
					}
				}

				setState(237);
				oS_R2S();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(238);
					match(SP);
					}
				}

				setState(241);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_S2RContext extends ParserRuleContext {
		public Token input;
		public OS_time_instantContext starting;
		public OS_DurationContext range;
		public List<TerminalNode> FROM() { return getTokens(SeraphParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SeraphParser.FROM, i);
		}
		public TerminalNode STREAM() { return getToken(SeraphParser.STREAM, 0); }
		public TerminalNode STARTING() { return getToken(SeraphParser.STARTING, 0); }
		public TerminalNode WITH() { return getToken(SeraphParser.WITH, 0); }
		public TerminalNode WINDOW() { return getToken(SeraphParser.WINDOW, 0); }
		public TerminalNode RANGE() { return getToken(SeraphParser.RANGE, 0); }
		public TerminalNode IRIREF() { return getToken(SeraphParser.IRIREF, 0); }
		public OS_time_instantContext oS_time_instant() {
			return getRuleContext(OS_time_instantContext.class,0);
		}
		public OS_DurationContext oS_Duration() {
			return getRuleContext(OS_DurationContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OS_S2RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_S2R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_S2R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_S2R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_S2R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_S2RContext oS_S2R() throws RecognitionException {
		OS_S2RContext _localctx = new OS_S2RContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_oS_S2R);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(FROM);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(246);
				match(SP);
				}
			}

			setState(249);
			match(STREAM);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(250);
				match(SP);
				}
			}

			setState(253);
			((OS_S2RContext)_localctx).input = match(IRIREF);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(254);
				match(SP);
				}
			}

			setState(257);
			match(STARTING);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(258);
				match(SP);
				}
			}

			setState(261);
			match(FROM);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(262);
				match(SP);
				}
			}

			setState(265);
			((OS_S2RContext)_localctx).starting = oS_time_instant();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(266);
				match(SP);
				}
			}

			setState(269);
			match(WITH);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(270);
				match(SP);
				}
			}

			setState(273);
			match(WINDOW);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(274);
				match(SP);
				}
			}

			setState(277);
			match(RANGE);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(278);
				match(SP);
				}
			}

			setState(281);
			((OS_S2RContext)_localctx).range = oS_Duration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_R2SContext extends ParserRuleContext {
		public OS_StreamOpContext op;
		public OS_PeriodContext period;
		public Token output;
		public TerminalNode EMIT() { return getToken(SeraphParser.EMIT, 0); }
		public TerminalNode EVERY() { return getToken(SeraphParser.EVERY, 0); }
		public TerminalNode INTO() { return getToken(SeraphParser.INTO, 0); }
		public OS_StreamOpContext oS_StreamOp() {
			return getRuleContext(OS_StreamOpContext.class,0);
		}
		public OS_PeriodContext oS_Period() {
			return getRuleContext(OS_PeriodContext.class,0);
		}
		public TerminalNode IRIREF() { return getToken(SeraphParser.IRIREF, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OS_R2SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_R2S; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_R2S(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_R2S(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_R2S(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_R2SContext oS_R2S() throws RecognitionException {
		OS_R2SContext _localctx = new OS_R2SContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oS_R2S);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(EMIT);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(284);
				match(SP);
				}
			}

			setState(287);
			((OS_R2SContext)_localctx).op = oS_StreamOp();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(288);
				match(SP);
				}
			}

			setState(291);
			match(EVERY);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(292);
				match(SP);
				}
			}

			setState(295);
			((OS_R2SContext)_localctx).period = oS_Period();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(296);
				match(SP);
				}
			}

			setState(299);
			match(INTO);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(300);
				match(SP);
				}
			}

			setState(303);
			((OS_R2SContext)_localctx).output = match(IRIREF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_StreamOpContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SeraphParser.ON, 0); }
		public TerminalNode ENTERING() { return getToken(SeraphParser.ENTERING, 0); }
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public TerminalNode EXIT() { return getToken(SeraphParser.EXIT, 0); }
		public TerminalNode SNAPSHOT() { return getToken(SeraphParser.SNAPSHOT, 0); }
		public OS_StreamOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_StreamOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_StreamOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_StreamOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_StreamOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_StreamOpContext oS_StreamOp() throws RecognitionException {
		OS_StreamOpContext _localctx = new OS_StreamOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_oS_StreamOp);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(ON);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(306);
					match(SP);
					}
				}

				setState(309);
				match(ENTERING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				match(ON);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(311);
					match(SP);
					}
				}

				setState(314);
				match(EXIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(SNAPSHOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_DurationContext extends ParserRuleContext {
		public TerminalNode Duration() { return getToken(SeraphParser.Duration, 0); }
		public OS_DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_Duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_Duration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_Duration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_Duration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_DurationContext oS_Duration() throws RecognitionException {
		OS_DurationContext _localctx = new OS_DurationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_oS_Duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(Duration);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_PeriodContext extends ParserRuleContext {
		public OS_EventRangeContext oS_EventRange() {
			return getRuleContext(OS_EventRangeContext.class,0);
		}
		public OS_DurationContext oS_Duration() {
			return getRuleContext(OS_DurationContext.class,0);
		}
		public OS_PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_Period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_Period(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_Period(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_Period(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_PeriodContext oS_Period() throws RecognitionException {
		OS_PeriodContext _localctx = new OS_PeriodContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_oS_Period);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HexInteger:
			case DecimalInteger:
			case OctalInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				oS_EventRange();
				}
				break;
			case Duration:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				oS_Duration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_EventRangeContext extends ParserRuleContext {
		public OC_IntegerLiteralContext oC_IntegerLiteral() {
			return getRuleContext(OC_IntegerLiteralContext.class,0);
		}
		public TerminalNode EVENTS() { return getToken(SeraphParser.EVENTS, 0); }
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OS_EventRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_EventRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_EventRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_EventRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_EventRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_EventRangeContext oS_EventRange() throws RecognitionException {
		OS_EventRangeContext _localctx = new OS_EventRangeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_oS_EventRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			oC_IntegerLiteral();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(325);
				match(SP);
				}
			}

			setState(328);
			match(EVENTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_time_instantContext extends ParserRuleContext {
		public TerminalNode LATEST() { return getToken(SeraphParser.LATEST, 0); }
		public TerminalNode EARLIEST() { return getToken(SeraphParser.EARLIEST, 0); }
		public OS_time_instantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_time_instant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_time_instant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_time_instant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_time_instant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_time_instantContext oS_time_instant() throws RecognitionException {
		OS_time_instantContext _localctx = new OS_time_instantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_oS_time_instant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==EARLIEST || _la==LATEST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_CypherContext extends ParserRuleContext {
		public OS_R2RContext oS_R2R() {
			return getRuleContext(OS_R2RContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SeraphParser.EOF, 0); }
		public OC_CypherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Cypher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Cypher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Cypher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Cypher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_CypherContext oC_Cypher() throws RecognitionException {
		OC_CypherContext _localctx = new OC_CypherContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_oC_Cypher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			oS_R2R();
			setState(333);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OS_R2RContext extends ParserRuleContext {
		public OC_StatementContext oC_Statement() {
			return getRuleContext(OC_StatementContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OS_R2RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oS_R2R; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOS_R2R(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOS_R2R(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOS_R2R(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OS_R2RContext oS_R2R() throws RecognitionException {
		OS_R2RContext _localctx = new OS_R2RContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_oS_R2R);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(335);
				match(SP);
				}
			}

			setState(338);
			oC_Statement();
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(339);
					match(SP);
					}
				}

				setState(342);
				match(T__2);
				}
				break;
			}
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(345);
				match(SP);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_StatementContext extends ParserRuleContext {
		public OC_QueryContext oC_Query() {
			return getRuleContext(OC_QueryContext.class,0);
		}
		public OC_StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_StatementContext oC_Statement() throws RecognitionException {
		OC_StatementContext _localctx = new OC_StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oC_Statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			oC_Query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_QueryContext extends ParserRuleContext {
		public OC_RegularQueryContext oC_RegularQuery() {
			return getRuleContext(OC_RegularQueryContext.class,0);
		}
		public OC_StandaloneCallContext oC_StandaloneCall() {
			return getRuleContext(OC_StandaloneCallContext.class,0);
		}
		public OC_QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_QueryContext oC_Query() throws RecognitionException {
		OC_QueryContext _localctx = new OC_QueryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oC_Query);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				oC_RegularQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				oC_StandaloneCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RegularQueryContext extends ParserRuleContext {
		public OC_SingleQueryContext oC_SingleQuery() {
			return getRuleContext(OC_SingleQueryContext.class,0);
		}
		public List<OC_UnionContext> oC_Union() {
			return getRuleContexts(OC_UnionContext.class);
		}
		public OC_UnionContext oC_Union(int i) {
			return getRuleContext(OC_UnionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_RegularQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RegularQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RegularQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RegularQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RegularQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RegularQueryContext oC_RegularQuery() throws RecognitionException {
		OC_RegularQueryContext _localctx = new OC_RegularQueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_oC_RegularQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			oC_SingleQuery();
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(355);
						match(SP);
						}
					}

					setState(358);
					oC_Union();
					}
					}
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_UnionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(SeraphParser.UNION, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode ALL() { return getToken(SeraphParser.ALL, 0); }
		public OC_SingleQueryContext oC_SingleQuery() {
			return getRuleContext(OC_SingleQueryContext.class,0);
		}
		public OC_UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Union(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_UnionContext oC_Union() throws RecognitionException {
		OC_UnionContext _localctx = new OC_UnionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oC_Union);
		int _la;
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(364);
				match(UNION);
				setState(365);
				match(SP);
				setState(366);
				match(ALL);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(367);
					match(SP);
					}
				}

				setState(370);
				oC_SingleQuery();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(371);
				match(UNION);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(372);
					match(SP);
					}
				}

				setState(375);
				oC_SingleQuery();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SingleQueryContext extends ParserRuleContext {
		public OC_SinglePartQueryContext oC_SinglePartQuery() {
			return getRuleContext(OC_SinglePartQueryContext.class,0);
		}
		public OC_MultiPartQueryContext oC_MultiPartQuery() {
			return getRuleContext(OC_MultiPartQueryContext.class,0);
		}
		public OC_SingleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_SingleQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_SingleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_SingleQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_SingleQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SingleQueryContext oC_SingleQuery() throws RecognitionException {
		OC_SingleQueryContext _localctx = new OC_SingleQueryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_oC_SingleQuery);
		try {
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				oC_SinglePartQuery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				oC_MultiPartQuery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SinglePartQueryContext extends ParserRuleContext {
		public OC_ReturnContext oC_Return() {
			return getRuleContext(OC_ReturnContext.class,0);
		}
		public List<OC_ReadingClauseContext> oC_ReadingClause() {
			return getRuleContexts(OC_ReadingClauseContext.class);
		}
		public OC_ReadingClauseContext oC_ReadingClause(int i) {
			return getRuleContext(OC_ReadingClauseContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<OC_UpdatingClauseContext> oC_UpdatingClause() {
			return getRuleContexts(OC_UpdatingClauseContext.class);
		}
		public OC_UpdatingClauseContext oC_UpdatingClause(int i) {
			return getRuleContext(OC_UpdatingClauseContext.class,i);
		}
		public OC_SinglePartQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_SinglePartQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_SinglePartQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_SinglePartQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_SinglePartQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SinglePartQueryContext oC_SinglePartQuery() throws RecognitionException {
		OC_SinglePartQueryContext _localctx = new OC_SinglePartQueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_oC_SinglePartQuery);
		int _la;
		try {
			int _alt;
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OPTIONAL - 67)) | (1L << (MATCH - 67)) | (1L << (UNWIND - 67)) | (1L << (CALL - 67)))) != 0)) {
					{
					{
					setState(382);
					oC_ReadingClause();
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(383);
						match(SP);
						}
					}

					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
				oC_Return();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OPTIONAL - 67)) | (1L << (MATCH - 67)) | (1L << (UNWIND - 67)) | (1L << (CALL - 67)))) != 0)) {
					{
					{
					setState(392);
					oC_ReadingClause();
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(393);
						match(SP);
						}
					}

					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
				oC_UpdatingClause();
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(403);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(402);
							match(SP);
							}
						}

						setState(405);
						oC_UpdatingClause();
						}
						}
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(415);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(411);
						match(SP);
						}
					}

					setState(414);
					oC_Return();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_MultiPartQueryContext extends ParserRuleContext {
		public OC_SinglePartQueryContext oC_SinglePartQuery() {
			return getRuleContext(OC_SinglePartQueryContext.class,0);
		}
		public List<OC_WithContext> oC_With() {
			return getRuleContexts(OC_WithContext.class);
		}
		public OC_WithContext oC_With(int i) {
			return getRuleContext(OC_WithContext.class,i);
		}
		public List<OC_ReadingClauseContext> oC_ReadingClause() {
			return getRuleContexts(OC_ReadingClauseContext.class);
		}
		public OC_ReadingClauseContext oC_ReadingClause(int i) {
			return getRuleContext(OC_ReadingClauseContext.class,i);
		}
		public List<OC_UpdatingClauseContext> oC_UpdatingClause() {
			return getRuleContexts(OC_UpdatingClauseContext.class);
		}
		public OC_UpdatingClauseContext oC_UpdatingClause(int i) {
			return getRuleContext(OC_UpdatingClauseContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_MultiPartQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_MultiPartQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_MultiPartQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_MultiPartQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_MultiPartQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_MultiPartQueryContext oC_MultiPartQuery() throws RecognitionException {
		OC_MultiPartQueryContext _localctx = new OC_MultiPartQueryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_oC_MultiPartQuery);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (OPTIONAL - 67)) | (1L << (MATCH - 67)) | (1L << (UNWIND - 67)) | (1L << (CALL - 67)))) != 0)) {
						{
						{
						setState(419);
						oC_ReadingClause();
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(420);
							match(SP);
							}
						}

						}
						}
						setState(427);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (MERGE - 71)) | (1L << (CREATE - 71)) | (1L << (SET - 71)) | (1L << (DETACH - 71)) | (1L << (DELETE - 71)) | (1L << (REMOVE - 71)))) != 0)) {
						{
						{
						setState(428);
						oC_UpdatingClause();
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(429);
							match(SP);
							}
						}

						}
						}
						setState(436);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(437);
					oC_With();
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(438);
						match(SP);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			setState(445);
			oC_SinglePartQuery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_UpdatingClauseContext extends ParserRuleContext {
		public OC_CreateContext oC_Create() {
			return getRuleContext(OC_CreateContext.class,0);
		}
		public OC_MergeContext oC_Merge() {
			return getRuleContext(OC_MergeContext.class,0);
		}
		public OC_DeleteContext oC_Delete() {
			return getRuleContext(OC_DeleteContext.class,0);
		}
		public OC_SetContext oC_Set() {
			return getRuleContext(OC_SetContext.class,0);
		}
		public OC_RemoveContext oC_Remove() {
			return getRuleContext(OC_RemoveContext.class,0);
		}
		public OC_UpdatingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_UpdatingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_UpdatingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_UpdatingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_UpdatingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_UpdatingClauseContext oC_UpdatingClause() throws RecognitionException {
		OC_UpdatingClauseContext _localctx = new OC_UpdatingClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_oC_UpdatingClause);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				oC_Create();
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				oC_Merge();
				}
				break;
			case DETACH:
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				oC_Delete();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				oC_Set();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				oC_Remove();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ReadingClauseContext extends ParserRuleContext {
		public OC_MatchContext oC_Match() {
			return getRuleContext(OC_MatchContext.class,0);
		}
		public OC_UnwindContext oC_Unwind() {
			return getRuleContext(OC_UnwindContext.class,0);
		}
		public OC_InQueryCallContext oC_InQueryCall() {
			return getRuleContext(OC_InQueryCallContext.class,0);
		}
		public OC_ReadingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ReadingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ReadingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ReadingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ReadingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ReadingClauseContext oC_ReadingClause() throws RecognitionException {
		OC_ReadingClauseContext _localctx = new OC_ReadingClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_oC_ReadingClause);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL:
			case MATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				oC_Match();
				}
				break;
			case UNWIND:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				oC_Unwind();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				oC_InQueryCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_MatchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(SeraphParser.MATCH, 0); }
		public OC_PatternContext oC_Pattern() {
			return getRuleContext(OC_PatternContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(SeraphParser.OPTIONAL, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_WhereContext oC_Where() {
			return getRuleContext(OC_WhereContext.class,0);
		}
		public OC_MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Match(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Match(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_MatchContext oC_Match() throws RecognitionException {
		OC_MatchContext _localctx = new OC_MatchContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_oC_Match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(459);
				match(OPTIONAL);
				setState(460);
				match(SP);
				}
			}

			setState(463);
			match(MATCH);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(464);
				match(SP);
				}
			}

			setState(467);
			oC_Pattern();
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(468);
					match(SP);
					}
				}

				setState(471);
				oC_Where();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_UnwindContext extends ParserRuleContext {
		public TerminalNode UNWIND() { return getToken(SeraphParser.UNWIND, 0); }
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode AS() { return getToken(SeraphParser.AS, 0); }
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_UnwindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Unwind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Unwind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Unwind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Unwind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_UnwindContext oC_Unwind() throws RecognitionException {
		OC_UnwindContext _localctx = new OC_UnwindContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_oC_Unwind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(UNWIND);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(475);
				match(SP);
				}
			}

			setState(478);
			oC_Expression();
			setState(479);
			match(SP);
			setState(480);
			match(AS);
			setState(481);
			match(SP);
			setState(482);
			oC_Variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_MergeContext extends ParserRuleContext {
		public TerminalNode MERGE() { return getToken(SeraphParser.MERGE, 0); }
		public OC_PatternPartContext oC_PatternPart() {
			return getRuleContext(OC_PatternPartContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<OC_MergeActionContext> oC_MergeAction() {
			return getRuleContexts(OC_MergeActionContext.class);
		}
		public OC_MergeActionContext oC_MergeAction(int i) {
			return getRuleContext(OC_MergeActionContext.class,i);
		}
		public OC_MergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Merge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Merge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Merge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Merge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_MergeContext oC_Merge() throws RecognitionException {
		OC_MergeContext _localctx = new OC_MergeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_oC_Merge);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(MERGE);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(485);
				match(SP);
				}
			}

			setState(488);
			oC_PatternPart();
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(489);
					match(SP);
					setState(490);
					oC_MergeAction();
					}
					}
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_MergeActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SeraphParser.ON, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode MATCH() { return getToken(SeraphParser.MATCH, 0); }
		public OC_SetContext oC_Set() {
			return getRuleContext(OC_SetContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SeraphParser.CREATE, 0); }
		public OC_MergeActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_MergeAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_MergeAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_MergeAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_MergeAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_MergeActionContext oC_MergeAction() throws RecognitionException {
		OC_MergeActionContext _localctx = new OC_MergeActionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_oC_MergeAction);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(496);
				match(ON);
				setState(497);
				match(SP);
				setState(498);
				match(MATCH);
				setState(499);
				match(SP);
				setState(500);
				oC_Set();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(501);
				match(ON);
				setState(502);
				match(SP);
				setState(503);
				match(CREATE);
				setState(504);
				match(SP);
				setState(505);
				oC_Set();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SeraphParser.CREATE, 0); }
		public OC_PatternContext oC_Pattern() {
			return getRuleContext(OC_PatternContext.class,0);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Create(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Create(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_CreateContext oC_Create() throws RecognitionException {
		OC_CreateContext _localctx = new OC_CreateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_oC_Create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(CREATE);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(509);
				match(SP);
				}
			}

			setState(512);
			oC_Pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SeraphParser.SET, 0); }
		public List<OC_SetItemContext> oC_SetItem() {
			return getRuleContexts(OC_SetItemContext.class);
		}
		public OC_SetItemContext oC_SetItem(int i) {
			return getRuleContext(OC_SetItemContext.class,i);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SetContext oC_Set() throws RecognitionException {
		OC_SetContext _localctx = new OC_SetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_oC_Set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(SET);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(515);
				match(SP);
				}
			}

			setState(518);
			oC_SetItem();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(519);
				match(T__3);
				setState(520);
				oC_SetItem();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SetItemContext extends ParserRuleContext {
		public OC_PropertyExpressionContext oC_PropertyExpression() {
			return getRuleContext(OC_PropertyExpressionContext.class,0);
		}
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_NodeLabelsContext oC_NodeLabels() {
			return getRuleContext(OC_NodeLabelsContext.class,0);
		}
		public OC_SetItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_SetItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_SetItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_SetItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_SetItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SetItemContext oC_SetItem() throws RecognitionException {
		OC_SetItemContext _localctx = new OC_SetItemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_oC_SetItem);
		int _la;
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(526);
				oC_PropertyExpression();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(527);
					match(SP);
					}
				}

				setState(530);
				match(T__4);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(531);
					match(SP);
					}
				}

				setState(534);
				oC_Expression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(536);
				oC_Variable();
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(537);
					match(SP);
					}
				}

				setState(540);
				match(T__4);
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(541);
					match(SP);
					}
				}

				setState(544);
				oC_Expression();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(546);
				oC_Variable();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(547);
					match(SP);
					}
				}

				setState(550);
				match(T__5);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(551);
					match(SP);
					}
				}

				setState(554);
				oC_Expression();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(556);
				oC_Variable();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(557);
					match(SP);
					}
				}

				setState(560);
				oC_NodeLabels();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SeraphParser.DELETE, 0); }
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public TerminalNode DETACH() { return getToken(SeraphParser.DETACH, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Delete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Delete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_DeleteContext oC_Delete() throws RecognitionException {
		OC_DeleteContext _localctx = new OC_DeleteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_oC_Delete);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DETACH) {
				{
				setState(564);
				match(DETACH);
				setState(565);
				match(SP);
				}
			}

			setState(568);
			match(DELETE);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(569);
				match(SP);
				}
			}

			setState(572);
			oC_Expression();
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(574);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(573);
						match(SP);
						}
					}

					setState(576);
					match(T__3);
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(577);
						match(SP);
						}
					}

					setState(580);
					oC_Expression();
					}
					}
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RemoveContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(SeraphParser.REMOVE, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<OC_RemoveItemContext> oC_RemoveItem() {
			return getRuleContexts(OC_RemoveItemContext.class);
		}
		public OC_RemoveItemContext oC_RemoveItem(int i) {
			return getRuleContext(OC_RemoveItemContext.class,i);
		}
		public OC_RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Remove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Remove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Remove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RemoveContext oC_Remove() throws RecognitionException {
		OC_RemoveContext _localctx = new OC_RemoveContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_oC_Remove);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(REMOVE);
			setState(587);
			match(SP);
			setState(588);
			oC_RemoveItem();
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(589);
						match(SP);
						}
					}

					setState(592);
					match(T__3);
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(593);
						match(SP);
						}
					}

					setState(596);
					oC_RemoveItem();
					}
					}
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RemoveItemContext extends ParserRuleContext {
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_NodeLabelsContext oC_NodeLabels() {
			return getRuleContext(OC_NodeLabelsContext.class,0);
		}
		public OC_PropertyExpressionContext oC_PropertyExpression() {
			return getRuleContext(OC_PropertyExpressionContext.class,0);
		}
		public OC_RemoveItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RemoveItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RemoveItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RemoveItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RemoveItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RemoveItemContext oC_RemoveItem() throws RecognitionException {
		OC_RemoveItemContext _localctx = new OC_RemoveItemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_oC_RemoveItem);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(602);
				oC_Variable();
				setState(603);
				oC_NodeLabels();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				oC_PropertyExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_InQueryCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(SeraphParser.CALL, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ExplicitProcedureInvocationContext oC_ExplicitProcedureInvocation() {
			return getRuleContext(OC_ExplicitProcedureInvocationContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(SeraphParser.YIELD, 0); }
		public OC_YieldItemsContext oC_YieldItems() {
			return getRuleContext(OC_YieldItemsContext.class,0);
		}
		public OC_InQueryCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_InQueryCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_InQueryCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_InQueryCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_InQueryCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_InQueryCallContext oC_InQueryCall() throws RecognitionException {
		OC_InQueryCallContext _localctx = new OC_InQueryCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_oC_InQueryCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(CALL);
			setState(609);
			match(SP);
			setState(610);
			oC_ExplicitProcedureInvocation();
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(611);
					match(SP);
					}
				}

				setState(614);
				match(YIELD);
				setState(615);
				match(SP);
				setState(616);
				oC_YieldItems();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_StandaloneCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(SeraphParser.CALL, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ExplicitProcedureInvocationContext oC_ExplicitProcedureInvocation() {
			return getRuleContext(OC_ExplicitProcedureInvocationContext.class,0);
		}
		public OC_ImplicitProcedureInvocationContext oC_ImplicitProcedureInvocation() {
			return getRuleContext(OC_ImplicitProcedureInvocationContext.class,0);
		}
		public TerminalNode YIELD() { return getToken(SeraphParser.YIELD, 0); }
		public OC_YieldItemsContext oC_YieldItems() {
			return getRuleContext(OC_YieldItemsContext.class,0);
		}
		public OC_StandaloneCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_StandaloneCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_StandaloneCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_StandaloneCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_StandaloneCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_StandaloneCallContext oC_StandaloneCall() throws RecognitionException {
		OC_StandaloneCallContext _localctx = new OC_StandaloneCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oC_StandaloneCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(CALL);
			setState(620);
			match(SP);
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(621);
				oC_ExplicitProcedureInvocation();
				}
				break;
			case 2:
				{
				setState(622);
				oC_ImplicitProcedureInvocation();
				}
				break;
			}
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(625);
				match(SP);
				setState(626);
				match(YIELD);
				setState(627);
				match(SP);
				setState(628);
				oC_YieldItems();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_YieldItemsContext extends ParserRuleContext {
		public OC_WhereContext oC_Where() {
			return getRuleContext(OC_WhereContext.class,0);
		}
		public List<OC_YieldItemContext> oC_YieldItem() {
			return getRuleContexts(OC_YieldItemContext.class);
		}
		public OC_YieldItemContext oC_YieldItem(int i) {
			return getRuleContext(OC_YieldItemContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_YieldItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_YieldItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_YieldItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_YieldItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_YieldItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_YieldItemsContext oC_YieldItems() throws RecognitionException {
		OC_YieldItemsContext _localctx = new OC_YieldItemsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_oC_YieldItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(631);
				match(T__6);
				}
				break;
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case HexLetter:
			case FILTER:
			case EXTRACT:
			case UnescapedSymbolicName:
			case EscapedSymbolicName:
				{
				{
				setState(632);
				oC_YieldItem();
				setState(643);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(634);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(633);
							match(SP);
							}
						}

						setState(636);
						match(T__3);
						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(637);
							match(SP);
							}
						}

						setState(640);
						oC_YieldItem();
						}
						}
					}
					setState(645);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(648);
					match(SP);
					}
				}

				setState(651);
				oC_Where();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_YieldItemContext extends ParserRuleContext {
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_ProcedureResultFieldContext oC_ProcedureResultField() {
			return getRuleContext(OC_ProcedureResultFieldContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode AS() { return getToken(SeraphParser.AS, 0); }
		public OC_YieldItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_YieldItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_YieldItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_YieldItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_YieldItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_YieldItemContext oC_YieldItem() throws RecognitionException {
		OC_YieldItemContext _localctx = new OC_YieldItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_oC_YieldItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(654);
				oC_ProcedureResultField();
				setState(655);
				match(SP);
				setState(656);
				match(AS);
				setState(657);
				match(SP);
				}
				break;
			}
			setState(661);
			oC_Variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SeraphParser.WITH, 0); }
		public OC_ProjectionBodyContext oC_ProjectionBody() {
			return getRuleContext(OC_ProjectionBodyContext.class,0);
		}
		public OC_WhereContext oC_Where() {
			return getRuleContext(OC_WhereContext.class,0);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_With; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_With(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_With(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_With(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_WithContext oC_With() throws RecognitionException {
		OC_WithContext _localctx = new OC_WithContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_oC_With);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(WITH);
			setState(664);
			oC_ProjectionBody();
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(665);
					match(SP);
					}
				}

				setState(668);
				oC_Where();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SeraphParser.RETURN, 0); }
		public OC_ProjectionBodyContext oC_ProjectionBody() {
			return getRuleContext(OC_ProjectionBodyContext.class,0);
		}
		public OC_ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ReturnContext oC_Return() throws RecognitionException {
		OC_ReturnContext _localctx = new OC_ReturnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_oC_Return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(RETURN);
			setState(672);
			oC_ProjectionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ProjectionBodyContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ProjectionItemsContext oC_ProjectionItems() {
			return getRuleContext(OC_ProjectionItemsContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(SeraphParser.DISTINCT, 0); }
		public OC_OrderContext oC_Order() {
			return getRuleContext(OC_OrderContext.class,0);
		}
		public OC_SkipContext oC_Skip() {
			return getRuleContext(OC_SkipContext.class,0);
		}
		public OC_LimitContext oC_Limit() {
			return getRuleContext(OC_LimitContext.class,0);
		}
		public OC_ProjectionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ProjectionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ProjectionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ProjectionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ProjectionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ProjectionBodyContext oC_ProjectionBody() throws RecognitionException {
		OC_ProjectionBodyContext _localctx = new OC_ProjectionBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_oC_ProjectionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(674);
					match(SP);
					}
				}

				setState(677);
				match(DISTINCT);
				}
				break;
			}
			setState(680);
			match(SP);
			setState(681);
			oC_ProjectionItems();
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(682);
				match(SP);
				setState(683);
				oC_Order();
				}
				break;
			}
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(686);
				match(SP);
				setState(687);
				oC_Skip();
				}
				break;
			}
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(690);
				match(SP);
				setState(691);
				oC_Limit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ProjectionItemsContext extends ParserRuleContext {
		public List<OC_ProjectionItemContext> oC_ProjectionItem() {
			return getRuleContexts(OC_ProjectionItemContext.class);
		}
		public OC_ProjectionItemContext oC_ProjectionItem(int i) {
			return getRuleContext(OC_ProjectionItemContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ProjectionItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ProjectionItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ProjectionItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ProjectionItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ProjectionItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ProjectionItemsContext oC_ProjectionItems() throws RecognitionException {
		OC_ProjectionItemsContext _localctx = new OC_ProjectionItemsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_oC_ProjectionItems);
		int _la;
		try {
			int _alt;
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(694);
				match(T__6);
				setState(705);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(696);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(695);
							match(SP);
							}
						}

						setState(698);
						match(T__3);
						setState(700);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(699);
							match(SP);
							}
						}

						setState(702);
						oC_ProjectionItem();
						}
						}
					}
					setState(707);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				}
				break;
			case T__0:
			case T__8:
			case T__10:
			case T__14:
			case T__15:
			case T__25:
			case ALL:
			case NOT:
			case NULL:
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case TRUE:
			case FALSE:
			case EXISTS:
			case CASE:
			case StringLiteral:
			case HexInteger:
			case DecimalInteger:
			case OctalInteger:
			case HexLetter:
			case ExponentDecimalReal:
			case RegularDecimalReal:
			case FILTER:
			case EXTRACT:
			case UnescapedSymbolicName:
			case EscapedSymbolicName:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(708);
				oC_ProjectionItem();
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(710);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(709);
							match(SP);
							}
						}

						setState(712);
						match(T__3);
						setState(714);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(713);
							match(SP);
							}
						}

						setState(716);
						oC_ProjectionItem();
						}
						}
					}
					setState(721);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ProjectionItemContext extends ParserRuleContext {
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode AS() { return getToken(SeraphParser.AS, 0); }
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_ProjectionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ProjectionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ProjectionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ProjectionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ProjectionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ProjectionItemContext oC_ProjectionItem() throws RecognitionException {
		OC_ProjectionItemContext _localctx = new OC_ProjectionItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_oC_ProjectionItem);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(724);
				oC_Expression();
				setState(725);
				match(SP);
				setState(726);
				match(AS);
				setState(727);
				match(SP);
				setState(728);
				oC_Variable();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				oC_Expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_OrderContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SeraphParser.ORDER, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode BY() { return getToken(SeraphParser.BY, 0); }
		public List<OC_SortItemContext> oC_SortItem() {
			return getRuleContexts(OC_SortItemContext.class);
		}
		public OC_SortItemContext oC_SortItem(int i) {
			return getRuleContext(OC_SortItemContext.class,i);
		}
		public OC_OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Order(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Order(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_OrderContext oC_Order() throws RecognitionException {
		OC_OrderContext _localctx = new OC_OrderContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_oC_Order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(ORDER);
			setState(734);
			match(SP);
			setState(735);
			match(BY);
			setState(736);
			match(SP);
			setState(737);
			oC_SortItem();
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(738);
				match(T__3);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(739);
					match(SP);
					}
				}

				setState(742);
				oC_SortItem();
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SkipContext extends ParserRuleContext {
		public TerminalNode L_SKIP() { return getToken(SeraphParser.L_SKIP, 0); }
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public OC_SkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Skip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Skip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Skip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Skip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SkipContext oC_Skip() throws RecognitionException {
		OC_SkipContext _localctx = new OC_SkipContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_oC_Skip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			match(L_SKIP);
			setState(749);
			match(SP);
			setState(750);
			oC_Expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SeraphParser.LIMIT, 0); }
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public OC_LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Limit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_LimitContext oC_Limit() throws RecognitionException {
		OC_LimitContext _localctx = new OC_LimitContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_oC_Limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(LIMIT);
			setState(753);
			match(SP);
			setState(754);
			oC_Expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SortItemContext extends ParserRuleContext {
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public TerminalNode ASCENDING() { return getToken(SeraphParser.ASCENDING, 0); }
		public TerminalNode ASC() { return getToken(SeraphParser.ASC, 0); }
		public TerminalNode DESCENDING() { return getToken(SeraphParser.DESCENDING, 0); }
		public TerminalNode DESC() { return getToken(SeraphParser.DESC, 0); }
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_SortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_SortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_SortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_SortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SortItemContext oC_SortItem() throws RecognitionException {
		OC_SortItemContext _localctx = new OC_SortItemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oC_SortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			oC_Expression();
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(757);
					match(SP);
					}
				}

				setState(760);
				_la = _input.LA(1);
				if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (ASCENDING - 87)) | (1L << (ASC - 87)) | (1L << (DESCENDING - 87)) | (1L << (DESC - 87)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SeraphParser.WHERE, 0); }
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public OC_WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Where(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Where(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_WhereContext oC_Where() throws RecognitionException {
		OC_WhereContext _localctx = new OC_WhereContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_oC_Where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(WHERE);
			setState(764);
			match(SP);
			setState(765);
			oC_Expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PatternContext extends ParserRuleContext {
		public List<OC_PatternPartContext> oC_PatternPart() {
			return getRuleContexts(OC_PatternPartContext.class);
		}
		public OC_PatternPartContext oC_PatternPart(int i) {
			return getRuleContext(OC_PatternPartContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PatternContext oC_Pattern() throws RecognitionException {
		OC_PatternContext _localctx = new OC_PatternContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_oC_Pattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			oC_PatternPart();
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(768);
						match(SP);
						}
					}

					setState(771);
					match(T__3);
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(772);
						match(SP);
						}
					}

					setState(775);
					oC_PatternPart();
					}
					}
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PatternPartContext extends ParserRuleContext {
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_AnonymousPatternPartContext oC_AnonymousPatternPart() {
			return getRuleContext(OC_AnonymousPatternPartContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_PatternPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PatternPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PatternPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PatternPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PatternPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PatternPartContext oC_PatternPart() throws RecognitionException {
		OC_PatternPartContext _localctx = new OC_PatternPartContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_oC_PatternPart);
		int _la;
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case HexLetter:
			case FILTER:
			case EXTRACT:
			case UnescapedSymbolicName:
			case EscapedSymbolicName:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(781);
				oC_Variable();
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(782);
					match(SP);
					}
				}

				setState(785);
				match(T__7);
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(786);
					match(SP);
					}
				}

				setState(789);
				oC_AnonymousPatternPart();
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				oC_AnonymousPatternPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_AnonymousPatternPartContext extends ParserRuleContext {
		public OC_PatternElementContext oC_PatternElement() {
			return getRuleContext(OC_PatternElementContext.class,0);
		}
		public OC_AnonymousPatternPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_AnonymousPatternPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_AnonymousPatternPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_AnonymousPatternPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_AnonymousPatternPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_AnonymousPatternPartContext oC_AnonymousPatternPart() throws RecognitionException {
		OC_AnonymousPatternPartContext _localctx = new OC_AnonymousPatternPartContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_oC_AnonymousPatternPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			oC_PatternElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PatternElementContext extends ParserRuleContext {
		public OC_NodePatternContext oC_NodePattern() {
			return getRuleContext(OC_NodePatternContext.class,0);
		}
		public List<OC_PatternElementChainContext> oC_PatternElementChain() {
			return getRuleContexts(OC_PatternElementChainContext.class);
		}
		public OC_PatternElementChainContext oC_PatternElementChain(int i) {
			return getRuleContext(OC_PatternElementChainContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_PatternElementContext oC_PatternElement() {
			return getRuleContext(OC_PatternElementContext.class,0);
		}
		public OC_PatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PatternElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PatternElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PatternElementContext oC_PatternElement() throws RecognitionException {
		OC_PatternElementContext _localctx = new OC_PatternElementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_oC_PatternElement);
		int _la;
		try {
			int _alt;
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(796);
				oC_NodePattern();
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(798);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(797);
							match(SP);
							}
						}

						setState(800);
						oC_PatternElementChain();
						}
						}
					}
					setState(805);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(806);
				match(T__8);
				setState(807);
				oC_PatternElement();
				setState(808);
				match(T__9);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_NodePatternContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_NodeLabelsContext oC_NodeLabels() {
			return getRuleContext(OC_NodeLabelsContext.class,0);
		}
		public OC_PropertiesContext oC_Properties() {
			return getRuleContext(OC_PropertiesContext.class,0);
		}
		public OC_NodePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_NodePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_NodePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_NodePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_NodePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_NodePatternContext oC_NodePattern() throws RecognitionException {
		OC_NodePatternContext _localctx = new OC_NodePatternContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_oC_NodePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			match(T__8);
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(813);
				match(SP);
				}
			}

			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (COUNT - 102)) | (1L << (ANY - 102)) | (1L << (NONE - 102)) | (1L << (SINGLE - 102)) | (1L << (HexLetter - 102)) | (1L << (FILTER - 102)) | (1L << (EXTRACT - 102)) | (1L << (UnescapedSymbolicName - 102)) | (1L << (EscapedSymbolicName - 102)))) != 0)) {
				{
				setState(816);
				oC_Variable();
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(817);
					match(SP);
					}
				}

				}
			}

			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(822);
				oC_NodeLabels();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(823);
					match(SP);
					}
				}

				}
			}

			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__25) {
				{
				setState(828);
				oC_Properties();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(829);
					match(SP);
					}
				}

				}
			}

			setState(834);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PatternElementChainContext extends ParserRuleContext {
		public OC_RelationshipPatternContext oC_RelationshipPattern() {
			return getRuleContext(OC_RelationshipPatternContext.class,0);
		}
		public OC_NodePatternContext oC_NodePattern() {
			return getRuleContext(OC_NodePatternContext.class,0);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_PatternElementChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PatternElementChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PatternElementChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PatternElementChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PatternElementChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PatternElementChainContext oC_PatternElementChain() throws RecognitionException {
		OC_PatternElementChainContext _localctx = new OC_PatternElementChainContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_oC_PatternElementChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			oC_RelationshipPattern();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(837);
				match(SP);
				}
			}

			setState(840);
			oC_NodePattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RelationshipPatternContext extends ParserRuleContext {
		public OC_LeftArrowHeadContext oC_LeftArrowHead() {
			return getRuleContext(OC_LeftArrowHeadContext.class,0);
		}
		public List<OC_DashContext> oC_Dash() {
			return getRuleContexts(OC_DashContext.class);
		}
		public OC_DashContext oC_Dash(int i) {
			return getRuleContext(OC_DashContext.class,i);
		}
		public OC_RightArrowHeadContext oC_RightArrowHead() {
			return getRuleContext(OC_RightArrowHeadContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_RelationshipDetailContext oC_RelationshipDetail() {
			return getRuleContext(OC_RelationshipDetailContext.class,0);
		}
		public OC_RelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RelationshipPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RelationshipPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RelationshipPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RelationshipPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RelationshipPatternContext oC_RelationshipPattern() throws RecognitionException {
		OC_RelationshipPatternContext _localctx = new OC_RelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_oC_RelationshipPattern);
		int _la;
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(842);
				oC_LeftArrowHead();
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(843);
					match(SP);
					}
				}

				setState(846);
				oC_Dash();
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(847);
					match(SP);
					}
					break;
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(850);
					oC_RelationshipDetail();
					}
				}

				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(853);
					match(SP);
					}
				}

				setState(856);
				oC_Dash();
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(857);
					match(SP);
					}
				}

				setState(860);
				oC_RightArrowHead();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(862);
				oC_LeftArrowHead();
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(863);
					match(SP);
					}
				}

				setState(866);
				oC_Dash();
				setState(868);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(867);
					match(SP);
					}
					break;
				}
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(870);
					oC_RelationshipDetail();
					}
				}

				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(873);
					match(SP);
					}
				}

				setState(876);
				oC_Dash();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(878);
				oC_Dash();
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(879);
					match(SP);
					}
					break;
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(882);
					oC_RelationshipDetail();
					}
				}

				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(885);
					match(SP);
					}
				}

				setState(888);
				oC_Dash();
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(889);
					match(SP);
					}
				}

				setState(892);
				oC_RightArrowHead();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(894);
				oC_Dash();
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(895);
					match(SP);
					}
					break;
				}
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(898);
					oC_RelationshipDetail();
					}
				}

				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(901);
					match(SP);
					}
				}

				setState(904);
				oC_Dash();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RelationshipDetailContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_RelationshipTypesContext oC_RelationshipTypes() {
			return getRuleContext(OC_RelationshipTypesContext.class,0);
		}
		public OC_RangeLiteralContext oC_RangeLiteral() {
			return getRuleContext(OC_RangeLiteralContext.class,0);
		}
		public OC_PropertiesContext oC_Properties() {
			return getRuleContext(OC_PropertiesContext.class,0);
		}
		public OC_RelationshipDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RelationshipDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RelationshipDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RelationshipDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RelationshipDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RelationshipDetailContext oC_RelationshipDetail() throws RecognitionException {
		OC_RelationshipDetailContext _localctx = new OC_RelationshipDetailContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_oC_RelationshipDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			match(T__10);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(909);
				match(SP);
				}
			}

			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (COUNT - 102)) | (1L << (ANY - 102)) | (1L << (NONE - 102)) | (1L << (SINGLE - 102)) | (1L << (HexLetter - 102)) | (1L << (FILTER - 102)) | (1L << (EXTRACT - 102)) | (1L << (UnescapedSymbolicName - 102)) | (1L << (EscapedSymbolicName - 102)))) != 0)) {
				{
				setState(912);
				oC_Variable();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(913);
					match(SP);
					}
				}

				}
			}

			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(918);
				oC_RelationshipTypes();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(919);
					match(SP);
					}
				}

				}
			}

			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(924);
				oC_RangeLiteral();
				}
			}

			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__25) {
				{
				setState(927);
				oC_Properties();
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(928);
					match(SP);
					}
				}

				}
			}

			setState(933);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PropertiesContext extends ParserRuleContext {
		public OC_MapLiteralContext oC_MapLiteral() {
			return getRuleContext(OC_MapLiteralContext.class,0);
		}
		public OC_ParameterContext oC_Parameter() {
			return getRuleContext(OC_ParameterContext.class,0);
		}
		public OC_PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Properties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Properties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Properties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PropertiesContext oC_Properties() throws RecognitionException {
		OC_PropertiesContext _localctx = new OC_PropertiesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_oC_Properties);
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				oC_MapLiteral();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				oC_Parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RelationshipTypesContext extends ParserRuleContext {
		public List<OC_RelTypeNameContext> oC_RelTypeName() {
			return getRuleContexts(OC_RelTypeNameContext.class);
		}
		public OC_RelTypeNameContext oC_RelTypeName(int i) {
			return getRuleContext(OC_RelTypeNameContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_RelationshipTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RelationshipTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RelationshipTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RelationshipTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RelationshipTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RelationshipTypesContext oC_RelationshipTypes() throws RecognitionException {
		OC_RelationshipTypesContext _localctx = new OC_RelationshipTypesContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_oC_RelationshipTypes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(T__7);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(940);
				match(SP);
				}
			}

			setState(943);
			oC_RelTypeName();
			setState(957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(944);
						match(SP);
						}
					}

					setState(947);
					match(T__12);
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__7) {
						{
						setState(948);
						match(T__7);
						}
					}

					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(951);
						match(SP);
						}
					}

					setState(954);
					oC_RelTypeName();
					}
					}
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_NodeLabelsContext extends ParserRuleContext {
		public List<OC_NodeLabelContext> oC_NodeLabel() {
			return getRuleContexts(OC_NodeLabelContext.class);
		}
		public OC_NodeLabelContext oC_NodeLabel(int i) {
			return getRuleContext(OC_NodeLabelContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_NodeLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_NodeLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_NodeLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_NodeLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_NodeLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_NodeLabelsContext oC_NodeLabels() throws RecognitionException {
		OC_NodeLabelsContext _localctx = new OC_NodeLabelsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_oC_NodeLabels);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			oC_NodeLabel();
			setState(967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(962);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(961);
						match(SP);
						}
					}

					setState(964);
					oC_NodeLabel();
					}
					}
				}
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_NodeLabelContext extends ParserRuleContext {
		public OC_LabelNameContext oC_LabelName() {
			return getRuleContext(OC_LabelNameContext.class,0);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_NodeLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_NodeLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_NodeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_NodeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_NodeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_NodeLabelContext oC_NodeLabel() throws RecognitionException {
		OC_NodeLabelContext _localctx = new OC_NodeLabelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_oC_NodeLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(T__7);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(971);
				match(SP);
				}
			}

			setState(974);
			oC_LabelName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RangeLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<OC_IntegerLiteralContext> oC_IntegerLiteral() {
			return getRuleContexts(OC_IntegerLiteralContext.class);
		}
		public OC_IntegerLiteralContext oC_IntegerLiteral(int i) {
			return getRuleContext(OC_IntegerLiteralContext.class,i);
		}
		public OC_RangeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RangeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RangeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RangeLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RangeLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RangeLiteralContext oC_RangeLiteral() throws RecognitionException {
		OC_RangeLiteralContext _localctx = new OC_RangeLiteralContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_oC_RangeLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(T__6);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(977);
				match(SP);
				}
			}

			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (HexInteger - 116)) | (1L << (DecimalInteger - 116)) | (1L << (OctalInteger - 116)))) != 0)) {
				{
				setState(980);
				oC_IntegerLiteral();
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(981);
					match(SP);
					}
				}

				}
			}

			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(986);
				match(T__13);
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(987);
					match(SP);
					}
				}

				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (HexInteger - 116)) | (1L << (DecimalInteger - 116)) | (1L << (OctalInteger - 116)))) != 0)) {
					{
					setState(990);
					oC_IntegerLiteral();
					setState(992);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(991);
						match(SP);
						}
					}

					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_LabelNameContext extends ParserRuleContext {
		public OC_SchemaNameContext oC_SchemaName() {
			return getRuleContext(OC_SchemaNameContext.class,0);
		}
		public OC_LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_LabelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_LabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_LabelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_LabelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_LabelNameContext oC_LabelName() throws RecognitionException {
		OC_LabelNameContext _localctx = new OC_LabelNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_oC_LabelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			oC_SchemaName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RelTypeNameContext extends ParserRuleContext {
		public OC_SchemaNameContext oC_SchemaName() {
			return getRuleContext(OC_SchemaNameContext.class,0);
		}
		public OC_RelTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RelTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RelTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RelTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RelTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RelTypeNameContext oC_RelTypeName() throws RecognitionException {
		OC_RelTypeNameContext _localctx = new OC_RelTypeNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_oC_RelTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			oC_SchemaName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ExpressionContext extends ParserRuleContext {
		public OC_OrExpressionContext oC_OrExpression() {
			return getRuleContext(OC_OrExpressionContext.class,0);
		}
		public OC_ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ExpressionContext oC_Expression() throws RecognitionException {
		OC_ExpressionContext _localctx = new OC_ExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_oC_Expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			oC_OrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_OrExpressionContext extends ParserRuleContext {
		public List<OC_XorExpressionContext> oC_XorExpression() {
			return getRuleContexts(OC_XorExpressionContext.class);
		}
		public OC_XorExpressionContext oC_XorExpression(int i) {
			return getRuleContext(OC_XorExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<TerminalNode> OR() { return getTokens(SeraphParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SeraphParser.OR, i);
		}
		public OC_OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_OrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_OrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_OrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_OrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_OrExpressionContext oC_OrExpression() throws RecognitionException {
		OC_OrExpressionContext _localctx = new OC_OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_oC_OrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			oC_XorExpression();
			setState(1011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1005);
					match(SP);
					setState(1006);
					match(OR);
					setState(1007);
					match(SP);
					setState(1008);
					oC_XorExpression();
					}
					}
				}
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_XorExpressionContext extends ParserRuleContext {
		public List<OC_AndExpressionContext> oC_AndExpression() {
			return getRuleContexts(OC_AndExpressionContext.class);
		}
		public OC_AndExpressionContext oC_AndExpression(int i) {
			return getRuleContext(OC_AndExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<TerminalNode> XOR() { return getTokens(SeraphParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(SeraphParser.XOR, i);
		}
		public OC_XorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_XorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_XorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_XorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_XorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_XorExpressionContext oC_XorExpression() throws RecognitionException {
		OC_XorExpressionContext _localctx = new OC_XorExpressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_oC_XorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			oC_AndExpression();
			setState(1021);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1015);
					match(SP);
					setState(1016);
					match(XOR);
					setState(1017);
					match(SP);
					setState(1018);
					oC_AndExpression();
					}
					}
				}
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_AndExpressionContext extends ParserRuleContext {
		public List<OC_NotExpressionContext> oC_NotExpression() {
			return getRuleContexts(OC_NotExpressionContext.class);
		}
		public OC_NotExpressionContext oC_NotExpression(int i) {
			return getRuleContext(OC_NotExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<TerminalNode> AND() { return getTokens(SeraphParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SeraphParser.AND, i);
		}
		public OC_AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_AndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_AndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_AndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_AndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_AndExpressionContext oC_AndExpression() throws RecognitionException {
		OC_AndExpressionContext _localctx = new OC_AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_oC_AndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			oC_NotExpression();
			setState(1031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1025);
					match(SP);
					setState(1026);
					match(AND);
					setState(1027);
					match(SP);
					setState(1028);
					oC_NotExpression();
					}
					}
				}
				setState(1033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_NotExpressionContext extends ParserRuleContext {
		public OC_ComparisonExpressionContext oC_ComparisonExpression() {
			return getRuleContext(OC_ComparisonExpressionContext.class,0);
		}
		public List<TerminalNode> NOT() { return getTokens(SeraphParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(SeraphParser.NOT, i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_NotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_NotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_NotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_NotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_NotExpressionContext oC_NotExpression() throws RecognitionException {
		OC_NotExpressionContext _localctx = new OC_NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_oC_NotExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOT) {
				{
				{
				setState(1034);
				match(NOT);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1035);
					match(SP);
					}
				}

				}
				}
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1043);
			oC_ComparisonExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ComparisonExpressionContext extends ParserRuleContext {
		public OC_AddOrSubtractExpressionContext oC_AddOrSubtractExpression() {
			return getRuleContext(OC_AddOrSubtractExpressionContext.class,0);
		}
		public List<OC_PartialComparisonExpressionContext> oC_PartialComparisonExpression() {
			return getRuleContexts(OC_PartialComparisonExpressionContext.class);
		}
		public OC_PartialComparisonExpressionContext oC_PartialComparisonExpression(int i) {
			return getRuleContext(OC_PartialComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ComparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ComparisonExpressionContext oC_ComparisonExpression() throws RecognitionException {
		OC_ComparisonExpressionContext _localctx = new OC_ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_oC_ComparisonExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			oC_AddOrSubtractExpression();
			setState(1052);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1046);
						match(SP);
						}
					}

					setState(1049);
					oC_PartialComparisonExpression();
					}
					}
				}
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_AddOrSubtractExpressionContext extends ParserRuleContext {
		public List<OC_MultiplyDivideModuloExpressionContext> oC_MultiplyDivideModuloExpression() {
			return getRuleContexts(OC_MultiplyDivideModuloExpressionContext.class);
		}
		public OC_MultiplyDivideModuloExpressionContext oC_MultiplyDivideModuloExpression(int i) {
			return getRuleContext(OC_MultiplyDivideModuloExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_AddOrSubtractExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_AddOrSubtractExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_AddOrSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_AddOrSubtractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_AddOrSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_AddOrSubtractExpressionContext oC_AddOrSubtractExpression() throws RecognitionException {
		OC_AddOrSubtractExpressionContext _localctx = new OC_AddOrSubtractExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_oC_AddOrSubtractExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			oC_MultiplyDivideModuloExpression();
			setState(1074);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1072);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						{
						setState(1057);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1056);
							match(SP);
							}
						}

						setState(1059);
						match(T__14);
						setState(1061);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1060);
							match(SP);
							}
						}

						setState(1063);
						oC_MultiplyDivideModuloExpression();
						}
						}
						break;
					case 2:
						{
						{
						setState(1065);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1064);
							match(SP);
							}
						}

						setState(1067);
						match(T__15);
						setState(1069);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1068);
							match(SP);
							}
						}

						setState(1071);
						oC_MultiplyDivideModuloExpression();
						}
						}
						break;
					}
					}
				}
				setState(1076);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_MultiplyDivideModuloExpressionContext extends ParserRuleContext {
		public List<OC_PowerOfExpressionContext> oC_PowerOfExpression() {
			return getRuleContexts(OC_PowerOfExpressionContext.class);
		}
		public OC_PowerOfExpressionContext oC_PowerOfExpression(int i) {
			return getRuleContext(OC_PowerOfExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_MultiplyDivideModuloExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_MultiplyDivideModuloExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_MultiplyDivideModuloExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_MultiplyDivideModuloExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_MultiplyDivideModuloExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_MultiplyDivideModuloExpressionContext oC_MultiplyDivideModuloExpression() throws RecognitionException {
		OC_MultiplyDivideModuloExpressionContext _localctx = new OC_MultiplyDivideModuloExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_oC_MultiplyDivideModuloExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			oC_PowerOfExpression();
			setState(1104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
					case 1:
						{
						{
						setState(1079);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1078);
							match(SP);
							}
						}

						setState(1081);
						match(T__6);
						setState(1083);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1082);
							match(SP);
							}
						}

						setState(1085);
						oC_PowerOfExpression();
						}
						}
						break;
					case 2:
						{
						{
						setState(1087);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1086);
							match(SP);
							}
						}

						setState(1089);
						match(T__16);
						setState(1091);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1090);
							match(SP);
							}
						}

						setState(1093);
						oC_PowerOfExpression();
						}
						}
						break;
					case 3:
						{
						{
						setState(1095);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1094);
							match(SP);
							}
						}

						setState(1097);
						match(T__17);
						setState(1099);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1098);
							match(SP);
							}
						}

						setState(1101);
						oC_PowerOfExpression();
						}
						}
						break;
					}
					}
				}
				setState(1106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PowerOfExpressionContext extends ParserRuleContext {
		public List<OC_UnaryAddOrSubtractExpressionContext> oC_UnaryAddOrSubtractExpression() {
			return getRuleContexts(OC_UnaryAddOrSubtractExpressionContext.class);
		}
		public OC_UnaryAddOrSubtractExpressionContext oC_UnaryAddOrSubtractExpression(int i) {
			return getRuleContext(OC_UnaryAddOrSubtractExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_PowerOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PowerOfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PowerOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PowerOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PowerOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PowerOfExpressionContext oC_PowerOfExpression() throws RecognitionException {
		OC_PowerOfExpressionContext _localctx = new OC_PowerOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_oC_PowerOfExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			oC_UnaryAddOrSubtractExpression();
			setState(1118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1108);
						match(SP);
						}
					}

					setState(1111);
					match(T__18);
					setState(1113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1112);
						match(SP);
						}
					}

					setState(1115);
					oC_UnaryAddOrSubtractExpression();
					}
					}
				}
				setState(1120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_UnaryAddOrSubtractExpressionContext extends ParserRuleContext {
		public OC_StringListNullOperatorExpressionContext oC_StringListNullOperatorExpression() {
			return getRuleContext(OC_StringListNullOperatorExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_UnaryAddOrSubtractExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_UnaryAddOrSubtractExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_UnaryAddOrSubtractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_UnaryAddOrSubtractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_UnaryAddOrSubtractExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_UnaryAddOrSubtractExpressionContext oC_UnaryAddOrSubtractExpression() throws RecognitionException {
		OC_UnaryAddOrSubtractExpressionContext _localctx = new OC_UnaryAddOrSubtractExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_oC_UnaryAddOrSubtractExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(1121);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1122);
					match(SP);
					}
				}

				}
				}
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1130);
			oC_StringListNullOperatorExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_StringListNullOperatorExpressionContext extends ParserRuleContext {
		public OC_PropertyOrLabelsExpressionContext oC_PropertyOrLabelsExpression() {
			return getRuleContext(OC_PropertyOrLabelsExpressionContext.class,0);
		}
		public List<OC_StringOperatorExpressionContext> oC_StringOperatorExpression() {
			return getRuleContexts(OC_StringOperatorExpressionContext.class);
		}
		public OC_StringOperatorExpressionContext oC_StringOperatorExpression(int i) {
			return getRuleContext(OC_StringOperatorExpressionContext.class,i);
		}
		public List<OC_ListOperatorExpressionContext> oC_ListOperatorExpression() {
			return getRuleContexts(OC_ListOperatorExpressionContext.class);
		}
		public OC_ListOperatorExpressionContext oC_ListOperatorExpression(int i) {
			return getRuleContext(OC_ListOperatorExpressionContext.class,i);
		}
		public List<OC_NullOperatorExpressionContext> oC_NullOperatorExpression() {
			return getRuleContexts(OC_NullOperatorExpressionContext.class);
		}
		public OC_NullOperatorExpressionContext oC_NullOperatorExpression(int i) {
			return getRuleContext(OC_NullOperatorExpressionContext.class,i);
		}
		public OC_StringListNullOperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_StringListNullOperatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_StringListNullOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_StringListNullOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_StringListNullOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_StringListNullOperatorExpressionContext oC_StringListNullOperatorExpression() throws RecognitionException {
		OC_StringListNullOperatorExpressionContext _localctx = new OC_StringListNullOperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_oC_StringListNullOperatorExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			oC_PropertyOrLabelsExpression();
			setState(1138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						setState(1133);
						oC_StringOperatorExpression();
						}
						break;
					case 2:
						{
						setState(1134);
						oC_ListOperatorExpression();
						}
						break;
					case 3:
						{
						setState(1135);
						oC_NullOperatorExpression();
						}
						break;
					}
					}
				}
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ListOperatorExpressionContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode IN() { return getToken(SeraphParser.IN, 0); }
		public OC_PropertyOrLabelsExpressionContext oC_PropertyOrLabelsExpression() {
			return getRuleContext(OC_PropertyOrLabelsExpressionContext.class,0);
		}
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public OC_ListOperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ListOperatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ListOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ListOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ListOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ListOperatorExpressionContext oC_ListOperatorExpression() throws RecognitionException {
		OC_ListOperatorExpressionContext _localctx = new OC_ListOperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_oC_ListOperatorExpression);
		int _la;
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1141);
				match(SP);
				setState(1142);
				match(IN);
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1143);
					match(SP);
					}
				}

				setState(1146);
				oC_PropertyOrLabelsExpression();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1147);
					match(SP);
					}
				}

				setState(1150);
				match(T__10);
				setState(1151);
				oC_Expression();
				setState(1152);
				match(T__11);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1154);
					match(SP);
					}
				}

				setState(1157);
				match(T__10);
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__25))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ALL - 66)) | (1L << (NOT - 66)) | (1L << (NULL - 66)) | (1L << (COUNT - 66)) | (1L << (ANY - 66)) | (1L << (NONE - 66)) | (1L << (SINGLE - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (EXISTS - 66)) | (1L << (CASE - 66)) | (1L << (StringLiteral - 66)) | (1L << (HexInteger - 66)) | (1L << (DecimalInteger - 66)) | (1L << (OctalInteger - 66)) | (1L << (HexLetter - 66)) | (1L << (ExponentDecimalReal - 66)) | (1L << (RegularDecimalReal - 66)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (FILTER - 138)) | (1L << (EXTRACT - 138)) | (1L << (UnescapedSymbolicName - 138)) | (1L << (EscapedSymbolicName - 138)))) != 0)) {
					{
					setState(1158);
					oC_Expression();
					}
				}

				setState(1161);
				match(T__13);
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__25))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ALL - 66)) | (1L << (NOT - 66)) | (1L << (NULL - 66)) | (1L << (COUNT - 66)) | (1L << (ANY - 66)) | (1L << (NONE - 66)) | (1L << (SINGLE - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (EXISTS - 66)) | (1L << (CASE - 66)) | (1L << (StringLiteral - 66)) | (1L << (HexInteger - 66)) | (1L << (DecimalInteger - 66)) | (1L << (OctalInteger - 66)) | (1L << (HexLetter - 66)) | (1L << (ExponentDecimalReal - 66)) | (1L << (RegularDecimalReal - 66)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (FILTER - 138)) | (1L << (EXTRACT - 138)) | (1L << (UnescapedSymbolicName - 138)) | (1L << (EscapedSymbolicName - 138)))) != 0)) {
					{
					setState(1162);
					oC_Expression();
					}
				}

				setState(1165);
				match(T__11);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_StringOperatorExpressionContext extends ParserRuleContext {
		public OC_PropertyOrLabelsExpressionContext oC_PropertyOrLabelsExpression() {
			return getRuleContext(OC_PropertyOrLabelsExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode STARTS() { return getToken(SeraphParser.STARTS, 0); }
		public TerminalNode WITH() { return getToken(SeraphParser.WITH, 0); }
		public TerminalNode ENDS() { return getToken(SeraphParser.ENDS, 0); }
		public TerminalNode CONTAINS() { return getToken(SeraphParser.CONTAINS, 0); }
		public OC_StringOperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_StringOperatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_StringOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_StringOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_StringOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_StringOperatorExpressionContext oC_StringOperatorExpression() throws RecognitionException {
		OC_StringOperatorExpressionContext _localctx = new OC_StringOperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_oC_StringOperatorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				{
				setState(1168);
				match(SP);
				setState(1169);
				match(STARTS);
				setState(1170);
				match(SP);
				setState(1171);
				match(WITH);
				}
				}
				break;
			case 2:
				{
				{
				setState(1172);
				match(SP);
				setState(1173);
				match(ENDS);
				setState(1174);
				match(SP);
				setState(1175);
				match(WITH);
				}
				}
				break;
			case 3:
				{
				{
				setState(1176);
				match(SP);
				setState(1177);
				match(CONTAINS);
				}
				}
				break;
			}
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1180);
				match(SP);
				}
			}

			setState(1183);
			oC_PropertyOrLabelsExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_NullOperatorExpressionContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode IS() { return getToken(SeraphParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SeraphParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SeraphParser.NOT, 0); }
		public OC_NullOperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_NullOperatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_NullOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_NullOperatorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_NullOperatorExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_NullOperatorExpressionContext oC_NullOperatorExpression() throws RecognitionException {
		OC_NullOperatorExpressionContext _localctx = new OC_NullOperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_oC_NullOperatorExpression);
		try {
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1185);
				match(SP);
				setState(1186);
				match(IS);
				setState(1187);
				match(SP);
				setState(1188);
				match(NULL);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1189);
				match(SP);
				setState(1190);
				match(IS);
				setState(1191);
				match(SP);
				setState(1192);
				match(NOT);
				setState(1193);
				match(SP);
				setState(1194);
				match(NULL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PropertyOrLabelsExpressionContext extends ParserRuleContext {
		public OC_AtomContext oC_Atom() {
			return getRuleContext(OC_AtomContext.class,0);
		}
		public List<OC_PropertyLookupContext> oC_PropertyLookup() {
			return getRuleContexts(OC_PropertyLookupContext.class);
		}
		public OC_PropertyLookupContext oC_PropertyLookup(int i) {
			return getRuleContext(OC_PropertyLookupContext.class,i);
		}
		public OC_NodeLabelsContext oC_NodeLabels() {
			return getRuleContext(OC_NodeLabelsContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_PropertyOrLabelsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PropertyOrLabelsExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PropertyOrLabelsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PropertyOrLabelsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PropertyOrLabelsExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PropertyOrLabelsExpressionContext oC_PropertyOrLabelsExpression() throws RecognitionException {
		OC_PropertyOrLabelsExpressionContext _localctx = new OC_PropertyOrLabelsExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_oC_PropertyOrLabelsExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			oC_Atom();
			setState(1204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1198);
						match(SP);
						}
					}

					setState(1201);
					oC_PropertyLookup();
					}
					}
				}
				setState(1206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1207);
					match(SP);
					}
				}

				setState(1210);
				oC_NodeLabels();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_AtomContext extends ParserRuleContext {
		public OC_LiteralContext oC_Literal() {
			return getRuleContext(OC_LiteralContext.class,0);
		}
		public OC_ParameterContext oC_Parameter() {
			return getRuleContext(OC_ParameterContext.class,0);
		}
		public OC_CaseExpressionContext oC_CaseExpression() {
			return getRuleContext(OC_CaseExpressionContext.class,0);
		}
		public TerminalNode COUNT() { return getToken(SeraphParser.COUNT, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ListComprehensionContext oC_ListComprehension() {
			return getRuleContext(OC_ListComprehensionContext.class,0);
		}
		public OC_PatternComprehensionContext oC_PatternComprehension() {
			return getRuleContext(OC_PatternComprehensionContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SeraphParser.ALL, 0); }
		public OC_FilterExpressionContext oC_FilterExpression() {
			return getRuleContext(OC_FilterExpressionContext.class,0);
		}
		public TerminalNode ANY() { return getToken(SeraphParser.ANY, 0); }
		public TerminalNode NONE() { return getToken(SeraphParser.NONE, 0); }
		public TerminalNode SINGLE() { return getToken(SeraphParser.SINGLE, 0); }
		public OC_RelationshipsPatternContext oC_RelationshipsPattern() {
			return getRuleContext(OC_RelationshipsPatternContext.class,0);
		}
		public OC_ParenthesizedExpressionContext oC_ParenthesizedExpression() {
			return getRuleContext(OC_ParenthesizedExpressionContext.class,0);
		}
		public OC_FunctionInvocationContext oC_FunctionInvocation() {
			return getRuleContext(OC_FunctionInvocationContext.class,0);
		}
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public OC_AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_AtomContext oC_Atom() throws RecognitionException {
		OC_AtomContext _localctx = new OC_AtomContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_oC_Atom);
		int _la;
		try {
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				oC_Literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1214);
				oC_Parameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1215);
				oC_CaseExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1216);
				match(COUNT);
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1217);
					match(SP);
					}
				}

				setState(1220);
				match(T__8);
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1221);
					match(SP);
					}
				}

				setState(1224);
				match(T__6);
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1225);
					match(SP);
					}
				}

				setState(1228);
				match(T__9);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1229);
				oC_ListComprehension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1230);
				oC_PatternComprehension();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1231);
				match(ALL);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1232);
					match(SP);
					}
				}

				setState(1235);
				match(T__8);
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1236);
					match(SP);
					}
				}

				setState(1239);
				oC_FilterExpression();
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1240);
					match(SP);
					}
				}

				setState(1243);
				match(T__9);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1245);
				match(ANY);
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1246);
					match(SP);
					}
				}

				setState(1249);
				match(T__8);
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1250);
					match(SP);
					}
				}

				setState(1253);
				oC_FilterExpression();
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1254);
					match(SP);
					}
				}

				setState(1257);
				match(T__9);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1259);
				match(NONE);
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1260);
					match(SP);
					}
				}

				setState(1263);
				match(T__8);
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1264);
					match(SP);
					}
				}

				setState(1267);
				oC_FilterExpression();
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1268);
					match(SP);
					}
				}

				setState(1271);
				match(T__9);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1273);
				match(SINGLE);
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1274);
					match(SP);
					}
				}

				setState(1277);
				match(T__8);
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1278);
					match(SP);
					}
				}

				setState(1281);
				oC_FilterExpression();
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1282);
					match(SP);
					}
				}

				setState(1285);
				match(T__9);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1287);
				oC_RelationshipsPattern();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1288);
				oC_ParenthesizedExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1289);
				oC_FunctionInvocation();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1290);
				oC_Variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_LiteralContext extends ParserRuleContext {
		public OC_NumberLiteralContext oC_NumberLiteral() {
			return getRuleContext(OC_NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SeraphParser.StringLiteral, 0); }
		public OC_BooleanLiteralContext oC_BooleanLiteral() {
			return getRuleContext(OC_BooleanLiteralContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SeraphParser.NULL, 0); }
		public OC_MapLiteralContext oC_MapLiteral() {
			return getRuleContext(OC_MapLiteralContext.class,0);
		}
		public OC_ListLiteralContext oC_ListLiteral() {
			return getRuleContext(OC_ListLiteralContext.class,0);
		}
		public OC_LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_LiteralContext oC_Literal() throws RecognitionException {
		OC_LiteralContext _localctx = new OC_LiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_oC_Literal);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HexInteger:
			case DecimalInteger:
			case OctalInteger:
			case ExponentDecimalReal:
			case RegularDecimalReal:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				oC_NumberLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				match(StringLiteral);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				oC_BooleanLiteral();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296);
				match(NULL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(1297);
				oC_MapLiteral();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(1298);
				oC_ListLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SeraphParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SeraphParser.FALSE, 0); }
		public OC_BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_BooleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_BooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_BooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_BooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_BooleanLiteralContext oC_BooleanLiteral() throws RecognitionException {
		OC_BooleanLiteralContext _localctx = new OC_BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_oC_BooleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ListLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public OC_ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ListLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ListLiteralContext oC_ListLiteral() throws RecognitionException {
		OC_ListLiteralContext _localctx = new OC_ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_oC_ListLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1303);
			match(T__10);
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1304);
				match(SP);
				}
			}

			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__25))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ALL - 66)) | (1L << (NOT - 66)) | (1L << (NULL - 66)) | (1L << (COUNT - 66)) | (1L << (ANY - 66)) | (1L << (NONE - 66)) | (1L << (SINGLE - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (EXISTS - 66)) | (1L << (CASE - 66)) | (1L << (StringLiteral - 66)) | (1L << (HexInteger - 66)) | (1L << (DecimalInteger - 66)) | (1L << (OctalInteger - 66)) | (1L << (HexLetter - 66)) | (1L << (ExponentDecimalReal - 66)) | (1L << (RegularDecimalReal - 66)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (FILTER - 138)) | (1L << (EXTRACT - 138)) | (1L << (UnescapedSymbolicName - 138)) | (1L << (EscapedSymbolicName - 138)))) != 0)) {
				{
				setState(1307);
				oC_Expression();
				setState(1309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1308);
					match(SP);
					}
				}

				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1311);
					match(T__3);
					setState(1313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1312);
						match(SP);
						}
					}

					setState(1315);
					oC_Expression();
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1316);
						match(SP);
						}
					}

					}
					}
					setState(1323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1326);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PartialComparisonExpressionContext extends ParserRuleContext {
		public OC_AddOrSubtractExpressionContext oC_AddOrSubtractExpression() {
			return getRuleContext(OC_AddOrSubtractExpressionContext.class,0);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_PartialComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PartialComparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PartialComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PartialComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PartialComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PartialComparisonExpressionContext oC_PartialComparisonExpression() throws RecognitionException {
		OC_PartialComparisonExpressionContext _localctx = new OC_PartialComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_oC_PartialComparisonExpression);
		int _la;
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1328);
				match(T__4);
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1329);
					match(SP);
					}
				}

				setState(1332);
				oC_AddOrSubtractExpression();
				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1333);
				match(T__19);
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1334);
					match(SP);
					}
				}

				setState(1337);
				oC_AddOrSubtractExpression();
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1338);
				match(T__20);
				setState(1340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1339);
					match(SP);
					}
				}

				setState(1342);
				oC_AddOrSubtractExpression();
				}
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1343);
				match(T__21);
				setState(1345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1344);
					match(SP);
					}
				}

				setState(1347);
				oC_AddOrSubtractExpression();
				}
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1348);
				match(T__22);
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1349);
					match(SP);
					}
				}

				setState(1352);
				oC_AddOrSubtractExpression();
				}
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1353);
				match(T__23);
				setState(1355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1354);
					match(SP);
					}
				}

				setState(1357);
				oC_AddOrSubtractExpression();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ParenthesizedExpressionContext extends ParserRuleContext {
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ParenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ParenthesizedExpressionContext oC_ParenthesizedExpression() throws RecognitionException {
		OC_ParenthesizedExpressionContext _localctx = new OC_ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_oC_ParenthesizedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(T__8);
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1361);
				match(SP);
				}
			}

			setState(1364);
			oC_Expression();
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1365);
				match(SP);
				}
			}

			setState(1368);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RelationshipsPatternContext extends ParserRuleContext {
		public OC_NodePatternContext oC_NodePattern() {
			return getRuleContext(OC_NodePatternContext.class,0);
		}
		public List<OC_PatternElementChainContext> oC_PatternElementChain() {
			return getRuleContexts(OC_PatternElementChainContext.class);
		}
		public OC_PatternElementChainContext oC_PatternElementChain(int i) {
			return getRuleContext(OC_PatternElementChainContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_RelationshipsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RelationshipsPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RelationshipsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RelationshipsPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RelationshipsPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RelationshipsPatternContext oC_RelationshipsPattern() throws RecognitionException {
		OC_RelationshipsPatternContext _localctx = new OC_RelationshipsPatternContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_oC_RelationshipsPattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1370);
			oC_NodePattern();
			setState(1375);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1371);
						match(SP);
						}
					}

					setState(1374);
					oC_PatternElementChain();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_FilterExpressionContext extends ParserRuleContext {
		public OC_IdInCollContext oC_IdInColl() {
			return getRuleContext(OC_IdInCollContext.class,0);
		}
		public OC_WhereContext oC_Where() {
			return getRuleContext(OC_WhereContext.class,0);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_FilterExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_FilterExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_FilterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_FilterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_FilterExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_FilterExpressionContext oC_FilterExpression() throws RecognitionException {
		OC_FilterExpressionContext _localctx = new OC_FilterExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_oC_FilterExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			oC_IdInColl();
			setState(1384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				{
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1380);
					match(SP);
					}
				}

				setState(1383);
				oC_Where();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_IdInCollContext extends ParserRuleContext {
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode IN() { return getToken(SeraphParser.IN, 0); }
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public OC_IdInCollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_IdInColl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_IdInColl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_IdInColl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_IdInColl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_IdInCollContext oC_IdInColl() throws RecognitionException {
		OC_IdInCollContext _localctx = new OC_IdInCollContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_oC_IdInColl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			oC_Variable();
			setState(1387);
			match(SP);
			setState(1388);
			match(IN);
			setState(1389);
			match(SP);
			setState(1390);
			oC_Expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_FunctionInvocationContext extends ParserRuleContext {
		public OC_FunctionNameContext oC_FunctionName() {
			return getRuleContext(OC_FunctionNameContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode DISTINCT() { return getToken(SeraphParser.DISTINCT, 0); }
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public OC_FunctionInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_FunctionInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_FunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_FunctionInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_FunctionInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_FunctionInvocationContext oC_FunctionInvocation() throws RecognitionException {
		OC_FunctionInvocationContext _localctx = new OC_FunctionInvocationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_oC_FunctionInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			oC_FunctionName();
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1393);
				match(SP);
				}
			}

			setState(1396);
			match(T__8);
			setState(1398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1397);
				match(SP);
				}
			}

			setState(1404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1400);
				match(DISTINCT);
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1401);
					match(SP);
					}
				}

				}
			}

			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__25))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ALL - 66)) | (1L << (NOT - 66)) | (1L << (NULL - 66)) | (1L << (COUNT - 66)) | (1L << (ANY - 66)) | (1L << (NONE - 66)) | (1L << (SINGLE - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (EXISTS - 66)) | (1L << (CASE - 66)) | (1L << (StringLiteral - 66)) | (1L << (HexInteger - 66)) | (1L << (DecimalInteger - 66)) | (1L << (OctalInteger - 66)) | (1L << (HexLetter - 66)) | (1L << (ExponentDecimalReal - 66)) | (1L << (RegularDecimalReal - 66)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (FILTER - 138)) | (1L << (EXTRACT - 138)) | (1L << (UnescapedSymbolicName - 138)) | (1L << (EscapedSymbolicName - 138)))) != 0)) {
				{
				setState(1406);
				oC_Expression();
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1407);
					match(SP);
					}
				}

				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1410);
					match(T__3);
					setState(1412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1411);
						match(SP);
						}
					}

					setState(1414);
					oC_Expression();
					setState(1416);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1415);
						match(SP);
						}
					}

					}
					}
					setState(1422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1425);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_FunctionNameContext extends ParserRuleContext {
		public OC_NamespaceContext oC_Namespace() {
			return getRuleContext(OC_NamespaceContext.class,0);
		}
		public OC_SymbolicNameContext oC_SymbolicName() {
			return getRuleContext(OC_SymbolicNameContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(SeraphParser.EXISTS, 0); }
		public OC_FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_FunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_FunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_FunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_FunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_FunctionNameContext oC_FunctionName() throws RecognitionException {
		OC_FunctionNameContext _localctx = new OC_FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_oC_FunctionName);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case HexLetter:
			case FILTER:
			case EXTRACT:
			case UnescapedSymbolicName:
			case EscapedSymbolicName:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1427);
				oC_Namespace();
				setState(1428);
				oC_SymbolicName();
				}
				}
				break;
			case EXISTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1430);
				match(EXISTS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ExplicitProcedureInvocationContext extends ParserRuleContext {
		public OC_ProcedureNameContext oC_ProcedureName() {
			return getRuleContext(OC_ProcedureNameContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public OC_ExplicitProcedureInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ExplicitProcedureInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ExplicitProcedureInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ExplicitProcedureInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ExplicitProcedureInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ExplicitProcedureInvocationContext oC_ExplicitProcedureInvocation() throws RecognitionException {
		OC_ExplicitProcedureInvocationContext _localctx = new OC_ExplicitProcedureInvocationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_oC_ExplicitProcedureInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			oC_ProcedureName();
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1434);
				match(SP);
				}
			}

			setState(1437);
			match(T__8);
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1438);
				match(SP);
				}
			}

			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__25))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ALL - 66)) | (1L << (NOT - 66)) | (1L << (NULL - 66)) | (1L << (COUNT - 66)) | (1L << (ANY - 66)) | (1L << (NONE - 66)) | (1L << (SINGLE - 66)) | (1L << (TRUE - 66)) | (1L << (FALSE - 66)) | (1L << (EXISTS - 66)) | (1L << (CASE - 66)) | (1L << (StringLiteral - 66)) | (1L << (HexInteger - 66)) | (1L << (DecimalInteger - 66)) | (1L << (OctalInteger - 66)) | (1L << (HexLetter - 66)) | (1L << (ExponentDecimalReal - 66)) | (1L << (RegularDecimalReal - 66)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (FILTER - 138)) | (1L << (EXTRACT - 138)) | (1L << (UnescapedSymbolicName - 138)) | (1L << (EscapedSymbolicName - 138)))) != 0)) {
				{
				setState(1441);
				oC_Expression();
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1442);
					match(SP);
					}
				}

				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1445);
					match(T__3);
					setState(1447);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1446);
						match(SP);
						}
					}

					setState(1449);
					oC_Expression();
					setState(1451);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1450);
						match(SP);
						}
					}

					}
					}
					setState(1457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1460);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ImplicitProcedureInvocationContext extends ParserRuleContext {
		public OC_ProcedureNameContext oC_ProcedureName() {
			return getRuleContext(OC_ProcedureNameContext.class,0);
		}
		public OC_ImplicitProcedureInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ImplicitProcedureInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ImplicitProcedureInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ImplicitProcedureInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ImplicitProcedureInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ImplicitProcedureInvocationContext oC_ImplicitProcedureInvocation() throws RecognitionException {
		OC_ImplicitProcedureInvocationContext _localctx = new OC_ImplicitProcedureInvocationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_oC_ImplicitProcedureInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			oC_ProcedureName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ProcedureResultFieldContext extends ParserRuleContext {
		public OC_SymbolicNameContext oC_SymbolicName() {
			return getRuleContext(OC_SymbolicNameContext.class,0);
		}
		public OC_ProcedureResultFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ProcedureResultField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ProcedureResultField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ProcedureResultField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ProcedureResultField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ProcedureResultFieldContext oC_ProcedureResultField() throws RecognitionException {
		OC_ProcedureResultFieldContext _localctx = new OC_ProcedureResultFieldContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_oC_ProcedureResultField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			oC_SymbolicName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ProcedureNameContext extends ParserRuleContext {
		public OC_NamespaceContext oC_Namespace() {
			return getRuleContext(OC_NamespaceContext.class,0);
		}
		public OC_SymbolicNameContext oC_SymbolicName() {
			return getRuleContext(OC_SymbolicNameContext.class,0);
		}
		public OC_ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ProcedureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ProcedureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ProcedureName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ProcedureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ProcedureNameContext oC_ProcedureName() throws RecognitionException {
		OC_ProcedureNameContext _localctx = new OC_ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_oC_ProcedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			oC_Namespace();
			setState(1467);
			oC_SymbolicName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_NamespaceContext extends ParserRuleContext {
		public List<OC_SymbolicNameContext> oC_SymbolicName() {
			return getRuleContexts(OC_SymbolicNameContext.class);
		}
		public OC_SymbolicNameContext oC_SymbolicName(int i) {
			return getRuleContext(OC_SymbolicNameContext.class,i);
		}
		public OC_NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Namespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Namespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Namespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_NamespaceContext oC_Namespace() throws RecognitionException {
		OC_NamespaceContext _localctx = new OC_NamespaceContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_oC_Namespace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1469);
					oC_SymbolicName();
					setState(1470);
					match(T__24);
					}
					}
				}
				setState(1476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ListComprehensionContext extends ParserRuleContext {
		public OC_FilterExpressionContext oC_FilterExpression() {
			return getRuleContext(OC_FilterExpressionContext.class,0);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_ExpressionContext oC_Expression() {
			return getRuleContext(OC_ExpressionContext.class,0);
		}
		public OC_ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ListComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ListComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ListComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ListComprehensionContext oC_ListComprehension() throws RecognitionException {
		OC_ListComprehensionContext _localctx = new OC_ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_oC_ListComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(T__10);
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1478);
				match(SP);
				}
			}

			setState(1481);
			oC_FilterExpression();
			setState(1490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1482);
					match(SP);
					}
				}

				setState(1485);
				match(T__12);
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1486);
					match(SP);
					}
				}

				setState(1489);
				oC_Expression();
				}
				break;
			}
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1492);
				match(SP);
				}
			}

			setState(1495);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PatternComprehensionContext extends ParserRuleContext {
		public OC_RelationshipsPatternContext oC_RelationshipsPattern() {
			return getRuleContext(OC_RelationshipsPatternContext.class,0);
		}
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_VariableContext oC_Variable() {
			return getRuleContext(OC_VariableContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SeraphParser.WHERE, 0); }
		public OC_PatternComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PatternComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PatternComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PatternComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PatternComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PatternComprehensionContext oC_PatternComprehension() throws RecognitionException {
		OC_PatternComprehensionContext _localctx = new OC_PatternComprehensionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_oC_PatternComprehension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497);
			match(T__10);
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1498);
				match(SP);
				}
			}

			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (COUNT - 102)) | (1L << (ANY - 102)) | (1L << (NONE - 102)) | (1L << (SINGLE - 102)) | (1L << (HexLetter - 102)) | (1L << (FILTER - 102)) | (1L << (EXTRACT - 102)) | (1L << (UnescapedSymbolicName - 102)) | (1L << (EscapedSymbolicName - 102)))) != 0)) {
				{
				setState(1501);
				oC_Variable();
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1502);
					match(SP);
					}
				}

				setState(1505);
				match(T__4);
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1506);
					match(SP);
					}
				}

				}
			}

			setState(1511);
			oC_RelationshipsPattern();
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1512);
				match(SP);
				}
			}

			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1515);
				match(WHERE);
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1516);
					match(SP);
					}
				}

				setState(1519);
				oC_Expression();
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1520);
					match(SP);
					}
				}

				}
			}

			setState(1525);
			match(T__12);
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1526);
				match(SP);
				}
			}

			setState(1529);
			oC_Expression();
			setState(1531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1530);
				match(SP);
				}
			}

			setState(1533);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PropertyLookupContext extends ParserRuleContext {
		public OC_PropertyKeyNameContext oC_PropertyKeyName() {
			return getRuleContext(OC_PropertyKeyNameContext.class,0);
		}
		public TerminalNode SP() { return getToken(SeraphParser.SP, 0); }
		public OC_PropertyLookupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PropertyLookup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PropertyLookup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PropertyLookup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PropertyLookup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PropertyLookupContext oC_PropertyLookup() throws RecognitionException {
		OC_PropertyLookupContext _localctx = new OC_PropertyLookupContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_oC_PropertyLookup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(T__24);
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1536);
				match(SP);
				}
			}

			{
			setState(1539);
			oC_PropertyKeyName();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_CaseExpressionContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(SeraphParser.END, 0); }
		public TerminalNode ELSE() { return getToken(SeraphParser.ELSE, 0); }
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public TerminalNode CASE() { return getToken(SeraphParser.CASE, 0); }
		public List<OC_CaseAlternativesContext> oC_CaseAlternatives() {
			return getRuleContexts(OC_CaseAlternativesContext.class);
		}
		public OC_CaseAlternativesContext oC_CaseAlternatives(int i) {
			return getRuleContext(OC_CaseAlternativesContext.class,i);
		}
		public OC_CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_CaseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_CaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_CaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_CaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_CaseExpressionContext oC_CaseExpression() throws RecognitionException {
		OC_CaseExpressionContext _localctx = new OC_CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_oC_CaseExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				{
				setState(1541);
				match(CASE);
				setState(1546);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1543);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1542);
							match(SP);
							}
						}

						setState(1545);
						oC_CaseAlternatives();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1548);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 2:
				{
				{
				setState(1550);
				match(CASE);
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1551);
					match(SP);
					}
				}

				setState(1554);
				oC_Expression();
				setState(1559);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1556);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SP) {
							{
							setState(1555);
							match(SP);
							}
						}

						setState(1558);
						oC_CaseAlternatives();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1561);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			}
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1565);
					match(SP);
					}
				}

				setState(1568);
				match(ELSE);
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1569);
					match(SP);
					}
				}

				setState(1572);
				oC_Expression();
				}
				break;
			}
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1575);
				match(SP);
				}
			}

			setState(1578);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_CaseAlternativesContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(SeraphParser.WHEN, 0); }
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(SeraphParser.THEN, 0); }
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_CaseAlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_CaseAlternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_CaseAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_CaseAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_CaseAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_CaseAlternativesContext oC_CaseAlternatives() throws RecognitionException {
		OC_CaseAlternativesContext _localctx = new OC_CaseAlternativesContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_oC_CaseAlternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			match(WHEN);
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1581);
				match(SP);
				}
			}

			setState(1584);
			oC_Expression();
			setState(1586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1585);
				match(SP);
				}
			}

			setState(1588);
			match(THEN);
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1589);
				match(SP);
				}
			}

			setState(1592);
			oC_Expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_VariableContext extends ParserRuleContext {
		public OC_SymbolicNameContext oC_SymbolicName() {
			return getRuleContext(OC_SymbolicNameContext.class,0);
		}
		public OC_VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_VariableContext oC_Variable() throws RecognitionException {
		OC_VariableContext _localctx = new OC_VariableContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_oC_Variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			oC_SymbolicName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_NumberLiteralContext extends ParserRuleContext {
		public OC_DoubleLiteralContext oC_DoubleLiteral() {
			return getRuleContext(OC_DoubleLiteralContext.class,0);
		}
		public OC_IntegerLiteralContext oC_IntegerLiteral() {
			return getRuleContext(OC_IntegerLiteralContext.class,0);
		}
		public OC_NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_NumberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_NumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_NumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_NumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_NumberLiteralContext oC_NumberLiteral() throws RecognitionException {
		OC_NumberLiteralContext _localctx = new OC_NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_oC_NumberLiteral);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ExponentDecimalReal:
			case RegularDecimalReal:
				enterOuterAlt(_localctx, 1);
				{
				setState(1596);
				oC_DoubleLiteral();
				}
				break;
			case HexInteger:
			case DecimalInteger:
			case OctalInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
				oC_IntegerLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_MapLiteralContext extends ParserRuleContext {
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public List<OC_PropertyKeyNameContext> oC_PropertyKeyName() {
			return getRuleContexts(OC_PropertyKeyNameContext.class);
		}
		public OC_PropertyKeyNameContext oC_PropertyKeyName(int i) {
			return getRuleContext(OC_PropertyKeyNameContext.class,i);
		}
		public List<OC_ExpressionContext> oC_Expression() {
			return getRuleContexts(OC_ExpressionContext.class);
		}
		public OC_ExpressionContext oC_Expression(int i) {
			return getRuleContext(OC_ExpressionContext.class,i);
		}
		public OC_MapLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_MapLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_MapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_MapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_MapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_MapLiteralContext oC_MapLiteral() throws RecognitionException {
		OC_MapLiteralContext _localctx = new OC_MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_oC_MapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			match(T__0);
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SP) {
				{
				setState(1601);
				match(SP);
				}
			}

			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UNION - 65)) | (1L << (ALL - 65)) | (1L << (OPTIONAL - 65)) | (1L << (MATCH - 65)) | (1L << (UNWIND - 65)) | (1L << (AS - 65)) | (1L << (MERGE - 65)) | (1L << (ON - 65)) | (1L << (CREATE - 65)) | (1L << (SET - 65)) | (1L << (DETACH - 65)) | (1L << (DELETE - 65)) | (1L << (REMOVE - 65)) | (1L << (WITH - 65)) | (1L << (RETURN - 65)) | (1L << (DISTINCT - 65)) | (1L << (ORDER - 65)) | (1L << (BY - 65)) | (1L << (L_SKIP - 65)) | (1L << (LIMIT - 65)) | (1L << (ASCENDING - 65)) | (1L << (ASC - 65)) | (1L << (DESCENDING - 65)) | (1L << (DESC - 65)) | (1L << (WHERE - 65)) | (1L << (OR - 65)) | (1L << (XOR - 65)) | (1L << (AND - 65)) | (1L << (NOT - 65)) | (1L << (IN - 65)) | (1L << (STARTS - 65)) | (1L << (ENDS - 65)) | (1L << (CONTAINS - 65)) | (1L << (IS - 65)) | (1L << (NULL - 65)) | (1L << (COUNT - 65)) | (1L << (ANY - 65)) | (1L << (NONE - 65)) | (1L << (SINGLE - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (EXISTS - 65)) | (1L << (CASE - 65)) | (1L << (ELSE - 65)) | (1L << (END - 65)) | (1L << (WHEN - 65)) | (1L << (THEN - 65)) | (1L << (HexLetter - 65)) | (1L << (CONSTRAINT - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DO - 129)) | (1L << (FOR - 129)) | (1L << (REQUIRE - 129)) | (1L << (UNIQUE - 129)) | (1L << (MANDATORY - 129)) | (1L << (SCALAR - 129)) | (1L << (OF - 129)) | (1L << (ADD - 129)) | (1L << (DROP - 129)) | (1L << (FILTER - 129)) | (1L << (EXTRACT - 129)) | (1L << (UnescapedSymbolicName - 129)) | (1L << (EscapedSymbolicName - 129)))) != 0)) {
				{
				setState(1604);
				oC_PropertyKeyName();
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1605);
					match(SP);
					}
				}

				setState(1608);
				match(T__7);
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1609);
					match(SP);
					}
				}

				setState(1612);
				oC_Expression();
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SP) {
					{
					setState(1613);
					match(SP);
					}
				}

				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1616);
					match(T__3);
					setState(1618);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1617);
						match(SP);
						}
					}

					setState(1620);
					oC_PropertyKeyName();
					setState(1622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1621);
						match(SP);
						}
					}

					setState(1624);
					match(T__7);
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1625);
						match(SP);
						}
					}

					setState(1628);
					oC_Expression();
					setState(1630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1629);
						match(SP);
						}
					}

					}
					}
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1639);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ParameterContext extends ParserRuleContext {
		public OC_SymbolicNameContext oC_SymbolicName() {
			return getRuleContext(OC_SymbolicNameContext.class,0);
		}
		public TerminalNode DecimalInteger() { return getToken(SeraphParser.DecimalInteger, 0); }
		public OC_ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ParameterContext oC_Parameter() throws RecognitionException {
		OC_ParameterContext _localctx = new OC_ParameterContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_oC_Parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(T__25);
			setState(1644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case HexLetter:
			case FILTER:
			case EXTRACT:
			case UnescapedSymbolicName:
			case EscapedSymbolicName:
				{
				setState(1642);
				oC_SymbolicName();
				}
				break;
			case DecimalInteger:
				{
				setState(1643);
				match(DecimalInteger);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PropertyExpressionContext extends ParserRuleContext {
		public OC_AtomContext oC_Atom() {
			return getRuleContext(OC_AtomContext.class,0);
		}
		public List<OC_PropertyLookupContext> oC_PropertyLookup() {
			return getRuleContexts(OC_PropertyLookupContext.class);
		}
		public OC_PropertyLookupContext oC_PropertyLookup(int i) {
			return getRuleContext(OC_PropertyLookupContext.class,i);
		}
		public List<TerminalNode> SP() { return getTokens(SeraphParser.SP); }
		public TerminalNode SP(int i) {
			return getToken(SeraphParser.SP, i);
		}
		public OC_PropertyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PropertyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PropertyExpressionContext oC_PropertyExpression() throws RecognitionException {
		OC_PropertyExpressionContext _localctx = new OC_PropertyExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_oC_PropertyExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			oC_Atom();
			setState(1651);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SP) {
						{
						setState(1647);
						match(SP);
						}
					}

					setState(1650);
					oC_PropertyLookup();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,307,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_PropertyKeyNameContext extends ParserRuleContext {
		public OC_SchemaNameContext oC_SchemaName() {
			return getRuleContext(OC_SchemaNameContext.class,0);
		}
		public OC_PropertyKeyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_PropertyKeyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_PropertyKeyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_PropertyKeyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_PropertyKeyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_PropertyKeyNameContext oC_PropertyKeyName() throws RecognitionException {
		OC_PropertyKeyNameContext _localctx = new OC_PropertyKeyNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_oC_PropertyKeyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			oC_SchemaName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HexInteger() { return getToken(SeraphParser.HexInteger, 0); }
		public TerminalNode OctalInteger() { return getToken(SeraphParser.OctalInteger, 0); }
		public TerminalNode DecimalInteger() { return getToken(SeraphParser.DecimalInteger, 0); }
		public OC_IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_IntegerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_IntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_IntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_IntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_IntegerLiteralContext oC_IntegerLiteral() throws RecognitionException {
		OC_IntegerLiteralContext _localctx = new OC_IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_oC_IntegerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1657);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (HexInteger - 116)) | (1L << (DecimalInteger - 116)) | (1L << (OctalInteger - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_DoubleLiteralContext extends ParserRuleContext {
		public TerminalNode ExponentDecimalReal() { return getToken(SeraphParser.ExponentDecimalReal, 0); }
		public TerminalNode RegularDecimalReal() { return getToken(SeraphParser.RegularDecimalReal, 0); }
		public OC_DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_DoubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_DoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_DoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_DoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_DoubleLiteralContext oC_DoubleLiteral() throws RecognitionException {
		OC_DoubleLiteralContext _localctx = new OC_DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_oC_DoubleLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_la = _input.LA(1);
			if ( !(_la==ExponentDecimalReal || _la==RegularDecimalReal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SchemaNameContext extends ParserRuleContext {
		public OC_SymbolicNameContext oC_SymbolicName() {
			return getRuleContext(OC_SymbolicNameContext.class,0);
		}
		public OC_ReservedWordContext oC_ReservedWord() {
			return getRuleContext(OC_ReservedWordContext.class,0);
		}
		public OC_SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_SchemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_SchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_SchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_SchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SchemaNameContext oC_SchemaName() throws RecognitionException {
		OC_SchemaNameContext _localctx = new OC_SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_oC_SchemaName);
		try {
			setState(1663);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
			case ANY:
			case NONE:
			case SINGLE:
			case HexLetter:
			case FILTER:
			case EXTRACT:
			case UnescapedSymbolicName:
			case EscapedSymbolicName:
				enterOuterAlt(_localctx, 1);
				{
				setState(1661);
				oC_SymbolicName();
				}
				break;
			case UNION:
			case ALL:
			case OPTIONAL:
			case MATCH:
			case UNWIND:
			case AS:
			case MERGE:
			case ON:
			case CREATE:
			case SET:
			case DETACH:
			case DELETE:
			case REMOVE:
			case WITH:
			case RETURN:
			case DISTINCT:
			case ORDER:
			case BY:
			case L_SKIP:
			case LIMIT:
			case ASCENDING:
			case ASC:
			case DESCENDING:
			case DESC:
			case WHERE:
			case OR:
			case XOR:
			case AND:
			case NOT:
			case IN:
			case STARTS:
			case ENDS:
			case CONTAINS:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case EXISTS:
			case CASE:
			case ELSE:
			case END:
			case WHEN:
			case THEN:
			case CONSTRAINT:
			case DO:
			case FOR:
			case REQUIRE:
			case UNIQUE:
			case MANDATORY:
			case SCALAR:
			case OF:
			case ADD:
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				oC_ReservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_ReservedWordContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SeraphParser.ALL, 0); }
		public TerminalNode ASC() { return getToken(SeraphParser.ASC, 0); }
		public TerminalNode ASCENDING() { return getToken(SeraphParser.ASCENDING, 0); }
		public TerminalNode BY() { return getToken(SeraphParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SeraphParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SeraphParser.DELETE, 0); }
		public TerminalNode DESC() { return getToken(SeraphParser.DESC, 0); }
		public TerminalNode DESCENDING() { return getToken(SeraphParser.DESCENDING, 0); }
		public TerminalNode DETACH() { return getToken(SeraphParser.DETACH, 0); }
		public TerminalNode EXISTS() { return getToken(SeraphParser.EXISTS, 0); }
		public TerminalNode LIMIT() { return getToken(SeraphParser.LIMIT, 0); }
		public TerminalNode MATCH() { return getToken(SeraphParser.MATCH, 0); }
		public TerminalNode MERGE() { return getToken(SeraphParser.MERGE, 0); }
		public TerminalNode ON() { return getToken(SeraphParser.ON, 0); }
		public TerminalNode OPTIONAL() { return getToken(SeraphParser.OPTIONAL, 0); }
		public TerminalNode ORDER() { return getToken(SeraphParser.ORDER, 0); }
		public TerminalNode REMOVE() { return getToken(SeraphParser.REMOVE, 0); }
		public TerminalNode RETURN() { return getToken(SeraphParser.RETURN, 0); }
		public TerminalNode SET() { return getToken(SeraphParser.SET, 0); }
		public TerminalNode L_SKIP() { return getToken(SeraphParser.L_SKIP, 0); }
		public TerminalNode WHERE() { return getToken(SeraphParser.WHERE, 0); }
		public TerminalNode WITH() { return getToken(SeraphParser.WITH, 0); }
		public TerminalNode UNION() { return getToken(SeraphParser.UNION, 0); }
		public TerminalNode UNWIND() { return getToken(SeraphParser.UNWIND, 0); }
		public TerminalNode AND() { return getToken(SeraphParser.AND, 0); }
		public TerminalNode AS() { return getToken(SeraphParser.AS, 0); }
		public TerminalNode CONTAINS() { return getToken(SeraphParser.CONTAINS, 0); }
		public TerminalNode DISTINCT() { return getToken(SeraphParser.DISTINCT, 0); }
		public TerminalNode ENDS() { return getToken(SeraphParser.ENDS, 0); }
		public TerminalNode IN() { return getToken(SeraphParser.IN, 0); }
		public TerminalNode IS() { return getToken(SeraphParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SeraphParser.NOT, 0); }
		public TerminalNode OR() { return getToken(SeraphParser.OR, 0); }
		public TerminalNode STARTS() { return getToken(SeraphParser.STARTS, 0); }
		public TerminalNode XOR() { return getToken(SeraphParser.XOR, 0); }
		public TerminalNode FALSE() { return getToken(SeraphParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(SeraphParser.TRUE, 0); }
		public TerminalNode NULL() { return getToken(SeraphParser.NULL, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SeraphParser.CONSTRAINT, 0); }
		public TerminalNode DO() { return getToken(SeraphParser.DO, 0); }
		public TerminalNode FOR() { return getToken(SeraphParser.FOR, 0); }
		public TerminalNode REQUIRE() { return getToken(SeraphParser.REQUIRE, 0); }
		public TerminalNode UNIQUE() { return getToken(SeraphParser.UNIQUE, 0); }
		public TerminalNode CASE() { return getToken(SeraphParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(SeraphParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SeraphParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(SeraphParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SeraphParser.END, 0); }
		public TerminalNode MANDATORY() { return getToken(SeraphParser.MANDATORY, 0); }
		public TerminalNode SCALAR() { return getToken(SeraphParser.SCALAR, 0); }
		public TerminalNode OF() { return getToken(SeraphParser.OF, 0); }
		public TerminalNode ADD() { return getToken(SeraphParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SeraphParser.DROP, 0); }
		public OC_ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_ReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_ReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_ReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_ReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_ReservedWordContext oC_ReservedWord() throws RecognitionException {
		OC_ReservedWordContext _localctx = new OC_ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_oC_ReservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (UNION - 65)) | (1L << (ALL - 65)) | (1L << (OPTIONAL - 65)) | (1L << (MATCH - 65)) | (1L << (UNWIND - 65)) | (1L << (AS - 65)) | (1L << (MERGE - 65)) | (1L << (ON - 65)) | (1L << (CREATE - 65)) | (1L << (SET - 65)) | (1L << (DETACH - 65)) | (1L << (DELETE - 65)) | (1L << (REMOVE - 65)) | (1L << (WITH - 65)) | (1L << (RETURN - 65)) | (1L << (DISTINCT - 65)) | (1L << (ORDER - 65)) | (1L << (BY - 65)) | (1L << (L_SKIP - 65)) | (1L << (LIMIT - 65)) | (1L << (ASCENDING - 65)) | (1L << (ASC - 65)) | (1L << (DESCENDING - 65)) | (1L << (DESC - 65)) | (1L << (WHERE - 65)) | (1L << (OR - 65)) | (1L << (XOR - 65)) | (1L << (AND - 65)) | (1L << (NOT - 65)) | (1L << (IN - 65)) | (1L << (STARTS - 65)) | (1L << (ENDS - 65)) | (1L << (CONTAINS - 65)) | (1L << (IS - 65)) | (1L << (NULL - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (EXISTS - 65)) | (1L << (CASE - 65)) | (1L << (ELSE - 65)) | (1L << (END - 65)) | (1L << (WHEN - 65)) | (1L << (THEN - 65)) | (1L << (CONSTRAINT - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (DO - 129)) | (1L << (FOR - 129)) | (1L << (REQUIRE - 129)) | (1L << (UNIQUE - 129)) | (1L << (MANDATORY - 129)) | (1L << (SCALAR - 129)) | (1L << (OF - 129)) | (1L << (ADD - 129)) | (1L << (DROP - 129)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_SymbolicNameContext extends ParserRuleContext {
		public TerminalNode UnescapedSymbolicName() { return getToken(SeraphParser.UnescapedSymbolicName, 0); }
		public TerminalNode EscapedSymbolicName() { return getToken(SeraphParser.EscapedSymbolicName, 0); }
		public TerminalNode HexLetter() { return getToken(SeraphParser.HexLetter, 0); }
		public TerminalNode COUNT() { return getToken(SeraphParser.COUNT, 0); }
		public TerminalNode FILTER() { return getToken(SeraphParser.FILTER, 0); }
		public TerminalNode EXTRACT() { return getToken(SeraphParser.EXTRACT, 0); }
		public TerminalNode ANY() { return getToken(SeraphParser.ANY, 0); }
		public TerminalNode NONE() { return getToken(SeraphParser.NONE, 0); }
		public TerminalNode SINGLE() { return getToken(SeraphParser.SINGLE, 0); }
		public OC_SymbolicNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_SymbolicName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_SymbolicName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_SymbolicName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_SymbolicName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_SymbolicNameContext oC_SymbolicName() throws RecognitionException {
		OC_SymbolicNameContext _localctx = new OC_SymbolicNameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_oC_SymbolicName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (COUNT - 102)) | (1L << (ANY - 102)) | (1L << (NONE - 102)) | (1L << (SINGLE - 102)) | (1L << (HexLetter - 102)) | (1L << (FILTER - 102)) | (1L << (EXTRACT - 102)) | (1L << (UnescapedSymbolicName - 102)) | (1L << (EscapedSymbolicName - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_LeftArrowHeadContext extends ParserRuleContext {
		public OC_LeftArrowHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_LeftArrowHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_LeftArrowHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_LeftArrowHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_LeftArrowHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_LeftArrowHeadContext oC_LeftArrowHead() throws RecognitionException {
		OC_LeftArrowHeadContext _localctx = new OC_LeftArrowHeadContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_oC_LeftArrowHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1669);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_RightArrowHeadContext extends ParserRuleContext {
		public OC_RightArrowHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_RightArrowHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_RightArrowHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_RightArrowHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_RightArrowHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_RightArrowHeadContext oC_RightArrowHead() throws RecognitionException {
		OC_RightArrowHeadContext _localctx = new OC_RightArrowHeadContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_oC_RightArrowHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OC_DashContext extends ParserRuleContext {
		public OC_DashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oC_Dash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).enterOC_Dash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SeraphListener ) ((SeraphListener)listener).exitOC_Dash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SeraphVisitor ) return ((SeraphVisitor<? extends T>)visitor).visitOC_Dash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OC_DashContext oC_Dash() throws RecognitionException {
		OC_DashContext _localctx = new OC_DashContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_oC_Dash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0094\u068e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\5\2\u00de\n\2\3\2\3\2\5\2\u00e2\n\2\3\2\3\2"+
		"\5\2\u00e6\n\2\3\2\3\2\5\2\u00ea\n\2\3\2\3\2\5\2\u00ee\n\2\3\2\3\2\5\2"+
		"\u00f2\n\2\3\2\3\2\5\2\u00f6\n\2\3\3\3\3\5\3\u00fa\n\3\3\3\3\3\5\3\u00fe"+
		"\n\3\3\3\3\3\5\3\u0102\n\3\3\3\3\3\5\3\u0106\n\3\3\3\3\3\5\3\u010a\n\3"+
		"\3\3\3\3\5\3\u010e\n\3\3\3\3\3\5\3\u0112\n\3\3\3\3\3\5\3\u0116\n\3\3\3"+
		"\3\3\5\3\u011a\n\3\3\3\3\3\3\4\3\4\5\4\u0120\n\4\3\4\3\4\5\4\u0124\n\4"+
		"\3\4\3\4\5\4\u0128\n\4\3\4\3\4\5\4\u012c\n\4\3\4\3\4\5\4\u0130\n\4\3\4"+
		"\3\4\3\5\3\5\5\5\u0136\n\5\3\5\3\5\3\5\5\5\u013b\n\5\3\5\3\5\5\5\u013f"+
		"\n\5\3\6\3\6\3\7\3\7\5\7\u0145\n\7\3\b\3\b\5\b\u0149\n\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\5\13\u0153\n\13\3\13\3\13\5\13\u0157\n\13\3\13\5\13"+
		"\u015a\n\13\3\13\5\13\u015d\n\13\3\f\3\f\3\r\3\r\5\r\u0163\n\r\3\16\3"+
		"\16\5\16\u0167\n\16\3\16\7\16\u016a\n\16\f\16\16\16\u016d\13\16\3\17\3"+
		"\17\3\17\3\17\5\17\u0173\n\17\3\17\3\17\3\17\5\17\u0178\n\17\3\17\5\17"+
		"\u017b\n\17\3\20\3\20\5\20\u017f\n\20\3\21\3\21\5\21\u0183\n\21\7\21\u0185"+
		"\n\21\f\21\16\21\u0188\13\21\3\21\3\21\3\21\5\21\u018d\n\21\7\21\u018f"+
		"\n\21\f\21\16\21\u0192\13\21\3\21\3\21\5\21\u0196\n\21\3\21\7\21\u0199"+
		"\n\21\f\21\16\21\u019c\13\21\3\21\5\21\u019f\n\21\3\21\5\21\u01a2\n\21"+
		"\5\21\u01a4\n\21\3\22\3\22\5\22\u01a8\n\22\7\22\u01aa\n\22\f\22\16\22"+
		"\u01ad\13\22\3\22\3\22\5\22\u01b1\n\22\7\22\u01b3\n\22\f\22\16\22\u01b6"+
		"\13\22\3\22\3\22\5\22\u01ba\n\22\6\22\u01bc\n\22\r\22\16\22\u01bd\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u01c7\n\23\3\24\3\24\3\24\5\24\u01cc"+
		"\n\24\3\25\3\25\5\25\u01d0\n\25\3\25\3\25\5\25\u01d4\n\25\3\25\3\25\5"+
		"\25\u01d8\n\25\3\25\5\25\u01db\n\25\3\26\3\26\5\26\u01df\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u01e9\n\27\3\27\3\27\3\27\7\27\u01ee"+
		"\n\27\f\27\16\27\u01f1\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u01fd\n\30\3\31\3\31\5\31\u0201\n\31\3\31\3\31\3\32\3\32"+
		"\5\32\u0207\n\32\3\32\3\32\3\32\7\32\u020c\n\32\f\32\16\32\u020f\13\32"+
		"\3\33\3\33\5\33\u0213\n\33\3\33\3\33\5\33\u0217\n\33\3\33\3\33\3\33\3"+
		"\33\5\33\u021d\n\33\3\33\3\33\5\33\u0221\n\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0227\n\33\3\33\3\33\5\33\u022b\n\33\3\33\3\33\3\33\3\33\5\33\u0231\n"+
		"\33\3\33\3\33\5\33\u0235\n\33\3\34\3\34\5\34\u0239\n\34\3\34\3\34\5\34"+
		"\u023d\n\34\3\34\3\34\5\34\u0241\n\34\3\34\3\34\5\34\u0245\n\34\3\34\7"+
		"\34\u0248\n\34\f\34\16\34\u024b\13\34\3\35\3\35\3\35\3\35\5\35\u0251\n"+
		"\35\3\35\3\35\5\35\u0255\n\35\3\35\7\35\u0258\n\35\f\35\16\35\u025b\13"+
		"\35\3\36\3\36\3\36\3\36\5\36\u0261\n\36\3\37\3\37\3\37\3\37\5\37\u0267"+
		"\n\37\3\37\3\37\3\37\5\37\u026c\n\37\3 \3 \3 \3 \5 \u0272\n \3 \3 \3 "+
		"\3 \5 \u0278\n \3!\3!\3!\5!\u027d\n!\3!\3!\5!\u0281\n!\3!\7!\u0284\n!"+
		"\f!\16!\u0287\13!\5!\u0289\n!\3!\5!\u028c\n!\3!\5!\u028f\n!\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0296\n\"\3\"\3\"\3#\3#\3#\5#\u029d\n#\3#\5#\u02a0\n#\3"+
		"$\3$\3$\3%\5%\u02a6\n%\3%\5%\u02a9\n%\3%\3%\3%\3%\5%\u02af\n%\3%\3%\5"+
		"%\u02b3\n%\3%\3%\5%\u02b7\n%\3&\3&\5&\u02bb\n&\3&\3&\5&\u02bf\n&\3&\7"+
		"&\u02c2\n&\f&\16&\u02c5\13&\3&\3&\5&\u02c9\n&\3&\3&\5&\u02cd\n&\3&\7&"+
		"\u02d0\n&\f&\16&\u02d3\13&\5&\u02d5\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u02de\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u02e7\n(\3(\7(\u02ea\n(\f(\16(\u02ed"+
		"\13(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\5+\u02f9\n+\3+\5+\u02fc\n+\3,\3,\3"+
		",\3,\3-\3-\5-\u0304\n-\3-\3-\5-\u0308\n-\3-\7-\u030b\n-\f-\16-\u030e\13"+
		"-\3.\3.\5.\u0312\n.\3.\3.\5.\u0316\n.\3.\3.\3.\5.\u031b\n.\3/\3/\3\60"+
		"\3\60\5\60\u0321\n\60\3\60\7\60\u0324\n\60\f\60\16\60\u0327\13\60\3\60"+
		"\3\60\3\60\3\60\5\60\u032d\n\60\3\61\3\61\5\61\u0331\n\61\3\61\3\61\5"+
		"\61\u0335\n\61\5\61\u0337\n\61\3\61\3\61\5\61\u033b\n\61\5\61\u033d\n"+
		"\61\3\61\3\61\5\61\u0341\n\61\5\61\u0343\n\61\3\61\3\61\3\62\3\62\5\62"+
		"\u0349\n\62\3\62\3\62\3\63\3\63\5\63\u034f\n\63\3\63\3\63\5\63\u0353\n"+
		"\63\3\63\5\63\u0356\n\63\3\63\5\63\u0359\n\63\3\63\3\63\5\63\u035d\n\63"+
		"\3\63\3\63\3\63\3\63\5\63\u0363\n\63\3\63\3\63\5\63\u0367\n\63\3\63\5"+
		"\63\u036a\n\63\3\63\5\63\u036d\n\63\3\63\3\63\3\63\3\63\5\63\u0373\n\63"+
		"\3\63\5\63\u0376\n\63\3\63\5\63\u0379\n\63\3\63\3\63\5\63\u037d\n\63\3"+
		"\63\3\63\3\63\3\63\5\63\u0383\n\63\3\63\5\63\u0386\n\63\3\63\5\63\u0389"+
		"\n\63\3\63\3\63\5\63\u038d\n\63\3\64\3\64\5\64\u0391\n\64\3\64\3\64\5"+
		"\64\u0395\n\64\5\64\u0397\n\64\3\64\3\64\5\64\u039b\n\64\5\64\u039d\n"+
		"\64\3\64\5\64\u03a0\n\64\3\64\3\64\5\64\u03a4\n\64\5\64\u03a6\n\64\3\64"+
		"\3\64\3\65\3\65\5\65\u03ac\n\65\3\66\3\66\5\66\u03b0\n\66\3\66\3\66\5"+
		"\66\u03b4\n\66\3\66\3\66\5\66\u03b8\n\66\3\66\5\66\u03bb\n\66\3\66\7\66"+
		"\u03be\n\66\f\66\16\66\u03c1\13\66\3\67\3\67\5\67\u03c5\n\67\3\67\7\67"+
		"\u03c8\n\67\f\67\16\67\u03cb\13\67\38\38\58\u03cf\n8\38\38\39\39\59\u03d5"+
		"\n9\39\39\59\u03d9\n9\59\u03db\n9\39\39\59\u03df\n9\39\39\59\u03e3\n9"+
		"\59\u03e5\n9\59\u03e7\n9\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\7=\u03f4\n="+
		"\f=\16=\u03f7\13=\3>\3>\3>\3>\3>\7>\u03fe\n>\f>\16>\u0401\13>\3?\3?\3"+
		"?\3?\3?\7?\u0408\n?\f?\16?\u040b\13?\3@\3@\5@\u040f\n@\7@\u0411\n@\f@"+
		"\16@\u0414\13@\3@\3@\3A\3A\5A\u041a\nA\3A\7A\u041d\nA\fA\16A\u0420\13"+
		"A\3B\3B\5B\u0424\nB\3B\3B\5B\u0428\nB\3B\3B\5B\u042c\nB\3B\3B\5B\u0430"+
		"\nB\3B\7B\u0433\nB\fB\16B\u0436\13B\3C\3C\5C\u043a\nC\3C\3C\5C\u043e\n"+
		"C\3C\3C\5C\u0442\nC\3C\3C\5C\u0446\nC\3C\3C\5C\u044a\nC\3C\3C\5C\u044e"+
		"\nC\3C\7C\u0451\nC\fC\16C\u0454\13C\3D\3D\5D\u0458\nD\3D\3D\5D\u045c\n"+
		"D\3D\7D\u045f\nD\fD\16D\u0462\13D\3E\3E\5E\u0466\nE\7E\u0468\nE\fE\16"+
		"E\u046b\13E\3E\3E\3F\3F\3F\3F\7F\u0473\nF\fF\16F\u0476\13F\3G\3G\3G\5"+
		"G\u047b\nG\3G\3G\5G\u047f\nG\3G\3G\3G\3G\3G\5G\u0486\nG\3G\3G\5G\u048a"+
		"\nG\3G\3G\5G\u048e\nG\3G\5G\u0491\nG\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H"+
		"\u049d\nH\3H\5H\u04a0\nH\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u04ae"+
		"\nI\3J\3J\5J\u04b2\nJ\3J\7J\u04b5\nJ\fJ\16J\u04b8\13J\3J\5J\u04bb\nJ\3"+
		"J\5J\u04be\nJ\3K\3K\3K\3K\3K\5K\u04c5\nK\3K\3K\5K\u04c9\nK\3K\3K\5K\u04cd"+
		"\nK\3K\3K\3K\3K\3K\5K\u04d4\nK\3K\3K\5K\u04d8\nK\3K\3K\5K\u04dc\nK\3K"+
		"\3K\3K\3K\5K\u04e2\nK\3K\3K\5K\u04e6\nK\3K\3K\5K\u04ea\nK\3K\3K\3K\3K"+
		"\5K\u04f0\nK\3K\3K\5K\u04f4\nK\3K\3K\5K\u04f8\nK\3K\3K\3K\3K\5K\u04fe"+
		"\nK\3K\3K\5K\u0502\nK\3K\3K\5K\u0506\nK\3K\3K\3K\3K\3K\3K\5K\u050e\nK"+
		"\3L\3L\3L\3L\3L\3L\5L\u0516\nL\3M\3M\3N\3N\5N\u051c\nN\3N\3N\5N\u0520"+
		"\nN\3N\3N\5N\u0524\nN\3N\3N\5N\u0528\nN\7N\u052a\nN\fN\16N\u052d\13N\5"+
		"N\u052f\nN\3N\3N\3O\3O\5O\u0535\nO\3O\3O\3O\5O\u053a\nO\3O\3O\3O\5O\u053f"+
		"\nO\3O\3O\3O\5O\u0544\nO\3O\3O\3O\5O\u0549\nO\3O\3O\3O\5O\u054e\nO\3O"+
		"\5O\u0551\nO\3P\3P\5P\u0555\nP\3P\3P\5P\u0559\nP\3P\3P\3Q\3Q\5Q\u055f"+
		"\nQ\3Q\6Q\u0562\nQ\rQ\16Q\u0563\3R\3R\5R\u0568\nR\3R\5R\u056b\nR\3S\3"+
		"S\3S\3S\3S\3S\3T\3T\5T\u0575\nT\3T\3T\5T\u0579\nT\3T\3T\5T\u057d\nT\5"+
		"T\u057f\nT\3T\3T\5T\u0583\nT\3T\3T\5T\u0587\nT\3T\3T\5T\u058b\nT\7T\u058d"+
		"\nT\fT\16T\u0590\13T\5T\u0592\nT\3T\3T\3U\3U\3U\3U\5U\u059a\nU\3V\3V\5"+
		"V\u059e\nV\3V\3V\5V\u05a2\nV\3V\3V\5V\u05a6\nV\3V\3V\5V\u05aa\nV\3V\3"+
		"V\5V\u05ae\nV\7V\u05b0\nV\fV\16V\u05b3\13V\5V\u05b5\nV\3V\3V\3W\3W\3X"+
		"\3X\3Y\3Y\3Y\3Z\3Z\3Z\7Z\u05c3\nZ\fZ\16Z\u05c6\13Z\3[\3[\5[\u05ca\n[\3"+
		"[\3[\5[\u05ce\n[\3[\3[\5[\u05d2\n[\3[\5[\u05d5\n[\3[\5[\u05d8\n[\3[\3"+
		"[\3\\\3\\\5\\\u05de\n\\\3\\\3\\\5\\\u05e2\n\\\3\\\3\\\5\\\u05e6\n\\\5"+
		"\\\u05e8\n\\\3\\\3\\\5\\\u05ec\n\\\3\\\3\\\5\\\u05f0\n\\\3\\\3\\\5\\\u05f4"+
		"\n\\\5\\\u05f6\n\\\3\\\3\\\5\\\u05fa\n\\\3\\\3\\\5\\\u05fe\n\\\3\\\3\\"+
		"\3]\3]\5]\u0604\n]\3]\3]\3^\3^\5^\u060a\n^\3^\6^\u060d\n^\r^\16^\u060e"+
		"\3^\3^\5^\u0613\n^\3^\3^\5^\u0617\n^\3^\6^\u061a\n^\r^\16^\u061b\5^\u061e"+
		"\n^\3^\5^\u0621\n^\3^\3^\5^\u0625\n^\3^\5^\u0628\n^\3^\5^\u062b\n^\3^"+
		"\3^\3_\3_\5_\u0631\n_\3_\3_\5_\u0635\n_\3_\3_\5_\u0639\n_\3_\3_\3`\3`"+
		"\3a\3a\5a\u0641\na\3b\3b\5b\u0645\nb\3b\3b\5b\u0649\nb\3b\3b\5b\u064d"+
		"\nb\3b\3b\5b\u0651\nb\3b\3b\5b\u0655\nb\3b\3b\5b\u0659\nb\3b\3b\5b\u065d"+
		"\nb\3b\3b\5b\u0661\nb\7b\u0663\nb\fb\16b\u0666\13b\5b\u0668\nb\3b\3b\3"+
		"c\3c\3c\5c\u066f\nc\3d\3d\5d\u0673\nd\3d\6d\u0676\nd\rd\16d\u0677\3e\3"+
		"e\3f\3f\3g\3g\3h\3h\5h\u0682\nh\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3m\2\2n"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\2\r\3\2AB\3\2Y\\\3\2\21\22\3\2lm\3\2vx\3\2\u0080\u0081\6"+
		"\2CORgls\u0082\u008b\6\2hkyy\u008c\u008e\u0091\u0091\4\2\27\27\35 \4\2"+
		"\30\30!$\4\2\22\22%/\2\u0777\2\u00f5\3\2\2\2\4\u00f7\3\2\2\2\6\u011d\3"+
		"\2\2\2\b\u013e\3\2\2\2\n\u0140\3\2\2\2\f\u0144\3\2\2\2\16\u0146\3\2\2"+
		"\2\20\u014c\3\2\2\2\22\u014e\3\2\2\2\24\u0152\3\2\2\2\26\u015e\3\2\2\2"+
		"\30\u0162\3\2\2\2\32\u0164\3\2\2\2\34\u017a\3\2\2\2\36\u017e\3\2\2\2 "+
		"\u01a3\3\2\2\2\"\u01bb\3\2\2\2$\u01c6\3\2\2\2&\u01cb\3\2\2\2(\u01cf\3"+
		"\2\2\2*\u01dc\3\2\2\2,\u01e6\3\2\2\2.\u01fc\3\2\2\2\60\u01fe\3\2\2\2\62"+
		"\u0204\3\2\2\2\64\u0234\3\2\2\2\66\u0238\3\2\2\28\u024c\3\2\2\2:\u0260"+
		"\3\2\2\2<\u0262\3\2\2\2>\u026d\3\2\2\2@\u0288\3\2\2\2B\u0295\3\2\2\2D"+
		"\u0299\3\2\2\2F\u02a1\3\2\2\2H\u02a8\3\2\2\2J\u02d4\3\2\2\2L\u02dd\3\2"+
		"\2\2N\u02df\3\2\2\2P\u02ee\3\2\2\2R\u02f2\3\2\2\2T\u02f6\3\2\2\2V\u02fd"+
		"\3\2\2\2X\u0301\3\2\2\2Z\u031a\3\2\2\2\\\u031c\3\2\2\2^\u032c\3\2\2\2"+
		"`\u032e\3\2\2\2b\u0346\3\2\2\2d\u038c\3\2\2\2f\u038e\3\2\2\2h\u03ab\3"+
		"\2\2\2j\u03ad\3\2\2\2l\u03c2\3\2\2\2n\u03cc\3\2\2\2p\u03d2\3\2\2\2r\u03e8"+
		"\3\2\2\2t\u03ea\3\2\2\2v\u03ec\3\2\2\2x\u03ee\3\2\2\2z\u03f8\3\2\2\2|"+
		"\u0402\3\2\2\2~\u0412\3\2\2\2\u0080\u0417\3\2\2\2\u0082\u0421\3\2\2\2"+
		"\u0084\u0437\3\2\2\2\u0086\u0455\3\2\2\2\u0088\u0469\3\2\2\2\u008a\u046e"+
		"\3\2\2\2\u008c\u0490\3\2\2\2\u008e\u049c\3\2\2\2\u0090\u04ad\3\2\2\2\u0092"+
		"\u04af\3\2\2\2\u0094\u050d\3\2\2\2\u0096\u0515\3\2\2\2\u0098\u0517\3\2"+
		"\2\2\u009a\u0519\3\2\2\2\u009c\u0550\3\2\2\2\u009e\u0552\3\2\2\2\u00a0"+
		"\u055c\3\2\2\2\u00a2\u0565\3\2\2\2\u00a4\u056c\3\2\2\2\u00a6\u0572\3\2"+
		"\2\2\u00a8\u0599\3\2\2\2\u00aa\u059b\3\2\2\2\u00ac\u05b8\3\2\2\2\u00ae"+
		"\u05ba\3\2\2\2\u00b0\u05bc\3\2\2\2\u00b2\u05c4\3\2\2\2\u00b4\u05c7\3\2"+
		"\2\2\u00b6\u05db\3\2\2\2\u00b8\u0601\3\2\2\2\u00ba\u061d\3\2\2\2\u00bc"+
		"\u062e\3\2\2\2\u00be\u063c\3\2\2\2\u00c0\u0640\3\2\2\2\u00c2\u0642\3\2"+
		"\2\2\u00c4\u066b\3\2\2\2\u00c6\u0670\3\2\2\2\u00c8\u0679\3\2\2\2\u00ca"+
		"\u067b\3\2\2\2\u00cc\u067d\3\2\2\2\u00ce\u0681\3\2\2\2\u00d0\u0683\3\2"+
		"\2\2\u00d2\u0685\3\2\2\2\u00d4\u0687\3\2\2\2\u00d6\u0689\3\2\2\2\u00d8"+
		"\u068b\3\2\2\2\u00da\u00f6\5\22\n\2\u00db\u00dd\7\60\2\2\u00dc\u00de\7"+
		"\u0092\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00df\u00e1\7>\2\2\u00e0\u00e2\7\u0092\2\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\7\3\2\2\u00e4\u00e6\7\u0092"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\5\4\3\2\u00e8\u00ea\7\u0092\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\5\24\13\2\u00ec\u00ee\7\u0092"+
		"\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\5\6\4\2\u00f0\u00f2\7\u0092\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\4\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00da\3\2\2\2\u00f5\u00db\3\2\2\2\u00f6\3\3\2\2\2\u00f7\u00f9\7\61\2"+
		"\2\u00f8\u00fa\7\u0092\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\7\63\2\2\u00fc\u00fe\7\u0092\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\7>\2\2\u0100"+
		"\u0102\7\u0092\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0105\7:\2\2\u0104\u0106\7\u0092\2\2\u0105\u0104\3\2\2"+
		"\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\7\61\2\2\u0108"+
		"\u010a\7\u0092\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010b\u010d\5\20\t\2\u010c\u010e\7\u0092\2\2\u010d\u010c\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7R\2\2\u0110"+
		"\u0112\7\u0092\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0115\7\64\2\2\u0114\u0116\7\u0092\2\2\u0115\u0114\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\7\67\2\2\u0118"+
		"\u011a\7\u0092\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\5\n\6\2\u011c\5\3\2\2\2\u011d\u011f\7\65\2\2\u011e"+
		"\u0120\7\u0092\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0123\5\b\5\2\u0122\u0124\7\u0092\2\2\u0123\u0122\3\2\2"+
		"\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\78\2\2\u0126\u0128"+
		"\7\u0092\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2"+
		"\2\u0129\u012b\5\f\7\2\u012a\u012c\7\u0092\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\7\62\2\2\u012e\u0130\7"+
		"\u0092\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2"+
		"\u0131\u0132\7>\2\2\u0132\7\3\2\2\2\u0133\u0135\7J\2\2\u0134\u0136\7\u0092"+
		"\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u013f\7;\2\2\u0138\u013a\7J\2\2\u0139\u013b\7\u0092\2\2\u013a\u0139\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\7=\2\2\u013d"+
		"\u013f\7<\2\2\u013e\u0133\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013d\3\2"+
		"\2\2\u013f\t\3\2\2\2\u0140\u0141\7?\2\2\u0141\13\3\2\2\2\u0142\u0145\5"+
		"\16\b\2\u0143\u0145\5\n\6\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"\r\3\2\2\2\u0146\u0148\5\u00caf\2\u0147\u0149\7\u0092\2\2\u0148\u0147"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7@\2\2\u014b"+
		"\17\3\2\2\2\u014c\u014d\t\2\2\2\u014d\21\3\2\2\2\u014e\u014f\5\24\13\2"+
		"\u014f\u0150\7\2\2\3\u0150\23\3\2\2\2\u0151\u0153\7\u0092\2\2\u0152\u0151"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0159\5\26\f\2"+
		"\u0155\u0157\7\u0092\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\7\5\2\2\u0159\u0156\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u015d\7\u0092\2\2\u015c\u015b\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\25\3\2\2\2\u015e\u015f\5\30\r\2\u015f\27\3\2\2\2"+
		"\u0160\u0163\5\32\16\2\u0161\u0163\5> \2\u0162\u0160\3\2\2\2\u0162\u0161"+
		"\3\2\2\2\u0163\31\3\2\2\2\u0164\u016b\5\36\20\2\u0165\u0167\7\u0092\2"+
		"\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a"+
		"\5\34\17\2\u0169\u0166\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c\33\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f"+
		"\7C\2\2\u016f\u0170\7\u0092\2\2\u0170\u0172\7D\2\2\u0171\u0173\7\u0092"+
		"\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u017b\5\36\20\2\u0175\u0177\7C\2\2\u0176\u0178\7\u0092\2\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\5\36\20\2"+
		"\u017a\u016e\3\2\2\2\u017a\u0175\3\2\2\2\u017b\35\3\2\2\2\u017c\u017f"+
		"\5 \21\2\u017d\u017f\5\"\22\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2"+
		"\u017f\37\3\2\2\2\u0180\u0182\5&\24\2\u0181\u0183\7\u0092\2\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0180\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u01a4\5F$\2\u018a\u018c\5&\24\2\u018b\u018d"+
		"\7\u0092\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2"+
		"\2\u018e\u018a\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191"+
		"\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u019a\5$\23\2\u0194"+
		"\u0196\7\u0092\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0199\5$\23\2\u0198\u0195\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a1\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019d\u019f\7\u0092\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\5F$\2\u01a1\u019e\3\2\2\2\u01a1\u01a2\3\2\2"+
		"\2\u01a2\u01a4\3\2\2\2\u01a3\u0186\3\2\2\2\u01a3\u0190\3\2\2\2\u01a4!"+
		"\3\2\2\2\u01a5\u01a7\5&\24\2\u01a6\u01a8\7\u0092\2\2\u01a7\u01a6\3\2\2"+
		"\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a5\3\2\2\2\u01aa\u01ad"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01b4\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01b0\5$\23\2\u01af\u01b1\7\u0092\2\2\u01b0\u01af"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01ae\3\2\2\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\5D#\2\u01b8\u01ba\7\u0092\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01ab\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\5 \21\2\u01c0#\3\2\2\2\u01c1\u01c7\5\60\31"+
		"\2\u01c2\u01c7\5,\27\2\u01c3\u01c7\5\66\34\2\u01c4\u01c7\5\62\32\2\u01c5"+
		"\u01c7\58\35\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7%\3\2\2\2\u01c8\u01cc"+
		"\5(\25\2\u01c9\u01cc\5*\26\2\u01ca\u01cc\5<\37\2\u01cb\u01c8\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc\'\3\2\2\2\u01cd\u01ce\7E\2\2"+
		"\u01ce\u01d0\7\u0092\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d3\7F\2\2\u01d2\u01d4\7\u0092\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01da\5X-\2\u01d6"+
		"\u01d8\7\u0092\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01db\5V,\2\u01da\u01d7\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		")\3\2\2\2\u01dc\u01de\7G\2\2\u01dd\u01df\7\u0092\2\2\u01de\u01dd\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5v<\2\u01e1\u01e2"+
		"\7\u0092\2\2\u01e2\u01e3\7H\2\2\u01e3\u01e4\7\u0092\2\2\u01e4\u01e5\5"+
		"\u00be`\2\u01e5+\3\2\2\2\u01e6\u01e8\7I\2\2\u01e7\u01e9\7\u0092\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ef\5Z"+
		".\2\u01eb\u01ec\7\u0092\2\2\u01ec\u01ee\5.\30\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0-\3\2\2\2"+
		"\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7J\2\2\u01f3\u01f4\7\u0092\2\2\u01f4"+
		"\u01f5\7F\2\2\u01f5\u01f6\7\u0092\2\2\u01f6\u01fd\5\62\32\2\u01f7\u01f8"+
		"\7J\2\2\u01f8\u01f9\7\u0092\2\2\u01f9\u01fa\7K\2\2\u01fa\u01fb\7\u0092"+
		"\2\2\u01fb\u01fd\5\62\32\2\u01fc\u01f2\3\2\2\2\u01fc\u01f7\3\2\2\2\u01fd"+
		"/\3\2\2\2\u01fe\u0200\7K\2\2\u01ff\u0201\7\u0092\2\2\u0200\u01ff\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\5X-\2\u0203\61"+
		"\3\2\2\2\u0204\u0206\7L\2\2\u0205\u0207\7\u0092\2\2\u0206\u0205\3\2\2"+
		"\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020d\5\64\33\2\u0209"+
		"\u020a\7\6\2\2\u020a\u020c\5\64\33\2\u020b\u0209\3\2\2\2\u020c\u020f\3"+
		"\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\63\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0212\5\u00c6d\2\u0211\u0213\7\u0092\2\2\u0212\u0211"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\7\7\2\2\u0215"+
		"\u0217\7\u0092\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218"+
		"\3\2\2\2\u0218\u0219\5v<\2\u0219\u0235\3\2\2\2\u021a\u021c\5\u00be`\2"+
		"\u021b\u021d\7\u0092\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0220\7\7\2\2\u021f\u0221\7\u0092\2\2\u0220\u021f"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\5v<\2\u0223"+
		"\u0235\3\2\2\2\u0224\u0226\5\u00be`\2\u0225\u0227\7\u0092\2\2\u0226\u0225"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\7\b\2\2\u0229"+
		"\u022b\7\u0092\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u022d\5v<\2\u022d\u0235\3\2\2\2\u022e\u0230\5\u00be`\2"+
		"\u022f\u0231\7\u0092\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\5l\67\2\u0233\u0235\3\2\2\2\u0234\u0210\3\2"+
		"\2\2\u0234\u021a\3\2\2\2\u0234\u0224\3\2\2\2\u0234\u022e\3\2\2\2\u0235"+
		"\65\3\2\2\2\u0236\u0237\7M\2\2\u0237\u0239\7\u0092\2\2\u0238\u0236\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\7N\2\2\u023b"+
		"\u023d\7\u0092\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0249\5v<\2\u023f\u0241\7\u0092\2\2\u0240\u023f\3\2\2\2"+
		"\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\7\6\2\2\u0243\u0245"+
		"\7\u0092\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2"+
		"\2\u0246\u0248\5v<\2\u0247\u0240\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\67\3\2\2\2\u024b\u0249\3\2\2\2\u024c"+
		"\u024d\7O\2\2\u024d\u024e\7\u0092\2\2\u024e\u0259\5:\36\2\u024f\u0251"+
		"\7\u0092\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2"+
		"\2\u0252\u0254\7\6\2\2\u0253\u0255\7\u0092\2\2\u0254\u0253\3\2\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\5:\36\2\u0257\u0250\3\2"+
		"\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"9\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\5\u00be`\2\u025d\u025e\5l\67"+
		"\2\u025e\u0261\3\2\2\2\u025f\u0261\5\u00c6d\2\u0260\u025c\3\2\2\2\u0260"+
		"\u025f\3\2\2\2\u0261;\3\2\2\2\u0262\u0263\7P\2\2\u0263\u0264\7\u0092\2"+
		"\2\u0264\u026b\5\u00aaV\2\u0265\u0267\7\u0092\2\2\u0266\u0265\3\2\2\2"+
		"\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\7Q\2\2\u0269\u026a"+
		"\7\u0092\2\2\u026a\u026c\5@!\2\u026b\u0266\3\2\2\2\u026b\u026c\3\2\2\2"+
		"\u026c=\3\2\2\2\u026d\u026e\7P\2\2\u026e\u0271\7\u0092\2\2\u026f\u0272"+
		"\5\u00aaV\2\u0270\u0272\5\u00acW\2\u0271\u026f\3\2\2\2\u0271\u0270\3\2"+
		"\2\2\u0272\u0277\3\2\2\2\u0273\u0274\7\u0092\2\2\u0274\u0275\7Q\2\2\u0275"+
		"\u0276\7\u0092\2\2\u0276\u0278\5@!\2\u0277\u0273\3\2\2\2\u0277\u0278\3"+
		"\2\2\2\u0278?\3\2\2\2\u0279\u0289\7\t\2\2\u027a\u0285\5B\"\2\u027b\u027d"+
		"\7\u0092\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2"+
		"\2\u027e\u0280\7\6\2\2\u027f\u0281\7\u0092\2\2\u0280\u027f\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\5B\"\2\u0283\u027c\3\2"+
		"\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u0279\3\2\2\2\u0288\u027a\3\2"+
		"\2\2\u0289\u028e\3\2\2\2\u028a\u028c\7\u0092\2\2\u028b\u028a\3\2\2\2\u028b"+
		"\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f\5V,\2\u028e\u028b\3\2\2"+
		"\2\u028e\u028f\3\2\2\2\u028fA\3\2\2\2\u0290\u0291\5\u00aeX\2\u0291\u0292"+
		"\7\u0092\2\2\u0292\u0293\7H\2\2\u0293\u0294\7\u0092\2\2\u0294\u0296\3"+
		"\2\2\2\u0295\u0290\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0298\5\u00be`\2\u0298C\3\2\2\2\u0299\u029a\7R\2\2\u029a\u029f\5H%\2"+
		"\u029b\u029d\7\u0092\2\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u02a0\5V,\2\u029f\u029c\3\2\2\2\u029f\u02a0\3\2\2"+
		"\2\u02a0E\3\2\2\2\u02a1\u02a2\7S\2\2\u02a2\u02a3\5H%\2\u02a3G\3\2\2\2"+
		"\u02a4\u02a6\7\u0092\2\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a9\7T\2\2\u02a8\u02a5\3\2\2\2\u02a8\u02a9\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\7\u0092\2\2\u02ab\u02ae\5J&\2\u02ac"+
		"\u02ad\7\u0092\2\2\u02ad\u02af\5N(\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3"+
		"\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02b1\7\u0092\2\2\u02b1\u02b3\5P)\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b5\7\u0092"+
		"\2\2\u02b5\u02b7\5R*\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7I"+
		"\3\2\2\2\u02b8\u02c3\7\t\2\2\u02b9\u02bb\7\u0092\2\2\u02ba\u02b9\3\2\2"+
		"\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\7\6\2\2\u02bd\u02bf"+
		"\7\u0092\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2"+
		"\2\u02c0\u02c2\5L\'\2\u02c1\u02ba\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1"+
		"\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02d5\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6"+
		"\u02d1\5L\'\2\u02c7\u02c9\7\u0092\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\7\6\2\2\u02cb\u02cd\7\u0092\2"+
		"\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0"+
		"\5L\'\2\u02cf\u02c8\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1"+
		"\u02d2\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02b8\3\2"+
		"\2\2\u02d4\u02c6\3\2\2\2\u02d5K\3\2\2\2\u02d6\u02d7\5v<\2\u02d7\u02d8"+
		"\7\u0092\2\2\u02d8\u02d9\7H\2\2\u02d9\u02da\7\u0092\2\2\u02da\u02db\5"+
		"\u00be`\2\u02db\u02de\3\2\2\2\u02dc\u02de\5v<\2\u02dd\u02d6\3\2\2\2\u02dd"+
		"\u02dc\3\2\2\2\u02deM\3\2\2\2\u02df\u02e0\7U\2\2\u02e0\u02e1\7\u0092\2"+
		"\2\u02e1\u02e2\7V\2\2\u02e2\u02e3\7\u0092\2\2\u02e3\u02eb\5T+\2\u02e4"+
		"\u02e6\7\6\2\2\u02e5\u02e7\7\u0092\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7"+
		"\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea\5T+\2\u02e9\u02e4\3\2\2\2\u02ea"+
		"\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ecO\3\2\2\2"+
		"\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7W\2\2\u02ef\u02f0\7\u0092\2\2\u02f0"+
		"\u02f1\5v<\2\u02f1Q\3\2\2\2\u02f2\u02f3\7X\2\2\u02f3\u02f4\7\u0092\2\2"+
		"\u02f4\u02f5\5v<\2\u02f5S\3\2\2\2\u02f6\u02fb\5v<\2\u02f7\u02f9\7\u0092"+
		"\2\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fc\t\3\2\2\u02fb\u02f8\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fcU\3\2\2\2"+
		"\u02fd\u02fe\7]\2\2\u02fe\u02ff\7\u0092\2\2\u02ff\u0300\5v<\2\u0300W\3"+
		"\2\2\2\u0301\u030c\5Z.\2\u0302\u0304\7\u0092\2\2\u0303\u0302\3\2\2\2\u0303"+
		"\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\7\6\2\2\u0306\u0308\7\u0092"+
		"\2\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030b\5Z.\2\u030a\u0303\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2"+
		"\2\u030c\u030d\3\2\2\2\u030dY\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0311"+
		"\5\u00be`\2\u0310\u0312\7\u0092\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3"+
		"\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\7\n\2\2\u0314\u0316\7\u0092\2\2"+
		"\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318"+
		"\5\\/\2\u0318\u031b\3\2\2\2\u0319\u031b\5\\/\2\u031a\u030f\3\2\2\2\u031a"+
		"\u0319\3\2\2\2\u031b[\3\2\2\2\u031c\u031d\5^\60\2\u031d]\3\2\2\2\u031e"+
		"\u0325\5`\61\2\u031f\u0321\7\u0092\2\2\u0320\u031f\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\5b\62\2\u0323\u0320\3\2\2\2\u0324"+
		"\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u032d\3\2"+
		"\2\2\u0327\u0325\3\2\2\2\u0328\u0329\7\13\2\2\u0329\u032a\5^\60\2\u032a"+
		"\u032b\7\f\2\2\u032b\u032d\3\2\2\2\u032c\u031e\3\2\2\2\u032c\u0328\3\2"+
		"\2\2\u032d_\3\2\2\2\u032e\u0330\7\13\2\2\u032f\u0331\7\u0092\2\2\u0330"+
		"\u032f\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0336\3\2\2\2\u0332\u0334\5\u00be"+
		"`\2\u0333\u0335\7\u0092\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u0337\3\2\2\2\u0336\u0332\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u033c\3\2"+
		"\2\2\u0338\u033a\5l\67\2\u0339\u033b\7\u0092\2\2\u033a\u0339\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u0338\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u0342\3\2\2\2\u033e\u0340\5h\65\2\u033f\u0341\7\u0092\2\2\u0340"+
		"\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u033e\3\2"+
		"\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345\7\f\2\2\u0345"+
		"a\3\2\2\2\u0346\u0348\5d\63\2\u0347\u0349\7\u0092\2\2\u0348\u0347\3\2"+
		"\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\5`\61\2\u034b"+
		"c\3\2\2\2\u034c\u034e\5\u00d4k\2\u034d\u034f\7\u0092\2\2\u034e\u034d\3"+
		"\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0352\5\u00d8m\2"+
		"\u0351\u0353\7\u0092\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0355\3\2\2\2\u0354\u0356\5f\64\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2"+
		"\2\2\u0356\u0358\3\2\2\2\u0357\u0359\7\u0092\2\2\u0358\u0357\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\5\u00d8m\2\u035b\u035d"+
		"\7\u0092\2\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\3\2\2"+
		"\2\u035e\u035f\5\u00d6l\2\u035f\u038d\3\2\2\2\u0360\u0362\5\u00d4k\2\u0361"+
		"\u0363\7\u0092\2\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0366\5\u00d8m\2\u0365\u0367\7\u0092\2\2\u0366\u0365\3"+
		"\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\3\2\2\2\u0368\u036a\5f\64\2\u0369"+
		"\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2\2\2\u036b\u036d\7\u0092"+
		"\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\5\u00d8m\2\u036f\u038d\3\2\2\2\u0370\u0372\5\u00d8m\2\u0371\u0373"+
		"\7\u0092\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2"+
		"\2\u0374\u0376\5f\64\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378"+
		"\3\2\2\2\u0377\u0379\7\u0092\2\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2"+
		"\2\u0379\u037a\3\2\2\2\u037a\u037c\5\u00d8m\2\u037b\u037d\7\u0092\2\2"+
		"\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f"+
		"\5\u00d6l\2\u037f\u038d\3\2\2\2\u0380\u0382\5\u00d8m\2\u0381\u0383\7\u0092"+
		"\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384"+
		"\u0386\5f\64\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2"+
		"\2\2\u0387\u0389\7\u0092\2\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u038a\3\2\2\2\u038a\u038b\5\u00d8m\2\u038b\u038d\3\2\2\2\u038c\u034c"+
		"\3\2\2\2\u038c\u0360\3\2\2\2\u038c\u0370\3\2\2\2\u038c\u0380\3\2\2\2\u038d"+
		"e\3\2\2\2\u038e\u0390\7\r\2\2\u038f\u0391\7\u0092\2\2\u0390\u038f\3\2"+
		"\2\2\u0390\u0391\3\2\2\2\u0391\u0396\3\2\2\2\u0392\u0394\5\u00be`\2\u0393"+
		"\u0395\7\u0092\2\2\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0397"+
		"\3\2\2\2\u0396\u0392\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039c\3\2\2\2\u0398"+
		"\u039a\5j\66\2\u0399\u039b\7\u0092\2\2\u039a\u0399\3\2\2\2\u039a\u039b"+
		"\3\2\2\2\u039b\u039d\3\2\2\2\u039c\u0398\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039f\3\2\2\2\u039e\u03a0\5p9\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2"+
		"\2\u03a0\u03a5\3\2\2\2\u03a1\u03a3\5h\65\2\u03a2\u03a4\7\u0092\2\2\u03a3"+
		"\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a1\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a8\7\16\2\2\u03a8"+
		"g\3\2\2\2\u03a9\u03ac\5\u00c2b\2\u03aa\u03ac\5\u00c4c\2\u03ab\u03a9\3"+
		"\2\2\2\u03ab\u03aa\3\2\2\2\u03aci\3\2\2\2\u03ad\u03af\7\n\2\2\u03ae\u03b0"+
		"\7\u0092\2\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2"+
		"\2\u03b1\u03bf\5t;\2\u03b2\u03b4\7\u0092\2\2\u03b3\u03b2\3\2\2\2\u03b3"+
		"\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\7\17\2\2\u03b6\u03b8\7"+
		"\n\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03ba\3\2\2\2\u03b9"+
		"\u03bb\7\u0092\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc"+
		"\3\2\2\2\u03bc\u03be\5t;\2\u03bd\u03b3\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf"+
		"\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0k\3\2\2\2\u03c1\u03bf\3\2\2\2"+
		"\u03c2\u03c9\5n8\2\u03c3\u03c5\7\u0092\2\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\5n8\2\u03c7\u03c4\3\2\2\2\u03c8"+
		"\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03cam\3\2\2\2"+
		"\u03cb\u03c9\3\2\2\2\u03cc\u03ce\7\n\2\2\u03cd\u03cf\7\u0092\2\2\u03ce"+
		"\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\5r"+
		":\2\u03d1o\3\2\2\2\u03d2\u03d4\7\t\2\2\u03d3\u03d5\7\u0092\2\2\u03d4\u03d3"+
		"\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03da\3\2\2\2\u03d6\u03d8\5\u00caf"+
		"\2\u03d7\u03d9\7\u0092\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03db\3\2\2\2\u03da\u03d6\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03e6\3\2"+
		"\2\2\u03dc\u03de\7\20\2\2\u03dd\u03df\7\u0092\2\2\u03de\u03dd\3\2\2\2"+
		"\u03de\u03df\3\2\2\2\u03df\u03e4\3\2\2\2\u03e0\u03e2\5\u00caf\2\u03e1"+
		"\u03e3\7\u0092\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e5"+
		"\3\2\2\2\u03e4\u03e0\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e7\3\2\2\2\u03e6"+
		"\u03dc\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7q\3\2\2\2\u03e8\u03e9\5\u00ce"+
		"h\2\u03e9s\3\2\2\2\u03ea\u03eb\5\u00ceh\2\u03ebu\3\2\2\2\u03ec\u03ed\5"+
		"x=\2\u03edw\3\2\2\2\u03ee\u03f5\5z>\2\u03ef\u03f0\7\u0092\2\2\u03f0\u03f1"+
		"\7^\2\2\u03f1\u03f2\7\u0092\2\2\u03f2\u03f4\5z>\2\u03f3\u03ef\3\2\2\2"+
		"\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6y\3"+
		"\2\2\2\u03f7\u03f5\3\2\2\2\u03f8\u03ff\5|?\2\u03f9\u03fa\7\u0092\2\2\u03fa"+
		"\u03fb\7_\2\2\u03fb\u03fc\7\u0092\2\2\u03fc\u03fe\5|?\2\u03fd\u03f9\3"+
		"\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"{\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0409\5~@\2\u0403\u0404\7\u0092\2"+
		"\2\u0404\u0405\7`\2\2\u0405\u0406\7\u0092\2\2\u0406\u0408\5~@\2\u0407"+
		"\u0403\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2"+
		"\2\2\u040a}\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040e\7a\2\2\u040d\u040f"+
		"\7\u0092\2\2\u040e\u040d\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2\2"+
		"\2\u0410\u040c\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2\2\u0412\u0413"+
		"\3\2\2\2\u0413\u0415\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0416\5\u0080A"+
		"\2\u0416\177\3\2\2\2\u0417\u041e\5\u0082B\2\u0418\u041a\7\u0092\2\2\u0419"+
		"\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d\5\u009c"+
		"O\2\u041c\u0419\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0081\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0434\5\u0084"+
		"C\2\u0422\u0424\7\u0092\2\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u0427\7\21\2\2\u0426\u0428\7\u0092\2\2\u0427\u0426"+
		"\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0433\5\u0084C"+
		"\2\u042a\u042c\7\u0092\2\2\u042b\u042a\3\2\2\2\u042b\u042c\3\2\2\2\u042c"+
		"\u042d\3\2\2\2\u042d\u042f\7\22\2\2\u042e\u0430\7\u0092\2\2\u042f\u042e"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433\5\u0084C"+
		"\2\u0432\u0423\3\2\2\2\u0432\u042b\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0432"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0083\3\2\2\2\u0436\u0434\3\2\2\2\u0437"+
		"\u0452\5\u0086D\2\u0438\u043a\7\u0092\2\2\u0439\u0438\3\2\2\2\u0439\u043a"+
		"\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\7\t\2\2\u043c\u043e\7\u0092\2"+
		"\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0451"+
		"\5\u0086D\2\u0440\u0442\7\u0092\2\2\u0441\u0440\3\2\2\2\u0441\u0442\3"+
		"\2\2\2\u0442\u0443\3\2\2\2\u0443\u0445\7\23\2\2\u0444\u0446\7\u0092\2"+
		"\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0451"+
		"\5\u0086D\2\u0448\u044a\7\u0092\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3"+
		"\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d\7\24\2\2\u044c\u044e\7\u0092\2"+
		"\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451"+
		"\5\u0086D\2\u0450\u0439\3\2\2\2\u0450\u0441\3\2\2\2\u0450\u0449\3\2\2"+
		"\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0085"+
		"\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0460\5\u0088E\2\u0456\u0458\7\u0092"+
		"\2\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459\3\2\2\2\u0459"+
		"\u045b\7\25\2\2\u045a\u045c\7\u0092\2\2\u045b\u045a\3\2\2\2\u045b\u045c"+
		"\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045f\5\u0088E\2\u045e\u0457\3\2\2"+
		"\2\u045f\u0462\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461\u0087"+
		"\3\2\2\2\u0462\u0460\3\2\2\2\u0463\u0465\t\4\2\2\u0464\u0466\7\u0092\2"+
		"\2\u0465\u0464\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\3\2\2\2\u0467\u0463"+
		"\3\2\2\2\u0468\u046b\3\2\2\2\u0469\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a"+
		"\u046c\3\2\2\2\u046b\u0469\3\2\2\2\u046c\u046d\5\u008aF\2\u046d\u0089"+
		"\3\2\2\2\u046e\u0474\5\u0092J\2\u046f\u0473\5\u008eH\2\u0470\u0473\5\u008c"+
		"G\2\u0471\u0473\5\u0090I\2\u0472\u046f\3\2\2\2\u0472\u0470\3\2\2\2\u0472"+
		"\u0471\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u008b\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0478\7\u0092\2\2\u0478"+
		"\u047a\7b\2\2\u0479\u047b\7\u0092\2\2\u047a\u0479\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u0491\5\u0092J\2\u047d\u047f\7\u0092"+
		"\2\2\u047e\u047d\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0481\7\r\2\2\u0481\u0482\5v<\2\u0482\u0483\7\16\2\2\u0483\u0491\3\2"+
		"\2\2\u0484\u0486\7\u0092\2\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0487\3\2\2\2\u0487\u0489\7\r\2\2\u0488\u048a\5v<\2\u0489\u0488\3\2\2"+
		"\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048d\7\20\2\2\u048c"+
		"\u048e\5v<\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\3\2\2"+
		"\2\u048f\u0491\7\16\2\2\u0490\u0477\3\2\2\2\u0490\u047e\3\2\2\2\u0490"+
		"\u0485\3\2\2\2\u0491\u008d\3\2\2\2\u0492\u0493\7\u0092\2\2\u0493\u0494"+
		"\7c\2\2\u0494\u0495\7\u0092\2\2\u0495\u049d\7R\2\2\u0496\u0497\7\u0092"+
		"\2\2\u0497\u0498\7d\2\2\u0498\u0499\7\u0092\2\2\u0499\u049d\7R\2\2\u049a"+
		"\u049b\7\u0092\2\2\u049b\u049d\7e\2\2\u049c\u0492\3\2\2\2\u049c\u0496"+
		"\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u049f\3\2\2\2\u049e\u04a0\7\u0092\2"+
		"\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2"+
		"\5\u0092J\2\u04a2\u008f\3\2\2\2\u04a3\u04a4\7\u0092\2\2\u04a4\u04a5\7"+
		"f\2\2\u04a5\u04a6\7\u0092\2\2\u04a6\u04ae\7g\2\2\u04a7\u04a8\7\u0092\2"+
		"\2\u04a8\u04a9\7f\2\2\u04a9\u04aa\7\u0092\2\2\u04aa\u04ab\7a\2\2\u04ab"+
		"\u04ac\7\u0092\2\2\u04ac\u04ae\7g\2\2\u04ad\u04a3\3\2\2\2\u04ad\u04a7"+
		"\3\2\2\2\u04ae\u0091\3\2\2\2\u04af\u04b6\5\u0094K\2\u04b0\u04b2\7\u0092"+
		"\2\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b5\5\u00b8]\2\u04b4\u04b1\3\2\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b4"+
		"\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04bd\3\2\2\2\u04b8\u04b6\3\2\2\2\u04b9"+
		"\u04bb\7\u0092\2\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc"+
		"\3\2\2\2\u04bc\u04be\5l\67\2\u04bd\u04ba\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u0093\3\2\2\2\u04bf\u050e\5\u0096L\2\u04c0\u050e\5\u00c4c\2\u04c1\u050e"+
		"\5\u00ba^\2\u04c2\u04c4\7h\2\2\u04c3\u04c5\7\u0092\2\2\u04c4\u04c3\3\2"+
		"\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\7\13\2\2\u04c7"+
		"\u04c9\7\u0092\2\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca"+
		"\3\2\2\2\u04ca\u04cc\7\t\2\2\u04cb\u04cd\7\u0092\2\2\u04cc\u04cb\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u050e\7\f\2\2\u04cf\u050e"+
		"\5\u00b4[\2\u04d0\u050e\5\u00b6\\\2\u04d1\u04d3\7D\2\2\u04d2\u04d4\7\u0092"+
		"\2\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5"+
		"\u04d7\7\13\2\2\u04d6\u04d8\7\u0092\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8"+
		"\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\5\u00a2R\2\u04da\u04dc\7\u0092"+
		"\2\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u04de\7\f\2\2\u04de\u050e\3\2\2\2\u04df\u04e1\7i\2\2\u04e0\u04e2\7\u0092"+
		"\2\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e5\7\13\2\2\u04e4\u04e6\7\u0092\2\2\u04e5\u04e4\3\2\2\2\u04e5\u04e6"+
		"\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e9\5\u00a2R\2\u04e8\u04ea\7\u0092"+
		"\2\2\u04e9\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb"+
		"\u04ec\7\f\2\2\u04ec\u050e\3\2\2\2\u04ed\u04ef\7j\2\2\u04ee\u04f0\7\u0092"+
		"\2\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04f3\7\13\2\2\u04f2\u04f4\7\u0092\2\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4"+
		"\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\5\u00a2R\2\u04f6\u04f8\7\u0092"+
		"\2\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fa\7\f\2\2\u04fa\u050e\3\2\2\2\u04fb\u04fd\7k\2\2\u04fc\u04fe\7\u0092"+
		"\2\2\u04fd\u04fc\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0501\7\13\2\2\u0500\u0502\7\u0092\2\2\u0501\u0500\3\2\2\2\u0501\u0502"+
		"\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u0505\5\u00a2R\2\u0504\u0506\7\u0092"+
		"\2\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\7\f\2\2\u0508\u050e\3\2\2\2\u0509\u050e\5\u00a0Q\2\u050a\u050e"+
		"\5\u009eP\2\u050b\u050e\5\u00a6T\2\u050c\u050e\5\u00be`\2\u050d\u04bf"+
		"\3\2\2\2\u050d\u04c0\3\2\2\2\u050d\u04c1\3\2\2\2\u050d\u04c2\3\2\2\2\u050d"+
		"\u04cf\3\2\2\2\u050d\u04d0\3\2\2\2\u050d\u04d1\3\2\2\2\u050d\u04df\3\2"+
		"\2\2\u050d\u04ed\3\2\2\2\u050d\u04fb\3\2\2\2\u050d\u0509\3\2\2\2\u050d"+
		"\u050a\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050c\3\2\2\2\u050e\u0095\3\2"+
		"\2\2\u050f\u0516\5\u00c0a\2\u0510\u0516\7t\2\2\u0511\u0516\5\u0098M\2"+
		"\u0512\u0516\7g\2\2\u0513\u0516\5\u00c2b\2\u0514\u0516\5\u009aN\2\u0515"+
		"\u050f\3\2\2\2\u0515\u0510\3\2\2\2\u0515\u0511\3\2\2\2\u0515\u0512\3\2"+
		"\2\2\u0515\u0513\3\2\2\2\u0515\u0514\3\2\2\2\u0516\u0097\3\2\2\2\u0517"+
		"\u0518\t\5\2\2\u0518\u0099\3\2\2\2\u0519\u051b\7\r\2\2\u051a\u051c\7\u0092"+
		"\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u052e\3\2\2\2\u051d"+
		"\u051f\5v<\2\u051e\u0520\7\u0092\2\2\u051f\u051e\3\2\2\2\u051f\u0520\3"+
		"\2\2\2\u0520\u052b\3\2\2\2\u0521\u0523\7\6\2\2\u0522\u0524\7\u0092\2\2"+
		"\u0523\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0527"+
		"\5v<\2\u0526\u0528\7\u0092\2\2\u0527\u0526\3\2\2\2\u0527\u0528\3\2\2\2"+
		"\u0528\u052a\3\2\2\2\u0529\u0521\3\2\2\2\u052a\u052d\3\2\2\2\u052b\u0529"+
		"\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052e"+
		"\u051d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531\7\16"+
		"\2\2\u0531\u009b\3\2\2\2\u0532\u0534\7\7\2\2\u0533\u0535\7\u0092\2\2\u0534"+
		"\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0551\5\u0082"+
		"B\2\u0537\u0539\7\26\2\2\u0538\u053a\7\u0092\2\2\u0539\u0538\3\2\2\2\u0539"+
		"\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0551\5\u0082B\2\u053c\u053e"+
		"\7\27\2\2\u053d\u053f\7\u0092\2\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2"+
		"\2\2\u053f\u0540\3\2\2\2\u0540\u0551\5\u0082B\2\u0541\u0543\7\30\2\2\u0542"+
		"\u0544\7\u0092\2\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545"+
		"\3\2\2\2\u0545\u0551\5\u0082B\2\u0546\u0548\7\31\2\2\u0547\u0549\7\u0092"+
		"\2\2\u0548\u0547\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u0551\5\u0082B\2\u054b\u054d\7\32\2\2\u054c\u054e\7\u0092\2\2\u054d\u054c"+
		"\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\5\u0082B"+
		"\2\u0550\u0532\3\2\2\2\u0550\u0537\3\2\2\2\u0550\u053c\3\2\2\2\u0550\u0541"+
		"\3\2\2\2\u0550\u0546\3\2\2\2\u0550\u054b\3\2\2\2\u0551\u009d\3\2\2\2\u0552"+
		"\u0554\7\13\2\2\u0553\u0555\7\u0092\2\2\u0554\u0553\3\2\2\2\u0554\u0555"+
		"\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0558\5v<\2\u0557\u0559\7\u0092\2\2"+
		"\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b"+
		"\7\f\2\2\u055b\u009f\3\2\2\2\u055c\u0561\5`\61\2\u055d\u055f\7\u0092\2"+
		"\2\u055e\u055d\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0562"+
		"\5b\62\2\u0561\u055e\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0561\3\2\2\2\u0563"+
		"\u0564\3\2\2\2\u0564\u00a1\3\2\2\2\u0565\u056a\5\u00a4S\2\u0566\u0568"+
		"\7\u0092\2\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\3\2\2"+
		"\2\u0569\u056b\5V,\2\u056a\u0567\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u00a3"+
		"\3\2\2\2\u056c\u056d\5\u00be`\2\u056d\u056e\7\u0092\2\2\u056e\u056f\7"+
		"b\2\2\u056f\u0570\7\u0092\2\2\u0570\u0571\5v<\2\u0571\u00a5\3\2\2\2\u0572"+
		"\u0574\5\u00a8U\2\u0573\u0575\7\u0092\2\2\u0574\u0573\3\2\2\2\u0574\u0575"+
		"\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\7\13\2\2\u0577\u0579\7\u0092"+
		"\2\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057e\3\2\2\2\u057a"+
		"\u057c\7T\2\2\u057b\u057d\7\u0092\2\2\u057c\u057b\3\2\2\2\u057c\u057d"+
		"\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u057a\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u0591\3\2\2\2\u0580\u0582\5v<\2\u0581\u0583\7\u0092\2\2\u0582\u0581\3"+
		"\2\2\2\u0582\u0583\3\2\2\2\u0583\u058e\3\2\2\2\u0584\u0586\7\6\2\2\u0585"+
		"\u0587\7\u0092\2\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588"+
		"\3\2\2\2\u0588\u058a\5v<\2\u0589\u058b\7\u0092\2\2\u058a\u0589\3\2\2\2"+
		"\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u0584\3\2\2\2\u058d\u0590"+
		"\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f\u0592\3\2\2\2\u0590"+
		"\u058e\3\2\2\2\u0591\u0580\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\3\2"+
		"\2\2\u0593\u0594\7\f\2\2\u0594\u00a7\3\2\2\2\u0595\u0596\5\u00b2Z\2\u0596"+
		"\u0597\5\u00d2j\2\u0597\u059a\3\2\2\2\u0598\u059a\7n\2\2\u0599\u0595\3"+
		"\2\2\2\u0599\u0598\3\2\2\2\u059a\u00a9\3\2\2\2\u059b\u059d\5\u00b0Y\2"+
		"\u059c\u059e\7\u0092\2\2\u059d\u059c\3\2\2\2\u059d\u059e\3\2\2\2\u059e"+
		"\u059f\3\2\2\2\u059f\u05a1\7\13\2\2\u05a0\u05a2\7\u0092\2\2\u05a1\u05a0"+
		"\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05b4\3\2\2\2\u05a3\u05a5\5v<\2\u05a4"+
		"\u05a6\7\u0092\2\2\u05a5\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05b1"+
		"\3\2\2\2\u05a7\u05a9\7\6\2\2\u05a8\u05aa\7\u0092\2\2\u05a9\u05a8\3\2\2"+
		"\2\u05a9\u05aa\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ad\5v<\2\u05ac\u05ae"+
		"\7\u0092\2\2\u05ad\u05ac\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b0\3\2\2"+
		"\2\u05af\u05a7\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2"+
		"\3\2\2\2\u05b2\u05b5\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b4\u05a3\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\7\f\2\2\u05b7\u00ab\3\2"+
		"\2\2\u05b8\u05b9\5\u00b0Y\2\u05b9\u00ad\3\2\2\2\u05ba\u05bb\5\u00d2j\2"+
		"\u05bb\u00af\3\2\2\2\u05bc\u05bd\5\u00b2Z\2\u05bd\u05be\5\u00d2j\2\u05be"+
		"\u00b1\3\2\2\2\u05bf\u05c0\5\u00d2j\2\u05c0\u05c1\7\33\2\2\u05c1\u05c3"+
		"\3\2\2\2\u05c2\u05bf\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c4"+
		"\u05c5\3\2\2\2\u05c5\u00b3\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7\u05c9\7\r"+
		"\2\2\u05c8\u05ca\7\u0092\2\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca"+
		"\u05cb\3\2\2\2\u05cb\u05d4\5\u00a2R\2\u05cc\u05ce\7\u0092\2\2\u05cd\u05cc"+
		"\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d1\7\17\2\2"+
		"\u05d0\u05d2\7\u0092\2\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2\3\2\2\2\u05d2"+
		"\u05d3\3\2\2\2\u05d3\u05d5\5v<\2\u05d4\u05cd\3\2\2\2\u05d4\u05d5\3\2\2"+
		"\2\u05d5\u05d7\3\2\2\2\u05d6\u05d8\7\u0092\2\2\u05d7\u05d6\3\2\2\2\u05d7"+
		"\u05d8\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\7\16\2\2\u05da\u00b5\3"+
		"\2\2\2\u05db\u05dd\7\r\2\2\u05dc\u05de\7\u0092\2\2\u05dd\u05dc\3\2\2\2"+
		"\u05dd\u05de\3\2\2\2\u05de\u05e7\3\2\2\2\u05df\u05e1\5\u00be`\2\u05e0"+
		"\u05e2\7\u0092\2\2\u05e1\u05e0\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e3"+
		"\3\2\2\2\u05e3\u05e5\7\7\2\2\u05e4\u05e6\7\u0092\2\2\u05e5\u05e4\3\2\2"+
		"\2\u05e5\u05e6\3\2\2\2\u05e6\u05e8\3\2\2\2\u05e7\u05df\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\5\u00a0Q\2\u05ea\u05ec\7\u0092"+
		"\2\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05f5\3\2\2\2\u05ed"+
		"\u05ef\7]\2\2\u05ee\u05f0\7\u0092\2\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f3\5v<\2\u05f2\u05f4\7\u0092\2\2"+
		"\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05ed"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\7\17\2\2"+
		"\u05f8\u05fa\7\u0092\2\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa"+
		"\u05fb\3\2\2\2\u05fb\u05fd\5v<\2\u05fc\u05fe\7\u0092\2\2\u05fd\u05fc\3"+
		"\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0600\7\16\2\2\u0600"+
		"\u00b7\3\2\2\2\u0601\u0603\7\33\2\2\u0602\u0604\7\u0092\2\2\u0603\u0602"+
		"\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\5\u00c8e"+
		"\2\u0606\u00b9\3\2\2\2\u0607\u060c\7o\2\2\u0608\u060a\7\u0092\2\2\u0609"+
		"\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d\5\u00bc"+
		"_\2\u060c\u0609\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060c\3\2\2\2\u060e"+
		"\u060f\3\2\2\2\u060f\u061e\3\2\2\2\u0610\u0612\7o\2\2\u0611\u0613\7\u0092"+
		"\2\2\u0612\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0614\3\2\2\2\u0614"+
		"\u0619\5v<\2\u0615\u0617\7\u0092\2\2\u0616\u0615\3\2\2\2\u0616\u0617\3"+
		"\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a\5\u00bc_\2\u0619\u0616\3\2\2\2"+
		"\u061a\u061b\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061e"+
		"\3\2\2\2\u061d\u0607\3\2\2\2\u061d\u0610\3\2\2\2\u061e\u0627\3\2\2\2\u061f"+
		"\u0621\7\u0092\2\2\u0620\u061f\3\2\2\2\u0620\u0621\3\2\2\2\u0621\u0622"+
		"\3\2\2\2\u0622\u0624\7p\2\2\u0623\u0625\7\u0092\2\2\u0624\u0623\3\2\2"+
		"\2\u0624\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0628\5v<\2\u0627\u0620"+
		"\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a\3\2\2\2\u0629\u062b\7\u0092\2"+
		"\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d"+
		"\7q\2\2\u062d\u00bb\3\2\2\2\u062e\u0630\7r\2\2\u062f\u0631\7\u0092\2\2"+
		"\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634"+
		"\5v<\2\u0633\u0635\7\u0092\2\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2"+
		"\u0635\u0636\3\2\2\2\u0636\u0638\7s\2\2\u0637\u0639\7\u0092\2\2\u0638"+
		"\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\5v"+
		"<\2\u063b\u00bd\3\2\2\2\u063c\u063d\5\u00d2j\2\u063d\u00bf\3\2\2\2\u063e"+
		"\u0641\5\u00ccg\2\u063f\u0641\5\u00caf\2\u0640\u063e\3\2\2\2\u0640\u063f"+
		"\3\2\2\2\u0641\u00c1\3\2\2\2\u0642\u0644\7\3\2\2\u0643\u0645\7\u0092\2"+
		"\2\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0667\3\2\2\2\u0646\u0648"+
		"\5\u00c8e\2\u0647\u0649\7\u0092\2\2\u0648\u0647\3\2\2\2\u0648\u0649\3"+
		"\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\7\n\2\2\u064b\u064d\7\u0092\2\2"+
		"\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u0650"+
		"\5v<\2\u064f\u0651\7\u0092\2\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2"+
		"\u0651\u0664\3\2\2\2\u0652\u0654\7\6\2\2\u0653\u0655\7\u0092\2\2\u0654"+
		"\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0658\5\u00c8"+
		"e\2\u0657\u0659\7\u0092\2\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659"+
		"\u065a\3\2\2\2\u065a\u065c\7\n\2\2\u065b\u065d\7\u0092\2\2\u065c\u065b"+
		"\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\5v<\2\u065f"+
		"\u0661\7\u0092\2\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0663"+
		"\3\2\2\2\u0662\u0652\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0667\u0646\3\2"+
		"\2\2\u0667\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\7\4\2\2\u066a"+
		"\u00c3\3\2\2\2\u066b\u066e\7\34\2\2\u066c\u066f\5\u00d2j\2\u066d\u066f"+
		"\7w\2\2\u066e\u066c\3\2\2\2\u066e\u066d\3\2\2\2\u066f\u00c5\3\2\2\2\u0670"+
		"\u0675\5\u0094K\2\u0671\u0673\7\u0092\2\2\u0672\u0671\3\2\2\2\u0672\u0673"+
		"\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0676\5\u00b8]\2\u0675\u0672\3\2\2"+
		"\2\u0676\u0677\3\2\2\2\u0677\u0675\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u00c7"+
		"\3\2\2\2\u0679\u067a\5\u00ceh\2\u067a\u00c9\3\2\2\2\u067b\u067c\t\6\2"+
		"\2\u067c\u00cb\3\2\2\2\u067d\u067e\t\7\2\2\u067e\u00cd\3\2\2\2\u067f\u0682"+
		"\5\u00d2j\2\u0680\u0682\5\u00d0i\2\u0681\u067f\3\2\2\2\u0681\u0680\3\2"+
		"\2\2\u0682\u00cf\3\2\2\2\u0683\u0684\t\b\2\2\u0684\u00d1\3\2\2\2\u0685"+
		"\u0686\t\t\2\2\u0686\u00d3\3\2\2\2\u0687\u0688\t\n\2\2\u0688\u00d5\3\2"+
		"\2\2\u0689\u068a\t\13\2\2\u068a\u00d7\3\2\2\2\u068b\u068c\t\f\2\2\u068c"+
		"\u00d9\3\2\2\2\u0137\u00dd\u00e1\u00e5\u00e9\u00ed\u00f1\u00f5\u00f9\u00fd"+
		"\u0101\u0105\u0109\u010d\u0111\u0115\u0119\u011f\u0123\u0127\u012b\u012f"+
		"\u0135\u013a\u013e\u0144\u0148\u0152\u0156\u0159\u015c\u0162\u0166\u016b"+
		"\u0172\u0177\u017a\u017e\u0182\u0186\u018c\u0190\u0195\u019a\u019e\u01a1"+
		"\u01a3\u01a7\u01ab\u01b0\u01b4\u01b9\u01bd\u01c6\u01cb\u01cf\u01d3\u01d7"+
		"\u01da\u01de\u01e8\u01ef\u01fc\u0200\u0206\u020d\u0212\u0216\u021c\u0220"+
		"\u0226\u022a\u0230\u0234\u0238\u023c\u0240\u0244\u0249\u0250\u0254\u0259"+
		"\u0260\u0266\u026b\u0271\u0277\u027c\u0280\u0285\u0288\u028b\u028e\u0295"+
		"\u029c\u029f\u02a5\u02a8\u02ae\u02b2\u02b6\u02ba\u02be\u02c3\u02c8\u02cc"+
		"\u02d1\u02d4\u02dd\u02e6\u02eb\u02f8\u02fb\u0303\u0307\u030c\u0311\u0315"+
		"\u031a\u0320\u0325\u032c\u0330\u0334\u0336\u033a\u033c\u0340\u0342\u0348"+
		"\u034e\u0352\u0355\u0358\u035c\u0362\u0366\u0369\u036c\u0372\u0375\u0378"+
		"\u037c\u0382\u0385\u0388\u038c\u0390\u0394\u0396\u039a\u039c\u039f\u03a3"+
		"\u03a5\u03ab\u03af\u03b3\u03b7\u03ba\u03bf\u03c4\u03c9\u03ce\u03d4\u03d8"+
		"\u03da\u03de\u03e2\u03e4\u03e6\u03f5\u03ff\u0409\u040e\u0412\u0419\u041e"+
		"\u0423\u0427\u042b\u042f\u0432\u0434\u0439\u043d\u0441\u0445\u0449\u044d"+
		"\u0450\u0452\u0457\u045b\u0460\u0465\u0469\u0472\u0474\u047a\u047e\u0485"+
		"\u0489\u048d\u0490\u049c\u049f\u04ad\u04b1\u04b6\u04ba\u04bd\u04c4\u04c8"+
		"\u04cc\u04d3\u04d7\u04db\u04e1\u04e5\u04e9\u04ef\u04f3\u04f7\u04fd\u0501"+
		"\u0505\u050d\u0515\u051b\u051f\u0523\u0527\u052b\u052e\u0534\u0539\u053e"+
		"\u0543\u0548\u054d\u0550\u0554\u0558\u055e\u0563\u0567\u056a\u0574\u0578"+
		"\u057c\u057e\u0582\u0586\u058a\u058e\u0591\u0599\u059d\u05a1\u05a5\u05a9"+
		"\u05ad\u05b1\u05b4\u05c4\u05c9\u05cd\u05d1\u05d4\u05d7\u05dd\u05e1\u05e5"+
		"\u05e7\u05eb\u05ef\u05f3\u05f5\u05f9\u05fd\u0603\u0609\u060e\u0612\u0616"+
		"\u061b\u061d\u0620\u0624\u0627\u062a\u0630\u0634\u0638\u0640\u0644\u0648"+
		"\u064c\u0650\u0654\u0658\u065c\u0660\u0664\u0667\u066e\u0672\u0677\u0681";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}