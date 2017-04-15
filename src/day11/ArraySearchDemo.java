package day11;

import java.util.Arrays;

public class ArraySearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={465,1,6,7498,416,13,4545};
		int res=7498;
		int count=0;
		if(arr.length%2==0){
			count=arr.length/2;
		}else{
			count=arr.length/2+1;
		}
		
		//System.out.println(count);
		Arrays.sort(arr);
		while(true){
			if(res==arr[count]){
				System.out.println(res+"µÄË÷ÒıÊÇ"+count);
				break;
			}else if(res<arr[count]){
				count=count/2;
			}else if(res>arr[count]){
				count+=count/2;
			}
		}
		
	}

}
