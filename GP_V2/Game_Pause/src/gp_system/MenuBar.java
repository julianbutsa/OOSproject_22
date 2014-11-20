package gp_system;

import java.awt.BorderLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuBar extends JPanel{
	
	public MenuBar() {
		super(new BorderLayout());

    JMenuBar menuBar = new JMenuBar();
    
    JMenu file = new JMenu("File");
    	JMenuItem open = new JMenuItem("Open");
    	JMenuItem exit = new JMenuItem("Exit");
    JMenu help = new JMenu("Help");
    	JMenuItem about = new JMenuItem("About");
    
    file.add(open);
    file.add(exit);
    help.add(about);
    
    menuBar.add(file);
    menuBar.add(help);
    
    this.add(menuBar);
	}

}
