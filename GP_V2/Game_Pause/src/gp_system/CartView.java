package gp_system;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.html.HTMLDocument.Iterator;

import containers.Item;
import controllers.Store;

public class CartView extends JPanel implements ActionListener{
	
	private ArrayList<ItemPanel> items;
	private JButton submitButton;
	private MainView mv;
	
	public CartView(MainView mainView){

		this.mv = mainView;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		this.items = new ArrayList<ItemPanel>();
		this.submitButton = new JButton("submit");
		
		for(Item i : mv.currentsession.getcart().cart){
			this.items.add( new ItemPanel(i, mv));
		}
		
		for (ItemPanel ip : items){
			//ip.setVisible(true);
			//ip.setPreferredSize(new Dimension(Panel.WIDTH, 50));
			this.add(ip);
			
		}
		this.add(submitButton);
		submitButton.addActionListener(this);
		submitButton.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()){
		case "submit":
			this.mv.currentsession.getcart().emptyCart();
			this.revalidate();
			this.repaint();
		break;
	}
	}
	
	
	public void update(){
		for(Item i : mv.currentsession.getcart().cart){
			this.items.add( new ItemPanel(i, mv));
		}
		
		for (ItemPanel ip : items){
			//ip.setVisible(true);
			if(!items.contains(ip))
				this.add(ip);
			
		}
	}

}
