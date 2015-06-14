package com.haiki.model;

import org.hibernate.validator.constraints.Length;

public class Communication {
	
	@Length(min = 5)
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
