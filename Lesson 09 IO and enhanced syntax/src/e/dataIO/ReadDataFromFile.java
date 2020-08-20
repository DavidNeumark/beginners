package e.dataIO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {

		File file = new File("files/data");

		try (DataInputStream in = new DataInputStream(new FileInputStream(file))) {

			String product = in.readUTF();
			double price = in.readDouble();
			int quantity = in.readInt();
			boolean available = in.readBoolean();

			System.out.println(product);
			System.out.println(price);
			System.out.println(quantity);
			System.out.println(available);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
