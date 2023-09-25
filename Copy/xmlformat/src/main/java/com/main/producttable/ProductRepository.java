package com.main.producttable;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDetails1,Integer> {

	Optional<ProductDetails1> findAll(ProductDetails1 productdetails);

	

	

}
