package e.doWhileLoop;

public class Demo1 {

	public static void main(String[] args) {

		String systemPass = "admin";
		String inputPass;
		// create a scanner object to read from keyboard
		java.util.Scanner sc = new java.util.Scanner(System.in);

		do {
			System.out.println("enter password");
			inputPass = sc.nextLine();
		} while (!inputPass.equals(systemPass));

		System.out.println("Logged in");

		// close the scanner to release system resources
		sc.close();

	}
}
