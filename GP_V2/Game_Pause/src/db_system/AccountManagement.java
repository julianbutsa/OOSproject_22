package db_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import containers.Account;

public class AccountManagement {
	
	//JDBC driver name and database URL
			static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
			static final String DB_URL = "jdbc:mysql://localhost:3306/gamepause";
			
			//  Database credentials
			static final String USER = "root";
			static final String PASS = "";
			
			Connection conn = null;
			Statement stmt = null;
			
			/*
			 * public int connect
			 * Returns a 0 if connection was successful.
			 * Returns a -1 if connection was unsuccessful.
			 */
			public int connect() throws SQLException {
				//Loading the JDBC+MySQL Driver
				int ret = 0;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("The JDBC Driver is working!");
					
				} catch (ClassNotFoundException e) {
					System.out.println("Where is your MySQL JDBC Driver?");
					e.printStackTrace();
				}
				//Connection
				System.out.println("Connectig to the Database...");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				//fill statement
				stmt  = conn.createStatement();
				if (conn == null) {
					ret = -1;
				}
				return ret;
				
			}
			//Disconnects from DB
			//if successful, returns a 0 if not returns -1
			public int disconnect(){
				int ret = 99;
				 try{
			         if(conn!=null)
			        	 ret = 0;
			            conn.close();
			     }catch(SQLException se){
			    	 ret = -1;
			         se.printStackTrace();
			     }//end try catch
			     System.out.println("Goodbye!");
				return ret;
			}
			
			public Iterator searchGame(){
				return null;
				
			}
	
	public int login(Account acc, String either, String password){
		ResultSet rs = null;
		int ret = 99;
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
					ret = 0;
				}
			}
			if ( ret == 99) ret = -1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = -1;
		}
		
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}
	public int createAccount(int accountid, String username, String email, String password, String firstname, String lastname, String phonenumber){
		int ret = 99;
		if(conn == null) System.out.println("No Connection to DB");
		else System.out.println("Connection to DB");
		String query = "INSERT INTO account " +
           "VALUES ("+accountid+", '"+username+"', '"+email+"', '"+password+
            "','"+firstname+"','"+lastname+"','"+phonenumber+"')";
		try {
			stmt.executeUpdate(query);
			ret = 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ret = -1;
		}
		return ret;
	}
}

