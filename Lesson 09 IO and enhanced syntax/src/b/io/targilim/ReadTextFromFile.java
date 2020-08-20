package b.io.targilim;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFromFile {

	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("files/file.txt");
			int c = in.read();
			System.out.println(c + " - " + (char) c);
			// in.close(); // this line may not be reached
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
