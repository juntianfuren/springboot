package com.jtfr.entity;

import lombok.Data;

@Data
public class User2 {
	
	public User2(){
		System.out.println("User2 实例化");
	}

	private String name;
	private Integer age;
	
	public void start() {
		System.out.println("User2 的 start() 方法");
	}
	
	public void cleanUp() {
		System.out.println("User2 的 cleanUp() 方法");
	}

}
