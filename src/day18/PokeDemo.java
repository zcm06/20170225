package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PokeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colors=new String[4];
		String[] numbers=new String[13];
		//String[] monster=new String[2];
		ArrayList<String> array=new ArrayList<>();
		colors[0]="♠";
		colors[1]="♥";
		colors[2]="♣";
		colors[3]="♦";
		numbers[0]="A";
		for(int i=1;i<10;i++){
			numbers[i]=i+1+"";
		}
		numbers[10]="J";
		numbers[11]="Q";
		numbers[12]="K";
		//monster[0]="大王";
		//monster[1]="小王";
		for(String color:colors){
			for(String number:numbers){
				array.add(color.concat(number));
			}
		}
		array.add("大王");
		array.add("小王");
		Collections.shuffle(array);
		ArrayList<String> p1=new ArrayList<>();
		ArrayList<String> p2=new ArrayList<>();
		ArrayList<String> p3=new ArrayList<>();
		ArrayList<String> finalPoke=new ArrayList<>();
		/*ArrayList<ArrayList<String>> landlord=new ArrayList<>();
		Random random=new Random();
		int num=random.nextInt(3)+1;*/
		
		for(int i=0;i<array.size();i++){
			if(i>=51){
				finalPoke.add(array.get(i));
			}
			if(i%3==0){
				p1.add(array.get(i));
			}else if(i%3==1){
				p2.add(array.get(i));
			}else if(i%3==2){
				p3.add(array.get(i));
			}
			
		}
		/*landlord.add(p1);
		landlord.add(p2);
		landlord.add(p3);
		landlord.get(num-1).addAll(finalPoke);*/
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(finalPoke);
		//System.out.println(p1.size()+"--"+p2.size()+"--"+p3.size());
		//System.out.println(array);
	}

}
