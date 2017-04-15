package day11;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = { 1, 26, 65, 7, 96, 31, 74 };
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

				}
			}

		}
		for (int i : arr) {
			System.out.println(i);
		}

	}
}
