package day06;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager("´óº£",18,4500,1500);
		System.out.println(m.getName()+m.getNum()+m.getWage()+m.getBonus());
	}

}
abstract class Employee{
	private String name;
	private int num;
	private double wage;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name,int num,double wage){
		this.num=num;
		this.name=name;
		this.wage=wage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
}
class Manager extends Employee{
	private double bonus;
	private String name;
	private int num;
	private double wage;
	public Manager(){
		super();
	}
	public Manager(String name,int num,double wage,double bonus){
		super(name,num,wage);
		this.bonus=bonus;
		
	}
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}