package gp_system;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemPanel extends JPanel{
	
	private JLabel itemname;
	private JLabel itemprice;
	
	public ItemPanel(){
		this.setLayout(new GridLayout(3,1));
		this.itemname = new JLabel("item name goes here");
		this.itemprice = new JLabel("$1,000,000.00");
		this.setPreferredSize(new Dimension(200,200));
		
		this.add(itemname);
		this.add(itemprice);
	}

}
