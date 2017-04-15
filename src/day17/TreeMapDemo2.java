package day17;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Person,String> tm=new TreeMap<>(new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				return p1.getAge()-p2.getAge();
			}
		});
		Person p1=new Person("张三",15);
		Person p2=new Person("李四",18);
		Person p3=new Person("王五",65);
		Person p4=new Person("张三",15);
		tm.put(p1, "1");
		tm.put(p2, "2");
		tm.put(p3, "3");
		tm.put(p4, "4");
		Set<Person> set=tm.keySet();
		for(Person s:set){
			System.out.println(s.getName()+"----"+s.getAge()+"----"+tm.get(s));
		}
	}

}
