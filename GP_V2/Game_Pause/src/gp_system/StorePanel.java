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
	private Store myStore;
	private ArrayList<Item> items;
	private ArrayList<ItemPanel> itemPanels;
	
	public StorePanel(){
		myStore = new Store();
		myStore.getItems(items);
		
		this.setLayout(new GridLayout( 4,2));
		
		this.items = new ArrayList<Item>();
		this.itemPanels = new ArrayList<ItemPanel>();
		
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
