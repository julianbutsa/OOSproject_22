package gp_system;

import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import containers.Item;
import db_system.DBItem;

public class StorePanel extends JPanel{
	private ArrayList<Item> items;
	private ArrayList<ItemPanel> itemPanels;
	
	public StorePanel(){
		DBItem d = new DBItem();
		try {
			d.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setLayout(new GridLayout( 4,2));
		
		this.items = new ArrayList<Item>();
		this.itemPanels = new ArrayList<ItemPanel>();
		
		if(d.itemSearch(items)){
			
			System.out.println("yay");
		}else{
			throw new RuntimeException ("failed to get items");
		}
		/*
		d.itemSearch(items);
		for(int i =0; i<items.size(); i++){
			System.out.println(items.get(i));
			
		}
		*/
		Iterator<Item> i = items.iterator();
		while(i.hasNext()){
			ItemPanel temp = new ItemPanel(i.next());
			itemPanels.add(temp);
		}
		
		for (ItemPanel ip : itemPanels){
			this.add(ip);
		}
		
	}
}
