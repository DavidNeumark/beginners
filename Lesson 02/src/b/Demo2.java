package b;

public class Demo2 {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(x);
		
		System.out.println(x = 10);
		System.out.println(x);
		
		x = 0;
		
		System.out.println(++x);
		
		{
			x = 0;
			int y = x++;
			System.out.println(y);
		}
		{
			x = 0;
			int y = ++x;
			System.out.println(y);
		}
	}
}
