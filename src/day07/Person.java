package day07;

public class Person implements Function{
	private String name;
	private int age;
	private char sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("我会说话");
		
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("我会走路");
	}
	
}
