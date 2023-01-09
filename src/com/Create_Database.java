//IQ : different steps in JDBC connectivity
//create database
//create table
//insert records
// update Example
package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Database {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step-1 : Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step2 : Create the Connection to the Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		
		//Step-3 Create the Statement
		Statement s = con.createStatement();
		
		//step-4 Execute
		s.executeUpdate("Update employee set Emp_Name='Anjali' where Emp_ID=2");
		System.out.println("data updated Successfully");
		
		//step-5 Close the connection
		con.close();
			
	}

}
