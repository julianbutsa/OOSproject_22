package controllers;

import db_system.*;
import containers.*;

import java.sql.SQLException;
import java.util.*;


public class Store {
	
	//Global variables for the session:
	public static int accountIDSession;
	
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
	
	public static boolean register(String username, String email, String password, 
			String firstname, String lastname, String phonenumber){
		//create account
		DBAccount account = new DBAccount();
		try {
			account.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return account.createAccount(username, email, password, firstname, lastname, phonenumber, 0);
	}
	
	public static boolean login(String username, String email, String password){
		//depending on what type of user
		//choose the session from Client or Admin
		DBAccount account = new DBAccount();
		
		
		
		return false;
	}

	
}
