package com.bridgelab.fundoonote.user.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UserGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<Object> userExceptionResponse(Exception e, WebRequest request) {
		UserErrorResponse errorResponse = new UserErrorResponse(LocalDateTime.now(), e.getMessage());
		return handleExceptionInternal(e, errorResponse, null, HttpStatus.NOT_FOUND, request);
	}

}
