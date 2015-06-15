package com.haiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haiki.model.Hike;
import com.haiki.model.HikeList;

/*
 * not very restful :(
 */
@Controller
@SessionAttributes("hikeList")
public class HikesController {
	
	@RequestMapping(value = "/hikes", method = RequestMethod.GET)
	public String hikes(Model model)  {
		HikeList hikes = new HikeList(new Hike("Jura", "haha"));
		model.addAttribute("hikeList", hikes);
		return "hikes";
	}
	

}
