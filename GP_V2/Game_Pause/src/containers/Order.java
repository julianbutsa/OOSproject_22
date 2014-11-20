package containers;

import java.util.ArrayList;

public class Order {
	private int orderid;
	private String tmeoforder;
	private boolean completed;
	private ArrayList<OrderItem> cart;
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getTmeoforder() {
		return tmeoforder;
	}
	public void setTmeoforder(String tmeoforder) {
		this.tmeoforder = tmeoforder;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public ArrayList<OrderItem> getCart() {
		return cart;
	}
	
	public void additem(OrderItem i){
		this.cart.add(i);
	}
	
	

}
