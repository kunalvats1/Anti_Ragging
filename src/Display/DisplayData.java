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

import pojo.studetails;

/**
 * Servlet implementation class DisplayData
 */
@WebServlet("/DisplayData")
public class DisplayData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayData() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("stuname");
		String comptitle=request.getParameter("cdes");
		String stuname=request.getParameter("name");
		String fname=request.getParameter("fname");
		String year=request.getParameter("year");
		double rollno= Double.parseDouble(request.getParameter("rollno"));
		String course=request.getParameter("course");
		String college=request.getParameter("college");
		String Email=request.getParameter("email");
		String phno=request.getParameter("phno");
		
		studetails detail=new studetails( name, comptitle,  stuname,Email, phno,fname,rollno,course,college,year);
		ServletContext sc= getServletContext();
		Connection conn=(Connection)sc.getAttribute("Refconn");
		Studentdao sd=new Daoimpl(conn);
		boolean status=sd.detailstudent(detail);
		if(status==true)
		{
			out.println(" Sucesfully");
			request.getRequestDispatcher("status.jsp").forward(request, response);	
			}
		else
		out.println("Already Registered");
		request.getRequestDispatcher("form.jsp").forward(request, response);		
	}
}