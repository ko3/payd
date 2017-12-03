package com.payd.app.service;

import org.springframework.stereotype.Service;

import com.payd.app.repository.entity.Group;

@Service
public class GroupService {
	
	public Group getGroup(Integer id) {
		
		return new Group();
	}

}
