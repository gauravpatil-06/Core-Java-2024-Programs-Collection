import java.lang.*;
import java.util.*;
class Flight 
{
    int flight_number;
	String flight_name;
	String Source;
    String Destination;
	String flight_class;
	int Seat_number;
}
class Reservation extends Flight
{
	void insertRecord() 
	{
        Scanner sc= new Scanner(System.in);
		System.out.print("Enter Flight Number        : ");
        flight_number = sc.nextInt();
		System.out.print("Enter Flight Name          : ");
        flight_name = sc.next();
		System.out.print("Enter Flight Take Of place : ");
        Source = sc.next();
		System.out.print("Enter Flight Landing Place : ");
        Destination = sc.next();
		System.out.print("Enter Flight Class         : ");
        flight_class = sc.next();
		System.out.print("Enter Flight Seat Number   : ");
        Seat_number = sc.nextInt();
		System.out.println("Flight record added successfully!!!");
    }
	void displayRecord() 
	{
            System.out.println("=================================");
			System.out.println("=========DISPLAY RECORD==========");
			System.out.println("=================================");
			System.out.println("Flight Number      : " +flight_number);
			System.out.println("Flight Name        : " +flight_name); 
			System.out.println("Take Of place      : " +Source);
			System.out.println("Landing Place      : " +Destination);
			System.out.println("Flight Class       : " +flight_class);
			System.out.println("Flight Seat Number : " +Seat_number);
			System.out.println("=================================");
    }
	void updateRecord() 
	{
	    
        Scanner sc= new Scanner(System.in);
			System.out.print("Enter New Flight Number        : ");
			flight_number = sc.nextInt();
			System.out.print("Enter New Flight Name          : ");
			flight_name = sc.next();
			System.out.print("Enter New Flight Take Of place : ");
			Source = sc.next();
			System.out.print("Enter New Flight Landing Place : ");
			Destination = sc.next();
			System.out.print("Enter New Flight Class         : ");
			flight_class = sc.next();
			System.out.print("Enter New Flight Seat Number   : ");
			Seat_number = sc.nextInt();
            System.out.println("Record updated successfully!!!");
    }
	void searchrecord() 
	{
			Scanner sc= new Scanner(System.in);
			System.out.println("=========SEARCH RECORD==========");
			System.out.println("=================================");
			System.out.println("Flight Number      : " +flight_number);
			System.out.println("Flight Name        : " +flight_name); 
			System.out.println("Take Of place      : " +Source);
			System.out.println("Landing Place      : " +Destination);
			System.out.println("Flight Class       : " +flight_class);
			System.out.println("Flight Seat Number : " +Seat_number);
			System.out.println("=================================");
    }
        
	void bookSeats() 
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter the number of seats to book : ");
        int number_Of_Seats = sc.nextInt();
		System.out.print("Enter Passenger Name    : ");
		String passengerName = sc.next();
		String reservation_Code="R1";
		System.out.println("Booking successful!!!");
		System.out.println("Reservation Code: " + reservation_Code);
				}
}
class Airline_Reservation_System 
{
    public static void main(String args[]) 
	{
	    
		Scanner sc= new Scanner(System.in);
		Reservation r1[]=new Reservation[10];
		int choice,i,N=0;
	          do
        {
				System.out.println("=================================");
				System.out.println("====AIRLINE MANAGEMENT SYSTEM====");
				System.out.println("=================================");
				System.out.println("1. Insert Record ");
				System.out.println("2. Display Record ");
				System.out.println("3. update Record ");
				System.out.println("4. search record ");
				System.out.println("5. Seat Book Record ");
				System.out.println("6. Exit ");
				System.out.println("================================");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				switch (choice) 
				{
					case 1:
							System.out.println("Enter number of record you want to insert");
							N = sc.nextInt();
				    
							for(i=0;i<N;i++)
							{	
								r1[i]=new Reservation();
								r1[i].insertRecord();
							}
						    break;  
					case 2:
							for(i=0;i<N;i++)
							{
								r1[i].displayRecord();
							}
						    break;
					case 3:
							System.out.print("Enter Flight Number to update : ");
							int search_Flight_Number = sc.nextInt();
							for(i=0;i<N;i++)
							{
								if (r1[i].flight_number==search_Flight_Number) 
							    {
									r1[i].updateRecord();
									break;
							    }
							}
							if(i==N)
							{
								System.out.println("Flight not found!!!");
							}
						    break;	
					case 4:
							System.out.print("Enter Flight Number to search record  : "); 
							int  flight = sc.nextInt();
							for(i=0;i<N;i++)
							{
						     	if(r1[i].flight_number==flight)
								{
									r1[i].searchrecord();
									break;
								}
							}
							if(i==N)
							{
								System.out.println("No such a record for this flight number");
							}
						   break;	
					case 5:
							System.out.print("Enter Flight Number to book seats : "); 
							int selected_Flight_Number = sc.nextInt();
				    
						   for(i=0;i<N;i++)
							{
								if(r1[i].flight_number==selected_Flight_Number)
								{
								   r1[i].bookSeats();
								   break;
								}
							}
							if(i==N)
							{
								System.out.println("Not enough available seats for the selected flight!!!");
							}
						   break;
					case 6:
						    System.out.println("Thanks for using our Software!!!");
						    break;
					default:
							System.out.println("Invalid choice. Please try again!!!");
				}
			} while (choice != 6);
	}
}