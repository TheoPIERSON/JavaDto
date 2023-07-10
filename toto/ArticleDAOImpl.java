package toto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ArticleDAOImpl implements IArticleDAO {
	static Connection conn = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    
		    String dbName = "SnackMounir"; 
		    String dbUserName = "root"; 
		    String dbPassword = "root"; 
		    String connectionString = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
	
		    conn = DriverManager.getConnection(connectionString);
		   
		}
		catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void ajoutArticle(Article unArticle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suppArticle(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifArticle(Article unArticle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getArticle(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllArticles() {
		// TODO Auto-generated method stub
		
	}

}
