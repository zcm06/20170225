package day11;

import java.util.Arrays;

public class HalfSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 45, 6, 41, 7, 74, 13, 74 };
		int num =100;
		int min = 0;
		int max = arr.length-1;
		int mid = (max + min) / 2;
		Arrays.sort(arr);
		while (true) {
			if(max<min){
				System.out.println("no data find");
				break;
			}
			if (num > arr[mid]) {
				min = mid + 1;
				mid = (min + max) / 2;
			} else if (num < arr[mid]) {
				max = mid - 1;
				mid = (min + max) / 2;
			} else if (num == arr[mid]) {
				System.out.println(mid);
				break;
			}
			
		}
		Arrays.binarySearch(arr, 41);
	}

}
