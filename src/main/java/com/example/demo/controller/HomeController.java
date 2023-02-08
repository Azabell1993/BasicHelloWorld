package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.model.Model;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {
	
	
	@GetMapping("/")
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model) {
        System.out.println("came");
		return "/main/index";
	}
}
