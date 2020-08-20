package b.arrays.dimentions;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[][] matrix = new int[3][5];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 11);
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println(Arrays.deepToString(matrix));
	}
}
