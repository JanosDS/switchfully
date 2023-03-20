package com.org.funiversity.exception;

import org.webjars.NotFoundException;

public class ProfessorNotFoundException extends NotFoundException {
	public ProfessorNotFoundException(String message) {
		super(message);
	}
}
