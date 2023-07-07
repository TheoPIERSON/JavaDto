package toto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    
		    String dbName = "SnackMounir"; 
		    String dbUserName = "root"; 
		    String dbPassword = "root"; 
		    String connectionString = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";

		    conn = DriverManager.getConnection(connectionString);
		    Article Kebab = new Article(1,"kebab", 6);
		    
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
