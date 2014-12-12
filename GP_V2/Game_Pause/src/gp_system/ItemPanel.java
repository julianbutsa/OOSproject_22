package gp_system;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import containers.Item;

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
	
	
	
	//private String imagename;
	//private String name;
	//private double price;
	//private int stock;
	//private double rating;

	
	
	public ItemPanel(Item itemParameter){
		this.item = itemParameter;
		this.itemname = new JLabel(item.getItemname());
		//this.setLayout(new GridLayout(3,1));
		this.itemprice = new JLabel(String.valueOf(item.getPrice()));
		this.stock = new JLabel(String.valueOf(item.getStock()));
		//this.rating = new JLabel(String.valueOf(item.getRating()));	
		this.rateTextBox = new JTextField();
		this.rateButton = new JButton("Rate");
		rateButton.addActionListener(this);
		rateButton.setActionCommand("rate");
		
		this.cartButton = new JButton("Cart");
		cartButton.addActionListener(this);
		cartButton.setActionCommand("cart");
		
		piclabel = new JLabel (new ImageIcon(item.getImage()));
		piclabel.setPreferredSize(new Dimension(30,30));
		
		this.add(piclabel);
		this.add(itemname);
		this.add(itemprice);
		this.add(stock);
		this.add(rateTextBox);
		this.add(rateButton);
		this.add(cartButton);
	}

	
	public ItemPanel(){
		this.item = null;
		
		this.itemname = new JLabel("name");
		//this.setLayout(new GridLayout(3,1));
		this.itemprice = new JLabel("100");
		this.stock = new JLabel("1");
		//this.rating = new JLabel(String.valueOf(item.getRating()));	
		this.rateTextBox = new JTextField();
		this.rateButton = new JButton("Rate");
		rateButton.addActionListener(this);
		rateButton.setActionCommand("rate");
		
		this.cartButton = new JButton("Cart");
		cartButton.addActionListener(this);
		cartButton.setActionCommand("cart");
		
		this.piclabel = new JLabel ( new ImageIcon("./logo.jpg"));
		
		this.add(piclabel);
		
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
		
	}
	
	

}
