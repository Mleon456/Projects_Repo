package example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The CustomConnectionFactory manufactures the connections that my various DAOs
//need to transfer data to the database
public class CustomConnectionFactory {
	
	static { //necessary to make JDBC work in a WAR project
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Static block has failed me");
		}
	}
	
	/*
	 * JDBC needs a SPECIFIC format to the URL string so that the DriverManager
	 * can understand WHICH driver you're asking to use.
	 * 
	 * For Postgresql, the URL format is:
	 * 		jdbc:postgresql://[endpoint]/[databasename]
	 * 
	 * For OracleSQL, the URL format is:
	 * 		jdbc:oracle:thin:@[endpoint]:[port]:[dbname]
	 * 
	 */
	public static String url = "jdbc:postgresql://database-1.cbuuz20rx9vd.us-east-2.rds.amazonaws.com/Project_1";
	public static String username =  "mleon";
	public static String password = "p4ssw0rd";
	
	public static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection(url, username, password);
		
	}

}

