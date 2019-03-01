package com.tcs.agileDashBoard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkForceController {
	@RequestMapping(value="/login", method=RequestMethod.GET)
		public String login() {
			
			return "Welcome";
		}
}
