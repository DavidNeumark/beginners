package e.singleton;

public class Test {

	public static void main(String[] args) {

		Superman s1 = Superman.getInstance();
		Superman s2 = Superman.getInstance();

		s1.setName("aaa");
		s1.setSpeed(100);

		System.out.println(s2.getName());
		System.out.println(s2.getSpeed());
	}
}
