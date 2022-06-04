package com.restapi.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DeviceRestExceptionHandler {

	// add exception handling code for DeviceNotFoundException

	@ExceptionHandler
	public ResponseEntity<DeviceErrorResponse> handleException(DeviceNotFoundException exc) {

		// create a DeviceErrorResponse

		DeviceErrorResponse error = new DeviceErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(),
				System.currentTimeMillis());

		// return ResponseEntity
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

	}

	// add another exception handler to catch any exception

	@ExceptionHandler
	public ResponseEntity<DeviceErrorResponse> handleException(Exception exc) {

		// create a DeviceErrorResponse
		DeviceErrorResponse error = new DeviceErrorResponse(HttpStatus.BAD_REQUEST.value(), exc.getMessage(),
				System.currentTimeMillis());

		// return ResponseEntity
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}
