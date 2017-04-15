package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import day15.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		Student s1=new Student("张三",16);
		Student s2=new Student("李四",18);
		c.add(s1);
		c.add(s2);
		Iterator it=c.iterator();
		while(it.hasNext()){
			Student s=(Student)it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
