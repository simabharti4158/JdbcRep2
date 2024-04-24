package com.online;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DynamicInsert {

	public static void main(String[] args) throws ClassNotFoundException,SQLException 
	{
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter the id");
    int id=scanner.nextInt();
    System.out.println("Enter the name");
    String name=scanner.next();
    System.out.println("Enter the marks");
    double marks=scanner.nextDouble();
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
    PreparedStatement preparableStatement=connection.prepareStatement("insert into firstdata values(?,?,?)");
    
     preparableStatement.setInt(1,id);
     preparableStatement.setString(2,name);
     preparableStatement.setDouble(3,marks);
    preparableStatement.execute();
    connection.close();
    System.out.println("inserted");
		

	}

//	private static void preparableStatement(String string) {
		// TODO Auto-generated method stub
		
//	}

}
