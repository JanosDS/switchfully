package com.org.funiversity.dto;

import com.org.funiversity.domain.Course;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CourseMapper {
	public List<CourseDTO> toDTO(List<Course> courseList) {
		return courseList.stream().map(this::toDTO).collect(Collectors.toList());
	}

	public CourseDTO toDTO(Course course) {
		return new CourseDTO(course.getId(), course.getName(), course.getAmountOfStudyPoints(), course.getProfessor());
	}
}
