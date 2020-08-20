package d.defaultIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLinesFromConsole {

	public static void main(String[] args) {

		System.out.println("Welcome to echo programe.");
		System.out.println("Enter lines. Enter 'quit' to stop.");

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

			String line = in.readLine();

			while (!line.equals("quit")) {
				System.out.println(line);
				line = in.readLine();
			}

			System.out.println("bye");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
