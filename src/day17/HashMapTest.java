package day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,HashMap<String,Integer>> hm=new HashMap<>();
		HashMap<String,Integer> hm2=new HashMap<>();
		hm2.put("张三", 18);
		hm2.put("李四", 16);
		hm.put("1", hm2);
		HashMap<String,Integer> hm3=new HashMap<>();
		hm3.put("王五", 21);
		hm3.put("赵六", 22);
		hm.put("2", hm3);
		Set<String> set=hm.keySet();
		for(String s:set){
			HashMap<String,Integer> hm4=hm.get(s);
			Set<String> set2=hm4.keySet();
			for(String key:set2){
				System.out.println(s+":"+key+"---"+hm4.get(key));
			}
		}
	}

}
