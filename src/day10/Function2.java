package day10;

public class Function2 {
	public String reverse(String str){
		String str2="";
		char[] ch=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			str2+=ch[i];
		}
		return str2;
	}
}
