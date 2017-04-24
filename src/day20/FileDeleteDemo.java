package day20;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("F:\\test\\");
		Dele(file);
	}
	public static void Dele(File file){
		File[] fi=file.listFiles();
		for(File ff:fi){
			if(ff.isFile()){
				System.out.println(ff.getName()+"---"+ff.delete());
			}else if(ff.isDirectory()){
			
				Dele(ff);
			}
		}
		System.out.println(file.getName()+"---"+file.delete());
	}
}
