package com.haiki.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haiki.model.Activity;
import com.haiki.model.NewsPiece;

@Controller
public class NewsController {
	
	@RequestMapping(value = "/addNews")
	public String addNews(@ModelAttribute ("newsPiece") NewsPiece newsPiece) {
		
		System.out.println("news: " + newsPiece.getNewsPieceTitle());
		System.out.println("activity: " + newsPiece.getActivity());
		
		return "addNews";
	}
	
	@RequestMapping(value= "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
	

}
