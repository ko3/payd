package com.payd.app.service;

import org.springframework.stereotype.Service;

import com.payd.app.repository.entity.Employer;

@Service
public class GroupService {
	
	public Employer getGroup(Integer id) {
		
		return new Employer();
	}

}
