package day06;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr=new String[21][21];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if((i==(arr.length/2)&&(j==0||j==arr[i].length-1))||(j==(arr[i].length/2)&&(i==0||i==arr.length-1))){
					arr[i][j]="0";
				}else{
				arr[i][j]="*";}
				if(i==arr.length/2&&j==arr.length/2){
					arr[i][j]="0";
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
