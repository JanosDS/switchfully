package com.org.funiversity.service;

import com.org.funiversity.domain.Course;
import com.org.funiversity.dto.CourseDTO;
import com.org.funiversity.dto.CourseMapper;
import com.org.funiversity.repository.CourseRepository;
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
		Course course = new Course(newCourse.getName(), newCourse.getAmountOfStudyPoints(), newCourse.getProfessor());
		return courseMapper.toDTO(courseRepository.addCourse(course));
	}

	public List<CourseDTO> getCoursesWithStudyPoints(int studyPoints) {
		return courseMapper.toDTO(courseRepository.findCoursesWithStudyPoints(studyPoints));
	}

	public CourseDTO getCourseForId(String id) {
		return courseMapper.toDTO(courseRepository.findCourseForId(id));
	}
}
