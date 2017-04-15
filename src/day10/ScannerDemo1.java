package day10;

import java.util.Scanner;

public class ScannerDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println(x);
		} else {
			System.out.println("error");
		}

		sc.close();
	}
}
