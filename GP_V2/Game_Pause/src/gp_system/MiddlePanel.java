package gp_system;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiddlePanel extends JPanel{
	//yes
	private JLabel middlelabel;
	
	public MiddlePanel(){
		this.middlelabel = new JLabel("This is the middle");
		this.add(middlelabel);
		this.setBackground(Color. blue);
	}
}
