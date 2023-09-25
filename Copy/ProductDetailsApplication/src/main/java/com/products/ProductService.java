package com.products;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepository productrepository;

	public String addingProduct(ProductDetails productdetails) {
		productrepository.save(productdetails);
		return "Inserted Success";
	}
	public String updateProduct(ProductDetails productdetails) {
		productrepository.save(productdetails);
		return "Updated Success";
	}

	public Optional<ProductDetails> getProductDetails(int id) {
		return productrepository.findById(id);
	}

	public String deletingProduct(int id) {
		productrepository.deleteById(id);
		return "deleted";
	}

}
