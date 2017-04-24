package day20;

import java.io.File;
import java.io.FileFilter;

public class FileDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("e:\\");
		File[] f=file.listFiles();
		for(File fi:f){
			if(fi.getName().endsWith(".iso")){
			String name=fi.getName();
			int index=name.indexOf("-");
			String alterName=name.substring(index+1);
			//System.out.println(alterName);
			File ff=new File(file,alterName);
			fi.renameTo(ff);
			}
		}
	}

}
