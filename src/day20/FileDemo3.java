package day20;

import java.io.File;

public class FileDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\");
		File[] f=file.listFiles();
		for(File fi:f){
			if(fi.isFile()){
				if(fi.getName().endsWith(".png")){
					System.out.println(fi.getName());
				}
			}
		}
	}

}
