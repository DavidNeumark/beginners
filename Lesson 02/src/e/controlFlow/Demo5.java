package e.controlFlow;

public class Demo5 {

	public static void main(String[] args) {

		// create 2 random numbers
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		// print the numbers
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int max = a > b ? a : b; // declare and initialize max

		// print max
		System.out.println("max = " + max);

	}
}
