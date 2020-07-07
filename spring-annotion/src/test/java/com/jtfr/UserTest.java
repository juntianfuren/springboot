package com.jtfr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jtfr.entity.User;
import com.jtfr.entity.User2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
	
	// 多个实例，@Qualifier 参数指定名称
	@Autowired
	@Qualifier("user")
	private User user_1;
	@Autowired
	@Qualifier("user")
	private User user_2;
	@Autowired
	@Qualifier("testUser")
	private User user_3;
	
	@Test
	public void testUser() {
		System.out.println("user_2-------------- "+user_2.getName()+" ------- "+ user_2.getAge());
		user_1.setName("user_1");
		System.out.println("user_2-------------- "+user_2.getName()+" ------- "+ user_2.getAge());
		user_3.setName("user_3");
		System.out.println("user_2-------------- "+user_2.getName()+" ------- "+ user_2.getAge());
		System.out.println("user_3-------------- "+user_3.getName()+" ------- "+ user_3.getAge());
	}
	

	// user1 和 user2 都是在 config 里面创建的同一个对象
	@Autowired
	private User2 user2_1;
	@Autowired
	private User2 user2_2;
	@Test
	public void testUser2() {
		System.out.println(user2_2.getName()+" ------- "+ user2_2.getAge());
		user2_1.setName("admin");
		System.out.println(user2_2.getName()+" ------- "+ user2_2.getAge());
	}

}
