package com.payd.app.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payd.app.controller.model.Group;
import com.payd.app.service.ResourceAssembler;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;;

@RestController
public class GroupController {
	
	@Autowired
	private ResourceAssembler resourceAssembler;
	
	@RequestMapping(value = "/group", method = GET, produces = APPLICATION_JSON_VALUE)
	public Group hello() {
		
		return resourceAssembler.getGroup();
	}

}
