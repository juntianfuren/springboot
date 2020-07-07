package com.jtfr.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String username;
	private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public User(Long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

}
