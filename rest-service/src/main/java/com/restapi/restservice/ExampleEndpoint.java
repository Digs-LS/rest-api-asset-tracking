package com.restapi.restservice;

public class ExampleEndpoint {

	private final long id;
	private final String content;

	public ExampleEndpoint(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
