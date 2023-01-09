package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class First_Program {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step-1 Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");		
		
		//Step-2 Create the connection to the Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","root" );
		
		//Step-3 Create the statement
		Statement s = con.createStatement();
				
		//step-4 Execute the statement
		ResultSet rs = s.executeQuery("select *from employee");
		
		//step-5 Process the results
		while(rs.next())
		{
		  // System.out.println(rs.getString("scenario"));
			System.out.println(rs.getString(1)+"   |   "+rs.getString(2)+"   |   "+rs.getString(3));			
		}	
		con.close();
		
	}	
}
		
		
	
