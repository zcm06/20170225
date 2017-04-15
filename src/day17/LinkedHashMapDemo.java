package day17;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,String> lhm=new LinkedHashMap<>();
		lhm.put("1", "aaa");
		lhm.put("3", "ccc");
		lhm.put("2", "bbb");
		lhm.put("3", "asdsa");
		lhm.put("1", "zhang");
		Set<String> set=lhm.keySet();
		for(String s:set){
			System.out.println(s+"----"+lhm.get(s));
		}
	}

}
