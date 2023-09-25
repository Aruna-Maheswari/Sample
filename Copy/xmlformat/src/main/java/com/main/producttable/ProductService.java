package com.main.producttable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
	@Autowired
	ProductRepository productrepository;

	public String addingProduct(ProductDetails1 productdetails) {
		productrepository.save(productdetails);
		return "Inserted Success";
	}
	public String updateProduct(ProductDetails1 productdetails) {
		productrepository.save(productdetails);
		return "Updated Success";
	}

	public Optional<ProductDetails1> getProductDetails(@RequestBody ProductDetails1 productdetails) {
		return productrepository.findAll(productdetails);
	}

	public String deletingProduct(int product_id) {
		productrepository.deleteById(product_id);
		return "deleted";
	}

}
