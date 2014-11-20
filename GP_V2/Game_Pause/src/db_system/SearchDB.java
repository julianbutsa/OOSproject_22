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

public class SearchDB {
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
		//Gets an arraylist of Item objects and populates it
		public int gameSearch(ArrayList list){
			ResultSet rs = null;
			int ret = 99;
			 //Execute query
			try{
				String query = "SELECT * FROM `item`";
				rs = stmt.executeQuery(query);
					
			}catch(Exception ex){
				System.out.println(ex);
			}
			//populate arraylist<item>
			try {
				int i = 0;
				Item pitem = new Item();
				while(rs.next()){
					//populate the object of game
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return ret;
			
		}
		


}//end of class
