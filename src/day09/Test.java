package day09;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s=new Student();
		//Cloneable��ǽӿ�
		s.setName("����");
		Object obj=s.clone();
		Student s2=(Student)obj;
		System.out.println(s.getName()+"-----"+s2.getName());
	}

}
