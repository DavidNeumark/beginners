package c.inheritance;

public class Point {

	protected int x;
	protected int y;

	public Point(int x, int y) {
		System.out.println("from Point(int x, int y)");
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point (" + x + ", " + y + ")";
	}

}
