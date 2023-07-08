package com.jspiders.assignmnts;
import java.sql.*;
public class FetchCarInfoColorIsBlack {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="select * from advancejava.car where ccolour='black'";
		try {
			Connection connection=DriverManager.getConnection(url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(query);
			Boolean status=resultSet.next();
			if(resultSet.last())
			{
				System.out.println("record is present");
			resultSet.beforeFirst();
			while(resultSet.next())
			{
				System.out.println("cbrand :"+resultSet.getString("cbrand"));
				System.out.println("cnumber :"+resultSet.getInt("cnumber"));
				System.out.println("ccolour :"+resultSet.getString("ccolour"));
				System.out.println("cprice :"+resultSet.getDouble("cprice"));
				System.out.println("====-------======------======-----========");
			}
			}
			else
			{
				System.err.println("record is not found....");
			}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
