package net.java.sprinboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.java.sprinboot.exception.ResourceNotFoundException;
import net.java.sprinboot.model.Order;
import net.java.sprinboot.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		Optional<Order> orderDb = this.orderRepository.findById(order.getId());
		
		if(orderDb.isPresent()) {
		Order orderUpdate = orderDb.get();
		
		orderUpdate.setId(order.getId());
		orderUpdate.setId_order(order.getId_order());
		orderUpdate.setId_ref(order.getId_ref());
		orderUpdate.setCustomer_name(order.getCustomer_name());
		orderUpdate.setPrice(order.getPrice());
		orderRepository.save(orderUpdate);
		return orderUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: "+ order.getId());
		}
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return this.orderRepository.findAll();
	}

	@Override
	public Order getOrderById(long orderId) {
		Optional<Order> orderDb = this.orderRepository.findById(orderId);
		// TODO Auto-generated method stub
		if(orderDb.isPresent()) {
			return orderDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id: "+ orderId);
		}
	}

	@Override
	public void deleteOrder(long orderId) {
		Optional<Order> orderDb = this.orderRepository.findById(orderId);
		if(orderDb.isPresent()) {
			this.orderRepository.delete(orderDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: "+ orderId);
		}
		// TODO Auto-generated method stub
		
	}


	
}
