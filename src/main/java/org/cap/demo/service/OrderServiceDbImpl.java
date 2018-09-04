package org.cap.demo.service;

import java.util.List;

import org.cap.demo.dao.IOrderDao;
import org.cap.demo.dao.IOrderDbDao;
import org.cap.demo.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iorderservice")
public class OrderServiceDbImpl implements IOrderService {

	@Autowired
	private IOrderDbDao orderdbdao;
	
	
	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderdbdao.findAll();
	}


	@Override
	public Order getOrder(Integer orderId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
