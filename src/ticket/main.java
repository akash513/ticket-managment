package ticket;


public class main {
	
	public static void main(String[] args) {
		 person p1 = new customer("akash","akash@gmail.com","12345a","+8801766487",1001,"dhaka",2);
		 person p2 = new manager ("sky","sky@gmail.com","1234","+880168794",194,"dhaka");
		 purches p3 = new purches(250);
		 p1.display();
		 System.out.println("\n------------------");
		 p2.display();
		 System.out.println("\n------------------");		 
		 p3.display();
		 
		
	}

}