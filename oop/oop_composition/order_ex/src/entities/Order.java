package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> itemsList = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : itemsList) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
