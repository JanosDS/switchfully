package com.org.funiversity.domain.user;

public class User {

	private final String name;
	private final String password;
	private final Role role;

	public User(String name, String password, Role role) {
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public Role getRole() {
		return role;
	}

	public boolean doesPasswordMatch(String password) {
		return this.password.equals(password);
	}

	public boolean hasAccessTo(Feature feature) {
		return role.hasFeature(feature);
	}
}
