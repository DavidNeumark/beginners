package c.inheritance.shapes;

public class Test {

	public static void main(String[] args) {
		Shape s;

		s = new Rectangle(5, 9);
		System.out.println(s.getArea());

		s = new Circle(3);
		System.out.println(s.getArea());
	}
}
