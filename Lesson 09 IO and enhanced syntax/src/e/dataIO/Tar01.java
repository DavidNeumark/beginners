package e.dataIO;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Tar01 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 101);
			arr[i] = r;
		}
		System.out.println(Arrays.toString(arr));

		File file = new File("files/arr.data");

		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
			for (int i = 0; i < arr.length; i++) {
				out.writeInt(arr[i]);
			}
			System.out.println("data written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
