package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("test.txt");
		FileOutputStream fos=new FileOutputStream("a.txt");
		int b;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		fis.close();
		fos.close();
	}

}
