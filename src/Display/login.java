package Display;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		double rollno= Double.parseDouble(request.getParameter("t1"));
		String password=request.getParameter("t2");
		ServletContext sc= getServletContext();
		Connection conn=(Connection)sc.getAttribute("Refconn");
		java.sql.Statement ssc;
		try 
		{
			ssc = conn.createStatement();
			ResultSet rs=ssc.executeQuery("select * from studenttable where rollno="+rollno+"");
			if(rs.next())
			{
				if(rs.getString(2).equals(password))
				{
					request.getRequestDispatcher("form.jsp").forward(request, response);
				}
				else
				{
					out.println("Incorrect Password/rollno");
					request.getRequestDispatcher("stulogin.jsp").include(request, response);
				}
		}} 
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		} 
		
		
	}


