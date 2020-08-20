package j.enhancedSyntax.autoboxing;

public class Demo1 {

	public static void main(String[] args) {

		int x = 5;
		Integer a = new Integer(x); // inboxing
		int b = a.intValue(); // outboxing

		Integer n1 = x; // auto-inboxing
		int n2 = a; // auto-outboxing

	}
}
