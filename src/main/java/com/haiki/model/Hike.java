package com.haiki.model;

public class Hike {
	
	private final String name;
	private final String description;

	public Hike(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
}
