package day01;

public class Reverse2 {
	public static void main(String[] args) {
		int[] arr={6,5,1,74,7};
		revers(arr);
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
			System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	public static void revers(int[] arr){
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr1[arr.length-i-1]=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			arr[i]=arr1[i];
		}
		//return arr1;
	}
}
