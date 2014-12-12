package db_system;

	/* HOWTO-RUN JDBC+MYSQL
	 * In order for you to work with JDBC and MySQL
	 * 1. Download XAMPP and install it.
	 * 2. Download from our github the gamepuase.sql file
	 *    inside the SQL folder
	 * 3. Run XAMPP and start Apache and MySQL services
	 *    from the XAMPP Control Panel
	 * 4. Click on the button that says Admin
	 *    which will then open a browser with the 
	 *    phpmyadmin page.
	 * 5. Search for the option 'Import' on the main menu bar
	 *    and click on it.
	 * 6. Then click on the Browse button and select the file
	 *    gampause.sql you download earlier, scroll all the
	 *    way down and click the 'Go' button.
	 *    //This will load the entire structure of the database.
	 *    //I will later on populate it and upload the updated .sql file
	 * 7. Refresh the Game Pause Project
	 */ 
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;




//containers - all classes for the system
import containers.*;

public class SearchDB extends ConnectionDB{

		//Gets an arraylist of Item objects and populates it
		public int gameSearch(ArrayList<Game> list){
			ResultSet rs1 = null;
			int ret = 99;
			//Execute query
			try{
				String query1 = "SELECT * FROM `item` INNER JOIN `game` ON item.itemid=game.itemid";
				rs1 = stmt.executeQuery(query1);
					
			}catch(Exception ex){
				System.out.println(ex);
			}
			//populate arraylist<item>
			try {
				while(rs1.next()){
					Game game = new Game();
					game.setItemid(rs1.getInt("itemid"));
					game.setItemname(rs1.getString("itemname"));
					game.setPrice(rs1.getDouble("price"));
					game.setStock(rs1.getInt("stock"));
					game.setPlatform(rs1.getString("platform"));
					game.setManufacturer(rs1.getString("manufacturer"));
					game.setReleasedate(rs1.getString("releasedate"));
					game.setGenre(rs1.getString("genre"));
					list.add(game);
				}
				ret = 0;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return ret;
			
		}
		
		public boolean searchOrdersbyID(ArrayList<Order> list, String accountid){
			ResultSet rs1 = null;
			boolean ret = false;
			//Execute query
			try{
				String query1 = "SELECT * FROM `ordermap` WHERE accountid = '"+accountid+"' INNER JOIN `orders`";
				rs1 = stmt.executeQuery(query1);
					
			}catch(Exception ex){
				System.out.println(ex);
			}
			return ret;
		}
		
		public static void main(String[] args) {
			
			SearchDB nop = new SearchDB();
			try {
				nop.connect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ArrayList<Game> list = new ArrayList<Game>();
			if(nop.gameSearch(list) == 0){
				for(int i=0; i<list.size(); i++){
					System.out.println(list.get(i).getItemname());
				}
			}
		}

}//end of class
