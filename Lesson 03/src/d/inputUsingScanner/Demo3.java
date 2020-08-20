package d.inputUsingScanner;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {

		// create a scanner object to read from keybord
		Scanner sc = new Scanner(System.in);

		System.out.print("enter first number: ");
		int a = sc.nextInt();
		System.out.print("enter second number: ");
		int b = sc.nextInt();

		int sum = a + b;

		System.out.println("sum = " + sum);

		// close the scanner to release system resources
		sc.close();
	}
}
