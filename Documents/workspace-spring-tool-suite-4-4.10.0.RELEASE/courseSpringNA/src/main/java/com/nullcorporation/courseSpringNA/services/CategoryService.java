package com.nullcorporation.courseSpringNA.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nullcorporation.courseSpringNA.entities.Category;
import com.nullcorporation.courseSpringNA.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findbyId(Long id) {
		Optional <Category> obj = repository.findById(id);
		return obj.get();
	}
}
