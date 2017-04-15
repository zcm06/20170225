package day15;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts=new TreeSet<Student>();
		Student s1=new Student("zhangsanfeng",16);
		Student s2=new Student("lisi",15);
		Student s3=new Student("wangwu",16);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		for(Student s:ts){
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
