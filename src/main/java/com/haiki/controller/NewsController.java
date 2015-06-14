package com.haiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haiki.model.Activity;
import com.haiki.model.NewsPiece;
import com.haiki.service.ExerciseService;

@Controller
public class NewsController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value = "/addNews")
	public String addNews(@ModelAttribute ("newsPiece") NewsPiece newsPiece) {
		
		System.out.println("news: " + newsPiece.getNewsPieceTitle());
		System.out.println("activity: " + newsPiece.getActivity());
		
		
		
		return "addNews";
	}
	
	@RequestMapping(value= "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}
	

}
