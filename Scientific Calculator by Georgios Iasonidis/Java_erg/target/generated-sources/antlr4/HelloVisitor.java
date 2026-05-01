// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#tan_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan_op(@NotNull HelloParser.Tan_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#p_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_op(@NotNull HelloParser.P_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#nand_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNand_op(@NotNull HelloParser.Nand_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#rul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRul(@NotNull HelloParser.RulContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(@NotNull HelloParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#and_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_op(@NotNull HelloParser.And_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#not_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_op(@NotNull HelloParser.Not_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#log_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_op(@NotNull HelloParser.Log_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#div_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv_op(@NotNull HelloParser.Div_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#or_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_op(@NotNull HelloParser.Or_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factorial_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorial_op(@NotNull HelloParser.Factorial_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin_op(@NotNull HelloParser.Sin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#xor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_op(@NotNull HelloParser.Xor_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#e_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE_op(@NotNull HelloParser.E_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#mod_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod_op(@NotNull HelloParser.Mod_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#cos_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos_op(@NotNull HelloParser.Cos_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#minus_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_op(@NotNull HelloParser.Minus_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#logic_operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_operations(@NotNull HelloParser.Logic_operationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#pow_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow_op(@NotNull HelloParser.Pow_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#cot_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCot_op(@NotNull HelloParser.Cot_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sqrt_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt_op(@NotNull HelloParser.Sqrt_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#multi_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_op(@NotNull HelloParser.Multi_opContext ctx);
}