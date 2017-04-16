package day04;

public class Student {
	private int old;
	private String name;
	private char sex;
	public Student(){
		System.out.println("初始化");
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		if(old>0){
		this.old = old;
		}else{
			System.out.println("输入错误");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		if(sex=='男'||sex=='女'){
		this.sex = sex;
		}else{
			System.out.println("输入错误");
		}
	}
	
	
}
