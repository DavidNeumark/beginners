package h.enhancedSyntax.forEach;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("aaa");
		set.add("bbb");
		set.add("del");
		set.add("ccc");

		System.out.println(set);

		for (String str : set) {
			System.out.println(str);
		}

	}
}
