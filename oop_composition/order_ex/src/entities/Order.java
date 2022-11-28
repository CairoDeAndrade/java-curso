package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDate moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> itemsList = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(LocalDate moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public OrderStatus getStatus() {
		return status;
	}

	public void addItem(OrderItem item) {
		itemsList.add(item);
	}
	
	public void removeItem(OrderItem item) {
		itemsList.remove(item);
	}
	
	public Double total() {
		double sum = 0.0;
		for (OrderItem item : itemsList) {
			sum += item.getQuantity() * item.getProduct().getPrice();
		}
		return sum;
	}
}
