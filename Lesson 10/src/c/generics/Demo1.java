package c.generics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		Set<String[]> set = new HashSet<>();

		set.add(new String[] { "aaa", "bbb", "ccc" });
		set.add(new String[] { "aaa", "bbb", "ccc" });
		set.add(new String[] { "aaa", "bbb", "ccc" });

		for (String[] strings : set) {
			System.out.println(Arrays.toString(strings));
		}
	}
}
