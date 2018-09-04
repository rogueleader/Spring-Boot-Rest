package org.cap.demo.controller;

import java.util.List;

import org.cap.demo.model.Order;
import org.cap.demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class OrderDbController {

	@Autowired
	private IOrderService orderDbservice;
	

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrders(){
	
		List<Order> orders = orderDbservice.getAllOrder();
		
		if (orders.isEmpty() || orders==null)
		{
			
			return new ResponseEntity("Sorry, Not Found",HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<Order>>(orders,HttpStatus.OK);
		
	}
	
}
