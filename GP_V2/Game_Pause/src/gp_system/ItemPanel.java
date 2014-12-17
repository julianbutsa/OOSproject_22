package gp_system;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import containers.Item;
import db_system.DBItem;

public class ItemPanel extends JPanel implements ActionListener{
	
	private Item item;
	
	private JLabel itemname;
	private JLabel itemprice;
	private JLabel stock;
	private JLabel piclabel;
	private JLabel rating;
	private JTextField rateTextBox;
	private JButton rateButton;
	private JButton cartButton;
	
	private MainView mv;
	
	//private String imagename;
	//private String name;
	//private double price;
	//private int stock;
	//private double rating;

	
	
	public ItemPanel(Item itemParameter, MainView a){
		this.mv = a;
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		this.setItem(itemParameter);
		this.itemname = new JLabel(getItem().getItemname());
		this.setLayout(new GridLayout(1,0));
		//this changes to different layout that seems better
		this.itemprice = new JLabel("Price: " + String.valueOf(getItem().getPrice()));
		this.stock = new JLabel("Num in stock: " + String.valueOf(getItem().getStock()));
		
		//this.rating = new JLabel(String.valueOf(getItem().getRating()));
		this.rating = new JLabel("Rating: " + String.valueOf(item.getRating()));	
		this.rateTextBox = new JTextField("Rating");
		this.rateButton = new JButton("Rate");
		rateButton.addActionListener(this);
		rateButton.setActionCommand("rate");
		
		this.cartButton = new JButton("Cart");
		cartButton.addActionListener(this);
		cartButton.setActionCommand("addtocart");
		/*
		piclabel = new JLabel (new ImageIcon(getItem().getImage()));

		piclabel.setPreferredSize(new Dimension(30,30));
		

		piclabel.setPreferredSize(new Dimension(30,30));
*/
		
		//playing around with GroupLayout, not working how I want it yet
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
					//.addComponent(piclabel)
					.addComponent(itemname)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(stock)
						.addComponent(rateTextBox))
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(rating)
						.addComponent(rateButton))
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(itemprice)
						.addComponent(cartButton))
				
		);
		
		layout.setVerticalGroup(
				layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						//.addComponent(piclabel)
						.addComponent(itemname)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(stock)
							.addComponent(rateTextBox))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(rating)
							.addComponent(rateButton))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(itemprice)
							.addComponent(cartButton)))
					
		);
		
		/*this.add(piclabel);
		this.add(itemname);
		this.add(itemprice);
		this.add(stock);
		this.add(rateTextBox);
		this.add(rateButton);
		this.add(cartButton);*/
	}

	
	public ItemPanel(){
		this.setItem(null);
		
		this.itemname = new JLabel("name");
		//this.setLayout(new GridLayout(3,1));
		this.itemprice = new JLabel("100");
		this.stock = new JLabel("1");
		//this.rating = new JLabel(String.valueOf(item.getRating()));	
		this.rateTextBox = new JTextField("",5);
		this.rateButton = new JButton("Rate");
		rateButton.addActionListener(this);
		rateButton.setActionCommand("rate");
		
		this.cartButton = new JButton("Cart");
		cartButton.addActionListener(this);
		cartButton.setActionCommand("cart");
		
		//this.piclabel = new JLabel ( new ImageIcon("./logo.jpg"));
		
		//this.add(piclabel);
		
		this.add(itemname);
		this.add(itemprice);
		this.add(stock);
		this.add(rateTextBox);
		this.add(rateButton);
		this.add(cartButton);
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand()){
			case "addtocart":
				this.mv.currentsession.getcart().addItemtoCart(this.item);
				break;
			case "rate" :
				//this.item.setRating((this.item.getRating() + (double) Double.parseDouble(this.rateTextBox.getText()) )/ this.item.getNumRating());
				//this.item.setRating(10.0);
				//this.rateTextBox = new JTextField(String.valueOf(this.item.getRating()));
				DBItem.updateRating(this.item.getItemname(), (double) Double.parseDouble(this.rateTextBox.getText()));
				
				break;
		}
		
	}


	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}
	
	

}
