package f.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set<String> days = new HashSet<>();
		days.add("Sun");
		days.add("Mon");
		days.add("Tue");
		days.add("Wed");
		System.out.println(days);
	}
}
