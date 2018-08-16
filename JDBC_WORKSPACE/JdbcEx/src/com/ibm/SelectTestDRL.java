package com.ibm;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTestDRL 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//loading driver class
	
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());//other way of loading the driver class
		
		//create the connection
		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
	
		//create the statement
		
		Statement st=conn.createStatement();
		
		//execute query
		
		ResultSet rs=st.executeQuery("select * from ibm where rowid='AAAE6QAABAAALGJAAA'");
		//using while loop
		/*while(rs.next())
		{
			
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}*/
		
		//using do while loop
		/*if(rs.next())
		{
			do
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}while(rs.next());
		}
		else
			System.out.println("there is no record");*/
		
		//using for loop
		
		/*if(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			for( ; rs.next() ; )
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
		}
		else
			System.out.println("there is no record");*/
		
		for( ; rs.next() ; )
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			//System.out.println();
		}
		
		//close the connection
		
		conn.close();
		
	}

}
