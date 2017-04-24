package day21;

import java.io.IOException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="玩蛇";
		byte[] bytes=s.getBytes();
		System.out.println(Arrays.toString(bytes));
	}

}
