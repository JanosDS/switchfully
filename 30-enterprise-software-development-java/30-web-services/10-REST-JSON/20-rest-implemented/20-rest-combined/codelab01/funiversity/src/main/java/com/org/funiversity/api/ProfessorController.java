package com.org.funiversity.api;

import com.org.funiversity.domain.user.Feature;
import com.org.funiversity.dto.ProfessorDTO;
import com.org.funiversity.service.ProfessorService;
import com.org.funiversity.service.SecurityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "professors")
public class ProfessorController {
	private final ProfessorService professorService;
	private final SecurityService securityService;

	public ProfessorController(ProfessorService professorService, SecurityService securityService) {
		this.professorService = professorService;
		this.securityService = securityService;
	}

	@GetMapping(produces = "application/json")
	public List<ProfessorDTO> getAllProfessors() {
		return professorService.getAllProfessors();
	}

	@PostMapping(path = "add", consumes = "application/json", produces = "application/json")
	public ProfessorDTO addProfessor(@RequestHeader String authorization, @RequestBody ProfessorDTO newProfessor) {
		securityService.validateAuthorization(authorization, Feature.ADD_PROFESSOR);
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
