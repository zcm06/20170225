package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int num=-1;
		while(true){
			num=sc.nextInt();
			if(num==0){
				break;
			}else{
				array.add(num);
			}
		}
		Integer[] arr=new Integer[array.size()];
		array.toArray(arr);
		Arrays.sort(arr);
		System.out.println(arr[array.size()-1]);
	}

}
