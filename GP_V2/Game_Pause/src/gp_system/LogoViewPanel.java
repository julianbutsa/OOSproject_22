package gp_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LogoViewPanel extends JPanel{

	public JLabel picLabel = new JLabel();
	public JPanel viewer = new JPanel(new BorderLayout());
	
	public JMenuBar mPanel = new JMenuBar();
	
	//test menu items
	public JMenuItem jm1 = new JMenuItem("Register");
	public JMenuItem jm2 = new JMenuItem("Log in");

	
	public LogoViewPanel() {

	this.setBackground(Color.white);
    this.setLayout(new BorderLayout());  
    
    viewer.setBackground(Color.white);
    
    String path = "./logo.jpg";
    
    picLabel = new JLabel(new ImageIcon(path));
    picLabel.setHorizontalAlignment(JLabel.CENTER);
    
    viewer.add(picLabel);
    
    this.add(viewer, BorderLayout.CENTER);
    
    mPanel.add(jm1);
    mPanel.add(jm2);
    
    this.add(mPanel, BorderLayout.SOUTH);

	}
}
