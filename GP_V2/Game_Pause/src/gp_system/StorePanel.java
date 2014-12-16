package gp_system;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import containers.Item;
import controllers.Store;
import db_system.DBItem;

public class StorePanel extends JPanel{
	private Store myStore;
	private ArrayList<Item> items;
	private ArrayList<ItemPanel> itemPanels;

	
	public StorePanel(MainView a){
		myStore = new Store();

		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.items = new ArrayList<Item>();
		this.itemPanels = new ArrayList<ItemPanel>();
		myStore.getItems(items);
		Iterator<Item> i = items.iterator();
		while(i.hasNext()){
			ItemPanel temp = new ItemPanel(i.next(), a);
			itemPanels.add(temp);
		}
		
		for (ItemPanel ip : itemPanels){
			ip.setPreferredSize(new Dimension(Panel.WIDTH, 50));
			this.add(ip);
		}
		
	}
}
