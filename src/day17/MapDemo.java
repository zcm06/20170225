package day17;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1, "java");
		map.put(2, "hello");
		map.put(3, "world");
		Set<Integer> set=map.keySet();
		for(int i:set){
			System.out.println(i+"---"+map.get(i));
		}
		System.out.println("----------------");
		Set<Map.Entry<Integer, String>> s=map.entrySet();
		for(Map.Entry<Integer, String> m:s){
			System.out.println(m.getKey()+"---"+m.getValue());
		}
	}

}
