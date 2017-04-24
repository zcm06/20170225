package day19;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getA());
	}
	public static int getA(){
		int a=10;
		int b=0;
		try{
			System.out.println(a/b);
		}catch(Exception e){
			a=20;
			return a;
		}
		finally{
			a=30;
			//System.out.println("----");
		}
		
		return a;
	}
}
