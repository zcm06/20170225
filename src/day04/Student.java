package day04;

public class Student {
	private int old;
	private String name;
	private char sex;
	public Student(){
		System.out.println("����һ��ѧ��");
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		if(old>0){
		this.old = old;
		}else{
			System.out.println("��������䣡");
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
		if(sex=='��'||sex=='Ů'){
		this.sex = sex;
		}else{
			System.out.println("�Ա����");
		}
	}
	
	
}
