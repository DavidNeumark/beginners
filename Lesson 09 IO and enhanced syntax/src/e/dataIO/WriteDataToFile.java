package e.dataIO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataToFile {

	public static void main(String[] args) {

		String product = "shirt";
		double price = 50.50;
		int quantity = 3;
		boolean available = true;

		// save the above data to file
		File directory = new File("files");
		File file = new File(directory, "data");

		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file));) {

			out.writeUTF(product);
			out.writeDouble(price);
			out.writeInt(quantity);
			out.writeBoolean(available);

			System.out.println("data written to " + file);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
