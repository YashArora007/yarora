package java_reservation;

import java.util.Scanner;

class airline 
{
    static int[][] seating = new int[][] {{},{1,0,0,0,0,0,0,0,0,0,0},{1,0,0,0,0,0,0,0,0,0,0},{1,0,0,0,0,0,0,0,0,0,0},{1,0,0,0,0,0,0,0,0,0,0}};
    static int j=1,k=6;
     String source[]  = new String[]      {"", "Delhi", "Mumbai", "Kolkata", "Banglore" };
     String destination[]  = new String[] {"", "Mumbai", "Delhi",  "Banglore","Kolkata" };
    static  int[] flight= new int[] {0,1,1,1,0};
    Scanner input = new Scanner(System.in);

 
   
    int Reservation(String source,String destination,char y)
    {  
    	int i=0,m=0,q=0;
    	for(;i<5;++i)
    	{
    	  if(this.source[i].equalsIgnoreCase(source))
    	  {	m=1; 
    	  break;
    	  }
    	}    
        
    	if(m==1)
    		if(this.destination[i].equalsIgnoreCase(destination))
    			{
    			if(y=='b')
    				{if(seating[i][j] ==0)
    			    	{
    					seating[i][j] =1;
    				    j++;
    				    System.out.println("Seat booked\nSeat number: "+j+" alloted of flight number "+flight[i]);
    				    j++;
    				    q=1;
    			    	}
    				else
    		    	{
    		    		System.out.print("Business Class Not Available");
    		    	}
    				}
    			else
    			{
    				if(seating[i][k] ==0)
		    	{
				seating[i][k] =1;
			    System.out.println("Seat booked\nSeat number: "+k+" alloted of flight number "+flight[i]);
			    k++;
			    q=1;
		    	}else
		    	{
		    		System.out.print("Business Class Not Available");
		    	}
    			}}
    		else
    			System.out.println("Flight not available.");
    	else
    	System.out.println("Flight not available..");
    return q;		    			
    }

   
    void cancel(int x,int z)
    {
    	if(flight[z]==0)
    		System.out.println("Flight not available");
    	else
    	if(seating[z][x]==0)
    		System.out.println("Seat not booked");
    	else
    		seating[z][x]=0;
    }

    void check(int x,int z)
    { if(flight[z]==1)
	   if(seating[z][x]==1)
		System.out.println("Seat booked");
	 else
			System.out.println("Seat available");
    else
		System.out.println("Flight not available");


    	
    }
}

class economy extends airline
{
	void price(double base)
	{double cost,total;
	 cost=(((0.2)*base)+base);
	 total=(cost+((0.05)*cost));
	System.out.println("\nBilled amount is : Rs."+total);	
	}

	
}

class business extends airline
{
	void price(double base)	
	{double cost=0,total=0;
			 cost=(0.3*base);
			 cost=cost+base;
			 cost=cost+((0.2)*base);	
	 total=(cost+((0.1)*cost));
	 System.out.println("\nBilled amount is : Rs."+total);	
	}
  	

}
