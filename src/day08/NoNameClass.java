package day08;

public class NoNameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterTwo ot=new OuterTwo();
		ot.method();
	}

}
interface Inner{
	public void show();
}
class OuterTwo{ 
	public void method(){
		Inner i=new Inner(){
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("this is a no name class method");
			}
			
		};
		i.show();
	}
}