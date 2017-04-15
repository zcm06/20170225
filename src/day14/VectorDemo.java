package day14;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement("hello");
		v.addElement("world");
		/*System.out.println(v.elements().nextElement());
		System.out.println(v.elements().nextElement());*/
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			//String s=(String)e.nextElement();
			System.out.println(e.nextElement());
		}
	}

}
