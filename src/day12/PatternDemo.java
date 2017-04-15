package day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("\\b\\w{3}\\b");
		String s="wo ai zhong guo,wo shi zhang can ming";
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}
	}	

}
