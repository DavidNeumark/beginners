package b.modfiers;

public class FinalDemo {

	// final field will not be initialized automatically
	final int x;

	public FinalDemo(int val) {
		x = val;
	}

	public static void main(String[] args) {
		int a = 5;
		a = 10;

		final int b = 5; // final
		// b = 10; // compilation error

		final int c; // blank final
		System.out.println(a);
		System.out.println(b);

		c = 11;
		System.out.println(c);

	}

	public void printX() {
		System.out.println(x);
	}
}
