package assignments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Assign2 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="update advancejava.employee set deptno=1002 where sal=100000";
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established ...");
			Statement statement=connection.createStatement();
			System.out.println("platform created ...");
		int noOfRecord =	statement.executeUpdate(query);
			System.out.println("record affected ..."+noOfRecord);
			if(noOfRecord>0)
			{
				System.out.println(" record updated ");
			}
			else
			{
				System.err.println("invalid data");
			}
			connection.close();
			System.out.println("Connection closed ...");
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		
		}
	}
	

}
