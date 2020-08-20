package b.io.targilim;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) {
		try {
			FileWriter out = new FileWriter("files/out.txt", true);
			out.write(65);
			out.write("Hello 2\n");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
