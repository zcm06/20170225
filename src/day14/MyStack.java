package day14;

import java.util.LinkedList;

public class MyStack {
	LinkedList list;
	public MyStack(){
		list=new LinkedList();
	}
	public void add(Object obj){
		list.addFirst(obj);
	}
	public Object get(){
		return list.removeFirst();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
}
