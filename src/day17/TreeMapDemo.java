package day17;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm=new TreeMap<>();
		tm.put("1", "aaa");
		tm.put("3", "ccc");
		tm.put("2", "bbb");
		//tm.put("1", "wanshe");
		Set<String> set=tm.keySet();
		for(String s:set){
			System.out.println(s+"----"+tm.get(s));
		}
	}

}
