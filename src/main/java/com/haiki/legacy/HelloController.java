package com.haiki.legacy;

import org.springframework.ui.Model;

//@Controller
public class HelloController {

	// @RequestMapping(value = "/greeting")
	public String sayHello(Model model) {

		model.addAttribute("greeting", "Hello, World!");

		// go to hello.jsp page
		return "hello";
	}

}
