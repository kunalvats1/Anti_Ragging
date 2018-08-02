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
import pojo.contactus;

/**
 * Servlet implementation class contactinfo
 */
@WebServlet("/contactinfo")
public class contactinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactinfo() {
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
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phno=request.getParameter("phno");
		String message=request.getParameter("message");
		contactus contact=new contactus( name,  email, phno, message);
		ServletContext sc= getServletContext();
		Connection conn=(Connection)sc.getAttribute("Refconn");
		Studentdao sd=new Daoimpl(conn);
		boolean status=sd.insertcontactus(contact);
		if(status==true)
		{
			out.println("Message Sent");
			request.getRequestDispatcher("index.jsp").include(request, response);
			}
	}
	}


