package db_system;

import java.sql.SQLException;
import java.util.*;

import containers.*;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Item> itemlist = new ArrayList<Item>();
		
		DBItem dbitem = new DBItem();

		try {
			dbitem.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dbitem.itemSearch(itemlist);
		
		for( int i = 0; i<itemlist.size(); i++){
			System.out.println("======Num: = " + i +"======");
			System.out.println(itemlist.get(i).getItemname());
			System.out.println(itemlist.get(i).getManufacturer());
			System.out.println(itemlist.get(i).getPlatform());
			System.out.println(itemlist.get(i).getStock());
			System.out.println(itemlist.get(i).getPrice());
			System.out.println(itemlist.get(i).getImage());
			System.out.println("=====================");
		}
		
		ArrayList<Item> nop = new ArrayList<Item>();
		
		nop = itemlist;
		
		//System.out.println(nop.get(0).getItemname());

		
		
		

	}

}
