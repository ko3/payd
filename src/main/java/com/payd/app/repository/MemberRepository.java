package com.payd.app.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.payd.app.repository.entity.Member;

@RepositoryRestResource(path = "members")
public interface MemberRepository extends CrudRepository<Member, Integer> {
	
	
	//List<String> findByLastName(String lastName);
}