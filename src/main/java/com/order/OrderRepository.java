package com.order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	Order findFirstByOrderByOrderIdDesc();
	List<Order> findAllByCustomerId(String customerId);
	List<Order> findAllByStoreId(String storeId);
}
