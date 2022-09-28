package com.katia.form001.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping(path="/index")
	public ModelAndView display() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
