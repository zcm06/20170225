package cn.zhang.dao;

import cn.zhang.pojo.User;

/**
 * 
 * ���Ƕ��û����в����Ľӿ�
 * @author �Ų���
 *@version V1.0
 */
public interface UserDao {
	/**
	 * �����û��ĵ�¼����
	 * @param usrname �û���
	 * @param password ����
	 * @return ���ص�½�Ƿ�ɹ�
	 */
	public abstract boolean isLogin(String usrname,String password);
	/**
	 * �����û�ע�Ṧ��
	 * @param user Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
}
