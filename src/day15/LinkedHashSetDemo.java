package day15;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("hello");
		lhs.add("world");
		lhs.add("java");
		lhs.add("hello");
		for(String s:lhs){
			System.out.println(s);
		}
	}

}
