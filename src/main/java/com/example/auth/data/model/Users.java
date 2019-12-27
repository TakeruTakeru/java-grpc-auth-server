package com.example.auth.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue
	protected Integer id;
	protected String username;
	protected String email;
	protected String password;

	public Users() {
		super();
	}

	public Users(String username, String email,
			String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String toString() {
		return "[name:" + username + ", mail:" + email +
				"]";
	}
}
