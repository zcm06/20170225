package cn.zhang.dao;

import cn.zhang.pojo.User;

/**
 * 
 * 这是对用户进行操作的接口
 * @author 张灿明
 *@version V1.0
 */
public interface UserDao {
	/**
	 * 这是用户的登录功能
	 * @param usrname 用户名
	 * @param password 密码
	 * @return 返回登陆是否成功
	 */
	public abstract boolean isLogin(String usrname,String password);
	/**
	 * 这是用户注册功能
	 * @param user 要注册的用户信息
	 */
	public abstract void regist(User user);
}
