import java.util.ArrayList;

public class Travel_Ireland
{
    //List to store trip information
    ArrayList<Trips> trip;
    //main method
   public static void main(String[] args)
    {
        
        //create instances of different bus companys
         BusEireann be = new BusEireann();
         GoBus gb = new GoBus();
         cityLink cl = new cityLink();
         
         //creating the trips
        Trips trip1 = new Trips("BusEireann","1234", "Galway", "Dublin", "17/11/2023", "10.00am", "17/11/2023", "2pm", 15,60);
        Trips trip2 =new Trips("BusEireann","2468", "Mayo", "Derry", "31/31/2023", "11.58pm", "31/12/2023", "11.59pm", 100,60);
         Trips trip3 =new Trips("BusEireann","5678", "Limerick", "Cork", "25/12/2023", "9.00am", "25/12/2023", "8pm", 50,60);



        // pull request test
        /*jlkl 
            f

            f
            f
            f
            f
            */
      
         //adding trips to bus Eireann
          be.addTrip(trip1);
          be.addTrip(trip2);
          be.addTrip(trip3);
            be.getAllAvailableTrips();
        
        
        
        //creating a booking using chosen trip object and number of seats booked
        Booking booking = new Booking(trip1,20);
        // boolean created true if booking goes ahead
        boolean success = be.makeBooking(booking);
        //if booking is a sucess booking info is printed
        if(success){
             System.out.println("\nBooking Successful");
            System.out.println("===================");
            System.out.println("Number of Passengers"+booking.getAvailableSeats());
            System.out.println("Trip details"+"["+booking.getStartingLocation()+ " ] to [" + booking.getDestination()+"]");
             System.out.println("Trip Id: "+booking.getTripId());
              System.out.println("Total Cost: "+booking.getFare() * booking.seatsPurchased + "\n");
        }else{
            System.out.println("Booking failed!!!");
        }
        //list out updated trips with decremented seat count
        be.getAllAvailableTrips();
        
    }
    }
