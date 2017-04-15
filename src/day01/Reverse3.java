package day01;

public class Reverse3 {

	public static void main(String[] args) {
		int[] arr = { 5, 678, 4, 9, 7, 8 };
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}

	public static void reverse(int[] arr) {
		for (int start = 0, end = arr.length - 1; start <= end; end--, start++) {
			int tmp;
			tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
		}
	}

}
