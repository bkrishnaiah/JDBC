package com.ibm;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTestDML
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//loading driver class
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		//create the connection
		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Abu", "qwerty12345");
	
		//create the statement
		
		Statement st=conn.createStatement();
		
		//execute query
		
		//int b=st.executeUpdate("insert into ibm values(7893226953,'Abbiee')");
		int b=st.executeUpdate("update ibm set eid=965154680 where eid=9651546806");
		//int b=st.executeUpdate("delete from ibm where eid=7893226953");
		
		//close the connection
		
		conn.close();
		System.out.println("table created: "+b);

	}

}
