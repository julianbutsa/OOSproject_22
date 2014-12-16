package controllers;

import gp_system.ItemPanel;

import java.util.ArrayList;

import containers.Account;


/* Client and Admin Session classes will implement this interface*/

public interface Session {
	public Account currentuser = null;
	public Cart usercart = new Cart();
	public boolean authenticated = false;;
	
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

	public Cart getcart();
	
	public void setauthenticated(boolean auth);
	public void setaccount(Account a);

	

}
