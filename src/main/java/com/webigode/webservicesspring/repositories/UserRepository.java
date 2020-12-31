package com.webigode.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webigode.webservicesspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
