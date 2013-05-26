package jack.l1.impl;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import jack.l1.L1BaseVisitor;
import jack.l1.L1Parser;
import jack.l1.L1Parser.EContext;
import jack.l1.L1Parser.LandContext;
import jack.l1.L1Parser.LarraydefContext;
import jack.l1.L1Parser.LarrayvisitContext;
import jack.l1.L1Parser.LassignstatContext;
import jack.l1.L1Parser.LblockContext;
import jack.l1.L1Parser.LbooleannagativeContext;
import jack.l1.L1Parser.LcallfunContext;
import jack.l1.L1Parser.LcomaContext;
import jack.l1.L1Parser.LconditionContext;
import jack.l1.L1Parser.LfalseContext;
import jack.l1.L1Parser.LfunctionContext;
import jack.l1.L1Parser.LidContext;
import jack.l1.L1Parser.LifstatContext;
import jack.l1.L1Parser.LmuldivContext;
import jack.l1.L1Parser.LnegativeContext;
import jack.l1.L1Parser.LnumberContext;
import jack.l1.L1Parser.LorContext;
import jack.l1.L1Parser.LparamsvalueContext;
import jack.l1.L1Parser.LprintContext;
import jack.l1.L1Parser.LreturnContext;
import jack.l1.L1Parser.LstringContext;
import jack.l1.L1Parser.LsubAddContext;
import jack.l1.L1Parser.LtrueContext;
import jack.l1.L1Parser.ParametersContext;
import jack.l1.mem.ScopeManager;

public class IdentityInterpreter extends L1BaseVisitor<Identity> {
	private final ScopeManager scopes = ScopeManager.newScopeManager();
	private final PrintStream stdOut;
	private final PrintStream errOut;

	public IdentityInterpreter(OutputStream stdOut, OutputStream errOut) {
		this.stdOut = new PrintStream(stdOut);
		this.errOut = new PrintStream(errOut);
	}

	@Override
	public Identity visitLifstat(LifstatContext ctx) {
		Identity condition = visit(ctx.e());
		if (condition.getIdentityType() != Identity.BOOL) {
			this.errOut.println(condition.getIdentityType()
					+ " is not a condition result.");
		}
		Boolean b = Boolean.valueOf(condition.getConstantValue().toString());
		if (b) {
			visit(ctx.b(0));
		} else {
			visit(ctx.b(1));
		}
		return null;
	}

	@Override
	public Identity visitLmuldiv(LmuldivContext ctx) {
		Identity left = visit(ctx.e(0));
		Identity right = visit(ctx.e(1));
		if (left.getIdentityType() != Identity.NUMBER
				|| right.getIdentityType() != Identity.NUMBER) {
			errOut.println("Number is need in MUL or DIV.");
		}
		if (ctx.op.getType() == L1Parser.MUL) {
			Double l = Double.valueOf(left.getConstantValue().toString());
			Double r = Double.valueOf(right.getConstantValue().toString());
			Double ans = l * r;
			return new Identity(Identity.NUMBER, ans);
		} else {
			Double l = Double.valueOf(left.getConstantValue().toString());
			Double r = Double.valueOf(right.getConstantValue().toString());
			Double ans = l / r;
			return new Identity(Identity.NUMBER, ans);
		}
	}

	@Override
	public Identity visitLnumber(LnumberContext ctx) {
		return new Identity(Identity.NUMBER, Double.valueOf(ctx.NUMBER()
				.getText()));
	}

	@Override
	public Identity visitLid(LidContext ctx) {
		String idName = ctx.ID().getText();
		Identity value = this.scopes.getIdentity(idName);
		if (value == null) {
			value = new Identity(Identity.NULL, null);
			this.scopes.putIdentity(idName, value);
		}
		return value;
	}

	@Override
	public Identity visitLtrue(LtrueContext ctx) {
		return new Identity(Identity.BOOL, true);
	}

	@Override
	public Identity visitLfalse(LfalseContext ctx) {
		return new Identity(Identity.BOOL, false);
	}

	@Override
	public Identity visitLstring(LstringContext ctx) {
		return new Identity(Identity.STRING, ctx.STRING().getText());
	}

	@Override
	public Identity visitLcoma(LcomaContext ctx) {
		Identity ans = visit(ctx.e());
		return ans;
	}

	@Override
	public Identity visitLsubAdd(LsubAddContext ctx) {
		Identity left = visit(ctx.e(0));
		Identity right = visit(ctx.e(1));
		if (left.getIdentityType() != Identity.NUMBER
				|| right.getIdentityType() != Identity.NUMBER) {
			errOut.println("Number is need in ADD or SUB.");
		}
		if (ctx.op.getType() == L1Parser.ADD) {
			Double l = Double.valueOf(left.getConstantValue().toString());
			Double r = Double.valueOf(right.getConstantValue().toString());
			Double ans = l + r;
			return new Identity(Identity.NUMBER, ans);
		} else {
			Double l = Double.valueOf(left.getConstantValue().toString());
			Double r = Double.valueOf(right.getConstantValue().toString());
			Double ans = l - r;
			return new Identity(Identity.NUMBER, ans);
		}
	}

	@Override
	public Identity visitLfunction(LfunctionContext ctx) {
		Identity pi = visitParameters(ctx.parameters());
		String[] ids = (String[]) pi.getConstantValue();
		String functionName = ctx.ID().getText();

		FunctionDef fd = new FunctionDef(functionName, ids, ctx.b());
		Identity iden = new Identity(Identity.FUN, fd);
		boolean isNotDef = scopes.putFunction(functionName, iden);
		if (!isNotDef) {
			errOut.println("Function " + functionName + " is already defined.");
		}
		Identity r = new Identity(Identity.FUN, fd);
		return r;
	}

	@Override
	public Identity visitLnegative(LnegativeContext ctx) {
		Identity ans = visit(ctx.e());
		Identity r = new Identity(Identity.NUMBER, -Double.valueOf(ans
				.getConstantValue().toString()));
		return r;
	}

	@Override
	public Identity visitLbooleannagative(LbooleannagativeContext ctx) {
		Identity br = visit(ctx.e());
		if (br.getIdentityType() != Identity.BOOL) {
			errOut.println("Boolean expr does not return BOOL type.");
		}
		Boolean b = (Boolean) br.getConstantValue();
		if (b == false) {
			b = true;
		} else {
			b = false;
		}
		return new Identity(Identity.BOOL, b);
	}

	@Override
	public Identity visitLblock(LblockContext ctx) {
		this.scopes.enterNewScope();
		this.scopes.moveFunctionParameterValuesToCurrentScope();
		visitChildren(ctx);
		this.scopes.exitNewScope();
		return new Identity(Identity.NULL, null);
	}

	@Override
	public Identity visitLarraydef(LarraydefContext ctx) {
		Identity pv = visit(ctx.elist());
		Identity[] pvs = (Identity[]) pv.getConstantValue();
		List<Identity> values = new ArrayList<Identity>();
		for (Identity p : pvs) {
			values.add(p);
		}
		return new Identity(Identity.ARRAY, values);
	}

	@Override
	public Identity visitLarrayvisit(LarrayvisitContext ctx) {

		Identity index = visit(ctx.e(1));
		if (index.getIdentityType() != Identity.NUMBER) {
			errOut.println("Index must be NUMBER.");
		}
		Integer rindex = Integer.valueOf(index.getConstantValue().toString());
		Identity prefix = visit(ctx.e(0));
		if (prefix.getIdentityType() == Identity.ID) {
			prefix = this.scopes.getIdentity(prefix.getConstantValue()
					.toString());
		}

		if (prefix == null) {
			errOut.println("Symbol " + prefix + " is not defined.");
		}

		if (prefix.getIdentityType() != Identity.ARRAY) {
			errOut.println("Array Visitor must be array.Visitor type :"
					+ prefix.getIdentityType());
		}

		@SuppressWarnings("unchecked")
		List<Identity> list = (List<Identity>) prefix.getConstantValue();
		return list.get(rindex);
	}

	@Override
	public Identity visitLreturn(LreturnContext ctx) {
		Identity r = visit(ctx.e());

		this.scopes.setReturnValue(r);
		return null;
	}

	@Override
	public Identity visitLparamsvalue(LparamsvalueContext ctx) {
		List<EContext> es = ctx.e();
		Identity[] ans = new Identity[es.size()];
		for (int i = 0; i < es.size(); i++) {
			Identity r = visit(es.get(i));
			ans[i] = r;
		}
		return new Identity(Identity.PARAMETER_VALUES, ans);
	}

	@Override
	public Identity visitLcallfun(LcallfunContext ctx) {

		String functionName = ctx.ID().getText();
		Identity fd = this.scopes.getFunction(functionName);
		if (fd == null || fd.getIdentityType() != Identity.FUN) {
			errOut.println("Function " + functionName + " is not defined.");
		}
		FunctionDef f = (FunctionDef) fd.getConstantValue();
		String[] paras = f.getParameters();
		Identity pv = visit(ctx.elist());
		if (pv.getIdentityType() != Identity.PARAMETER_VALUES) {
			errOut.println("Visi parameters error. Return type:"
					+ pv.getIdentityType());
		}

		Identity[] pvs = (Identity[]) pv.getConstantValue();
		if (paras.length != pvs.length) {
			errOut.println("Value'lenght not equal Para's length:" + pvs.length
					+ " " + paras.length);
		}

		this.scopes.prepareForCallFunction();
		for (int i = 0; i < paras.length; i++) {
			this.scopes.pushFunctionParameterValue(paras[i], pvs[i]);
		}
		visitLblock((LblockContext) f.getFunctionBody());
		Identity ans = this.scopes.getReturnValue() != null ? this.scopes
				.getReturnValue() : new Identity(Identity.NULL, null);
		return ans;
	}

	@Override
	public Identity visitParameters(ParametersContext ctx) {
		List<TerminalNode> ids = ctx.ID();
		String[] ans = new String[ids.size()];
		int i = 0;
		for (TerminalNode id : ids) {
			if (id != null) {
				if (id.getText() == null) {
					errOut.println("Invalid id: null");
				}
				ans[i] = id.getText();
				i++;
			}
		}
		return new Identity(Identity.PARAMETERS, ans);
	}

	@Override
	public Identity visitLassignstat(LassignstatContext ctx) {
		Identity value = visit(ctx.e(1));
		Identity left = visit(ctx.e(0));

		left.setConstantValue(value.getConstantValue());
		left.setIdentityType(value.getIdentityType());
		return null;
	}

	@Override
	public Identity visitLprint(LprintContext ctx) {
		Identity value = visit(ctx.e());
		if (value.getIdentityType() == Identity.ID) {
			value = this.scopes
					.getIdentity(value.getConstantValue().toString());
		}
		Identity ans = null;
		if (value.getIdentityType() == Identity.NUMBER
				|| value.getIdentityType() == Identity.STRING) {
			ans = new Identity(Identity.STRING, value.getConstantValue()
					.toString());
		} else if (value.getIdentityType() == Identity.FUN) {
			FunctionDef fd = (FunctionDef) value.getConstantValue();
			ans = new Identity(Identity.STRING, "Function: "
					+ fd.getFunctionName());
		} else if (value.getIdentityType() == Identity.ARRAY) {
			ans = new Identity(Identity.STRING, "Array: " + value.hashCode());
		} else {
			ans = new Identity(Identity.STRING, "Internal : "
					+ value.hashCode());
		}

		stdOut.println(ans.getConstantValue().toString());

		return null;
	}

	@Override
	public Identity visitLcondition(LconditionContext ctx) {
		int opType = ctx.op.getType();
		Identity left = visit(ctx.e(0));
		Identity right = visit(ctx.e(1));

		if (left.getIdentityType() != Identity.NUMBER
				|| right.getIdentityType() != Identity.NUMBER) {
			errOut.println("Condition Error: test values must be NUMBER.");
		}
		boolean ans = false;
		Double l = Double.valueOf(left.getConstantValue().toString());
		Double r = Double.valueOf(right.getConstantValue().toString());
		switch (opType) {
		case L1Parser.G:
			ans = l > r;
			break;
		case L1Parser.GE:
			ans = l >= r;
			break;
		case L1Parser.L:
			ans = l < r;
			break;
		case L1Parser.LE:
			ans = l <= r;
			break;
		case L1Parser.EQ:
			ans = l == r;
			break;
		case L1Parser.NEQ:
			ans = l != r;
			break;
		default:
			errOut.println("Wrong op:" + ctx.op.getText());
			break;
		}

		return new Identity(Identity.BOOL, ans);
	}

	@Override
	public Identity visitLand(LandContext ctx) {
		Identity left = visit(ctx.e(0));
		Identity right = visit(ctx.e(1));
		Boolean l = Boolean.valueOf(left.getConstantValue().toString());
		Boolean r = Boolean.valueOf(right.getConstantValue().toString());
		boolean ans = false;
		if (l && r) {
			ans = true;
		}
		return new Identity(Identity.BOOL, ans);
	}

	@Override
	public Identity visitLor(LorContext ctx) {
		Identity left = visit(ctx.e(0));
		Identity right = visit(ctx.e(1));
		Boolean l = Boolean.valueOf(left.getConstantValue().toString());
		Boolean r = Boolean.valueOf(right.getConstantValue().toString());
		boolean ans = false;
		if (l || r) {
			ans = true;
		}
		return new Identity(Identity.BOOL, ans);
	}

}
