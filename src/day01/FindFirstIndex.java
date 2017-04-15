package day01;

import java.util.Scanner;

public class FindFirstIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 9, 74, 6, 3, 4 };
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的数字");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("这个数在数组中的索引是：" + i);
				break;
			}
		}
	}
}
