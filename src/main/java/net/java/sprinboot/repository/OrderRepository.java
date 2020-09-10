package net.java.sprinboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.sprinboot.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
