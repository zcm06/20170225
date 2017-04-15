package day14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		list.add("world");
		list.add("java");
		list.add("world");
		list.add("java");
		list.add("world");
		List list2=new LinkedList();
		Iterator it=list.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			if(!list2.contains(s)){
				list2.add(s);
			}
		}
		Iterator it2=list2.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}

}
