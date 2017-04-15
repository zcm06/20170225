package day12;

import java.util.Scanner;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄãµÄqqºÅ");
		String str=sc.nextLine();
		System.out.println(check(str));
		
	}
	public static boolean check(String str){
		return str.matches("[1-9][0-9]{1,14}");
	}
}
