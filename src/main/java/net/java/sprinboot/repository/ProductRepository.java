package net.java.sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.sprinboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
