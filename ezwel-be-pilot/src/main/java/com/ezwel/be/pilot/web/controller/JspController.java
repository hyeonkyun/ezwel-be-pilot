package com.ezwel.be.pilot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {

	@GetMapping("/jsp/home")
    public String home(Model model) {
		System.out.println("=========== [/jsp/home in] ===========");
		
        model.addAttribute("message", "Hello, Spring Boot with JSP!");
        return "home"; // home.jsp로 매핑됨
    }
}
