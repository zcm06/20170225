package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<String>> hm=new HashMap<>();
		ArrayList<String> list=new ArrayList<>();
		list.add("张三");
		list.add("李四");
		hm.put("1", list);
		Set<String> set=hm.keySet();
		for(String key:set){
			ArrayList<String> value=hm.get(key);
			for(String str:value){
				System.out.println(key+"---"+str);
			}
			
		}
	}

}
