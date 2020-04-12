package ticket;

public class purches {
	
	
	private float price;

public purches()
{
	
}
public purches(float ps)
{
	
	this.price = ps;
}

public float getprice()
{
	return price;
}


public void setprice(float ps)
{
	price = ps;
}	
 public void display()
 {
	 System.out.println("Total price :"+ this.price);
 }
}

