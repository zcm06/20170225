package day15;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Student>> bigArrayList=new ArrayList<ArrayList<Student>>();
		ArrayList<Student> firstArrayList=new ArrayList<Student>();
		Student s1=new Student("张三",16);
		Student s2=new Student("李四",18);
		Student s3=new Student("王五",18);
		Student s4=new Student("赵六",18);
		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);
		firstArrayList.add(s4);
		bigArrayList.add(firstArrayList);
		for(ArrayList<Student> array:bigArrayList){
			for(Student s:array){
				System.out.println(s.getName()+"----"+s.getAge());
			}
		}
		
	}

}
