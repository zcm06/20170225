package day15;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array=new ArrayList<Integer>();
		Random r=new Random();
		int random=0;
		int count=0;
		while(count<10){
			//array.add(random);
			random=r.nextInt(20)+1;
			if(!array.contains(random)){
				array.add(random);
				count++;
			}
		}
		for(int i:array){
			System.out.println(i);
		}
	}

}
