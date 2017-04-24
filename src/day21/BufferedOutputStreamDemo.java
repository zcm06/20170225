package day21;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("a.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write("hello".getBytes());
		bos.close();
	}

}
