package day21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("E:\\百度云下载\\copy.zip"));
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("E:\\百度云下载\\CM11 4pda.zip"));
		byte[] by=new byte[1024];
		while(bis.read(by)!=-1){
			bos.write(by);
		}
		bis.close();
		bos.close();
	}

}
