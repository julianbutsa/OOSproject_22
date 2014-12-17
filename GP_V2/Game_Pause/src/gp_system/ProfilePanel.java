package gp_system;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import containers.Account;


public class ProfilePanel extends JPanel {
	public JLabel accountIDLabel, nameLabel, usernameLabel, phoneNumberLabel, emailLabel, billingInfoLabel, shippingInfoLabel,
	              accountID, name, username, phoneNumber, email, billingInfo, shippingInfo;
	public JButton editProfile;
	//public Account testAccount = new Account();
	private MainView mv;
	private Account user;
	
	public ProfilePanel(MainView main) {
		this.mv = main;
		this.setBackground(Color.WHITE);
		if(this.mv.currentsession.getUser() != null){
		user = this.mv.currentsession.getUser();
		
		GridLayout layout = new GridLayout(8,2);
		this.setLayout(layout);
		
		accountIDLabel = new JLabel("Account ID:");
		nameLabel = new JLabel("Name:");
		usernameLabel = new JLabel("Username:");
		phoneNumberLabel = new JLabel("Phone Number:");
		emailLabel = new JLabel("Email:");
		billingInfoLabel = new JLabel("Billing Info:");
		shippingInfoLabel = new JLabel("Shipping Info:");
		
		accountID = new JLabel(String.valueOf(user.getAccountid()));
		name = new JLabel(String.valueOf(user.getFirstname()) + " " + String.valueOf(user.getLastname()));
		username = new JLabel(String.valueOf(user.getUsername()));
		phoneNumber = new JLabel(String.valueOf(user.getPhonenumber()));
		email = new JLabel(String.valueOf(user.getEmail()));
		//billingInfo = new JLabel(String.valueOf(user.getBillinginfo().getStreet()) + "  " + String.valueOf(user.getBillinginfo().getState()) +" " +String.valueOf(user.getBillinginfo().getZip()));
		//shippingInfo = new JLabel(String.valueOf(user.getShippinginfo().getStreet()) + "  " + String.valueOf(user.getShippinginfo().getState()) +" " +String.valueOf(user.getShippinginfo().getZip()));
		
		this.add(accountIDLabel);
		this.add(accountID);
		this.add(nameLabel);
		this.add(name);
		this.add(usernameLabel);
		this.add(username);
		this.add(phoneNumberLabel);
		this.add(phoneNumber);
		this.add(emailLabel);
		this.add(email);
		//this.add(billingInfoLabel);
		//this.add(billingInfo);
		//this.add(shippingInfoLabel);
		//this.add(shippingInfo);
		
		editProfile = new JButton("Edit Profile");
		this.add(editProfile);
		}
	}

}
