package day13;

import java.text.SimpleDateFormat;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*double d=0;
		long startTime=System.currentTimeMillis();
		for(int i=0;i<1000000000;i++){
			d+=4*Math.pow(-1, i)/(2*i+1);
		}
		long endTime=System.currentTimeMillis();
		System.out.println(d);
		System.out.println(endTime-startTime);*/
		SimpleDateFormat time=new SimpleDateFormat("mm:ss");
		System.out.println(time.format(102614));
	}

}
