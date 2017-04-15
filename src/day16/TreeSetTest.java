package day16;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts=new TreeSet<Student>();
		Student s1=new Student("zhangsan",65,98,77);
		Student s2=new Student("lisi",78,100,36);
		Student s3=new Student("wudalang",55,78,31);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		for(Student s:ts){
			int num=s.getMath()+s.getChinese()+s.getEnglish();
			System.out.println(s.getName()+"---"+num);
		}
	}

}
