package day16;

import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		Random r=new Random();
		while(hs.size()<10){
			int num=r.nextInt(20)+1;
//			System.out.println('p');
			hs.add(num);
			
		}
		for(int i:hs){
			System.out.println(i);
		}
	}

}
