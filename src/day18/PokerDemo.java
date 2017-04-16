package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
	public static void LookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
		StringBuilder sb=new StringBuilder();
		for(int i:ts){
			String poker=hm.get(i);
			sb.append(poker).append(" ");
		}
		System.out.println(name+"的牌是："+sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> array = new ArrayList<>();
		String[] colors = { "♠", "♥", "♣", "♦" };
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
		int index = 0;
		for (String number : numbers) {
			for (String color : colors) {
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		array.add(index);
		hm.put(index + 1, "大王");
		array.add(index + 1);
		Collections.shuffle(array);
		//System.out.println(array);
		TreeSet<Integer> zs = new TreeSet<>();
		TreeSet<Integer> ls = new TreeSet<>();
		TreeSet<Integer> ww = new TreeSet<>();
		TreeSet<Integer> dp = new TreeSet<>();
		for (int i = 0; i < array.size(); i++) {
			if (i >= 51) {
				dp.add(array.get(i));
			} else if (i % 3 == 0) {
				zs.add(array.get(i));
			} else if (i % 3 == 1) {
				ls.add(array.get(i));
			} else if (i % 3 == 2) {
				ww.add(array.get(i));
			}
		}
		LookPoker("张三",zs,hm);
		LookPoker("李四",ls,hm);
		LookPoker("王五",ww,hm);
		LookPoker("底牌",dp,hm);
	}

}
