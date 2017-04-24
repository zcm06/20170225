package day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is=new FileInputStream("fos.txt");
		InputStreamReader isr=new InputStreamReader(is);
		//int by=0;
		while(isr.ready()){
			System.out.print((char)isr.read());
		}
		is.close();
		isr.close();
	}

}
