package e.controlFlow;

public class Demo7 {

	public static void main(String[] args) {

		// create a random number in the range 1 - 3 inclusive
		// int day = (int) (Math.random() * 7) + 1;
		int day = (int) (Math.random() * 11);
		System.out.println("day = " + day);

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("almost weekend");
			break;
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Illegal day value");
			break;
		}

	}
}
