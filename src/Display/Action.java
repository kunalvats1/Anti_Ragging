package Display;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import DaoImplematation.Daoimpl;
import DaoInterface.Studentdao;
import pojo.pojo;

/**
 * Servlet implementation class Action
 */
@WebServlet("/Action")
public class Action extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Action() {
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
		double rollno=Double.parseDouble(request.getParameter("rollno"));
		PrintWriter out=response.getWriter();
		String Action=request.getParameter("action");
		pojo action=new pojo(rollno,Action);
		ServletContext sc=getServletContext();
		Connection conn=(Connection) sc.getAttribute("Refconn");
		Studentdao sd=new Daoimpl(conn);	
		boolean status=sd.insertaction(action);
		if(status==true)
		{
			out.println(" Sucesfully");
			//request.getRequestDispatcher("status.jsp").forward(request, response);	
			}
		else
		out.println("Something went wrong");
		//request.getRequestDispatcher("register.jsp").include(request, response);		
	}
		
		
	}


