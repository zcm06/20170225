package day20;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="test.txt";
		File file=new File(path);
		//file.mkdirs();
		//System.out.println(file.mkdirs());
		file.createNewFile();
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		//System.out.println(file.lastModified());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date=sdf.format(file.lastModified());
		System.out.println(date);
	}

}
