package com.payd.app.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {
	
	
	@RequestMapping(value = "/group", method = RequestMethod.GET, produces = "text/json")
	public String hello() {
		
		return "Hello KOuty";
	}

}
