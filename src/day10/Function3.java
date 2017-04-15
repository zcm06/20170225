package day10;

public class Function3 {
	public int getCount(String str,String substr){
		int index=-1;
		int count=0;
		String strtem=str;
		do{
			index=strtem.indexOf(substr);
			if(index!=-1){
				count++;
				strtem=strtem.substring(index+substr.length());
			}
		}while(index!=-1);
		return count;
	}
}
