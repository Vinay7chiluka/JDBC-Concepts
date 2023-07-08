package assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Statement;


public class Assign4 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="select * from advancejava.car";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url);
		System.out.println("connection created ...");
		
		Statement statement=(Statement) connection.createStatement();
		System.out.println("platform created...");
		
	  ResultSet	res=statement.executeQuery(query);
	 while( res.next()) {
		 
	
	  System.out.println(res.getInt(1));
	  System.out.println(res.getString(2));
	  System.out.println(res.getString(3));
	  System.out.println(res.getInt(4));
	  System.out.println("------------------");
	 }
	  
		
		System.out.println("query executed...");
		connection.close();
		}
		catch (Exception e) { 
			e.printStackTrace();
			
		}

	}

}