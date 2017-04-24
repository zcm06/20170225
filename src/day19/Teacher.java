package day19;

public class Teacher {
	public void check(int score) throws MyException{
		if(score>100||score<0){
			//System.out.println("输入错误");
			throw new MyException("分数错误"); 
		}else{
			System.out.println("it's ok");
		}
	}
}
