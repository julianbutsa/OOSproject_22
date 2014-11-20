package gp_system;

import java.awt.event.*;

public class GamePauseControllerV2 implements ActionListener{

		private GamePauseModel model;
		private MainView view;
		

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		public GamePauseControllerV2(GamePauseModel model, MainView view){
			this.model = model;
			this.view = view;
		}
}
