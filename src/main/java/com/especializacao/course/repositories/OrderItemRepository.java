package com.especializacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.especializacao.course.entities.OrderItem;
import com.especializacao.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
