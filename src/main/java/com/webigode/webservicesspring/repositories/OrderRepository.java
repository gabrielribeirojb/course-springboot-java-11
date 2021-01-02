package com.webigode.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webigode.webservicesspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
