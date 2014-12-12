package gp_system;

import java.awt.GridLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import containers.Item;
import controllers.Store;
import db_system.DBItem;

public class StorePanel extends JPanel{
	private ArrayList<Item> items;
	private ArrayList<ItemPanel> itemPanels;
	private Store mystore;
	public StorePanel(){
		this.mystore = new Store();
		
		this.items = new ArrayList<Item>();
		this.itemPanels = new ArrayList<ItemPanel>();
		
		mystore.getItems(items);
		
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
