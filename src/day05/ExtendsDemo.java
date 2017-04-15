package day05;

public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("--------");
		Man m1=new Man("hah");
	}

}
class Person{
	//String name;

	Person(String name){
		System.out.println("person1"+name);
	}
}
class Man extends Person{
	//String name;
	
	Man(String name){
		super(name);
		System.out.println("man1");
	}
}