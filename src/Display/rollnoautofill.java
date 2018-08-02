package Display;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import DaoImplematation.Daoimpl;
import DaoInterface.Studentdao;
import pojo.studetails;

/**
 * Servlet implementation class rollnoautofill
 */
@WebServlet("/rollnoautofill")
public class rollnoautofill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rollnoautofill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=request.getServletContext();
		Connection conn=(Connection) sc.getAttribute("Refconn");
		Studentdao sd=new Daoimpl(conn);
		List <studetails> stu_list=sd.getAllstudent();
		request.setAttribute("stulist", stu_list);
		request.getRequestDispatcher("text.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext sc=request.getServletContext();
		Connection conn=(Connection) sc.getAttribute("Refconn");
		Studentdao sd=new Daoimpl(conn);
		List <studetails> stu_list=sd.getAllstudent();
		request.setAttribute("stulist", stu_list);
		request.getRequestDispatcher("text.jsp").include(request, response);
	}

}
