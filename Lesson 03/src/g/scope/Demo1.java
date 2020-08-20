package g.scope;

public class Demo1 {

	static int global = 100;

	public static void main(String[] args) {
		int x = 5;
		System.out.println(global);

		{
			// declaring a variable inside a block
			int a = 5;
		}

		{
			// declaring a variable inside a different block
			int a = 5;
		}
	}

	public static void myMethod() {
		// System.out.println(x);
	}
}
