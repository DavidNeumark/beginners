package g.scope;

public class Demo2 {

	static int global = 100;

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		// System.out.println(i);

		if (true) {
			int a = 5;
		}

		// System.out.println(a);
	}

}
