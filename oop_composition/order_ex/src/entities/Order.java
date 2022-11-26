package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orderList = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}
	
	public void addItem(OrderItem item) {
		orderList.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderList.remove(item);
	}
	
	public Double total(List<OrderItem> orderList){
		Double total = 0.0;
		for (OrderItem item : orderList) {
			total += item.getPrice();
		}
		return total;
	}
}








