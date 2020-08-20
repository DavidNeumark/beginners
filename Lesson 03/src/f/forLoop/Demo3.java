package f.forLoop;

public class Demo3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 21 + 10);
		int b = (int) (Math.random() * 21 + 10);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.println("a = " + a + ", b = " + b);

		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}

	}

}
