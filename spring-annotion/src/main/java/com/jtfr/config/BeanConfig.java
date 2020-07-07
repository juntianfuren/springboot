package com.jtfr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jtfr.entity.User;
import com.jtfr.entity.User2;

@Configuration
public class BeanConfig {
	/**
	 * 只和返回值类型有关。
	 * 方法名就是实例的名称。
	 */
	@Bean
	public User user() {
		return new User();
	}
	/**
	 * 指定 name 名称，这个是个不使用方法名
	 */
	@Bean(name="testUser")
	public User testUser() {
		return new User();
	}
	/**
	 * 指定名称、开始、结束方法
	 * @return
	 */
	@Bean(initMethod="start",destroyMethod="cleanUp")
	public User2 getUser2() {
		return new User2();
	}
}
