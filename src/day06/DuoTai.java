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
	String name="动物";
	public void speak(){
		System.out.println("我是动物");
	}
}
class Cat extends Animal{
	static int age=2;
	String name="猫";
	public void speak(){
		System.out.println("我是猫");
	}
}
class Tools{
	public static void useTool(Animal a){
		a.speak();
	}
}