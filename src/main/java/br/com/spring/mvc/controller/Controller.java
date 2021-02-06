package br.com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String whatsup(HttpServletRequest request) {
		
		request.setAttribute("nome", "Mundo");
		return "what's up!?";
		
	}
	
}
