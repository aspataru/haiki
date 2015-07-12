package com.haiki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haiki.model.Hike;
import com.haiki.model.HikeList;
import com.haiki.service.HikeService;


@Controller
@SessionAttributes({"hikeList","hike"})
public class HikesController {
	
	@Autowired
	private HikeService hikeService;
	
	@RequestMapping(value = "/hikes", method = RequestMethod.GET)
	public String hikes(Model model)  {
		HikeList hikes = hikeService.getHikes();
		model.addAttribute("hikeList", hikes);
		return "hikes";
	}
	
	@RequestMapping(value = "/hikes/new", method = RequestMethod.GET)
	public String newHike(Model model)  {
		model.addAttribute("hike", new Hike("Default hike title", "Default hike description"));
		return "addHike";
	}
	
	@RequestMapping(value = "/hikes/new", method = RequestMethod.POST)
	public String newHike(@ModelAttribute("hike") Hike hike, BindingResult result) {
		System.out.println("Hike added" + hike.getName());	
		hikeService.addHike(hike);
		return "redirect:addHike.html";
	}
	

}
