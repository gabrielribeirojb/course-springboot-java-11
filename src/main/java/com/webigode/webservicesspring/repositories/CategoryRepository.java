package com.webigode.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webigode.webservicesspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
