package com.org.funiversity.domain.user;

public class UsernamePassword {

	private final String username;
	private final String password;

	public UsernamePassword(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}
}
