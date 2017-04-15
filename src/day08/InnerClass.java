package day08;

public class InnerClass {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++){
			
			arr[i]=i+1;
			sum+=(i+1);
			if(i==arr.length-1){
				arr[i]=100-sum;
			}
			System.out.println(arr[i]);
		}
		//System.out.println(sum);
	}
}