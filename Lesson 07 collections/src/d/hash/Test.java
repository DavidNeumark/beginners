package d.hash;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Point p1 = new Point(5, 5);
		Point p2 = new Point(3, 3);
		Point p3 = new Point(5, 5);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

		Set<Point> points = new HashSet<>();
		points.add(new Point(2, 2));
		points.add(new Point(3, 3));
		points.add(new Point(5, 5));
		System.out.println(points);

		System.out.println(points.contains(new Point(2, 2)));

	}

}
