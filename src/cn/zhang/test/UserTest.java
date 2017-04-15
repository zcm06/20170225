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
			System.out.println("1 注册");
			System.out.println("2 登陆");
			System.out.println("3 退出");
			System.out.println("------------");
			System.out.println("请输入你的选择");
			String num=sc.nextLine();
			switch (num) {
			case "1":
				System.out.println("请输入用户名");
				String Newusername=sc.nextLine();
				System.out.println("请输入密码");
				String Newpassword=sc.nextLine();
				user.setUsername(Newusername);
				user.setPassword(Newpassword);
				udi.regist(user);
				System.out.println("注册成功");
				break;
			case  "2":
				System.out.println("请输入用户名");
				String username=sc.nextLine();
				System.out.println("请输入密码");
				String password=sc.nextLine();
				if(udi.isLogin(username, password)){
					System.out.println("登陆成功");
					System.exit(0);
				}else{
					System.out.println("用户名或密码错误");
				}
				break;
			case "3":
				System.exit(0);
				break;

			default:
				System.out.println("输入错误请重新输入");
				break;
			}
		}
		
	}

}
