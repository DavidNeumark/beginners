package d.defaultIO;

import java.io.IOException;
import java.io.InputStreamReader;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("default io");

		System.out.write(65);
		System.out.write('\n');
		System.out.write('A');
		System.out.write('\n');
		System.out.write('à');
		System.out.write('\n');

		System.out.flush();

		// try {
		// int c = System.in.read();
		// System.out.println((char) c);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

		System.out.println();

		InputStreamReader in = new InputStreamReader(System.in);
		try {
			int c;
			c = in.read();
			System.out.println((char) c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
