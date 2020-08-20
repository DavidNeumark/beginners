package c.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {

		// arrays are type safe by nature
		int[] arr1;
		String[] arr2;

		// collections are not type safe unless we use type parameters <Type>
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		int x = list1.get(0);

		// DONT DO THIS
		// not using type parameters is not type safe
		List ls = list1;
		ls.add(new Date());

		System.out.println(list1);

		// this will throw an exception (will fail atr runtime)
		int a = list1.get(1);

	}

}
