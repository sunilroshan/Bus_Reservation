package busRese;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Bus buses[] = new Bus[50]; it not much efiicient than arraylist
		ArrayList<Bus> buses = new ArrayList<>();//already we have to add the data
		ArrayList<Booking> bookings = new ArrayList<>();//after your booking is confirmed
		
		
		buses.add(new Bus(true,2,"Kanyakumari","Coimbatore"));
		buses.add(new Bus(true,1,"Tirunelveli","Chennai"));
		buses.add(new Bus(false,7,"Coimbatore","Nagercoil"));
		
		
	   //initially dispalying the list of buses 
		for(Bus b : buses){
			b.displauBusInfo();
		}	
		
	
		
		int useropt = 1;
		while(useropt == 1){
		
		System.out.println("Enter 1 to Book and 2 to Exist");
		  
		useropt = sc.nextInt();
		
		if(useropt == 1){
			Booking booking = new Booking();  //here it will call the constructor
			
			//eg: like in the rectangle basic problem....
			
			if(booking.isAvailable(buses,bookings)){
				bookings.add(booking);
				System.out.println("Your Booking is confirmed");
			}
			else{
				System.out.println("Sorry Bus is full. Try another bus or date");
			}
		}
		}
		
		

	}

}
