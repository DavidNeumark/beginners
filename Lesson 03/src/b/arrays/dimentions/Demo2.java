package b.arrays.dimentions;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		int x, y;
		x = (int) (Math.random() * 11);
		int[][] matrix = new int[x][];

		for (int i = 0; i < matrix.length; i++) {
			y = (int) (Math.random() * 11);
			matrix[i] = new int[y];
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 11);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}

		System.out.println("===========");

		System.out.println(Arrays.deepToString(matrix));
	}
}
