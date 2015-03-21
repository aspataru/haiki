package com.haiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.haiki.model.Communication;

@Controller
@SessionAttributes("communication")
public class CommunicationController {
	
	@RequestMapping(value = "/addCommunication", method = RequestMethod.GET)
	public String addCommunication(Model model) {
		Communication comm = new Communication();
		comm.setTitle("Hello title!");
		model.addAttribute("communication", comm);
		
		return "addCommunication";
	}
	
	@RequestMapping(value = "/addCommunication", method = RequestMethod.POST)
	public String updateGoal(@ModelAttribute("communication") Communication communication) {
		System.out.println("Comm title updated: " + communication.getTitle());
		
		return "redirect:addNews.html";
	}

}
