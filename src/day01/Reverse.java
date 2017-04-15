package day01;

public class Reverse {
	public static void main(String[] args) {
		String[] str = { "hh", "shi", "qewq", "oqo" };
		for (int i = 0; i < str.length / 2; i++) {
			String tmp;
			tmp = str[i];
			str[i] = str[str.length - 1 - i];
			str[str.length - 1 - i] = tmp;
		}
		System.out.print("[");
		for (int i = 0; i < str.length; i++) {
			if (i == str.length - 1) {
				System.out.print(str[i] + "]");
			} else {
				System.out.print(str[i] + ",");
			}
		}
	}
}
