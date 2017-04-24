package day21;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream os=new FileOutputStream("fos.txt");
		OutputStreamWriter osw=new OutputStreamWriter(os);
		//osw.write("玩蛇");
		osw.write('B');
		osw.flush();
		osw.close();
		os.close();
	}

}
