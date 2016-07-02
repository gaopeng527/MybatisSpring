package gao.ssm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import gao.ssm.po.User;
/**
 * �û������ӿ�ʵ����
 * @author DELL
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		// ����һ�����ӣ��̳�SqlSessionDaoSupportͨ��getSqlSession()�����õ�SqlSession������������spring���Զ��ͷ���Դ
		SqlSession session = this.getSqlSession();
		User user = session.selectOne("test.findUserById", id);
		return user;
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		// ����һ������
		SqlSession session = this.getSqlSession();
		List<User> list = session.selectList("test.findUserByName", name);
		return list;
	}
	
	@Override
	public void insertUser(User user) throws Exception {
		// ����һ������
		SqlSession session = this.getSqlSession();
		session.insert("test.insertUser", user);
		// �ύ����
		session.commit();

	}

	@Override
	public void updateUser(User user) throws Exception {
		// ����һ������
		SqlSession session = this.getSqlSession();
		session.update("test.updateUser", user);
		// �ύ����
		session.commit();
	}

	@Override
	public void deleteUser(int id) throws Exception {
		// ����һ������
		SqlSession session = this.getSqlSession();
		session.delete("test.deleteUser", id);
		// �ύ����
		session.commit();

	}


}
