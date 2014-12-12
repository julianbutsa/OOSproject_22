package db_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import containers.Account;

public class DBAccount extends DBConnect
{
	public static boolean login(Account acc, String either, String password){
		ResultSet rs = null;
		boolean ret = false;
	    //Execute query
		try{
			String query = "SELECT * FROM `account`";
			rs = stmt.executeQuery(query);
				
		}catch(Exception ex){
			System.out.println(ex);
		}
		try {
			while(rs.next()){
				if(rs.getString("username").equals(either) || rs.getString("email").equals(either)){
					acc.setAccountid(rs.getInt("accountid"));
					acc.setUsername(rs.getString("username"));
					acc.setEmail(rs.getString("email"));
					acc.setPassword(rs.getString("password"));
					acc.setFirstname(rs.getString("firstname"));
					acc.setLastname(rs.getString("lastname"));
					acc.setPhonenumber(rs.getString("phonenumber"));
					ret = true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = false;
		}
		
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	public static boolean createAccount(int accountid, String username, String email, String password, String firstname, String lastname, String phonenumber,int admin){
		boolean ret = false;
		if(conn == null) System.out.println("No Connection to DB");
		else System.out.println("Connection to DB");
		String query = "INSERT INTO account " +
           "VALUES ("+accountid+", '"+username+"', '"+email+"', '"+password+
            "','"+firstname+"','"+lastname+"','"+phonenumber+"',"+ admin+")";
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
	
	public static boolean insertShippingInfo(int accountid, String state, int zip, String street, int apptnum, String country){
		boolean ret = false;
		String query = "INSERT INTO shippinginfo " + "VALUES ("+accountid+", '"+state+"', "+
		               zip+", '"+street+", "+apptnum+", '" +country+"')";
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
	public static boolean insertBillingInfo(int accountid, String state, int zip, String street, int apptnum, String country){
		boolean ret = false;
		String query = "INSERT INTO billinginfo " + 
		"VALUES (" +accountid+", '"+ state+"', "+zip+ ", '"+street+
		"', "+apptnum+", '"+country+"')";
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
	
	

}
