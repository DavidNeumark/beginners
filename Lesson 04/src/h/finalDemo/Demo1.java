package h.finalDemo;

public class Demo1 {

	public static void main(String[] args) {
		final int x = 3;
		// x++;

		final int y;
		System.out.println("before we use y it should be initialized");
		y = 10;
		System.out.println(y);
		// y = 100;

	}
}
