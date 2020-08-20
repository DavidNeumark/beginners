package a.homework;

public class Tar3 {

	public static void main(String[] args) {
		int length = 0;
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		lbl: for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 11);
			for (int j = 0; j < i; j++) {
				if (arr1[j] == arr1[i]) {
					continue lbl;
				}
			}

			length++;
		}
	}
}
