package day17;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "^^^fajksdhaksjdhkashdkjasd";
		TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
		char[] ch = s.toCharArray();
		
		for (char key : ch) {
				if (key > 'z' || key < 'a') {
					key='*';
					if (hm.containsKey(String.valueOf(key))) {
						int j = hm.get(String.valueOf(key));
						j++;
						hm.put(String.valueOf(key), j);
					} else {
						hm.put(String.valueOf(key), 1);
					}
					continue;
				}
		
			if (hm.containsKey(String.valueOf(key))) {
				int i = hm.get(String.valueOf(key));
				i++;
				hm.put(String.valueOf(key), i);
			} else {
				hm.put(String.valueOf(key), 1);
			}
		}
		Set<String> set = hm.keySet();
		for (String str : set) {
			System.out.print(str + "(" + hm.get(str) + ")");
		}
	}

}
