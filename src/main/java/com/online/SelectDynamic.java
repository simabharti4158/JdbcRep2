package com.online;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class SelectDynamic {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id =sc.nextInt();
	 Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root","root");
	  PreparedStatement preparableStatement=connection.prepareStatement("select * from firstdata  where id=?");
	   preparableStatement.setInt(1,id);
		ResultSet resultSet= preparableStatement.executeQuery();
		System.out.println("===========Display the data from table ================");
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getDouble(3));
		  
		}
		connection.close();

	}

}
