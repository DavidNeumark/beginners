package h.debug;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("stat of program");
		methodA();
		System.out.println("end of program");
	}

	public static void methodA() {
		int x = 5;
		int y = 9;
		System.out.println(x + y);
		methodB();
	}

	public static void methodB() {
		int x = 50;
		int y = 90;
		System.out.println(x + y);
	}
}
