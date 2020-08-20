package f.collections;

import java.util.HashSet;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		System.out.println(set);
		System.out.println(set.size());
		int itr = 0;

		while (set.size() < 10) {
			int r = (int) (Math.random() * 11);
			set.add(r);
			itr++;
		}

		System.out.println(set);
		System.out.println(set.size());
		System.out.println("iterations: " + itr);
	}
}
