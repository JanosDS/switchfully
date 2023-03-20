package com.org.funiversity.repository;

import com.org.funiversity.domain.Course;
import com.org.funiversity.domain.Professor;
import com.org.funiversity.exception.CourseNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CourseRepository {

	private List<Course> courseList;

	public CourseRepository() {
		courseList = new ArrayList<>();
	}

	public List<Course> getAllCourses() {
		return courseList;
	}

	public Course addCourse(Course course) {
		courseList.add(course);
		return course;
	}

	public List<Course> findCoursesWithStudyPoints(int studyPoints) {
		return courseList.stream()
				.filter(course -> course.getAmountOfStudyPoints() == studyPoints)
				.collect(Collectors.toList());
	}

	public Course findCourseForId(String id) {
		return courseList.stream()
				.filter(course -> course.getId().equals(id))
				.findFirst()
				.orElseThrow(() -> new CourseNotFoundException("No course found for ID: " + id));
	}
}
