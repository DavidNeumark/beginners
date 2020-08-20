package c.inheritance;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point(3, 7);
		System.out.println(p1);

		Pixel px1 = new Pixel(4, 9, "Red");
		System.out.println(px1);

		Pixel px2 = new Pixel();
		System.out.println(px2);

	}

}
