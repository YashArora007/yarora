package java_reservation;

import java.util.Scanner;

public class A_reservation {

	public static void main(String gg[])
   {
		Scanner input = new Scanner(System.in);	
	System.out.print("---------------\nAIRLINE RESERVE\n---------------\n\n1.Book\n2.Cancel\n3.Check\n4.Exit\nEnter your choice : ");	
	int c = input.nextInt();
	String source= new String();
	String destination = new String();
	{System.out.println("\n1. Business Class\n2. Economy Class");
    int section = input.nextInt(); 
	
	if(section==1)
	{		
		business fir=new business();
	 switch(c)
	 {
	 case 1:{System.out.println("Enter source & destination :\n");		
			 source = input.next();			
			 destination = input.next();			
			int y=fir.Reservation(source,destination,'b');
	 		if(y==1)
			
	 			fir.price(20000);
	 		}
	 		break;
			
	 case 2:{System.out.println("Enter seat number & flight number");
	 		int seat = input.nextInt();
	 		int flight = input.nextInt();
	 		fir.cancel(seat,flight);
	 		}
	 		break;
		
	 case 3:{System.out.println("Enter seat number & flight number");
	     	int seat = input.nextInt();
		    int flight = input.nextInt();
			fir.check(seat,flight);
	 		}
			break;
	 case 4:
			break;						
	 }
	}
	
	else
	 {
		
		economy er=new economy();
	 switch(c)
	 {
	 case 1:{System.out.println("Enter source, destination :\n");
			
			 source = input.nextLine();
			destination = input.nextLine();
	 		int y=er.Reservation(source,destination,'e');
	 		if(y==1)
	 		er.price(10000);
	 		}
	 		break;
			
	 case 2:{System.out.println("Enter seat number & flight number");
	 		int seat = input.nextInt();
	 		int flight = input.nextInt();
	 		er.cancel(seat,flight);
	 		}
	 		break;
		
	 case 3:{System.out.println("Enter seat number & flight number");
	     	int seat = input.nextInt();
		    int flight = input.nextInt();
			er.check(seat,flight);
	 		}
			break;
	 case 4:
			break;						
	 }
	}
	}
  input.close();
	
}}
