package day11;

import java.util.Scanner;

public class SBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer sb=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//sb.append(str).reverse().toString().equals(str); StringBuffer实现验证
		System.out.println(isSame(str));	
	}
	public static boolean isSame(String str){
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return false;
			}
		}
		return true;
	}

}
