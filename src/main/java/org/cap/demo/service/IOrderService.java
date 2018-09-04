package org.cap.demo.service;

import java.util.List;

import org.cap.demo.model.Order;

public interface IOrderService {

	
	public List<Order> getAllOrder();

	public Order getOrder(Integer orderId);

	public Order updateOrder(Order order);

	

	
	
}
