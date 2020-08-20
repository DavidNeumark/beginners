package c.calc.ui;

import java.util.Scanner;

import c.calc.impl.Calculator;

public class CalcUI {

	private static Calculator calc = new Calculator();
	private static boolean quit;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (!quit) {
			showMenu();
			char command = sc.nextLine().charAt(0);
			switch (command) {
			case '+':
				doAdd();
				break;
			case '-':
				doSub();
				break;
			case '*':
				doMul();
				break;
			case '/':
				doDiv();
				break;
			case '=':
				doShowResult();
				break;
			case 'r':
				calc.reset();
				break;
			case 'q':
				quit = true;
				break;

			default:
				break;
			}
		}

		sc.close();
		System.out.println("Bye");
	}

	private static void doShowResult() {
		System.out.println("result = " + calc.getResult());

	}

	private static void doAdd() {
		System.out.print("enter number to add: ");
		double val = Double.parseDouble(sc.nextLine());
		calc.add(val);
	}

	private static void doSub() {
		System.out.print("enter number to subtract: ");
		double val = Double.parseDouble(sc.nextLine());
		calc.sub(val);
	}

	private static void doMul() {
		System.out.print("enter number to multiply by: ");
		double val = Double.parseDouble(sc.nextLine());
		calc.mul(val);
	}

	private static void doDiv() {
		System.out.print("enter number to divid by: ");
		double val = Double.parseDouble(sc.nextLine());
		calc.div(val);
	}

	private static void showMenu() {
		System.out.println("====================");
		System.out.println("add ......... +");
		System.out.println("sub ......... -");
		System.out.println("mul ......... *");
		System.out.println("div ......... /");
		System.out.println("result ...... =");
		System.out.println("reset ....... r");
		System.out.println("quit ........ q");

	}

}
