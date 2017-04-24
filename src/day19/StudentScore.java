package day19;

public class StudentScore{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t=new Teacher();
		try {
			t.check(120);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
