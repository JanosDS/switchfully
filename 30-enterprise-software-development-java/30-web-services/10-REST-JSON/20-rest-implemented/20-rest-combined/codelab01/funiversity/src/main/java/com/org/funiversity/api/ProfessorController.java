package com.org.funiversity.api;

import com.org.funiversity.dto.ProfessorDTO;
import com.org.funiversity.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "professors")
public class ProfessorController {
	private final ProfessorService professorService;

	public ProfessorController(ProfessorService professorService) {
		this.professorService = professorService;
	}

	@GetMapping(produces = "application/json")
	public List<ProfessorDTO> getAllProfessors() {
		return professorService.getAllProfessors();
	}

	@PostMapping(path = "add", consumes = "application/json", produces = "application/json")
	public ProfessorDTO addProfessor(@RequestBody ProfessorDTO newProfessor) {
		return professorService.addProfessor(newProfessor);
	}

	@GetMapping(value = "{id}", produces = "application/json")
	public ProfessorDTO findProfessorForId(@PathVariable String id) {
		return professorService.findProfessorForId(id);
	}

	@PostMapping(path = "update", consumes = "application/json", produces = "application/json")
	public ProfessorDTO updateProfessor(@RequestBody ProfessorDTO professor) {
		return professorService.updateProfessor(professor);
	}

	@PostMapping(path = "delete", consumes = "application/json", produces = "application/json")
	public ProfessorDTO deleteProfessor(@RequestBody ProfessorDTO professorToDelete) {
		return professorService.deleteProfessor(professorToDelete);
	}
}
