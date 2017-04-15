package day08;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo sd=new StudentDemo();
		sd.show(new Student(){
			public void study(){
				System.out.println("hahahaha");
			}
		});
		//Person p=new Student();
		
	}

}
interface Person{
	public abstract void study();
}
class Student implements Person{
	public void study(){
		System.out.println("good good study,day day up!");
	} 
}
class StudentDemo{
	public void show(Person p){
		p.study();
	}
}