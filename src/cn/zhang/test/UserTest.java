package cn.zhang.test;

import java.util.Scanner;

import cn.zhang.impl.UserDaoImpl;
import cn.zhang.pojo.User;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDaoImpl udi=new UserDaoImpl();
		User user=new User();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("------------");
			System.out.println("1 ע��");
			System.out.println("2 ��½");
			System.out.println("3 �˳�");
			System.out.println("------------");
			System.out.println("���������ѡ��");
			String num=sc.nextLine();
			switch (num) {
			case "1":
				System.out.println("�������û���");
				String Newusername=sc.nextLine();
				System.out.println("����������");
				String Newpassword=sc.nextLine();
				user.setUsername(Newusername);
				user.setPassword(Newpassword);
				udi.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case  "2":
				System.out.println("�������û���");
				String username=sc.nextLine();
				System.out.println("����������");
				String password=sc.nextLine();
				if(udi.isLogin(username, password)){
					System.out.println("��½�ɹ�");
					System.exit(0);
				}else{
					System.out.println("�û������������");
				}
				break;
			case "3":
				System.exit(0);
				break;

			default:
				System.out.println("�����������������");
				break;
			}
		}
		
	}

}
