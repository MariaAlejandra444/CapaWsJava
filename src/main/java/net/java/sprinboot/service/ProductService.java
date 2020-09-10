package net.java.sprinboot.service;

import java.util.List;

import net.java.sprinboot.model.Product;

public interface ProductService {

	Product createProduct(Product product);
	Product updateProduct(Product product);
	List<Product> getAllProduct();
	Product getProductById(long productId);
	void deleteProduct(long productId);
	
}
