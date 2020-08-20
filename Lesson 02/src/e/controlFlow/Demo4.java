package e.controlFlow;

public class Demo4 {

	public static void main(String[] args) {

		// create 2 random numbers
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		// print the numbers
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int max; // declare max
		
		// initialize max
		if (a > b) {
			max = a;
		}else{
			max = b;
		}
		
		// print max
		System.out.println("max = " + max);

	}
}
