package controllers;


import java.util.*;
import db_system.*;
import containers.*;


public class Cart {
	
	public ArrayList<Item> cart = new ArrayList<Item>();
	
	public boolean addItemtoCart(Item e){
		cart.add(e);
		return false;
	}

	public boolean removeItemfromCart(){
		
		return false;
	}
	
	public boolean checkout(){
		
		return false;
	}
	
	public boolean emptyCart(){
		
		return false;
	}
}
