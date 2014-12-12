package gp_system;

import java.awt.*;

import javax.swing.*;

/**
 *  GamePauseView
 *  This class is in charger of the View (GUI)
 */


public class GamePauseView extends JFrame{
	

	
	public JPanel container = new JPanel();
	
	public LogoViewPanel logoPanel =new LogoViewPanel(null);
	//private ButtonPanel bPanel = new ButtonPanel();
	public JMenuBar mPanel = new JMenuBar();
	
	//test menu items
	public JMenuItem jm1 = new JMenuItem("Browse");
	public JMenuItem jm2 = new JMenuItem("Log in");

	
	//public static int fWidth;
	//public static int fHeight;
	
	public GamePauseView(){
		
		//Title of the Main_Page(GamePause GUI)
		super("Game][Pause");
		
		//Sets the size of the JFrame
	    //this.setExtendedState(this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
		
	    //This is the main panel
	    container = new JPanel(new BorderLayout());
	    
	    //add menu items
	    mPanel.add(jm1);
	    mPanel.add(jm2);
	    //Adding all the Panels into the Container
		container.add(logoPanel,BorderLayout.CENTER);	
		container.add(mPanel, BorderLayout.NORTH);
	    
		//Adding the main panel to the Frame
		this.add(container);
		
		//Telling the program what to do when a user clicks on close
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


	public void register(GamePauseController controller) {
		//bPanel.m_button.addActionListener(controller);
		
	}


}
