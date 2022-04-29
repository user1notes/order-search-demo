package com.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

enum STATUS{
	PLACED, SHIPPED, CLOSED, CANCELED, REJECTED, RETURNED, REPLACED
}

@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer orderId;
	
	String storeId;
	String storeName;
	String cutomerName;
	String customerId;
	String customerEmail;
	float amount;
	Date orderDate = new Date();
	STATUS status;
	
	public Order() {
		
	}
		
	public Order(Integer orderId, String storeName, String cutomerName, String customerId, String customerEmail,
			float amount, Date orderDate, STATUS status) {
		this.orderId = orderId;
		this.storeName = storeName;
		this.cutomerName = cutomerName;
		this.customerId = customerId;
		this.customerEmail = customerEmail;
		this.amount = amount;
		this.orderDate = orderDate;
		this.status = status;
	}

	
	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getCutomerName() {
		return cutomerName;
	}
	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}

	
	
}
