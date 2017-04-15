package day04;

import java.util.Arrays;

public class Panduan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int miniIndex=0;
		int maxIndex=0;
		int count=0;
		int arr1[]={46,5,6,984,4,65,984,684,654,312,4,684,98496,4161,1,168,65165,1654,4,65465,46,464,651,64,646,46,46,464,64,64,65};
		int arr2[]={46,464,651,64};
		Arrays.sort(arr1);
		
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++){
			if(arr2[0]>=arr1[i]){
				miniIndex=i;
				
				
			}
		}
		
		for(int i=arr1.length-1;i>=miniIndex;i--){
			if(arr2[arr2.length-1]<=arr1[i]){
				maxIndex=i;
			}
		}
		for(int i=0;i<arr2.length;i++){
			for(int j=miniIndex;j<=maxIndex;j++){
				if(arr2[i]==arr1[j]){
					count++;
				}
			}
		}
		
		if(count>=arr2.length){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("程序运行时间："+(endTime-startTime)+"ms");
	}

}
