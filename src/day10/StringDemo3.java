package day10;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®");
		String s=sc.nextLine();
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
				smallCount++;
			}else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
				bigCount++;
			}else if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
				numberCount++;
			}
		}
		System.out.println("bigCount:"+bigCount);
		System.out.println("smallCount:"+smallCount);
		System.out.println("numberCount:"+numberCount);
	}

}
