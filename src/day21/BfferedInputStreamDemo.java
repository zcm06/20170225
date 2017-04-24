package day21;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BfferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("a.txt"));
		int by=0;
		while((by=bis.read())!=-1){
			System.out.print((char)by);
		}
		
		bis.close();
	}

}
