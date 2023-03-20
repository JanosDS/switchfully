package com.org.funiversity.api;

import com.org.funiversity.dto.CourseDTO;
import com.org.funiversity.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "courses")
public class CourseController {

	private final CourseService courseService;

	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@GetMapping(produces = "application/json")
	public List<CourseDTO> getAllCourses() {
		return courseService.getAllCourses();
	}

	@PostMapping(path = "add", consumes = "application/json", produces = "application/json")
	public CourseDTO addNewCourse(@RequestBody CourseDTO newCourse) {
		return courseService.addNewCourse(newCourse);
	}

	@GetMapping(value = "/studyPoints/{studyPoints}", produces = "application/json")
	public List<CourseDTO> getCoursesWithStudyPoints(@PathVariable int studyPoints) {
		return courseService.getCoursesWithStudyPoints(studyPoints);
	}

	@GetMapping(value = "/id/{id}", produces = "application/json")
	public CourseDTO getCourseForId(@PathVariable String id) {
		return courseService.getCourseForId(id);
	}
}
