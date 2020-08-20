package c.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(100);
		list.add(1);
		list.add(-20);
		list.add(8);

		System.out.println(list);

		// sort
		Collections.sort(list);
		System.out.println(list);
	}

}
