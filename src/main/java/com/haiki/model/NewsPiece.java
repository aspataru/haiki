package com.haiki.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class NewsPiece {
	
	@NotNull
	private String activity;
	
	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	@Length(min = 5)
	private String newsPieceTitle;

	public String getNewsPieceTitle() {
		return newsPieceTitle;
	}

	public void setNewsPieceTitle(String newsPieceTitle) {
		this.newsPieceTitle = newsPieceTitle;
	}

}
