package com.haiki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.SessionScope;

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
		for (Hike hike : hikes.getHikes()) {
			System.out.println(hike);
		}
		model.addAttribute("hikeList", hikes);
		model.addAttribute("hike", new Hike("title!", ""));
		return "hikes";
	}
	
	@RequestMapping(value = "/hikes", method = RequestMethod.POST)
	public String editHike(@ModelAttribute("hike") Hike hike, BindingResult result) {
		System.out.println("Hike added" + hike.getName());	
		hikeService.addHike(hike);
		return "redirect:hikes.html";
	}
	

}
