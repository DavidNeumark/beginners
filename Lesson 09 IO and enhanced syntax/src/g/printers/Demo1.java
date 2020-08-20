package g.printers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import f.objects.Person;

public class Demo1 {

	public static void main(String[] args) {

		System.out.println();

		File file = new File("files/prints.txt");
		try (PrintWriter out = new PrintWriter(file);) {

			int x = 5;
			boolean b = true;
			Person p = new Person(111, "aaa", 22, 111L);

			// using the write method
			out.write(String.valueOf(x));
			out.write("\n");
			out.write(String.valueOf(b));
			out.write("\n");
			out.write(p.toString());
			out.write("\n");

			// using the print method
			out.println(x);
			out.println(b);
			out.println(p);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
