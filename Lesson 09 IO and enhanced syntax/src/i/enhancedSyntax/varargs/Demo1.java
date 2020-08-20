package i.enhancedSyntax.varargs;

public class Demo1 {

	public static void main(String... args) {

		System.out.println(sum(5, 3, 4, 5, 7, 7, 8));
		System.out.println(sum(5, 3));
		System.out.println(sum(5));
		System.out.println(sum("David", 5, 3));
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int sum(int... numbers) {
		int sum = 0;

		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}

	public static int sum(String name, int... numbers) {
		System.out.println("Hello " + name);
		return sum(numbers);
	}

}
