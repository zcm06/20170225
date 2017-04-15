package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c=new ArrayList<Integer>();
		c.add(123);
		c.add(4645);
		c.add(4564);
		Iterator i=c.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
