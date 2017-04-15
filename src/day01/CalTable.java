package day01;

public class CalTable {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			for(int j=1;j<i+1;j++){
				int sum;
				sum=i*j;
				System.out.print(j+"x"+i+"="+sum+"\t");
			}
			System.out.println();
		}
	}
}
