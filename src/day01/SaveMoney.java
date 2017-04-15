package day01;

public class SaveMoney {
	public static void main(String[] args) {
		double money=0;
		int day=0;
		while(money<=100){
			day++;
			money+=2.5;
			if(day%5==0){
				money-=6;
			}
			
		}
		System.out.println(day);
	}
}
