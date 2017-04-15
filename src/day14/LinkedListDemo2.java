package day14;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack ms=new MyStack();
		ms.add("hello");
		ms.add("java");
		ms.add("world");
		while(!ms.isEmpty()){
			System.out.println(ms.get());
		}
	}

}
