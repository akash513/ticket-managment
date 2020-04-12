
package ticket;

public class non_ac extends vehicle{
						
	public float price;
	
	public non_ac()
	{
		
	}
	public non_ac(String name,int car_no,int ticket_price,String destination,float pr)
             
	{
		super(name,car_no,ticket_price,destination); 
		this.price=pr;
	}
}