package day19;

public class ExceptionDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try{
			int num=a/b;
			System.out.println(num);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

}
