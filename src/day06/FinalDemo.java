package day06;
/**��̬�еĳ�Ա�����ص㣺
A:��Ա����
	���뿴��ߣ����п���ߡ�
B:���췽��
	������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ����
C:��Ա����
	���뿴��ߣ����п��ұߡ�
D:��̬����
	���뿴��ߣ����п���ߡ�
	(��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�)
	
���ڳ�Ա�������ڷ�����д�����������п��ұߡ�
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