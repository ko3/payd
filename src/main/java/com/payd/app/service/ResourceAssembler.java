package com.payd.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payd.app.controller.model.Group;
import com.payd.app.repository.GroupRepository;

@Service
public class ResourceAssembler {
	
	@Autowired
	private GroupRepository groupRepository;
	
	
	public Group getGroup(Integer groupId) {
		com.payd.app.repository.entity.Group groupEntity = groupRepository.getGroup(groupId);
		Group group = new Group();
		group.setGroupId(groupEntity.getGroupId());
		group.setGroupName(groupEntity.getGroupName());
		group.setDescription(groupEntity.getDescription());
		return group;
	}

}
