package gp_system;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class StorePanel extends JPanel{
	private ArrayList<ItemPanel> items;
	
	public StorePanel(){
		this.setLayout(new GridLayout( 4,2));
		this.items = new ArrayList<ItemPanel>();
		for(int i = 0; i < 6; i ++){
			ItemPanel temp = new ItemPanel();
			items.add(temp);
		}
		
		for (ItemPanel ip : items){
			this.add(ip);
		}
		
	}
}
