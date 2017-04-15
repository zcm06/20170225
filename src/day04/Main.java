package day04;

public class Main {

	public static void main(String[] args) {
		int[] arr=new int[10];
		//Random r=new Random();
		for(int i=0;i<arr.length;i++){
			arr[i]=(int) (Math.random()*1000+1);
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		maxMin(arr);

	}
	public static void maxMin(int[] arr){
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("max="+max+","+"min="+min);
	}
}


