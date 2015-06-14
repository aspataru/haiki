package com.haiki.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

public class NewsPiece {
	
	@Length(min = 5)
	private String newsPieceTitle;

	public String getNewsPieceTitle() {
		return newsPieceTitle;
	}

	public void setNewsPieceTitle(String newsPieceTitle) {
		this.newsPieceTitle = newsPieceTitle;
	}

}
