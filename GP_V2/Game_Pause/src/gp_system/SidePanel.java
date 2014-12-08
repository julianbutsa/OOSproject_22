package gp_system;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SidePanel extends JPanel {
	private JLabel sidelabel;
	private JButton storeButton;
	private ActionListener MainActionListener;
	
	public SidePanel(ActionListener MAL){
		this.MainActionListener = MAL;
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
		storeButton.addActionListener(this.MainActionListener);
		storeButton.setActionCommand("changepanels");
		this.add(storeButton);
	}



}
