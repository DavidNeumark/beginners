package a.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Tar2B2 {

	public static void main(String[] args) {

		File file1 = new File("files/txt1");
		File file2 = new File("files/txt2");

		try (BufferedReader in = new BufferedReader(new FileReader(file1));
				PrintWriter out = new PrintWriter(new FileWriter(file2, true));) {

			String line = in.readLine();

			while (line != null) {
				out.println(line);
				line = in.readLine();
			}

			System.out.println(file1 + " copied to " + file2);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
