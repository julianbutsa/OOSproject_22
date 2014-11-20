package gp_system;

import java.awt.event.*;

public class GamePauseController implements ActionListener{

		private GamePauseModel model;
		private GamePauseView view;
		

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		public GamePauseController(GamePauseModel model, GamePauseView view){
			this.model = model;
			this.view = view;
		}
}
