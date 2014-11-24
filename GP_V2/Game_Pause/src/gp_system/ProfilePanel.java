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
	public Account testAccount = new Account();
	
	public ProfilePanel() {
		this.setBackground(Color.WHITE);
		
		GridLayout layout = new GridLayout(8,2);
		this.setLayout(layout);
		
		accountIDLabel = new JLabel("Account ID:");
		nameLabel = new JLabel("Name:");
		usernameLabel = new JLabel("Username:");
		phoneNumberLabel = new JLabel("Phone Number:");
		emailLabel = new JLabel("Email:");
		billingInfoLabel = new JLabel("Billing Info:");
		shippingInfoLabel = new JLabel("Shipping Info:");
		
		accountID = new JLabel(""+testAccount.getAccountid());
		name = new JLabel(testAccount.getFirstname() + " " + testAccount.getLastname());
		username = new JLabel(testAccount.getUsername());
		phoneNumber = new JLabel(testAccount.getPhonenumber());
		email = new JLabel(testAccount.getEmail());
		billingInfo = new JLabel(testAccount.getBillinginfo().getStreet() + " " + testAccount.getBillinginfo().getState() + " " + testAccount.getBillinginfo().getZip());
		shippingInfo = new JLabel(testAccount.getShippinginfo().getStreet() + " " + testAccount.getShippinginfo().getState() + " " + testAccount.getShippinginfo().getZip());
		
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
		this.add(billingInfoLabel);
		this.add(billingInfo);
		this.add(shippingInfoLabel);
		this.add(shippingInfo);
		
		editProfile = new JButton("Edit Profile");
		this.add(editProfile);

	}

}
