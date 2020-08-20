package a.homework;

import java.util.Arrays;

public class Ex07Tar03 {

	public static void main(String[] args) {

		// int[] arrDup = { 2, 10, 6, 4, 4, 8, 7, 2, 4, 4 };

		// create the original array (with duplications)
		int[] arrDup = new int[10];

		for (int i = 0; i < arrDup.length; i++) {
			arrDup[i] = (int) (Math.random() * 11);
		}

		// print
		System.out.println(Arrays.toString(arrDup));

		// create a temporary array to host unique values
		int[] arrTemp = new int[10];
		int c = 0;

		for (int i = 0; i < arrDup.length; i++) {
			int j;
			for (j = 0; j < c; j++) {
				if (arrDup[i] == arrTemp[j]) {
					break;
				}
			}

			// is the current datum (at index i) is unique
			if (j == c) {
				arrTemp[c] = arrDup[i];
				c++;
			}

		}

		int[] arrUnique = new int[c];
		System.arraycopy(arrTemp, 0, arrUnique, 0, c);

		System.out.println(Arrays.toString(arrTemp));
		System.out.println(Arrays.toString(arrUnique));
	}

}
