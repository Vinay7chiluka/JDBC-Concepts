package assignments;
import java.sql.*;
public class Assign3 {
	public static void main(String args)
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="update Advance.car set ccolour=black where cbrand='bugatti'";
		try {
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established..");
			Statement statement=connection.createStatement();
			int noOfRecord=statement.executeUpdate(query);
			if(noOfRecord>0)
			{ 
				System.out.println("record update");
			}
			else
			{
				System.out.println("invalid");
			}
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}


}
