package b.iterators;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {

		Collection<Integer> c = new HashSet<>();
		c.add(2);
		c.add(4);
		c.add(3);
		c.add(6);
		c.add(1);
		System.out.println(c);
		Iterator<Integer> it = c.iterator();

		while (it.hasNext()) { // בדיקה אם קיים אלמנט נוסף
			Integer curr = it.next(); // קבלת האלמנט הנוכחי
			System.out.println(curr);
			if (curr % 2 != 0) {
				it.remove(); // הסרת אלמנט הנוכחי
			}
		}
		System.out.println(c);

	}

}
