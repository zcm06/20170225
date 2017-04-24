package day20;

public class RecursiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digui(5);
	}

	public static void Digui(int n) {
		if (n > 0) {
			System.out.println(n);
			n -= 1;
			Digui(n);
		}
	}
}
