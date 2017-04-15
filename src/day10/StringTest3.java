package day10;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="javaSEjavaadsdjasldjavadamskdlajava";
		String substr="java";
		int count=0;
		Function3 f=new Function3();
		count=f.getCount(str, substr);
		System.out.println("\""+str+"\"жага"+count+"Иі"+substr);
	}

}
