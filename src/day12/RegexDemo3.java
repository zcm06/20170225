package day12;

import java.util.Arrays;

public class RegexDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="91 27 46 38 50";
		String regex=" +";
		String[] str=s.split(regex);
		Arrays.sort(str);
		/*int[] integer=new int[str.length];
		for(int i=0;i<str.length;i++){
			integer[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(integer);*/
		StringBuilder sb=new StringBuilder();
		for(String i:str){
			sb.append(i+" ");
		}
		System.out.println(sb.toString().trim());
	}

}
