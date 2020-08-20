package a;

import b.Demo1;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String str = "aaa";
		
		Person p1 = new Person();
		System.out.println(p1);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		p1.setName("David");
		p1.setAge(36);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		Demo1.main(null);
		
	}

}
