package org.praveen.onlineShoppingSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring MVC!!");
		return mv;
	}

	/*Example for RequestParam
	@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value = "greeting", required = false) String greeting) {
		if (greeting == null) {
			greeting = "Hello There!!";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;

	}*/

	/* Example for @PathVariable 
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test1(@PathVariable("greeting") String greeting) {
		if (greeting == null) {
			greeting = "Hello There!!";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;

	}*/
}
