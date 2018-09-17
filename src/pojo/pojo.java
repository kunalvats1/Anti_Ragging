package pojo;

public class pojo
{
private String stuname;
private String password;
private String password1;
private String course;
private String Action;
private double rollno;

public pojo() 
{

}
public pojo(String stuname, String password,  String password1,double rollno, String course)
{
	super();
	this.stuname=stuname;
	this.course=course;
	this.rollno=rollno;
	this.password=password;
	this.password1=password1;
}
public pojo(double rollno,String Action)
{
	super();
	this.Action=Action;
	this.rollno=rollno;
}
public String getAction() {
	return Action;
}
public void setAction(String action) {
	Action = action;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getPassword1() {
	return password1;
}
public void setPassword1(String password1) {
	this.password1 = password1;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public double getRollno() {
	return rollno;
}
public void setRollno(double rollno) {
	this.rollno = rollno;
}
}
