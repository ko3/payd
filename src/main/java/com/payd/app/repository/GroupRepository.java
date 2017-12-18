package com.payd.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.payd.app.repository.entity.Employer;

public interface GroupRepository extends CrudRepository<Employer, Integer>{
	List<Employer> findByGroupName(String groupName);
}
