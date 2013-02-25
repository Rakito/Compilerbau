package interpreter;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.Scanner;

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
			ToC interp = new ToC();
			ast.apply(interp);

//			System.out.println("JETZT KOMMT DER CODEPRINTER!");

//			System.out.print(interp.cp.code.toString());

		} catch (Exception e) {
			System.out.println("Verkackt!");
			e.printStackTrace();
		}

	}
}
