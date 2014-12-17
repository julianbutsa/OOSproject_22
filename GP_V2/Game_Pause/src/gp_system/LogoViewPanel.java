package gp_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.Session;

public class LogoViewPanel extends JPanel implements ActionListener{

	public JLabel picLabel = new JLabel();
	public JPanel viewer = new JPanel(new BorderLayout());

	public JMenuBar mPanel = new JMenuBar();

	//test menu items


	public JButton register = new JButton("Register");
	public JButton logIn = new JButton("Log in");
	public JButton logout = new JButton("logout");
	public JButton store = new JButton("Store");
	public JButton cart = new JButton("Cart");
	public JButton profile = new JButton("Profile");

	public JTextField password = new JTextField("password");
	public JTextField email = new JTextField("email");

	public MainView mainFrame;
	public LogoViewPanel(MainView a) {

		this.mainFrame = a;
		this.setBackground(Color.white);
		this.setLayout(new BorderLayout());  

		viewer.setBackground(Color.white);

		String path = "./logo.jpg";

		picLabel = new JLabel(new ImageIcon(path));
		picLabel.setHorizontalAlignment(JLabel.CENTER);


		viewer.add(picLabel);

		this.add(viewer, BorderLayout.CENTER);


		register.addActionListener(a);
		register.setActionCommand("register");


		logIn.addActionListener(a);
		logIn.setActionCommand("login");

		logout.addActionListener(a);
		logout.setActionCommand("logout");
		
		store.addActionListener(a);
		store.setActionCommand("store");
		
		cart.addActionListener(a);
		cart.setActionCommand("cart");
		
		profile.addActionListener(a);
		profile.setActionCommand("profile");


		register.setAlignmentX(RIGHT_ALIGNMENT);



		password.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				password.setText("");
			}
		});
		
		email.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				email.setText("");
			}
		});



		mPanel.add(Box.createHorizontalGlue());
		//mPanel.add
		mPanel.add(store);
		mPanel.add(email);
		mPanel.add(password);
		mPanel.add(logIn);
		mPanel.add(register);
		mPanel.add(cart);
		mPanel.add(logout);
		mPanel.add(profile);
		logout.setVisible(false);
		profile.setVisible(false);
		this.add(mPanel, BorderLayout.SOUTH);
		this.add(mPanel, BorderLayout.SOUTH);

	}




	public String getusername(){
		return this.email.getText();
	}
	
	public String getpassword(){
		return this.password.getText();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
