package com.payd.app.repository;

import org.springframework.stereotype.Repository;

import com.payd.app.repository.entity.Group;

@Repository
public class GroupRepositoryImpl implements GroupRepository{
	
	public Group getGroup(Integer groupId) {
		Group group = new Group();
		group.setGroupId(groupId);
		group.setGroupName("HJjgslkn");
		group.setDescription("Hbfksgkjbdknlsd");
		return group;
	}

}
