package gp_system;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;


public class SidePanel extends JPanel{
	private JLabel sidelabel;
	private JButton storeButton;
	
	
	public SidePanel(){
		this.setLayout(new GridLayout(10,1));
		
		
		
		
		this.setPreferredSize(new Dimension(100, 10000));
		
		//this just tells us what this panel is and how much space it takes
		//we'll take this out later
		this.sidelabel = new JLabel("this is the menu");
		this.add(sidelabel);
		this.setBackground(Color.GREEN);
		
		//set up the button
		//we're adding the listener from the MainView, referring to it statically
		this.storeButton = new JButton("Store");
		storeButton.addActionListener(MainView.MainActionListener);
		storeButton.setActionCommand("changepanels");
		this.add(storeButton);
	}
	

}
