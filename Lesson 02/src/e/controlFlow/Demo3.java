package e.controlFlow;

public class Demo3 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 11);
		System.out.println("grade = " + grade);

		if (grade < 6) {
			System.out.println("Fail");
		}else if(grade <=8){
			System.out.println("OK");
		}else{
			System.out.println("Great");
		}
	}
}
