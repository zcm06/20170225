package day15;

public class ArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int result = sum(a, b);
		System.out.println(result);
	}

	public static int sum(int... a) {//此时a为数组
		int result=0;
		for(int i:a){
			result+=i;
		}
		return result;
	}

}
