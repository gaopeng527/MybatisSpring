package gao.ssm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import gao.ssm.po.User;
/**
 * 用户操作接口实现类
 * @author DELL
 *
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		// 创建一个连接，继承SqlSessionDaoSupport通过getSqlSession()方法得到SqlSession，方法结束会spring会自动释放资源
		SqlSession session = this.getSqlSession();
		User user = session.selectOne("test.findUserById", id);
		return user;
	}

	@Override
	public List<User> findUserByName(String name) throws Exception {
		// 创建一个连接
		SqlSession session = this.getSqlSession();
		List<User> list = session.selectList("test.findUserByName", name);
		return list;
	}
	
	@Override
	public void insertUser(User user) throws Exception {
		// 创建一个连接
		SqlSession session = this.getSqlSession();
		session.insert("test.insertUser", user);
		// 提交事务
		session.commit();

	}

	@Override
	public void updateUser(User user) throws Exception {
		// 创建一个连接
		SqlSession session = this.getSqlSession();
		session.update("test.updateUser", user);
		// 提交事务
		session.commit();
	}

	@Override
	public void deleteUser(int id) throws Exception {
		// 创建一个连接
		SqlSession session = this.getSqlSession();
		session.delete("test.deleteUser", id);
		// 提交事务
		session.commit();

	}


}
