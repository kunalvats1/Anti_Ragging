package pojo;

public class studetails 
{
private String comptitle;
private String compdes;
private String stuname;
private String Email;
private String phno;
private String fname;
private double rollno;
private String course;
private String college;
private String year;

public studetails()
{
	
}
public studetails( String comptitle, String compdes, String stuname,String email,String phno,String fname,double rollno,String course,String college,String year)
{
	super();
	this.comptitle=comptitle;
	this.year=year;
	this.compdes=compdes;
	this.fname=fname;
	this.Email=email;
	this.phno=phno;
	this.stuname=stuname;
	this.rollno=rollno;
	this.course=course;
	this.college=college;
}

public String getFname() {
	return fname;
}
public String getComptitle() {
	return comptitle;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public void setComptitle(String comptitle) {
	this.comptitle = comptitle;
}
public String getCompdes() {
	return compdes;
}
public void setCompdes(String compdes) {
	this.compdes = compdes;
}
public String getStuname() {
	return stuname;
}
public void setStuname(String stuname) {
	this.stuname = stuname;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public void setFname(String fname) {
	this.fname = fname;
}
public double getRollno() {
	return rollno;
}
public void setRollno(double rollno) {
	this.rollno = rollno;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
}