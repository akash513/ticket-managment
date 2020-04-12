
package ticket;

public abstract class person {
	
	private String name, email, password, mobile;
	public person()
	{
		
	}
	public person(String na,String em, String ps, String mo)
	{
		
		this.name = na;
		this.email = em;
		this.password = ps;
		this.mobile = mo;
	}
	public String getname()
	{
		return name;
	}
	public String getemail()
	{
		return email;
	}	
	public String getpassword()
	{
		return password;
	}
	public String getmobile()
	{
		return mobile;
	}	
	public void setname(String na)
	{
		name = na;
	}
	public void setemail(String em)
	{
		email = em;
	}
	public void setpassword(String ps)
	{
		password = ps;
	}
	public void setphone(String mo)
	{
		mobile = mo;
	}
	

	public abstract void display();

}
