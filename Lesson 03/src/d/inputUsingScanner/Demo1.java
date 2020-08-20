package d.inputUsingScanner;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		// create a scanner object to read from keybord
		Scanner sc = new Scanner(System.in);

		System.out.println("enter password");
		String pass = sc.nextLine();
		System.out.println(pass);

		// close the scanner to release system resources
		sc.close();
	}
}
