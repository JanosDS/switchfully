package com.org.funiversity.dto;

import com.org.funiversity.domain.Professor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProfessorMapper {
	public List<ProfessorDTO> toDTO(List<Professor> allProfessors) {
		return allProfessors.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public ProfessorDTO toDTO(Professor professor) {
		return new ProfessorDTO(professor.getId(), professor.getFirstname(), professor.getLastname());
	}

	public Professor toDomain(ProfessorDTO professorDTO) {
		return new Professor(professorDTO.getId(), professorDTO.getFirstname(), professorDTO.getLastname());
	}
}
