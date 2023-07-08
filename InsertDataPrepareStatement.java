package com.jspiders.assignmnts;
import java.sql.*;
import java.util.Scanner;
public class InsertDataPrepareStatement {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		String query="insert into advancejava.employee values(?,?,?,?)";
		try {
		Connection cn=DriverManager.getConnection(url);
		
		PreparedStatement ps=cn.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empid :");
		int empid=sc.nextInt();
		ps.setInt(1, empid);
		System.out.println("enter the ename :");
		String ename=sc.next();
		ps.setString(2, ename);
		System.out.println("enter the sal :");
		double sal=sc.nextDouble();
		ps.setDouble(3, sal);
		System.out.println("enter the deptno :");
		int deptno=sc.nextInt();
		ps.setInt(4, deptno);
		ps.executeUpdate();
		System.out.println("record is updated..!!");
		cn.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
		

	}

}
