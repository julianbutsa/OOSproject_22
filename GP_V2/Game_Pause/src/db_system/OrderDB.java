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

public class OrderDB extends ConnectionDB{

			public int createOrder(){
				int ret = 99;
				if(conn == null) System.out.println("No Connection to DB");
				else System.out.println("Connection to DB");
				/*
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
				*/
				return ret;
			}
			

}
