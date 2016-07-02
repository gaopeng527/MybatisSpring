package gao.ssm.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gao.ssm.po.User;

public class UserDaoImplTest {

	// spring����
	private ApplicationContext applicationContext;
	// ��setUp()�����л��spring����
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		// ����useDao�ķ���
		User user = userDao.findUserById(1);
		System.out.println(user);
	}

	@Test
	public void testFindUserByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

}
