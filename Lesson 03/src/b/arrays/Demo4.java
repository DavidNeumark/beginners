package b.arrays;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {

		int length = (int) (Math.random() * 11);
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}

		System.out.println(Arrays.toString(arr));

	}

}
