package javatraining.javacollectionsandsortingexercise;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order {
	private long id;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private String status;
	private long custId;
	private Customer customer;
	private List<Product> products;
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Order(long id, LocalDate orderDate, LocalDate deliveryDate, String status, long  custId) {
		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
		this.custId= custId;
		
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", status=" + status
				+ ", custId=" + custId + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(custId, customer, deliveryDate, id, orderDate, products, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return custId == other.custId && Objects.equals(customer, other.customer)
				&& Objects.equals(deliveryDate, other.deliveryDate) && id == other.id
				&& Objects.equals(orderDate, other.orderDate) && Objects.equals(products, other.products)
				&& Objects.equals(status, other.status);
	}
	
	
	

}
