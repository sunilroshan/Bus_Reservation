package busRese;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  // this is a class

public class Booking {
	
	String passengerName;
	Date date;
	String froming;
	String tooing;
	
	//construcotr..
	
	Booking (){ // new booking so i am taking the input from the user
		
		// you can get it directly otherwise using "this" keyword initialization
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the Passenger : ");
		passengerName = sc.next();
		
		
		
		System.out.println("Enter date dd-mm-yyyy : ");
		String dateInput = sc.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // creating a object...
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter the Origin  : ");
		 froming = sc.next();
		
		System.out.println("Enter the destination : ");
		tooing = sc.next();
																																																																																																			
		
	}
	
	public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> bookings){  //when we are passing the object it will passing the reference
		
		int capac = 0;
		for(Bus bus : buses){
			if((bus.getfromm().equals(froming)) && (bus.gettooo().equals(tooing))){  //busNo is directly accessing because in main class isavailable is directly invoking
				capac = bus.getCapacity();  //here we are getting the total capacity of the bus
			}
		}
		int booked = 0;
		for(Booking b : bookings){
			if((b.date.equals(date)) && (b.froming.equals(froming))  &&( b.tooing.equals(tooing))){ //b.busNo is already booked busNo...
				booked++;
			}
		}
		return booked < capac ? true : false;
	}

}
