package interpreter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.List;

import lexer.Lexer;
import lexer.LexerException;
import node.Start;
import parser.Parser;
import parser.ParserException;

public class Main {
	public static void main(String[] args) {
		System.out.println("Run, run, run!");

		if (args.length < 1) {
			System.out.println("No filename supplied!");
		}

		ToC interp = null;

		Lexer lexer = null;
		try {
			lexer = new Lexer(new PushbackReader(new FileReader(args[0])));
		} catch (FileNotFoundException e) {
			System.out.println("Error occured: File not found!");
			return;
		}
		System.out.println("Lex, lex!");
		Parser parser = new Parser(lexer);

		Start ast = null;

		System.out.println("Versuch mal zu parsen.");
		try {
			System.out.println("Pars, pars!");
			ast = parser.parse();
		} catch (ParserException e) {
			System.out
					.println("Parser Error occured! Error: " + e.getMessage());
			return;
		} catch (LexerException e) {
			System.out.println("Lexer Error occured! Error: " + e.getMessage());
			return;
		} catch (IOException e) {
			System.out.println("IO error occured! Error: " + e.getMessage());
			return;
		}
		try {
			/* Get our Interpreter going. */
			interp = new ToC("C:/users/fhoeborn", "olaf");
			ast.apply(interp);
		} catch (SemanticException e) {
			System.out.println("Semantic Error occured!\nError: "
					+ e.getMessage());
			return;
		}

		printWarnings(interp.getWarnings());

		System.out.println("Compile completed!");
	}

	private static void printWarnings(List<String> warnings) {
		for (String warning : warnings) {
			System.out.println("Warning: " + warning);
		}
	}
}
