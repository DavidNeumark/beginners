package f.objects;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonToFile {

	public static void main(String[] args) {

		Person p = new Person(101, "Ariel", 22, 1111L);
		System.out.println(p);

		File file = new File("files/person.obj");

		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {

			out.writeObject(p);

			System.out.println("the object " + p + " written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
