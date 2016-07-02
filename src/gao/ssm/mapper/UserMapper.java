package gao.ssm.mapper;
import java.util.List;

import gao.ssm.po.User;
import gao.ssm.po.UserCustom;
import gao.ssm.po.UserQueryVo;
/**
 * �������ݿ�ӿڣ��൱��Dao�ӿڣ�mapper��������
 * ֻ����ѭ�����淶��mybatis�ſ����Զ�����mapper�ӿ�ʵ����������
 * �����淶��
 * 1.UserMapper.xml�е�namespaceҪ��UserMapper.javaһ��
 * 2.UserMapper.java������Ҫ��UserMapper.xml��statement��idһ��
 * 3.UserMapper.java�����еĲ�������Ҫ��UserMapper.xml��statement��parameterTypeָ��������һ��
 * 4.UserMapper.java�����еķ���ֵ����Ҫ��UserMapper.xml��statement��resultTypeָ��������һ��
 * @author DELL
 *
 */
public interface UserMapper {
	// �û���Ϣ���ۺϲ�ѯ
	public List<UserCustom> findUserList(UserQueryVo userQueryVo) throws Exception;
	
	// �û���Ϣ�ۺϲ�ѯ����
	public int findUserCount(UserQueryVo userQueryVo) throws Exception;
	
	// ����id��ѯ�û���Ϣ
	public User findUserById(int id) throws Exception;
	
	// ʹ��ResultMap�����ӳ��
	public User findUserByIdResultMap(int id) throws Exception;
	
	// �����û�����ѯ�û��б���Ϣ
	public List<User> findUserByName(String name) throws Exception;
	
	// ����û���Ϣ
	public void insertUser(User user) throws Exception;
	
	// �����û���Ϣ
	public void updateUser(User user) throws Exception;
	
	// ɾ���û���Ϣ
	public void deleteUser(int id) throws Exception;
}
