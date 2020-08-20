package c.whileLoop;

public class Demo7 {

	public static void main(String[] args) {

		int sum = 0;
		double avg;
		int ind = 1;

		while (ind <= 10) {
			int r = (int) (Math.random() * 101);
			sum += r;
			System.out.print(r + ", ");
			ind++;
		}
		System.out.println();

		avg = sum / 10D;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}
}
