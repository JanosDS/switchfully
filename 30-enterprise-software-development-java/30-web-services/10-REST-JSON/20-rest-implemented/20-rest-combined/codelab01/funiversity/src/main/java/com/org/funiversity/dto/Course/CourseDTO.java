package com.org.funiversity.dto.Course;

import com.org.funiversity.domain.Professor;
import com.org.funiversity.dto.ProfessorDTO;


public class CourseDTO {
	private final String id;
	private String name;
	private int amountOfStudyPoints;
	private ProfessorDTO professorDTO;

	public CourseDTO(String id, String name, int amountOfStudyPoints, ProfessorDTO professorDTO) {
		this.id = id;
		this.name = name;
		this.amountOfStudyPoints = amountOfStudyPoints;
		this.professorDTO = professorDTO;
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

	public ProfessorDTO getProfessor() {
		return professorDTO;
	}
}
