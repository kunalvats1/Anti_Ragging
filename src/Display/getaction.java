package Display;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import DaoImplematation.Daoimpl;
import DaoInterface.Studentdao;
import pojo.pojo;
import pojo.studetails;

/**
 * Servlet implementation class getaction
 */
@WebServlet("/getaction")
public class getaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter pw=response.getWriter();
		ServletContext sc=request.getServletContext();
		Connection conn=(Connection) sc.getAttribute("Refconn");
		Studentdao sd=new Daoimpl(conn);
		List <pojo> stu_list=sd.getAllaction();
		request.setAttribute("stulist", stu_list);
		request.getRequestDispatcher("action.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String k=request.getParameter("rollno");
		double rollno=Double.parseDouble(k);
		
		ServletContext sc=request.getServletContext();
		Connection conn=(Connection) sc.getAttribute("Refconn");
//		Studentdao sd=new Daoimpl(conn);
//		List <pojo> stu_list=sd.getAllaction();
//		request.setAttribute("stulist", stu_list);
		try 
		{
			PreparedStatement ps=conn.prepareStatement("select * from action where rollno=?");
			ps.setDouble(1, rollno);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			
				out.println(rs.getString(2));
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}
	}
}