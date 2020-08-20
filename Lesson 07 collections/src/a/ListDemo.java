package a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add(0, "AAA");

		System.out.println(list);

		list.set(0, "BBB");
		System.out.println(list);

		System.out.println(list.contains("bbb"));

		System.out.println(list.size());

		System.out.println(list.get(1));

		System.out.println("==========");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("==========");
		list = new LinkedList<>();
		System.out.println(list);
	}

}
