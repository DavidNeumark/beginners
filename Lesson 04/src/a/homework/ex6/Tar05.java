package a.homework.ex6;

public class Tar05 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100_000);
		// num = 45;
		int numberOfDigits = 0;
		int leftDigit = 0;
		int sumOfDigits = 0;
		int rev = 0;
		System.out.println("num = " + num);

		while (num != 0) {
			numberOfDigits++;
			if (num < 10) {
				leftDigit = num;
			}
			sumOfDigits += num % 10;
			rev *= 10;
			rev += num % 10;
			num = num / 10;
		}

		System.out.println("number of digits = " + numberOfDigits);
		System.out.println("left digit = " + leftDigit);
		System.out.println("sum of digits = " + sumOfDigits);
		System.out.println("reversed number = " + rev);

	}

}
