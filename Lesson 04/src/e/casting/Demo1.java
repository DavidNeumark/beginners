package e.casting;

public class Demo1 {

	public static void main(String[] args) {
		byte n1 = 10;
		int n2 = n1; // implicit casting

		byte n3 = (byte) n2; // explicit casting

		n3 = (byte) 2000;
		System.out.println(n3);

		// converting decimals to integers is always explicit
		double x = 3.5;
		int y = (int) x;

		long a1 = 9223372036854775807L;
		long a2 = a1 - 1;
		double b1 = a1;
		double b2 = a2;

		// πιρει χθο
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(b1);
		System.out.println(b2);
		a1 = (long) b1;
		a2 = (long) b2;
		System.out.println(a1);
		System.out.println(a2);
	}
}
