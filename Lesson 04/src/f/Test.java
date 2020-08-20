package f;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car(101);
		Car c2 = new Car(102);

		System.out.println(c1.equals(c1));
		System.out.println(c1.equals(c2));

		System.out.println(c1);
		System.out.println(c2);

		c1.drive(30);
		c2.drive(130);

		System.out.println(c1);
		System.out.println(c2);
	}
}
