package com.organization.mvcproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.organization.mvcproject.model.ReviewImpl;

@Controller
public class HomeController {
   
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";

	}

}
