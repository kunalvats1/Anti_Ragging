package DaoImplematation;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import DaoInterface.Studentdao;
import pojo.contactus;
import pojo.pojo;
import pojo.studetails;

public class Daoimpl implements Studentdao
{
	Connection conn=null;
	
	public Daoimpl(Connection conn)
	{
		this.conn=conn;
	}

	@Override
	public boolean insertstudent(pojo student) 
	{
	boolean Status=false;	
		try
		{
			PreparedStatement ps=conn.prepareStatement("insert into studenttable values(?,?,?,?,?)");
			ps.setString(1, student.getStuname());
			ps.setString(2, student.getPassword());
			ps.setString(3, student.getPassword1());
			ps.setDouble(4, student.getRollno());
			ps.setString(5, student.getCourse());
			ps.execute();
			Status =true;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			Status=false;
		}
		return Status;
	}

	@Override
	public int deletestudent(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatestudent(pojo student) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getstudentbyrollno(pojo student) 
	{
		boolean status=false;
		try
		{
			PreparedStatement ps=conn.prepareStatement("select * from studentdetail where rollno=?");
			ps.setDouble(1, student.getRollno());
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				status=true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			status=false;
		}
		
		return status;
	}

	@Override
	public boolean detailstudent(studetails detail) 
	{
		
		boolean Status=false;	
		try
		{
			PreparedStatement ps=conn.prepareStatement("insert into studentdetail values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, detail.getComptitle());
			ps.setString(2, detail.getCompdes());
			ps.setString(3, detail.getStuname());
			ps.setString(4, detail.getEmail());
			ps.setString(5, detail.getPhno());
			ps.setString(6, detail.getFname());
			ps.setDouble(7, detail.getRollno());
			ps.setString(8, detail.getCourse());
			ps.setString(9, detail.getCollege());
			ps.setString(10, detail.getYear());
			ps.execute();
			Status =true;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			Status=false;
		}
		return Status;
	}

	@Override
	public List<studetails> getAllstudent() 
	{
		List<studetails> stu_list=new ArrayList<>();
		try
		{
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from studentdetail");
			while(rs.next())
			{
				studetails e=new studetails();
				e.setComptitle(rs.getString(1));
				e.setCompdes(rs.getString(2));
				e.setStuname(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setYear(rs.getString(5));
				e.setFname(rs.getString(6));
				e.setRollno(rs.getDouble(7));
				e.setCourse(rs.getString(8));
				e.setCollege(rs.getString(9));
				e.setPhno(rs.getString(10));
				stu_list.add(e);
			}
		}
		catch(Exception e)
		{		
		}
		return stu_list;
	}

	@Override
	public boolean insertaction(pojo action) 
	{
		boolean Status=false;	
		try
		{
			PreparedStatement ps=conn.prepareStatement("insert into action values(?,?)");
			ps.setDouble(1,action.getRollno());
			ps.setString(2,action.getAction());
			ps.execute();
			Status =true;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			Status=false;
		}
		return Status;
	}

	@Override
	public List<pojo> getAllaction() 
	{
		List<pojo> stu_list=new ArrayList<>();
		try
		{
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from action");
			while(rs.next())
			{
				pojo e=new pojo();
				e.setRollno(rs.getDouble(1));
				e.setAction(rs.getString(2));
				stu_list.add(e);
			}
		}
		catch(Exception e)
		{	
			System.out.println("error");
		}
		return stu_list;
	}

	@Override
	public boolean insertcontactus(contactus contact) 
	{
		
		boolean Status=false;	
		try
		{
			PreparedStatement ps=conn.prepareStatement("insert into contact_us values(?,?,?,?)");
			ps.setString(1, contact.getName());
			ps.setString(2, contact.getEmail());
			ps.setString(3, contact.getPhno());
			ps.setString(4, contact.getMessage());
			ps.execute();
			Status =true;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
			Status=false;
		}
		return Status;
	}

}



