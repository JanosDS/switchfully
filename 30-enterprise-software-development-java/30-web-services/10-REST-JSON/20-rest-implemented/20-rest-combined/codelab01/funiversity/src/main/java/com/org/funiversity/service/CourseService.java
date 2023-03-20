package com.org.funiversity.service;

import com.org.funiversity.domain.Course;
import com.org.funiversity.domain.Professor;
import com.org.funiversity.dto.CourseDTO;
import com.org.funiversity.dto.CourseMapper;
import com.org.funiversity.repository.CourseRepository;
import com.org.funiversity.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
	private final CourseRepository courseRepository;
	private final CourseMapper courseMapper;

	public CourseService(CourseRepository courseRepository, CourseMapper courseMapper) {
		this.courseRepository = courseRepository;
		this.courseMapper = courseMapper;
	}

	public List<CourseDTO> getAllCourses() {
		return courseMapper.toDTO(courseRepository.getAllCourses());
	}

	public CourseDTO addNewCourse(CourseDTO newCourse) {
		return courseMapper.toDTO(courseRepository.addCourse(courseMapper.toDomain(newCourse)));
	}

	public List<CourseDTO> getCoursesWithStudyPoints(int studyPoints) {
		return courseMapper.toDTO(courseRepository.findCoursesWithStudyPoints(studyPoints));
	}

	public CourseDTO getCourseForId(String id) {
		return courseMapper.toDTO(courseRepository.findCourseForId(id));
	}
}
