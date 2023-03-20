package com.org.funiversity.service;

import com.org.funiversity.domain.Professor;
import com.org.funiversity.dto.ProfessorDTO;
import com.org.funiversity.dto.ProfessorMapper;
import com.org.funiversity.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

	private final ProfessorRepository professorRepository;
	private final ProfessorMapper professorMapper;

	public ProfessorService(ProfessorRepository professorRepository, ProfessorMapper professorMapper) {
		this.professorRepository = professorRepository;
		this.professorMapper = professorMapper;
	}

	public List<ProfessorDTO> getAllProfessors() {
		return professorMapper.toDTO(professorRepository.getAllProfessors());
	}

	public ProfessorDTO addProfessor(ProfessorDTO newProfessor) {
		Professor professor = new Professor(newProfessor.getFirstname(), newProfessor.getLastname());
		return professorMapper.toDTO(professorRepository.addProfessor(professor));
	}

	public ProfessorDTO findProfessorForId(String id) {
		return professorMapper.toDTO(professorRepository.findProfessorForId(id));
	}

	public ProfessorDTO updateProfessor(ProfessorDTO professorDTOToUpdate) {
		return professorMapper.toDTO(professorRepository.updateProfessor(professorMapper.toDomain(professorDTOToUpdate)));
	}

	public ProfessorDTO deleteProfessor(ProfessorDTO professorToDelete) {
		return professorMapper.toDTO(professorRepository.deleteProfessor(professorToDelete.getId()));
	}
}
