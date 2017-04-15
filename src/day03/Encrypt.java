/**
 *这是一个加密程序
 *@author 张灿明
 *@version v1.0
 */
package day03;

import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要加密的数字(不超过8位)：");
		int num=sc.nextInt();
		sc.close();
		//int n=Integer.bitCount(num);
		int n=String.valueOf(num).length();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=num/pow(10,i)%10;
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i]=(arr[i]+5)%10;
		}
		
		int temp;
		temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	/**
	 * 这是计算一个数的n次方的方法
	 * 数据类型为整形，返回值为整形
	 * @param x 要计算的数
	 * @param y 幂
	 * @return int 返回结果
	 */
	public static int pow(int x,int y){
		int result=1;
		for(int i=0;i<y;i++){
			result*=x;
		}
		return result;
	}
}
