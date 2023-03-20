package com.org.funiversity.dto;

public class ProfessorDTO {
	private String id;
	private String firstname;
	private String lastname;

	public ProfessorDTO(String id, String firstname, String lastname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
}
