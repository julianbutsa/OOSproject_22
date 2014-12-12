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

//containers - all classes for the system
import containers.*;

	public class InsertDB {
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
		
		/*
		 * public int insert
		 */
		public int insertAccount(int accountid, String username, String email, String password, String firstname, String lastname, String phonenumber){
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
		
		public int insertBillingInfo(int accountid, String state, int zip, String street, int apptnum, String country){
			int ret = 99;
			String query = "INSERT INTO billinginfo " + 
			"VALUES (" +accountid+", '"+ state+"', "+zip+ ", '"+street+
			"', "+apptnum+", '"+country+"')";
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
		
		public int insertComment(int commentid, String comment, String dateposted){
			int ret = 99;
			String query = "INSERT INTO comment " + "VALUES ("+commentid + ",'"+ comment +"', '" + dateposted +"')";
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
		public int insertCommentMap(int commentid, int accountid, int itemid){
			int ret = 99;
			String query = "INSERT INTO commentmap " + "VALUES ("+
			                commentid+", "+accountid+", "+itemid+")";
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
		public int insertGame(int itemid, String releasedata, String genre){
			int ret = 99;
			String query = "INSERT INTO game " + "VALUES ("+itemid+", '"+releasedata+"', '"+ genre+ "')";
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
		public int insertHardware(int itemid, String itemtype){
			int ret = 99;
			String query = "INSERT INTO hardware " + "VALUES ("+itemid+", '"+ itemtype+"')";
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
		public int insertItem(int itemid, String itemname, double price, int stock, String platform, String manufacturer){
			int ret = 99;
			String query = "INSERT INTO item " + "VALUES ("+itemid+", '"+itemname+
					"', "+price+", "+stock+", '" +platform +"', '"+manufacturer+"')";
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
		public int insertOrderMap(int orderid, int accountid, int itemid, int quantity){
			int ret = 99;
			String query = "INSERT INTO ordermap " + "VALUES ("+orderid+", "+accountid+
					", " + itemid+", " +quantity+ ")";
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
		public int insertOrders(int orderid, String timeoforder, int completed){
			int ret = 99;
			String query = "INSERT INTO orders " + "VALUES ("+orderid+", "+
			timeoforder +", "+completed+ ")";
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
		public int insertShippingInfo(int accountid, String state, int zip, String street, int apptnum, String country){
			int ret = 99;
			String query = "INSERT INTO shippinginfo " + "VALUES ("+accountid+", '"+state+"', "+
			               zip+", '"+street+", "+apptnum+", '" +country+"')";
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
