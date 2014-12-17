package controllers;

import containers.Account;


public class AdminSession implements Session{


	@Override
	public boolean order() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean comment() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteComment() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createCart() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cart getcart() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Account getUser(){
		return null;
	}

	@Override
	public void setauthenticated(boolean auth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setaccount(Account a) {
		// TODO Auto-generated method stub
		
	}

}
