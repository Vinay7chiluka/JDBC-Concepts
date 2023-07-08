package com.jspiders.assignmnts;
//to delete car information if carno is present in DB
//Calleble Statement Example
import java.sql.*;
import java.util.Scanner;
public class DeleteCarInfo {

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306?user=root&password=1234";
		
		
		Connection connection=DriverManager.getConnection(url);
		CallableStatement cs=connection.prepareCall("call advancejava.Car(?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the car number :");
		cs.setString(1, sc.nextLine());
		int rs=cs.executeUpdate();
		if(rs>0)
		{
			System.out.println("data deleted..");
		}
		else
		{
			System.out.println("no record found..");
		}
		
		connection.close();
		
	

	}

}
