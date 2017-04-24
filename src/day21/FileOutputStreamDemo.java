package day21;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file=new File();
		FileOutputStream fos=new FileOutputStream("test.txt");
		FileOutputStream fo=new FileOutputStream("fos.txt");
		fo.write("联通".getBytes());
		fo.close();
		/*String s="java,io";
		byte[] bb=s.getBytes();*/
		// byte[] b={'j','a','v','a'};
		fos.write("hello java".getBytes());
		fos.write("\n".getBytes());
		fos.write("hello,io".getBytes());
		fos.close();
	}

}
