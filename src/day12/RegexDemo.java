package day12;

import java.util.Scanner;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("���������qq��");
		do {
			if (!flag) {
				
				String str = sc.nextLine();
				flag = check(str);
			}else{
				System.out.println("qq��ȷ");
				break;
			}
		} while (true);
	}

	public static boolean check(String str) {
		char[] ch = str.toCharArray();
		if ( ch.length < 5 || ch.length > 15) {
			System.out.println("�����������������");
			return false;
		}
		if(ch[0]=='0'){
			System.out.println("�����������������");
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
