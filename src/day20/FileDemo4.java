package day20;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\");
		String[] str = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File f = new File(dir, name);
				return f.isFile() && f.getName().endsWith(".iso");
			}
		});
		for (String s : str) {
			System.out.println(s);
		}
	}

}
