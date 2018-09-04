package org.cap.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.cap.demo.model.Order;
import org.springframework.stereotype.Repository;

@Repository("IOrderDao")
public class OrderDaoImpl implements IOrderDao{
	
	private static AtomicInteger orderNo = new AtomicInteger(1000);
	private static List<Order> orders = dummyDb();
	
	
	private static List<Order> dummyDb(){
		
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(orderNo.incrementAndGet(),new Date(),"Samsung TV",1,50000.0));
		orders.add(new Order(orderNo.incrementAndGet(),new Date(),"Sony TV",2,70000.0));

		return orders;
		
	}
	
	@Override
	public List<Order> getAllOrder() {

		return orders;
	}

	@Override
	public Order findOrder(Integer orderId) {
		
		for (Order order : orders) {
			
			if(orderId==order.getOrderId())
			{
				
				return order;
			}
		}
		
		return null;
		
	}

	@Override
	public Order updateOrder(Order order) {

		return null;
	}

}
