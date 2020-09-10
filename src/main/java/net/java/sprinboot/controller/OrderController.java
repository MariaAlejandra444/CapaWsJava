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

import net.java.sprinboot.service.OrderService;
import net.java.sprinboot.model.Order;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService Orderservice;
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrder(){
		return ResponseEntity.ok().body(Orderservice.getAllOrder());
		
	}
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable long id){
		return ResponseEntity.ok().body(Orderservice.getOrderById(id));
		
	}
	
	@PostMapping("/orders")
	public ResponseEntity<Order> createOrder(@RequestBody Order order){
		return ResponseEntity.ok().body(this.Orderservice.createOrder(order));
	}
	
	@PutMapping("/orders/{id}")
	public ResponseEntity<Order> updateOrder(@PathVariable long id,Order order){
		order.setId(id);
		return ResponseEntity.ok().body(this.Orderservice.updateOrder(order));
		
	}
	
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<?> deleteOrder(@PathVariable long id){
		this.Orderservice.deleteOrder(id);
		return (ResponseEntity<?>) ResponseEntity.status(HttpStatus.OK);
		
	}

}
