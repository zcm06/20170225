package day13;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
		String format="yyyy/MM/dd  HH:mm:ss";
		String s=df.format(d.getTime());
		Date d2=df.parse(s);
		System.out.println(d2);
		System.out.println(s);
		System.out.println(DateUtil.dateToString(d2, format));
		System.out.println(DateUtil.stringToDate(s, format));
	}

}
