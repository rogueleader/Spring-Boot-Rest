package org.cap.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="order_table")
public class Order {

	@Id
	@GeneratedValue
	private int orderId;
	private Date orderDate;
	private String item;
	private int quantity;
	private double price;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order(int orderId, Date orderDate, String item, int quantity, double price) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}

	public Order() {

	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", item=" + item + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}

}
