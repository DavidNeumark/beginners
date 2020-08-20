package b.arrays.copy;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] src = { 2, 4, 6 };
		System.out.println(Arrays.toString(src));
		int[] dst = new int[src.length + 2];
		System.arraycopy(src, 0, dst, 0, src.length);
		src = dst;
		src[3] = 100;
		src[4] = 200;
		System.out.println(Arrays.toString(src));
	}
}
