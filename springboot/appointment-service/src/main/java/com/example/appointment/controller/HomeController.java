package com.example.appointment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getWelcomeText(){
		return "Welcome to Appointment Service";
	}
}
