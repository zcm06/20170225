package day21;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("test.txt");
		int i;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
			
		}
		
		fis.close();
	}

}
