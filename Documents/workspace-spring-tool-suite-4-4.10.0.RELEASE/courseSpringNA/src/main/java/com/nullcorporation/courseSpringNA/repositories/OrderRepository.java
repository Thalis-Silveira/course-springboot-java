package com.nullcorporation.courseSpringNA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nullcorporation.courseSpringNA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
