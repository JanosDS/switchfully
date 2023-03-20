package com.org.funiversity.dto;

import com.org.funiversity.domain.Professor;

import java.util.UUID;

public class CourseDTO {
	private final String id;
	private String name;
	private int amountOfStudyPoints;
	private Professor professor;

	public CourseDTO(String id, String name, int amountOfStudyPoints, Professor professor) {
		this.id = id;
		this.name = name;
		this.amountOfStudyPoints = amountOfStudyPoints;
		this.professor = professor;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAmountOfStudyPoints() {
		return amountOfStudyPoints;
	}

	public Professor getProfessor() {
		return professor;
	}
}
