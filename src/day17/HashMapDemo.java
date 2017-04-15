package day17;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("z","w");
		hm.put("c", "d");
		hm.put("z", "q");
		Set<String> set=hm.keySet();
		for(String s:set){
			System.out.println(s+"----"+hm.get(s));
		}
	}

}
