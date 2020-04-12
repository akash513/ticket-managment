package ticket;
public class manager extends person{
	
	private int mid;
	private String address;
	
	public manager()
	{
		
	}
	//overload
	public manager(String name, String email, String password, String mobile,int mi,String ad)
	{
		super(name, email, password, mobile);
		this.mid = mi;
		this.address = ad;
	}
	public int getmid()
	{
		return mid;
	}
	public String address()
	{
		return address;
	}
	public void setmid(int mi)
	{
		mid = mi;
	}
	public void setdiscount(String ad)
	{
		address = ad;
	}	
	@Override
	public void display()
	{
		System.out.println("Seller ID :" + this.mid + "\n address :" + this.address );
	}

}


