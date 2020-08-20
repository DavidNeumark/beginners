package c.binary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String[] args) {
		try (

				FileInputStream in = new FileInputStream("files/snoopy.jpg");

				FileOutputStream out = new FileOutputStream("files/snoopy2.jpg")) {

			System.out.println("available bytes on this stream: " + in.available() + " bytes");

			long ts1 = System.currentTimeMillis();
			int b = in.read();
			while (b != -1) {
				out.write(b);
				b = in.read();
			}
			long ts2 = System.currentTimeMillis();

			System.out.println("file copied: " + (ts2 - ts1) + " ms");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
