package gp_system;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CartView extends JFrame implements ActionListener{
	
	GridLayout layout = new GridLayout(6,2);
	JPanel labelsTextPanel = new JPanel(layout);
	//labelsTextPanel.setBackground(Color.WHITE);
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
