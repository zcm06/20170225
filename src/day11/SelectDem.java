package day11;

import java.util.Arrays;

public class SelectDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 91, 6, 49, 4, 446, 45 };
		int temp;
		Arrays.sort(arr);
	/*	for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length ; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}*/
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
