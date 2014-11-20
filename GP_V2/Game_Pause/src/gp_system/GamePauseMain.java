package gp_system;

import gp_system.GamePauseControllerV2;
import gp_system.GamePauseModel;
import gp_system.MainView;

import javax.swing.JFrame;

/**
 *  GamePauseMain
 *  This class is in charger of executing all the system (Main)
 */

public class GamePauseMain {
	//test
	public static void main(String[] args) {
		GamePauseModel model = new GamePauseModel();
		//GamePauseView view = new GamePauseView();
		MainView view = new MainView();
		GamePauseControllerV2 controller = new GamePauseControllerV2(model, view);
		
		view.register(controller);
		
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(800,600);
        view.setVisible(true);

	}

}
