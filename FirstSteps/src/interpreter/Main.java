package interpreter;

import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import lexer.Lexer;
import node.Start;
import parser.Parser;

public class Main {
	public static void main(String[] args) {
		System.out.println("Run, run, run!");

		try {
			System.in.read();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		ToC interp = null;
		try {
			Lexer lexer = new Lexer(new PushbackReader(new FileReader(
					"testCodeFS")
			// new InputStreamReader(System.in)
			// new StringReader("1?2:3 ")
					));
			System.out.println("Lex, lex!");
			Parser parser = new Parser(lexer);
			System.out.println("Pars, pars!");
			Start ast;

			System.out.println("Versuch mal zu parsen.");
			ast = parser.parse();
			System.out.println("Der Parser parst");

			/* Get our Interpreter going. */
			interp = new ToC("/Users/vin/Study/5.Semester/Compilerbau", "olaf");
			ast.apply(interp);
			//ast.apply(interp);
			
			System.out.println(interp.output.toString());
			System.out.println("FunctionScope: "
					+ interp.currentFunctionVariableScope.toString());
			System.out.println("GlobalScope: "
					+ interp.currentGlobalVariableScope.toString());
			System.out.println("StructScope: "
					+ interp.currentStructVariableScope.toString());

			// System.out.print(interp.cp.code.toString());

		} catch (Exception e) {
			System.out.println("Verkackt!");
			if (interp != null) {
				System.out.println("FunctionScope: "
						+ interp.currentFunctionVariableScope.toString());
				System.out.println("GlobalScope: "
						+ interp.currentGlobalVariableScope.toString());
				System.out.println("StructScope: "
						+ interp.currentStructVariableScope.toString());
			}

			e.printStackTrace();
		}

	}
}
