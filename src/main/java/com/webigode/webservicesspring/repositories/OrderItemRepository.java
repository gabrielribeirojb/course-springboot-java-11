package com.webigode.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webigode.webservicesspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
