package com.restapi.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/device")
public class DeviceController {
	
	private static final String template = "Ok%s";
	private final AtomicLong counter = new AtomicLong();

	
//	@GetMapping("/device")
//	public ExampleEndpoint device(@RequestParam(value = "name", defaultValue = "!") String name) {
//		return new ExampleEndpoint(counter.incrementAndGet(), String.format(template, name));
//	}
}
