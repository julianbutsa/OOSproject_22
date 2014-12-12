package db_system;

import java.sql.*;

import containers.*;

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

public class MainDBControl {

	//JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/gamepause";
	
	//  Database credentials
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) throws SQLException {
	Connection conn = null;
	Statement stmt = null;

	
	//Loading the JDBC+MySQL Driver
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("The JDBC Driver is working!");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	
	//Connection
	System.out.println("Connectig to the Database...");
	conn = DriverManager.getConnection(DB_URL,USER,PASS);
	//Create statement
	System.out.println("Creating statement...");
	stmt  = conn.createStatement();
	
	ResultSet rs = null;
	
    //Execute query
	try{
		String query = "SELECT * FROM `account`";
		rs = stmt.executeQuery(query);
			
	}catch(Exception ex){
		System.out.println(ex);
	}
	Account accu = new Account();
	//Extract data from result set
	//Using a type of iterator
	while(rs.next()){
		//Retrieve by column name
		int accountid = rs.getInt("accountid");
		String username = rs.getString("username");
		String email = rs.getString("email");
		String password = rs.getString("password");
		String firstname = rs.getString("firstname");
		String lastname = rs.getString("lastname");
		String phonenumber = rs.getString("phonenumber");
		
		System.out.println("\nTesting retrieving and displaying values from the DB\n");
		
		//Display values
		System.out.println(accountid);
		System.out.println(username);
		System.out.println(email);
		System.out.println(password);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(phonenumber);
		
		accu.setAccountid(accountid);
		accu.setUsername(username);
		accu.setEmail(email);
		accu.setPassword(password);
		accu.setFirstname(firstname);
		accu.setLastname(lastname);
		accu.setPhonenumber(phonenumber);
		
		System.out.println("\n Using an object \n");
		System.out.println(accu.getUsername());
		System.out.println(accu.getPassword());
		
		
	}
    //Execute query
	try{
		String query = "INSERT INTO account " + 
				"VALUES (11112, 'jontron', 'jontron@java02.org', 'passord', 'jon', 'tron','7730123')";
		stmt.executeUpdate(query);
			
	}catch(Exception ex){
		System.out.println(ex);
	}
	
	//Close the resultset rs
	rs.close();
	 try{
         if(conn!=null)
            conn.close();
     }catch(SQLException se){
         se.printStackTrace();
     }//end try catch
     System.out.println("Goodbye!");
	}


	
	

}
