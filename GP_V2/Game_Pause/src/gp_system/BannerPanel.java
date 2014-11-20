package gp_system;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BannerPanel extends JPanel{
	private JLabel panelLabel;
	private JLabel picLabel = new JLabel();
	
	
	public BannerPanel(){
		this.panelLabel = new JLabel("This is the banner");
		this.add(this.panelLabel);
		
		
		
		 String path = "./logo.jpg";
		    
		    picLabel = new JLabel(new ImageIcon(path));
		    picLabel.setHorizontalAlignment(JLabel.CENTER);
		    
		    this.add(picLabel);
	}
}
