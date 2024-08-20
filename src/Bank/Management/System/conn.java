package Bank.Management.System;

import java.sql.*;


public class conn {
	
	Connection connection;
	
	Statement statement;
	
	public  conn() {
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","13579@.com");
			statement = connection.createStatement();
		} catch  (Exception e) {
			e.printStackTrace();
			
		}
	}

	
}
