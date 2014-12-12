package gp_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogoViewPanel extends JPanel{

	public JLabel picLabel = new JLabel();
	public JPanel viewer = new JPanel(new BorderLayout());
	
	public JMenuBar mPanel = new JMenuBar();
	
	//test menu items
	public JButton jm1 = new JButton("Register");
	public JButton jm2 = new JButton("Log in");
	public JTextField password = new JTextField("password");
	public JTextField email = new JTextField("email");
	
	
	public LogoViewPanel(ActionListener a) {

	this.setBackground(Color.white);
    this.setLayout(new BorderLayout());  
    
    viewer.setBackground(Color.white);
    
    String path = "./logo.jpg";
    
    picLabel = new JLabel(new ImageIcon(path));
    picLabel.setHorizontalAlignment(JLabel.CENTER);
    
    viewer.add(picLabel);
    
    this.add(viewer, BorderLayout.CENTER);
    
    jm1.addActionListener(a);
    jm1.setActionCommand("register");
    
  
    jm1.setAlignmentX(RIGHT_ALIGNMENT);
    mPanel.add(Box.createHorizontalGlue());
    //mPanel.add
    mPanel.add(email);
    mPanel.add(password);
    mPanel.add(jm2);
    
    mPanel.add(jm1);
    
    this.add(mPanel, BorderLayout.SOUTH);
    
    
	}
}
