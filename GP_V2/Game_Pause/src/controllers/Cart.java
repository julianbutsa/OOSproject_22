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
		for(int i = 0; i<cart.size(); i++){
			cart.remove(i);
		}
		
		return false;
	}
	
	public boolean checkout(){
	
		return false;
	}
	
	public boolean emptyCart(){
		for(int i = cart.size()-1; i>=0; i--){
			cart.remove(i);
		}
		
		return false;
	}
}
