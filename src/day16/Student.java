package day16;

public class Student implements Comparable<Student>{
	private String name;
	private int math;
	private int english;
	private int chinese;
	
	public Student(String name, int math, int english, int chinese) {
		super();
		this.name = name;
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		int sum1=s.getChinese()+s.getEnglish()+s.getMath();
		int sum2=this.getChinese()+this.getEnglish()+this.getMath();
		int num=sum1-sum2;
		int num2=num==0?s.getName().compareTo(this.getName()):num;
		return num2;
	}
	
	
}
