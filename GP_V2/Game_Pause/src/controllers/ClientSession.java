package controllers;

import gp_system.ItemPanel;

import java.util.ArrayList;

import containers.Account;
import containers.Item;


public class ClientSession implements Session{

	public Account currentuser;
	public Cart usercart;
	public boolean authenticated;

	
	public ClientSession(){
		this.currentuser = null;
		this.usercart = new Cart();
		this.authenticated = false;
		
	}
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
	public Cart getcart(){
		return usercart;
	}
	@Override
	public void setauthenticated(boolean auth) {
		// TODO Auto-generated method stub
		this.authenticated=auth;
		
	}
	@Override
	public void setaccount(Account a) {
		// TODO Auto-generated method stub
		this.currentuser=a;
		
	}

}
