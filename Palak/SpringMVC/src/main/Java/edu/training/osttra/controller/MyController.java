package edu.training.osttra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("home")
	public ModelAndView home(String uname) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("uname",uname);
		mv.setViewName("home.jsp");
		return mv;
//	   return"home.jsp";
	}

}
