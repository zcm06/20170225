package day13;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		Calendar ca=Calendar.getInstance();
		ca.set(year,2,1);
		ca.add(Calendar.DATE, -1);
		System.out.println(ca.get(Calendar.DATE));
		
	}

}
