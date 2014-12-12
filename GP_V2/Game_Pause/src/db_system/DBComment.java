package db_system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import containers.*;

public class DBComment  extends DBConnect{
	
	public boolean insertComment(int commentid, String comment, String dateposted){
		boolean ret = false;
		String query = "INSERT INTO comment " + "VALUES ("+commentid + ",'"+ comment +"', '" + dateposted +"')";
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
	public boolean insertCommentMap(int commentid, int accountid, int itemid){
		boolean ret = false;
		String query = "INSERT INTO commentmap " + "VALUES ("+
		                commentid+", "+accountid+", "+itemid+")";
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
	
	public boolean getCommentByID(ArrayList<Comment> list, String id){
		boolean ret = false;
		ResultSet rs = null;
		try{
			 String query = "SELECT * FROM `comment` JOIN `commentmap` ON comment.commentid=commentmap.commentid";
			 rs = stmt.executeQuery(query);
						
		}catch(Exception ex){
			 System.out.println(ex);
		}
		//populate arraylist<item>
		try {
			 while(rs.next()){
				Comment comment = new Comment();
				comment.setCommentid(rs.getString("commentid"));
				comment.setComment(rs.getString("comment"));
				comment.setDataposted(rs.getString("dataposted"));
				list.add(comment);
			}
			ret = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return ret;
		
	}
	

}
