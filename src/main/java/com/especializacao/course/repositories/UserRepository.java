package com.especializacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.especializacao.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
