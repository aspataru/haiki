package com.haiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haiki.model.NewsPiece;

@Controller
public class NewsController {
	
	@RequestMapping(value = "/addNews")
	public String addNews(@ModelAttribute ("newsPiece") NewsPiece newsPiece) {
		
		System.out.println("news: " + newsPiece.getNewsPieceTitle());
		
		return "addNews";
	}

}
