package b.iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		while (set.size() < 10) {
			set.add((int) (Math.random() * 101));
		}

		System.out.println(set);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			if (it.next() > 50) {
				it.remove();
			}
		}
		System.out.println(set);
	}
}
