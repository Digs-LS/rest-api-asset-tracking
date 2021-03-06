package com.restapi.restservice;

public class DeviceNotFoundException extends RuntimeException {

	public DeviceNotFoundException() {
	}

	public DeviceNotFoundException(String message) {
		super(message);
	}

	public DeviceNotFoundException(Throwable cause) {
		super(cause);
	}

	public DeviceNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeviceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
