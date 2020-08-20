package a;

public class TaxCalculator {

	/** Salary taxes are calculated according to the following */
	public static void main(String[] args) {

		double salary = (int) (Math.random() * 150_000);
		double tax = 0;
		System.out.println("salary: " + salary);

		if (salary <= 23_000) {
			tax = salary * 0.1;
		} else if (salary <= 50_000) {
			tax = 23_000 * 0.1 + (salary - 23_000) * 0.2;
		} else if (salary <= 100_000) {
			tax = 23_000 * 0.1 + 27_000 * 0.2 + (salary - 50_000) * 0.3;
		} else {
			tax = 23_000 * 0.1 + 27_000 * 0.2 + 50_000 * 0.3 + (salary - 100_000) * 0.4;
		}

		System.out.println("tax: " + tax);
		System.out.println("net: " + (salary - tax));

	}

}
