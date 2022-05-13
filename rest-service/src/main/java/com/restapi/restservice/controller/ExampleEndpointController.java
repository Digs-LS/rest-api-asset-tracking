package com.restapi.restservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restservice.ExampleEndpoint;

@RestController
public class ExampleEndpointController {

	private static final String template = "Ok%s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/confirmation")
	public ExampleEndpoint confirmation(@RequestParam(value = "name", defaultValue = "!") String name) {
		return new ExampleEndpoint(counter.incrementAndGet(), String.format(template, name));
	}
}
