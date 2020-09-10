package net.java.sprinboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.java.sprinboot.service.ProductService;
import net.java.sprinboot.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct(){
		return ResponseEntity.ok().body(productservice.getAllProduct());
		
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable long id){
		return ResponseEntity.ok().body(productservice.getProductById(id));
		
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok().body(this.productservice.createProduct(product));
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable long id,Product product){
		product.setId(id);
		return ResponseEntity.ok().body(this.productservice.updateProduct(product));
		
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable long id){
		this.productservice.deleteProduct(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
		
	}

}
