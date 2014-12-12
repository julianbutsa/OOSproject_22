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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
    //JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/gamepausedb";
	
	//  Database credentials
	static final String USER = "root";
	static final String PASS = "";
	
	static Connection conn = null;
	static Statement stmt = null;
	/*
	 * public int connect
	 * Returns a 0 if connection was successful.
	 * Returns a -1 if connection was unsuccessful.
	 */
	public static boolean connect() throws SQLException{
		//Loading the JDBC+MySQL Driver
		boolean ret = true;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("The JDBC Driver is working!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		}
		//Connection
		System.out.println("Connectig to the Database...");
		try {
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fill statement
		try {
			stmt  = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (conn == null) {
			ret = false;
		}
		return ret;
		
	}
	//Disconnects from DB
	//if successful, returns a 0 if not returns -1
	public static boolean disconnect(){
		boolean ret = false;
		 try{
	         if(conn!=null)
	        	 ret = true;
	            conn.close();
	     }catch(SQLException se){
	    	 ret = false;
	         se.printStackTrace();
	     }//end try catch
	     System.out.println("Goodbye!");
		return ret;
	}
}
