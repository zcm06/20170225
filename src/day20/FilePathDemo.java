package day20;

import java.io.File;

public class FilePathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("F:\\学习资料\\黑马程序员_Java基础视频-深入浅出精华版");
		Bianli(file);
		
	}
	public static void Bianli(File file){
		File[] fi=file.listFiles();
		for(File ff:fi){
			if(ff.isFile()&&ff.getName().endsWith(".avi")){
				System.out.println(ff.getAbsolutePath());
			}else if(ff.isDirectory())
				Bianli(ff);
			}
		}
	}


