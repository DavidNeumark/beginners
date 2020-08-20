package a.homework;

import java.util.Arrays;

public class Ex07Tar4 {

	public static void main(String[] args) {

		// random array length 5 - 15
		int a = 5;
		int b = 15;
		int length = (int) (Math.random() * (b - a + 1)) + a;

		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}

		// print
		System.out.println(Arrays.toString(arr));

		// reverse the array
		int[] rev = new int[length];

		for (int i = 0, j = length - 1; i < arr.length; i++, j--) {
			rev[j] = arr[i];
		}

		System.out.println(Arrays.toString(rev));
	}

}
