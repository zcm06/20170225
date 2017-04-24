package day20;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("d:\\");
		File[] f=file.listFiles();
		for(File fi:f){
			System.out.println(fi);
		}
		
	}

}
