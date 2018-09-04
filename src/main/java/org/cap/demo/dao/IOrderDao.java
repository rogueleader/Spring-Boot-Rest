package org.cap.demo.dao;

import java.util.List;

import org.cap.demo.model.Order;

public interface IOrderDao {
	
	public List<Order> getAllOrder();

	public Order findOrder(Integer orderId);

	public Order updateOrder(Order order);

}
