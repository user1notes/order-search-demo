package com.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}

	public Order getOrder() {
		return orderRepository.findFirstByOrderByOrderIdDesc();
	}

	public Optional<Order> getOrderById(int id) {
		return orderRepository.findById(id);
	}

	public List<Order> getByCustomerId(String customerId) {
		return orderRepository.findAllByCustomerId(customerId);
	}

	public List<Order> getByStoreId(String storeId) {
		return orderRepository.findAllByStoreId(storeId);
	}
	
	

}
