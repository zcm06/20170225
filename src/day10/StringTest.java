package day10;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="123";
		String password="123456";
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			String user=sc.nextLine();
			String pw=sc.nextLine();
			if(user.equals(username)&&pw.equals(password)){
				System.out.println("��½�ɹ���");
				break;
			}else{
				System.out.println("��¼ʧ�ܣ��㻹��"+(3-i)+"�λ���");
			}
		}
	}

}
