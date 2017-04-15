package day06;
/**多态中的成员访问特点：
A:成员变量
	编译看左边，运行看左边。
B:构造方法
	创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化。
C:成员方法
	编译看左边，运行看右边。
D:静态方法
	编译看左边，运行看左边。
	(静态和类相关，算不上重写，所以，访问还是左边的)
	
由于成员方法存在方法重写，所以它运行看右边。
*/
public class FinalDemo {
	public static void main(String[] args) {
		final Father f=new Father();
		f.show();
		System.out.println(f.num);
		f.num=6;
		System.out.println(f.num);
		//f=new Father();
	}
	
}
class Father{
	int num=1; 
	public void show (){
		System.out.println("secret");
	}
}
class Son extends Father{
	
}