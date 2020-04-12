package ticket;

public class customer extends person{
	
	private int customer_id;
	private String home;
        private  int no_of_ticket;
		
	public customer()
	{
		
	}
		
	public customer(String name, String email, String password, String mobile,int ci,String ho, int tic)
	{
		super(name, email, password, mobile);		
		this.customer_id = ci;
		this.home = ho;
		this.no_of_ticket = tic;
		
	}
	public int getcustomer_id()
	{
		return customer_id;
	}
	public String gethome()
	{
		return home;
	}	
	public int getno_of_ticket()
	{
		return no_of_ticket;
	}
	public void setcustomer_id(int ci)
	{
		customer_id = ci;
	}
	public void sethomee(String ho)
	{
		home = ho;
	}
	public void no_of_ticket(int tic)
	{
		no_of_ticket = tic;
	}
	
	
	@Override
	public void display()
	{
		System.out.println("Customer name :"+this.getname()+"\nCustomer ID :"+ this.customer_id + "\nhome :"+this.home + "\n ticket no" +this.no_of_ticket);
	}

}
