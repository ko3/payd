package com.payd.app.service;

import org.springframework.stereotype.Service;

import com.payd.app.controller.model.Group;
import com.payd.app.controller.model.Member;

@Service
public class ResourceAssembler {
	
	
	public Group getGroup(com.payd.app.repository.entity.Employer groupEntity) {
		Group group = new Group();
		group.setGroupId(groupEntity.getGroupId());
		group.setGroupName(groupEntity.getGroupName());
		group.setDescription(groupEntity.getGroupDescription());
		groupEntity.getMembersList().stream().forEach(memberEntity -> {
		 Member member = new Member();
		 member.setMemberId(memberEntity.getMemberId());
		 member.setFirstName(memberEntity.getFirstName());
		 member.setLastName(memberEntity.getLastName());
		 member.setMiddleName(memberEntity.getMiddleName());
		 member.setDateOfBirth(memberEntity.getDateOfBirth());
		 member.setEmail(memberEntity.getEmail());
		 group.getMembersList().add(member);
		});
		return group;
	}

}
