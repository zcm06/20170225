/**
 *����һ�����ܳ���
 *@author �Ų���
 *@version v1.0
 */
package day03;

import java.util.Scanner;

public class Encrypt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ���ܵ�����(������8λ)��");
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
	 * ���Ǽ���һ������n�η��ķ���
	 * ��������Ϊ���Σ�����ֵΪ����
	 * @param x Ҫ�������
	 * @param y ��
	 * @return int ���ؽ��
	 */
	public static int pow(int x,int y){
		int result=1;
		for(int i=0;i<y;i++){
			result*=x;
		}
		return result;
	}
}
