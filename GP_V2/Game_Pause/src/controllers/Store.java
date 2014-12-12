package controllers;

import db_system.*;
import containers.*;

import java.sql.SQLException;
import java.util.*;


public class Store {
	
	public static boolean displayRandomItems(ArrayList<Item> itemlist){
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
		DBAccount account = new DBAccount();
		
		
		return false;
	}
	
	public static boolean login(){
		return false;
	}

	public static void main(String[] args) {
		Store store = new Store();
		ArrayList<Item> ilist = new ArrayList<Item>();
		Store.displayRandomItems(ilist);
		for(int i = 0; i<ilist.size(); i++){
			System.out.println(ilist.get(i).getItemname());
		}
		
	}
	
}
