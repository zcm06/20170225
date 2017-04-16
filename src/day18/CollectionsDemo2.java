package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		Student s1=new Student("张三",18);
		Student s2=new Student("李四",17);
		Student s3=new Student("王五",26);
		Student s4=new Student("长江",17);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list);
		for(Student s:list){
			System.out.println(s.getName()+"---"+s.getAge());
		}
	}

}
