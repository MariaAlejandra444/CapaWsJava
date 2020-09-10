package net.java.sprinboot.service;

import java.util.List;

import net.java.sprinboot.model.Order;

public interface OrderService {

	Order createOrder(Order order);
	Order updateOrder(Order order);
	List<Order> getAllOrder();
	Order getOrderById(long orderId);
	void deleteOrder(long ordertId);
	
}
