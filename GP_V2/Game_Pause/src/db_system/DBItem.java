package db_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import containers.*;

public class DBItem extends DBConnect{
	
	public static boolean insertItem(int itemid, String itemname, double price, int stock, String platform, String manufacturer,double rating){
		boolean ret = false;
		String query = "INSERT INTO item " + "VALUES ("+itemid+", '"+itemname+
				"', "+price+", "+stock+", '" +platform +"', '"+manufacturer+"'," +rating+"')";
		try {
			stmt.executeUpdate(query);
			ret = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}
	
	public static boolean insertGame(int itemid, String releasedata, String genre, String image){
		boolean ret = false;
		String query = "INSERT INTO game " + "VALUES ("+itemid+", '"+releasedata+"', '"+ genre+ "','"+ image+"')";
		try {
			stmt.executeUpdate(query);
			ret = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}
	public static boolean insertHardware(int itemid, String itemtype){
		boolean ret = false;
		String query = "INSERT INTO hardware " + "VALUES ("+itemid+", '"+ itemtype+"')";
		try {
			stmt.executeUpdate(query);
			ret = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = false;
		}
		return ret;
	}
	//Gets an arraylist of Item objects and populates it
	public static boolean gameSearch(ArrayList<Game> list){
		ResultSet rs1 = null;
		boolean flag = false;
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
				game.setRating(rs1.getDouble("rating"));
				list.add(game);
			}
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
				
	}
	
	//Gets an arraylist of Item objects and populates it
		public boolean itemSearch(ArrayList<Item> list){
			ResultSet rs1 = null;
			boolean flag = false;
			//Execute query
			try{
				 String query = "SELECT * FROM `item`";
				 rs1 = stmt.executeQuery(query);
							
			}catch(Exception ex){
				 System.out.println(ex);
			}
			//populate arraylist<item>
			try {
				 while(rs1.next()){
					Item item = new Item();
					item.setItemid(rs1.getInt("itemid"));
					item.setItemname(rs1.getString("itemname"));
					item.setPrice(rs1.getDouble("price"));
					item.setStock(rs1.getInt("stock"));
					item.setPlatform(rs1.getString("platform"));
					item.setManufacturer(rs1.getString("manufacturer"));
					item.setImage(rs1.getString("image"));
					list.add(item);
				}
				flag = true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flag;
					
		} 

}
