package a;

public class PrimitiveDataTypes {
	/**
	 * PRIMITIVE DATA TYPES
	 */
	public static void main(String[] args) {
		
		// NUMERAL INTEGERS
		byte n1 = 127; // max = 127
		n1++; // beware of overflow
		short n2 = 100;
		int n3 = 1_000;
		long n4;
		n4 = 2_147_483_648L;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
		// NUMERAL DECIMALS
		float d1 = 3.8F;
		double d2 = 3.5;
		double d3 = 3D;
		double d4 = 3;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);

		// LOGICAL
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 < 20;
		boolean b4 = 10 > 20;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		// CHARACTER
		char c1 = 'A';
		char c2 = 'à';
		char c3 = 188;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
	}

}
