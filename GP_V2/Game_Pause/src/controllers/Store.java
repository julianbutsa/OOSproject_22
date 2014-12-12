package controllers;

import db_system.*;
import containers.*;

import java.sql.SQLException;
import java.util.*;


public class Store {
	
	public static boolean getItems(ArrayList<Item> itemlist){
		DBItem items = new DBItem();
		//ArrayList<Item> itemlist = new ArrayList<Item>();
		try {
			items.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		items.itemSearch(itemlist);
		
		return true;
	}
	
	public static boolean register(){
		
		
		
		return false;
	}
	
	public static boolean login(){
		
		return false;
	}
	
}
