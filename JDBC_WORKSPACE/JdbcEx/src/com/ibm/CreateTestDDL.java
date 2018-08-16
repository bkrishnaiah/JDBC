package com.ibm;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTestDDL 
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
		
		boolean b=st.execute("create table ibm(eid number(10),ename varchar2(20)");
		
		//close the connection
		
		conn.close();
		System.out.println(b);

	}

}
