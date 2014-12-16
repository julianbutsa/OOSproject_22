package gp_system;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import containers.Account;
import controllers.ClientSession;
import controllers.Session;
import db_system.DBAccount;

public class MainView extends JFrame implements ActionListener{
	//private GamePauseView currentView;

	
	//private JPanel sidepanel;
	private LogoViewPanel bannerpanel;
	private ProfilePanel profilepanel;
	private ItemPanel itempanel;
	private StorePanel storepanel;
	private CreateAccountPanel registerpanel;
	private JFrame mainView;
	private CartView cart;

	public static Session currentsession = null;
	
	private JPanel currentPanel;
	//public static ActionListener MainActionListener;
	
	public MainView(){
		MainView.currentsession = new ClientSession();
		
		//this.mainView = new JFrame();
		this.setMainView(new JFrame());
		//this.currentuser = null;
		//set up the layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//set up the side panel
		//this.sidepanel = new SidePanel(this);
		c.gridy = 2;
		c.gridheight = 2;//GridBagConstraints.REMAINDER;
		//this.add(this.sidepanel,c );
		
		//set up the top panel. Banner with login / register
		this.bannerpanel = new LogoViewPanel(this);
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 10;
		c.gridwidth = 100;
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(this.bannerpanel,c );
		
		//Setting up the main Panel. THis will change as you navigate the site
		this.storepanel = new StorePanel(this);
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.REMAINDER;
		this.add(storepanel,c);
		this.currentPanel = this.storepanel;
		
		this.profilepanel = new ProfilePanel();
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.REMAINDER;
		this.add(profilepanel,c);
		
		profilepanel.setVisible(false);
		
		this.itempanel = new ItemPanel();
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.REMAINDER;
		this.add(itempanel, c);
		itempanel.setVisible(false);
		
		this.registerpanel = new CreateAccountPanel(this);
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.REMAINDER;
		this.add(registerpanel, c);
		registerpanel.setVisible(false);
		

		this.cart  = new CartView(this);
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.REMAINDER;
		this.add(cart, c);
		cart.setVisible(false);
		
		//set up action listener
		//action listening should probably be the controllers job.
		//MainView.MainActionListener = this;
	}

	public void register(GamePauseControllerV2 controller) {
		// TODO Auto-generated method stub
		
	}


	//action listening works if you hand this frame as an action listener to the panel with the button.
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand()){
			case "store":
				this.currentPanel.setVisible(false);
				this.currentPanel = this.storepanel;
				this.currentPanel.setVisible(true);
				break;		
			case "profile":
				this.currentPanel.setVisible(false);
				this.currentPanel = this.profilepanel;
				this.currentPanel.setVisible(true);
				break;
			case "register":
				this.currentPanel.setVisible(false);
				this.currentPanel = this.registerpanel;
				this.currentPanel.setVisible(true);
				break;
			case "registerSuccess":
				this.currentPanel.setVisible(false);
				this.currentPanel = this.storepanel;
				this.currentPanel.setVisible(true);
				break;	
				
			case "cart":
				this.cart  = new CartView(this);
				GridBagConstraints c = new GridBagConstraints();
				c.gridx = 2;
				c.gridy = 2;
				c.gridwidth = GridBagConstraints.REMAINDER;
				c.gridheight = GridBagConstraints.REMAINDER;
				this.add(cart, c);
				this.currentPanel.setVisible(false);
				this.currentPanel = this.cart;
				this.currentPanel.setVisible(true);
				break;
			
			case "login":
				Account a = new Account();
				if(DBAccount.login(a, bannerpanel.email.getText(), bannerpanel.password.getText() )){
					System.out.println("logged in");
					currentsession.setaccount(a);
					currentsession.setauthenticated(true);
					bannerpanel.email.setVisible(false);
					bannerpanel.password.setVisible(false);
					bannerpanel.logIn.setVisible(false);
					bannerpanel.logout.setVisible(true);
					bannerpanel.register.setVisible(false);
					bannerpanel.repaint();
				}
				break;
			case "logout":
				this.currentsession = new ClientSession();
				bannerpanel.email.setVisible(true);
				bannerpanel.email.setText("");
				bannerpanel.password.setVisible(true);
				bannerpanel.password.setText("");
				bannerpanel.logIn.setVisible(true);
				bannerpanel.logout.setVisible(false);
				bannerpanel.register.setVisible(true);
				bannerpanel.repaint();
				break;
			
		}
	}

	public JFrame getMainView() {
		return mainView;
	}

	public void setMainView(JFrame mainView) {
		this.mainView = mainView;
	}

}
