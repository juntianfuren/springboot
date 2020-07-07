package com.jtfr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jtfr.entity.User2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

	// user1 和 user2 都是在 config 里面创建的同一个对象
	@Autowired
	private User2 user1;
	@Autowired
	private User2 user2;
	
	@Test
	public void testUser() {
		System.out.println(user2.getName()+" ------- "+ user2.getAge());
		user1.setName("admin");
		System.out.println(user2.getName()+" ------- "+ user2.getAge());
	}
}
