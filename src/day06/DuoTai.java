package day06;

public class DuoTai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Cat();
		System.out.println(a.name);
		Tools.useTool(a);
	}

}
class Animal{
	static int age=1;
	String name="����";
	public void speak(){
		System.out.println("���Ƕ���");
	}
}
class Cat extends Animal{
	static int age=2;
	String name="è";
	public void speak(){
		System.out.println("����è");
	}
}
class Tools{
	public static void useTool(Animal a){
		a.speak();
	}
}