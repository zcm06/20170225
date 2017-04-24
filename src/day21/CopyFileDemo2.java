package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("a.txt");
		FileInputStream fis=new FileInputStream("test.txt");
		byte[] bytes=new byte[1024];
		//byte[] by=new byte[1024];
		while(fis.read(bytes)!=-1){
			fos.write(bytes);
			//System.out.print(new String(bytes));
		}
		fos.close();
		fis.close();
	}

}
