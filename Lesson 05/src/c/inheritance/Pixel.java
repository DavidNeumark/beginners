package c.inheritance;

public class Pixel extends Point {

	private String color;

	public Pixel(int x, int y, String color) {
		super(x, y);
		System.out.println("from Pixel(int x, int y, String color)");
		this.color = color;
	}

	public Pixel(int x, int y) {
		this(x, y, "black");
		System.out.println("from Pixel(int x, int y)");
	}

	public Pixel() {
		this(0, 0);
		System.out.println("from Pixel()");
	}

	@Override
	public String toString() {
		return "Pixel (" + x + ", " + y + ") " + color;
	}

}
