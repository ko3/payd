package com.payd.app.repository.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.payd.app.controller.model.Member;

@Entity
public class Group {
	
	@Id
	private Long guid;
	
	private Integer groupId;
	
	private String groupName;
	
	private String description;
	
	private List<Member> membersList;
	
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Member> getMembersList() {
		return membersList;
	}
	public void setMembersList(List<Member> membersList) {
		this.membersList = membersList;
	}
	
}
