package DaoInterface;

import java.util.List;

import pojo.contactus;
import pojo.pojo;
import pojo.studetails;

public interface Studentdao 
{
public boolean insertstudent(pojo student);
public boolean insertaction(pojo action);
public boolean detailstudent(studetails detail);
public List<studetails> getAllstudent();
public List<pojo> getAllaction();
public boolean insertcontactus(contactus contact);

public int deletestudent(String username);
public int updatestudent(pojo student);
public boolean getstudentbyrollno(pojo student);
}
