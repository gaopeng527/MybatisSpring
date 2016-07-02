package gao.ssm.dao;
import java.util.List;

import gao.ssm.po.User;
/**
 * �������ݿ�ӿڣ�ԭʼDao������ʽ
 * @author DELL
 *
 */
public interface UserDao {
	// ����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;
	
	// �����û�����ѯ�û��б���Ϣ
	public List<User> findUserByName(String name) throws Exception;
	
	// ����û���Ϣ
	public void insertUser(User user) throws Exception;
	
	// �����û���Ϣ
	public void updateUser(User user) throws Exception;
	
	// ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;
}
