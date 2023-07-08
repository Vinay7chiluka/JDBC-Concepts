package com.jspiders.assignmnts;
import java.sql.*;
//Write a program emp information if empid is odd number
public class FetchEmpInfoEmpidOdd {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="select * from advancejava.employee where empid%2=1";
		try {
			Connection connection=DriverManager.getConnection(url);
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(query);
			Boolean status=resultSet.next();
			if(resultSet.last())
			{
				System.err.println("record is present");
			resultSet.beforeFirst();
			while(resultSet.next())
			{
				System.out.println("ename :"+resultSet.getString("ename"));
				System.out.println("empid :"+resultSet.getInt("empid"));
				System.out.println("deptno :"+resultSet.getInt("deptno"));
				System.out.println("sal :"+resultSet.getDouble("sal"));
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
