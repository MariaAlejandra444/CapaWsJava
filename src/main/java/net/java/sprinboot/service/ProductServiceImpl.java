package net.java.sprinboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.java.sprinboot.exception.ResourceNotFoundException;
import net.java.sprinboot.model.Product;
import net.java.sprinboot.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
Optional<Product> productDb = this.productRepository.findById(product.getId());
		
		if(productDb.isPresent()) {
		Product productUpdate = productDb.get();
		productUpdate.setId(product.getId());
		productUpdate.setName(product.getName());
		productUpdate.setDescription(product.getDescription());
		productRepository.save(productUpdate);
		return productUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: "+ product.getId());
		}
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductById(long productId) {
		Optional<Product> productDb = this.productRepository.findById(productId);
		// TODO Auto-generated method stub
		if(productDb.isPresent()) {
			return productDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id: "+ productId);
		}
	}

	@Override
	public void deleteProduct(long productId) {
		Optional<Product> productDb = this.productRepository.findById(productId);
		if(productDb.isPresent()) {
			this.productRepository.delete(productDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: "+ productId);
		}
		// TODO Auto-generated method stub
		
	}


	
}
