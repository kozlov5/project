package com.springapp.mvc.controllers;

import com.springapp.mvc.domain.Test;
import com.springapp.mvc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	TestService testService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		Test test = new Test();
		test.setName("name1");
		test.setValue("wgwege");

		testService.insertOrUpdate(test);

		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}