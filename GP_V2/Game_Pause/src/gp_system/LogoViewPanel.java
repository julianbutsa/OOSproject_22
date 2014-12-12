package gp_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
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

public class LogoViewPanel extends JPanel implements ActionListener{

	public JLabel picLabel = new JLabel();
	public JPanel viewer = new JPanel(new BorderLayout());
	
	public JMenuBar mPanel = new JMenuBar();
	
	//test menu items
	public JButton registerbutton = new JButton("Register");
	public JButton loginbutton = new JButton("Log in");

<<<<<<< HEAD
	public JButton register = new JButton("Register");
	public JButton logIn = new JButton("Log in");
	public JButton store = new JButton("Store");
=======
>>>>>>> origin/master
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
<<<<<<< HEAD
    
    register.addActionListener(a);
    register.setActionCommand("register");

 
    logIn.addActionListener(a);
    logIn.setActionCommand("login");

    store.addActionListener(a);
    store.setActionCommand("store");
    
  
    register.setAlignmentX(RIGHT_ALIGNMENT);
=======
    
    registerbutton.addActionListener(a);
    registerbutton.setActionCommand("register");
    
  
    registerbutton.setAlignmentX(RIGHT_ALIGNMENT);
>>>>>>> origin/master
    mPanel.add(Box.createHorizontalGlue());
    //mPanel.add
    mPanel.add(store);
    mPanel.add(email);
    mPanel.add(password);
<<<<<<< HEAD
    mPanel.add(logIn);
    
    mPanel.add(register);

=======
    mPanel.add(loginbutton);   
    mPanel.add(registerbutton);
>>>>>>> origin/master
    
    this.add(mPanel, BorderLayout.SOUTH);
    
    
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
