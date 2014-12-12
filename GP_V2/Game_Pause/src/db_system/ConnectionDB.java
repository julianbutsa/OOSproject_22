package db_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {
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

}
