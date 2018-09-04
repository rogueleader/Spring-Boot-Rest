package org.cap.demo.service;

import java.util.List;

import org.cap.demo.dao.IOrderDao;
import org.cap.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iorderservice")
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderDao orderdao;
	
	
	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderdao.getAllOrder();
	}
	
	public Order getOrder(Integer orderId) {
	
		
		return orderdao.findOrder(orderId);
		
		
	}

	@Override
	public Order updateOrder(Order order) {

		return orderdao.updateOrder(order);
		
	}

}
