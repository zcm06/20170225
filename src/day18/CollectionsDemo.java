package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(30);
		list.add(33);
		list.add(12);
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, 30));
		System.out.println(Collections.max(list));
	}

}
