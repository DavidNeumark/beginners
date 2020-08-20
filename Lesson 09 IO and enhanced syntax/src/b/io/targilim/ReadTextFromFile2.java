package b.io.targilim;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile2 {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("files/file.txt");) {

			System.out.println("=== file is open ===");
			int c = in.read();
			while (c != -1) {
				System.out.print((char) c);
				c = in.read();
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=== file closed ===");
	}

}
