package com.especializacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.especializacao.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
