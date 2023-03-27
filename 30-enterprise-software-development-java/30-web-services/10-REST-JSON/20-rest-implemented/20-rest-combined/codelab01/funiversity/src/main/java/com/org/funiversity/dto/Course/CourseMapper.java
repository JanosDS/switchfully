package com.org.funiversity.dto.Course;

import com.org.funiversity.domain.Course;
import com.org.funiversity.dto.ProfessorMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseMapper {

	private final ProfessorMapper professorMapper;

	public CourseMapper(ProfessorMapper professorMapper) {
		this.professorMapper = professorMapper;
	}

	public List<CourseDTO> toDTO(List<Course> courseList) {
		return courseList.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public CourseDTO toDTO(Course course) {
		return new CourseDTO(course.getId(), course.getName(), course.getAmountOfStudyPoints(), professorMapper.toDTO(course.getProfessor()));
	}

	public Course toDomain(CourseDTO courseDTO) {
		return new Course(courseDTO.getId(), courseDTO.getName(), courseDTO.getAmountOfStudyPoints(), professorMapper.toDomain(courseDTO.getProfessor()));
	}
}
