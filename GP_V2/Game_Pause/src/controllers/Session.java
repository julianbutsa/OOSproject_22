package controllers;


/* Client and Admin Session classes will implement this interface*/

public interface Session {
	

	
	//Account stuff
	//1-thinking of deleting createAccount() store class does that to register a user
	//2-thinking of removing  login as well 
	//3-thinking of removing logout as well because of the session
	public boolean updateAccount();
	
	//Order Checkout Cart
	public boolean createCart();
	public boolean order();
	public boolean checkout();
	
	
	//Comment
	public boolean comment();
	public boolean deleteComment();

	

}
