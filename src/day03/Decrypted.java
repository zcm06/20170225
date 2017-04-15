package day03;

import java.util.Scanner;

public class Decrypted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要解密的数字(不超过8位)：");
		int num=sc.nextInt();
		sc.close();
		//int n=Integer.bitCount(num);
		int n=String.valueOf(num).length();
		int[] arr=new int[n];
		for(int i=arr.length-1;i>=0;i--){
			arr[i]=num/pow(10,i)%10;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=5){
				arr[i]-=5;
			}else{
				arr[i]+=5;
			}
		}
		int temp;
		temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	public static int pow(int x,int y){
		int result=1;
		for(int i=0;i<y;i++){
			result*=x;
		}
		return result;
	}
	public static void reverse(int[] arr) {
		for (int start = 0, end = arr.length - 1; start <= end; end--, start++) {
			int tmp;
			tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
		}
		
	}
}
