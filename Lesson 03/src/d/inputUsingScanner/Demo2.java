package d.inputUsingScanner;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		// create a scanner object to read from keybord
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your name");
		String name = sc.nextLine();
		System.out.println(name);

		// close the scanner to release system resources
		sc.close();
	}
}
