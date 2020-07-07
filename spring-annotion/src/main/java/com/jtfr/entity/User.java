package com.jtfr.entity;

import lombok.Data;

@Data
public class User {
	
	public User(){
		System.out.println("----------------User 实例化");
	}

	private String name;
	private Integer age;

}
