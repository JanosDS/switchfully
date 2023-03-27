package com.org.funiversity.service;

import com.org.funiversity.dto.Course.CourseDTO;
import com.org.funiversity.dto.Course.CourseMapper;
import com.org.funiversity.dto.ProfessorDTO;
import com.org.funiversity.exception.ProfessorNotFoundException;
import com.org.funiversity.repository.CourseRepository;
import com.org.funiversity.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
	private final CourseRepository courseRepository;
	private final ProfessorRepository professorRepository;
	private final CourseMapper courseMapper;

	public CourseService(CourseRepository courseRepository, ProfessorRepository professorRepository, CourseMapper courseMapper) {
		this.courseRepository = courseRepository;
		this.professorRepository = professorRepository;
		this.courseMapper = courseMapper;
	}

	public List<CourseDTO> getAllCourses() {
		return courseMapper.toDTO(courseRepository.getAllCourses());
	}

	public CourseDTO addNewCourse(CourseDTO newCourse) {
		validateProfessor(newCourse.getProfessor());
		return courseMapper.toDTO(courseRepository.addCourse(courseMapper.toDomain(newCourse)));
	}

	private void validateProfessor(ProfessorDTO professor) {
		professorRepository.findProfessorForId(professor.getId()).orElseThrow(() -> new ProfessorNotFoundException("The given professor doesn't exist."));
	}

	public List<CourseDTO> getCoursesWithStudyPoints(int studyPoints) {
		return courseMapper.toDTO(courseRepository.findCoursesWithStudyPoints(studyPoints));
	}

	public CourseDTO getCourseForId(String id) {
		return courseRepository.findCourseForId(id)
				.map(courseMapper::toDTO)
				.orElse(null);
	}
}
