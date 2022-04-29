package com.order;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping
	void saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
	}
	
	@GetMapping("/{id}")
	Optional<Order> getOrderById(@PathVariable int id){
		return orderService.getOrderById(id);
	}
	
	@GetMapping("/latest")
	Order getLatestOrder() {
		return orderService.getOrder();
	}
	
	@GetMapping("/customer/{customerId}")
	List<Order> findByCustomerId(@PathVariable String customerId){
		return orderService.getByCustomerId(customerId);
	}
	
	@GetMapping("store/{storeId}")
	List<Order> findByStoreId(@PathVariable String storeId){
		return orderService.getByStoreId(storeId);
	}
	
}
