package day01;

import java.util.Scanner;

public class FindFirstIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 9, 74, 6, 3, 4 };
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ�����");
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("������������е������ǣ�" + i);
				break;
			}
		}
	}
}
