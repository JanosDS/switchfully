package com.org.funiversity.domain;

import java.util.UUID;

public class Course {

	private static final int MAX_AMOUNT_OF_STUDY_POINTS = 6;
	private static final int MIN_AMOUNT_OF_STUDY_POINTS = 1;
	private final String id;
	private String name;
	private int amountOfStudyPoints;
	private Professor professor;

	public Course(String name, int amountOfStudyPoints, Professor professor) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		setAmountOfStudyPoints(amountOfStudyPoints);
		this.professor = professor;
	}

	public Course(String id, String name, int amountOfStudyPoints, Professor professor) {
		this.id = id;
		this.name = name;
		setAmountOfStudyPoints(amountOfStudyPoints);
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

	private void setAmountOfStudyPoints(int amount) {
		if (amount > MAX_AMOUNT_OF_STUDY_POINTS) {
			amount = MAX_AMOUNT_OF_STUDY_POINTS;
		}
		if (amount < MIN_AMOUNT_OF_STUDY_POINTS) {
			amount = MIN_AMOUNT_OF_STUDY_POINTS;
		}
		this.amountOfStudyPoints = amount;
	}
}
