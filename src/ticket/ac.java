package ticket;


public class ac extends vehicle{
						
	public float price;
	
	public ac()
	{
		
	}
	public ac(String name,int car_no,int ticket_price,String destination,float pr)
             
	{
		super(name,car_no,ticket_price,destination); 
		this.price=pr;
	}
}