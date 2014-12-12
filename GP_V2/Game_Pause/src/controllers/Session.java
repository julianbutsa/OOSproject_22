package controllers;


/* Client and Admin Session classes will implement this interface*/

public interface Session {
	

	
	//Account stuff
	public boolean createAccount();
	public boolean login();
	public boolean logout();
	public boolean updateAccount();
	
	//Order Checkout Cart
	public boolean order();
	public boolean checkout();
	public boolean createCart();
	
	//Comment
	public boolean comment();
	public boolean deleteComment();

}
