package com.haiki.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@EqualsAndHashCode(of={"title"})
public class Hike {
	
	@NonNull
	private String title;
	@NonNull
	private String description;
	
	public Hike(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
}
