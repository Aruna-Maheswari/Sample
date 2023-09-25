package com.products;

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
	public String addingProduct(@RequestBody ProductDetails productdetails) {
		return productservice.addingProduct(productdetails);
	}

	@GetMapping("/productdetails")
	public Optional<ProductDetails> getProductDetails(@RequestParam int pid) {
		return productservice.getProductDetails(pid);

	}
	@PutMapping("/productdetails")
	public String updateProduct(@RequestBody ProductDetails productdetails )
	{
		return productservice.updateProduct(productdetails);
	}

	@DeleteMapping("/productdetails/{id}")
	public String deletingProduct(@PathVariable int id) {
		return productservice.deletingProduct(id);
	}

}
