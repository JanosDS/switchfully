package com.org.funiversity.exception;

import org.webjars.NotFoundException;

public class CourseNotFoundException extends NotFoundException {
	public CourseNotFoundException(String message) {
		super(message);
	}
}
