package com.org.funiversity.repository;

import com.org.funiversity.domain.Professor;
import com.org.funiversity.exception.ProfessorNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProfessorRepository {

	private List<Professor> professorList;

	public ProfessorRepository() {
		this.professorList = new ArrayList<>();
		professorList.add(new Professor("Janos", "Descheemaeker"));
	}

	public List<Professor> getAllProfessors() {
		return professorList;
	}

	public Professor addProfessor(Professor professor) {
		professorList.add(professor);
		return professor;
	}

	public Optional<Professor> findProfessorForId(String idToFind) {
		return professorList.stream()
				.filter(professor -> professor.getId().equals(idToFind))
				.findFirst();
	}

	public Professor updateProfessor(Professor professorToUpdate) {
		professorList.set(professorList.indexOf(professorToUpdate), professorToUpdate);
		return professorToUpdate;
	}

	public Professor deleteProfessor(String id) {
		Professor profToDelete = findProfessorForId(id).orElseThrow(() -> new ProfessorNotFoundException("No professor found to delete for ID: " + id));
		professorList.remove(profToDelete);
		return profToDelete;
	}
}
