package day13;

import java.util.Calendar;

public class CalendarDemo {
	//public final static int MAX=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar ca=Calendar.getInstance();//��̬,�������
		int year = ca.get(Calendar.YEAR);
		System.out.println(year);
		ca.add(Calendar.YEAR, -5);
		year = ca.get(Calendar.YEAR);
		System.out.println(year);
	}

}
