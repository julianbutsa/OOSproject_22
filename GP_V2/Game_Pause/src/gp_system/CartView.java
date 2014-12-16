package gp_system;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLDocument.Iterator;
import containers.Item;

public class CartView extends JPanel implements ActionListener{
	
	private ArrayList<ItemPanel> items;
	private JButton submitButton;
	
	public CartView(){

		this.setLayout(new GridLayout( 4,2));
		this.items = new ArrayList<ItemPanel>();
		this.submitButton = new JButton("submit");
		for(int i = 0; i < 6; i ++){
			ItemPanel temp = new ItemPanel();
			items.add(temp);
		}
		
		for (ItemPanel ip : items){
			this.add(ip);
		}
		this.add(submitButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
