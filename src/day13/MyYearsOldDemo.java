package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyYearsOldDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String s="1996-06-14";
		Date d=sd.parse(s);
		long time=d.getTime();
		long nowTime=System.currentTimeMillis();
		long day=(nowTime-time)/1000/60/60/24;
		System.out.println(day+"Ìì");
	}

}
