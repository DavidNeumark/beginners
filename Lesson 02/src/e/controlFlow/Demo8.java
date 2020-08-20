package e.controlFlow;

public class Demo8 {

	public static void main(String[] args) {

		// create a random grade in the range 0 - 11 inclusive
		int grade = (int) (Math.random() * 12);
		System.out.println("grade = " + grade);

		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("נכשל");
			break;
		case 5:
		case 6:
			System.out.println("מספיק");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("טוב");
			break;
		case 10:
			System.out.println("מצוין");
			break;
		default:
			System.out.println("Illegal grade value: " + grade);
			break;
		}

	}
}
