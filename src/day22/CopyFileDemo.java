package day22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("a.txt");
		FileReader fr=new FileReader("b.txt");
		char[] ch=new char[1024];
		while(fr.read(ch)!=-1){
			fw.write(ch);
		}
		fw.close();
		fr.close();
	}

}
