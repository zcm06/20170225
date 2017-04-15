package cn.zhang.impl;

import java.util.ArrayList;
import cn.zhang.dao.UserDao;
import cn.zhang.pojo.User;

public class UserDaoImpl implements UserDao{
	private ArrayList<User> array=new ArrayList<User>();
	@Override
	public boolean isLogin(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(User user:array){
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
				flag=true;
				break;
			}
		}
		return flag;
	}

	@Override
	public void regist(User user) {
		// TODO Auto-generated method stub
		
		array.add(user);
	}

	

}
