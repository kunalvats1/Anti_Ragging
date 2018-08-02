package Display;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import DaoImplematation.Daoimpl;
import DaoInterface.Studentdao;
import pojo.pojo;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
	
		}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Student_name=request.getParameter("stuname");
		String password=request.getParameter("pwd");
		String password1=request.getParameter("pwd1");
		double rollno= Double.parseDouble(request.getParameter("rollno"));
		String course=request.getParameter("course");

		pojo student=new pojo( Student_name,  password,  password1, rollno,course);
		ServletContext sc= getServletContext();
		Connection conn=(Connection)sc.getAttribute("Refconn");
		Studentdao sd=new Daoimpl(conn);
		boolean status=sd.insertstudent(student);
		if(status==true)
		{
			out.println(" Registered Sucesfully");
			request.getRequestDispatcher("stulogin.jsp").forward(request, response);	
			}
		else
		out.println("Already Registered");
		request.getRequestDispatcher("register.jsp").include(request, response);
	}
}