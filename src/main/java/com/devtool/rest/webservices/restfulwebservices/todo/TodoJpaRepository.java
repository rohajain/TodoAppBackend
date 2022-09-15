package com.devtool.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	
	public List<Todo> findByuserName(String username);
	
}