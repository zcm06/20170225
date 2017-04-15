package day14;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		list.add("hello");
		list.add("java");
		if(list.contains("java")){
			list.add("javaee");
		}
		System.out.println(list);
	}

}
