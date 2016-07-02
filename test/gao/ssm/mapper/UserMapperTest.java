package gao.ssm.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gao.ssm.po.User;

public class UserMapperTest {

	// spring容器
	private ApplicationContext applicationContext;

	// 在setUp()方法中获得spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindUserList() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserById() throws Exception {
		// 获得代理对象
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		// 调用userMapper的方法
		User user = userMapper.findUserById(1);
		System.out.println(user);
	}

	@Test
	public void testFindUserByIdResultMap() {
		fail("Not yet implemented");
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
