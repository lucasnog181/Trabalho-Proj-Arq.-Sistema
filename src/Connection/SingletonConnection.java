package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	static Connection connection = null;
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Loja?useTimezone=true&serverTimezone=UTC";
	
	private SingletonConnection() {}
	
	public static Connection getConnection() {
		try {
			
			if(connection == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
