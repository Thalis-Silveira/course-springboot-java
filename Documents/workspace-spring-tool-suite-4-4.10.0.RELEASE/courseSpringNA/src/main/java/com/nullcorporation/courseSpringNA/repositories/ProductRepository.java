package com.nullcorporation.courseSpringNA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nullcorporation.courseSpringNA.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
