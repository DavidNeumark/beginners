package c.whileLoop;

public class Demo4 {

	public static void main(String[] args) {
		int c = 1;

		while (c <= 500) {
			if (c % 5 == 0 && c % 7 == 0) {
				System.out.print(c + ", ");
			}
			c++;
		}
		System.out.println();
	}
}
