package day08;

public class FaceIterm {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
interface Inter{
	void show();
}
class Outer{
	public static Inter method(){
		return new Inter(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("helloWorld");
			}
			
		};
		
	}
}