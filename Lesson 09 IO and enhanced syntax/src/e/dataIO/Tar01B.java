package e.dataIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tar01B {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		File file = new File("files/arr.data");
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

			while (true) {
				list.add(in.readInt());
			}

		} catch (EOFException e) {
			System.out.println("end of file");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(list);
	}

}
