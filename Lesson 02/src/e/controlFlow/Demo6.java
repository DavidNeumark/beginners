package e.controlFlow;

public class Demo6 {

	public static void main(String[] args) {

		// create a random number in the range 1 - 3 inclusive
		int day = (int) (Math.random() * 3) + 1;
		System.out.println("day = " + day);

		if (day == 1) {
			System.out.println("Sunday");
		} else if (day == 2) {
			System.out.println("Monday");
		} else {
			System.out.println("Tueday");
		}

	}
}
