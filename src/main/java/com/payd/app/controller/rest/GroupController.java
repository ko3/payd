package com.payd.app.controller.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.payd.app.controller.model.Group;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class GroupController {
	
	
	@RequestMapping(value = "/group", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Group hello() {
		Group group = new Group();
		group.setGroupId(4365789);
		group.setGroupName("HJjgslkn");
		group.setDescription("Hbfksgkjbdknlsd");
		return group;
	}

}
