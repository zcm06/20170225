package day04;

public class Panduan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int arr1[]={46,5,6,984,4,65,984,684,654,312,4,684,98496,4161,1,168,65165,1654,4,65465,46,464,651,64,646,46,46,464,64,64,65};
		int arr2[]={46,464,651,64};
		int count=0;
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr1.length;j++){
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
