package f.objects;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonFromFile {

	public static void main(String[] args) {
		Person p = null;

		File file = new File("files/person.obj");

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));) {

			Object o = in.readObject();
			if (o instanceof Person) {
				p = (Person) o;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(p);
	}

}
