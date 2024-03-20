// Generated from MYGRAMM.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MYGRAMMParser}.
 */
public interface MYGRAMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MYGRAMMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MYGRAMMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(MYGRAMMParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(MYGRAMMParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(MYGRAMMParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(MYGRAMMParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MYGRAMMParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MYGRAMMParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MYGRAMMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MYGRAMMParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#input_tail}.
	 * @param ctx the parse tree
	 */
	void enterInput_tail(MYGRAMMParser.Input_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#input_tail}.
	 * @param ctx the parse tree
	 */
	void exitInput_tail(MYGRAMMParser.Input_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#print_tail}.
	 * @param ctx the parse tree
	 */
	void enterPrint_tail(MYGRAMMParser.Print_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#print_tail}.
	 * @param ctx the parse tree
	 */
	void exitPrint_tail(MYGRAMMParser.Print_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#assign_tail}.
	 * @param ctx the parse tree
	 */
	void enterAssign_tail(MYGRAMMParser.Assign_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#assign_tail}.
	 * @param ctx the parse tree
	 */
	void exitAssign_tail(MYGRAMMParser.Assign_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MYGRAMMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MYGRAMMParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(MYGRAMMParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(MYGRAMMParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MYGRAMMParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MYGRAMMParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MYGRAMMParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MYGRAMMParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#numerical_constant}.
	 * @param ctx the parse tree
	 */
	void enterNumerical_constant(MYGRAMMParser.Numerical_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#numerical_constant}.
	 * @param ctx the parse tree
	 */
	void exitNumerical_constant(MYGRAMMParser.Numerical_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYGRAMMParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MYGRAMMParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYGRAMMParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MYGRAMMParser.VariableContext ctx);
}