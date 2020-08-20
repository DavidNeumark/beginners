package a;

public class Person {

	private int id;
	private String name;
	private int age;
	
	public void setName(String x) {
		name = x;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int x) {
		if(x >= 0 && x <= 120) {
			age = x;
		}else{
			System.out.println("Error - illegal age");
		}
	}
	
	public int getAge() {
		return age;
	}
}
