package gp_system;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame implements ActionListener{
	//private GamePauseView currentView;
	private JPanel sidepanel;
	private JPanel bannerpanel;
	private JPanel middlepanel;
	
	private JPanel storepanel;
	private JPanel testpanel = new ProfilePanel();
	
	private JFrame mainView;

	public static ActionListener MainActionListener;
	
	public MainView(){
		this.setMainView(new JFrame());
		//set up the layout
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//set up the side panel
		this.sidepanel = new SidePanel();
		c.gridy = 2;
		c.gridheight = 2;//GridBagConstraints.REMAINDER;
		this.add(this.sidepanel,c );
		
		//set up the top panel. Banner with login / register
		this.bannerpanel = new LogoViewPanel();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 100;
		c.gridwidth = 10;
		c.fill = GridBagConstraints.HORIZONTAL;
		this.add(this.bannerpanel,c );
		
		//Setting up the main Panel. THis will change as you navigate the site
		this.storepanel = new StorePanel();
		this.middlepanel = this.storepanel;
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = GridBagConstraints.REMAINDER;
		this.add(middlepanel,c);
		
		
		//set up action listener
		//action listening should probably be the controllers job.
		MainView.MainActionListener = this;
	}

	public void register(GamePauseControllerV2 controller) {
		// TODO Auto-generated method stub
		
	}


	//action listening does not work.
	
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Button Pressed");
		// TODO Auto-generated method stub
		if("changepanels".equals(arg0.getActionCommand())){
				this.middlepanel = this.testpanel;
				this.revalidate();
				this.repaint();
			}
		}

	public JFrame getMainView() {
		return mainView;
	}

	public void setMainView(JFrame mainView) {
		this.mainView = mainView;
	}

}
