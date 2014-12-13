package controllers;

import db_system.*;
import containers.*;

import java.sql.SQLException;
import java.util.*;


public class Store {
	
	//Global variables for the session:
	public static int accountIDSession;
	public static int accountType;
	public static Session session;
	
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
	
	public static boolean login(String unameoemail, String password){
		//depending on what type of user
		//choose the session from Client or Admin
		DBAccount account = new DBAccount();
		Account acc = new Account();
		boolean flag;
		//connect
		try {
			account.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		flag = account.login(acc, unameoemail, password);
		accountIDSession = acc.getAccountid();
		accountType = acc.getAdmin();
		
		if(accountType == 0){
		  session = new AdminSession();
		} else {
			session = new ClientSession();
		}
		
		return flag;
	}
	
	public static int getSessionID(){
		return accountIDSession;
	}
	public static int getAccType(){
		return accountType;
	}
	
	//for testing purposes
	public static void main(String[] args){
		Store store = new Store();
		boolean flag = store.login("admin@gmail.com","admin");
		if(flag == true){
			System.out.println("Valid Account"+flag);
		}
		if(flag == false){
			System.out.println("Invalid Account"+flag);
			return;
		}
		
		System.out.println("Session ID = "+store.getSessionID());
		System.out.println("Admin or Client? = "+store.getAccType());
	}

	
}
