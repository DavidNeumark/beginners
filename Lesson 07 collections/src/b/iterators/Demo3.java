package b.iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(111, "David");
		map.put(222, "Sarah");
		map.put(333, "Dan");

		Iterator<Integer> it = map.keySet().iterator();

		while (it.hasNext()) {
			int key = it.next();
			System.out.println(key + ": " + map.get(key));
		}

	}

}
