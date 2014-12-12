package gp_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.Store;


public class CreateAccountPanel extends JPanel implements ActionListener {
	public JLabel firstNameLabel, lastNameLabel, usernameLabel, emailLabel, confirmEmailLabel, 
           passwordLabel, confirmPasswordLabel, passwordReq, picLabel, phoneLabel;
	public JTextField firstNametf, lastNametf, usernametf, emailtf, confirmEmailtf, phonetf;
	public JPasswordField passwordtf, confirmPasswordtf;
	public JButton createAccountButton;
	
	public CreateAccountPanel(){
		this.setBackground(Color.WHITE);
		this.setLayout(new BorderLayout());
		
	  //  String path = "./logo.jpg";
	    
	   // picLabel = new JLabel(new ImageIcon(path));
	   // picLabel.setHorizontalAlignment(JLabel.CENTER);
	    
	   // this.add(picLabel);
		
		//create a panel for the labels and text fields
		GridLayout layout = new GridLayout(8,2);
		JPanel labelsTextPanel = new JPanel(layout);
		labelsTextPanel.setBackground(Color.WHITE);
		
		//create labels
		firstNameLabel = new JLabel("First Name:");
		lastNameLabel = new JLabel("Last Name:");
		usernameLabel = new JLabel("Username:");
		emailLabel = new JLabel("Email:");
		confirmEmailLabel = new JLabel("Confirm Email:");
		passwordLabel = new JLabel("Password:");
		confirmPasswordLabel = new JLabel("Confirm Password:");
		phoneLabel = new JLabel ("Phone Number");
		//create text fields
		firstNametf = new JTextField("", 30);
		lastNametf = new JTextField("", 30);
		usernametf = new JTextField("", 30);
		emailtf = new JTextField("", 30);
		confirmEmailtf = new JTextField("", 30);
		passwordtf = new JPasswordField("", 30);
		confirmPasswordtf = new JPasswordField("", 30);
		phonetf  = new JTextField("", 30);
		
		//add elements to panel
		labelsTextPanel.add(firstNameLabel);
		labelsTextPanel.add(firstNametf);
		labelsTextPanel.add(lastNameLabel);
		labelsTextPanel.add(lastNametf);
		labelsTextPanel.add(usernameLabel);
		labelsTextPanel.add(usernametf);
		labelsTextPanel.add(emailLabel);
		labelsTextPanel.add(emailtf);
		labelsTextPanel.add(confirmEmailLabel);
		labelsTextPanel.add(confirmEmailtf);
		labelsTextPanel.add(passwordLabel);
		labelsTextPanel.add(passwordtf);
		labelsTextPanel.add(confirmPasswordLabel);
		labelsTextPanel.add(confirmPasswordtf);
		labelsTextPanel.add(phoneLabel);
		labelsTextPanel.add(phonetf);
		
		//create a panel for the button and password requirements
		JPanel buttonPanel = new JPanel(new GridLayout(1,2));
		buttonPanel.setBackground(Color.WHITE);
		
		//create password info label and button
		passwordReq = new JLabel("*Password needs to be 8 to 30 characters\n*");
		createAccountButton = new JButton("Submit and Create Account");
		createAccountButton.addActionListener(this);
		createAccountButton.setActionCommand("register");
		//add elements to panel
		buttonPanel.add(passwordReq);
		buttonPanel.add(createAccountButton);
		
		
		//add elements to AccountPanel
		this.add(labelsTextPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		switch(arg0.getActionCommand()){
			case "register":
				Store.register(usernametf.getText(), emailtf.getText(), passwordtf.getText(), 
						firstNametf.getText(), lastNametf.getText(), phonetf.getText());
				
			break;
		}
		// TODO Auto-generated method stub
		
	}
}
