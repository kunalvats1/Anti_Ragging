package Database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBconn 
{

	public static Connection getconnection()//here return type is connection
	{
	Connection conn=null;
	try
	{
		Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
	}
	catch(Exception e)
	{
		System.out.println("Error in Database : "+e.getMessage());
	}
	return conn;
	}
}
