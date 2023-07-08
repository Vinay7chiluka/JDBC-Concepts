package assignments;
import java.sql.*;
import java.sql.SQLException;

public class Assign1 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="delete sname from advancejava.student where stream=mech";
		try {
			/*Step1 Register the Driver
			 * Class.forName(driver);
			 */
			//Step2 get the connection
			Connection connection=DriverManager.getConnection(url);
			System.out.println("Connection established ...");
			
			//Step3 Create the statement object
			Statement statement=connection.createStatement();
			System.out.println("platform created ...");
			
			//Step4 excute the queries
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
			
			//close the connection
			connection.close();
			System.out.println("Connection closed ...");
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		
		}
	}
	

}
