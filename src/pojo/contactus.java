package pojo;

public class contactus 
{
	private String name;
	private String email;
	private String phno;
	private String message;
	
	public contactus()
	{
		
	}

	public contactus( String name,String email,String phno,String message)
	{
		super();
		this.email=email;
		this.phno=phno;
		this.name=name;
		this.message=message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
