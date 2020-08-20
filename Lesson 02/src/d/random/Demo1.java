package d.random;

public class Demo1 {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11);
		System.out.println(r);

		int a = 10;
		int b = 20;

		r = (int) (Math.random() * (b - a + 1) + a);
		System.out.println(r);
		
	}
}
