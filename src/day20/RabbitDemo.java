package day20;

public class RabbitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[arr.length-1]);
		System.out.println(func(20));
	}
	public static int func(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return func(n-1)+func(n-2);
		}
		
	}
	
}
