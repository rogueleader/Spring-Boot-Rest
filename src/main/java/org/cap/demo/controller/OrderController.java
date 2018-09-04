package org.cap.demo.controller;

import java.util.List;

import org.cap.demo.model.Order;
import org.cap.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class OrderController {

	@Autowired
	private IOrderService orderService;
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrders(){
	
		List<Order> orders = orderService.getAllOrder();
		
		if (orders.isEmpty() || orders==null)
		{
			
			return new ResponseEntity("Sorry, Not Found",HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Order>>(orders,HttpStatus.OK);
		
	}
	
	@GetMapping("/order/{orderId}")
	public ResponseEntity<Order> getOrder(@PathVariable("orderId") Integer orderId){
		
		Order order = orderService.getOrder(orderId);
		
		if ( order==null)
		{
			
			return new ResponseEntity("Sorry, Not Found",HttpStatus.NOT_FOUND);
		}
				
		return new ResponseEntity<Order>(order,HttpStatus.OK);
		
		
	}
	
	@PutMapping("/order/{orderId}")
	public ResponseEntity<Order> updateUser(@PathVariable String orderId, @RequestBody Order order) {
		
		orderService.updateOrder(order);
		
		return new ResponseEntity<Order>(HttpStatus.OK);
		
		
		
	}
	
	
	
}
