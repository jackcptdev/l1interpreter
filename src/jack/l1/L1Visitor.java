// Generated from L1.g4 by ANTLR 4.0
package jack.l1;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface L1Visitor<T> extends ParseTreeVisitor<T> {
	T visitLcoma(L1Parser.LcomaContext ctx);

	T visitLnumber(L1Parser.LnumberContext ctx);

	T visitLand(L1Parser.LandContext ctx);

	T visitLfunction(L1Parser.LfunctionContext ctx);

	T visitLblock(L1Parser.LblockContext ctx);

	T visitLreturn(L1Parser.LreturnContext ctx);

	T visitLstat(L1Parser.LstatContext ctx);

	T visitLdemaexpr(L1Parser.LdemaexprContext ctx);

	T visitParameters(L1Parser.ParametersContext ctx);

	T visitLwhile(L1Parser.LwhileContext ctx);

	T visitLor(L1Parser.LorContext ctx);

	T visitLparamsvalue(L1Parser.LparamsvalueContext ctx);

	T visitLsubAdd(L1Parser.LsubAddContext ctx);

	T visitLassignstat(L1Parser.LassignstatContext ctx);

	T visitLnegative(L1Parser.LnegativeContext ctx);

	T visitLarrayvisit(L1Parser.LarrayvisitContext ctx);

	T visitLprog(L1Parser.LprogContext ctx);

	T visitLid(L1Parser.LidContext ctx);

	T visitLmuldiv(L1Parser.LmuldivContext ctx);

	T visitLexpr(L1Parser.LexprContext ctx);

	T visitLbooleannagative(L1Parser.LbooleannagativeContext ctx);

	T visitLtrue(L1Parser.LtrueContext ctx);

	T visitLfalse(L1Parser.LfalseContext ctx);

	T visitLcondition(L1Parser.LconditionContext ctx);

	T visitLprint(L1Parser.LprintContext ctx);

	T visitLarraydef(L1Parser.LarraydefContext ctx);

	T visitLstring(L1Parser.LstringContext ctx);

	T visitLifstat(L1Parser.LifstatContext ctx);

	T visitLcallfun(L1Parser.LcallfunContext ctx);
}