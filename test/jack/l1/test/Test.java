package jack.l1.test;

import jack.l1.L1Lexer;
import jack.l1.L1Parser;
import jack.l1.impl.IdentityInterpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {

	public static void main(String[] args) throws IOException {

		String file = "etc/proc.script";
		InputStream is = new FileInputStream(new File(file));
		ANTLRInputStream charInput = new ANTLRInputStream(is);
		L1Lexer l1lexer = new L1Lexer(charInput);
		CommonTokenStream tokens = new CommonTokenStream(l1lexer);
		L1Parser l1parser = new L1Parser(tokens);
		ParseTree tree = l1parser.prog();
		IdentityInterpreter itp = new IdentityInterpreter(System.out,System.err);
		itp.visit(tree);
	}
}
