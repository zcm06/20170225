package day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayList_Included_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String,String>> array=new ArrayList<>();
		HashMap<String,String> hm=new HashMap<>();
		hm.put("1", "张三");
		hm.put("2", "李四");
		array.add(hm);
		for(HashMap<String, String> map:array){
			Set<String> set=map.keySet();
			for(String s:set){
				System.out.println(s+"---"+map.get(s));
			}
		}
	}

}
