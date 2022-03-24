package com.krishnam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.krishnam.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int first, @RequestParam("t2") int second) {
		AddService as = new AddService();
		int result = as.add(first, second);
		System.out.println("i am here...."+result);
		ModelAndView mv =new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", result);
		return mv;
	}

}
