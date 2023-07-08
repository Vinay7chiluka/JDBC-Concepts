package com.jspiders.assignmnts;
import java.sql.*;
import java.util.Scanner;

public class FetchEmpDataPrepareStatement {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String  query="select ename,deptno from advancejava.employee where sal=? ";
		try {
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement ps=connection.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the employee sal :");
			double sal=sc.nextDouble();
			ps.setDouble(1, sal);
			ResultSet rs=ps.executeQuery();
			
			if(rs.last())
			{
				rs.beforeFirst();
				while(rs.next())
				{
					
				System.out.println("employee name :"+rs.getString("ename"));
				System.out.println("employee sal :"+rs.getDouble("sal"));
				System.out.println("employee deptno :"+rs.getInt("deptno"));
				System.out.println("------------------------------------------");
				}
			}
			else
			{
				System.err.println("no record found ...");
			}
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
