package day12;

import java.util.Scanner;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("请输入你的qq号");
		do {
			if (!flag) {
				
				String str = sc.nextLine();
				flag = check(str);
			}else{
				System.out.println("qq正确");
				break;
			}
		} while (true);
	}

	public static boolean check(String str) {
		char[] ch = str.toCharArray();
		if ( ch.length < 5 || ch.length > 15) {
			System.out.println("输入错误，请重新输入");
			return false;
		}
		if(ch[0]=='0'){
			System.out.println("输入错误，请重新输入");
			return false;
		}
		for (int i = 0; i < ch.length; i++) {

			if (!Character.isDigit(ch[i])) {
				return false;
			}
		}

		return true;
	}

}
