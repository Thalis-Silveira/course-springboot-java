package com.nullcorporation.courseSpringNA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nullcorporation.courseSpringNA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
