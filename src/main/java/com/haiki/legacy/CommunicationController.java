package com.haiki.legacy;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.haiki.model.Communication;

//@Controller
//@SessionAttributes("communication")
public class CommunicationController {

	// @RequestMapping(value = "/addCommunication", method = RequestMethod.GET)
	public String addCommunication(Model model) {
		Communication comm = new Communication();
		comm.setTitle("Hello title!");
		model.addAttribute("communication", comm);

		return "addCommunication";
	}

	// @RequestMapping(value = "/addCommunication", method = RequestMethod.POST)
	public String updateGoal(
			@Valid @ModelAttribute("communication") Communication communication,
			BindingResult result) {
		System.out.println("result has errors:" + result.hasErrors());
		System.out.println("Comm title updated: " + communication.getTitle());

		if (result.hasErrors()) {
			return "addCommunication";
		}

		return "redirect:addNews.html";
	}

}
