package com.payd.app.repository.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Employer {
	
	
	//private Long guid;
	
	private Integer groupId;
	
	private String groupName;
	
	private String groupDescription;
	
	private List<Member> membersList;
	
	@Id
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
	public String getGroupDescription() {
		return groupDescription;
	}
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
	
	@OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
	public List<Member> getMembersList() {
		return membersList;
	}
	public void setMembersList(List<Member> membersList) {
		this.membersList = membersList;
	}
	
}
