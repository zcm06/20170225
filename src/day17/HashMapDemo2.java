package day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Person,String> hm=new HashMap<>();
		Person p1=new Person("张三",15);
		Person p2=new Person("李四",18);
		Person p3=new Person("王五",65);
		Person p4=new Person("张三",15);
		hm.put(p1, "1");
		hm.put(p2, "2");
		hm.put(p3, "3");
		hm.put(p4, "4");
		Set<Map.Entry<Person, String>> set=hm.entrySet();
		for(Map.Entry<Person, String> s:set){
			System.out.println(s.getKey().getName()+"----"+s.getKey().getAge()+"-----"+s.getValue());
		}
	}

}
