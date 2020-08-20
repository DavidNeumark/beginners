package b.io.targilim;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile3 {

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader(new FileReader("files/file.txt"));) {

			System.out.println("=== file is open ===");
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("=== file closed ===");
	}

}
