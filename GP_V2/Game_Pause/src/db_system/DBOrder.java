package db_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import containers.*;

public class DBOrder extends DBConnect{

	public static boolean insertOrderMap(int orderid, int accountid, int itemid, int quantity){
		boolean ret = false;
		String query = "INSERT INTO ordermap " + "VALUES ("+orderid+", "+accountid+
				", " + itemid+", " +quantity+ ")";
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
	public static boolean insertOrders(int orderid, String timeoforder, int completed){
		boolean ret = false;
		String query = "INSERT INTO orders " + "VALUES ("+orderid+", "+
		timeoforder +", "+completed+ ")";
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
	
	public static boolean orderSearch(ArrayList<Game> list){
		ResultSet rs = null;
		boolean flag = false;
		//Execute query

		String query = "SELECT * FROM `` ";
		try {
			rs = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//populate arraylist<item>
		 try {
			    while(rs.next()){
					 /*
					Order game = new Game();
					game.setItemid(rs.getInt("itemid"));
					game.setItemname(rs.getString("itemname"));
					game.setPrice(rs.getDouble("price"));
					game.setStock(rs.getInt("stock"));
					game.setPlatform(rs.getString("platform"));
					game.setManufacturer(rs.getString("manufacturer"));
					game.setReleasedate(rs.getString("releasedate"));
					game.setGenre(rs.getString("genre"));
					list.add(game);
					*/
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return flag;			
	}
}
