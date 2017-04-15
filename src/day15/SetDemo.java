package day15;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> set=new HashSet<Student>();
		Student s1=new Student("张三",18);
		Student s2=new Student("王五",16);
		Student s3=new Student("张三",16);
		Student s4=new Student("张三",18);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		for(Student s:set){
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}

}
