package com.nullcorporation.courseSpringNA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nullcorporation.courseSpringNA.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
