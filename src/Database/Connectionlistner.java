package Database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public  class Connectionlistner implements ServletContextListener
{
	Connection conn=null;

public void contextInitialized(ServletContextEvent sce)
{				
	try 
	{
		Driver d=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(d);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
		ServletContext sc=sce.getServletContext();
		sc.setAttribute("Refconn", conn);
		
	} 
	catch (SQLException e) 
	{
		e.printStackTrace();
	
	}	
}

@Override
public void contextDestroyed(ServletContextEvent arg0) 
{	
}

}