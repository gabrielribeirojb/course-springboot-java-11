package com.webigode.webservicesspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webigode.webservicesspring.entities.Product;

public interface ProductRespository extends JpaRepository<Product, Long>{

}
