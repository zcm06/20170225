package day02;

import java.util.Scanner;

public class YHtriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		int n=sc.nextInt();
		sc.close();
		int[][] arr=new int[n][n];
		for(int i=0;i<arr.length;i++){
			arr[i][0]=1;
			arr[i][i]=1;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<=i-1;j++){
				arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				//System.out.print(arr[i][j]+" ");
				
			}
			//System.out.println();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
