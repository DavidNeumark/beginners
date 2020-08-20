package e.wrrapperClasses;

public class Demo1 {

	public static void main(String[] args) {
		int a = 5;
		Integer x = new Integer(a); // inboxing
		Integer y = 10; // auto-inbox

		System.out.println(a);
		System.out.println(x);

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Long.MAX_VALUE);

		// converting String to numerals
		String str = "25";
		int num = Integer.parseInt(str);
		System.out.println(num);

		// converting numerals to String
		str = String.valueOf(num);
		System.out.println(str);
	}

}
