package com.main.producttable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductService productservice;

	@PostMapping("/productdetails")
	public String addingProduct(@RequestBody ProductDetails1 productdetails) {
		return productservice.addingProduct(productdetails);
	}

	@GetMapping("/productdetails")
	public Optional<ProductDetails1> getProductDetails(@RequestBody ProductDetails1 productdetails) {
		return productservice.getProductDetails(productdetails);

	}
	@PutMapping("/productdetails")
	public String updateProduct(@RequestBody ProductDetails1 productdetails )
	{
		return productservice.updateProduct(productdetails);
	}

	@DeleteMapping("/productdetails/{product_id}")
	public String deletingProduct(@PathVariable int product_id) {
		return productservice.deletingProduct(product_id);
	}

}
