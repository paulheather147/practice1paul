
import java.util.ArrayList;
public  abstract class Bus {
    //creates an array which stores trip details
    public ArrayList<Trips> trip = new ArrayList<>();
//methods which subclasses inherit
//add trip adds a trip
    public void addTrip(Trips trip){
    this.trip.add(trip);
    }
    // prints all trip details which to string method in trip  class
    public void getAllAvailableTrips( ) {
        for(Trips trip:trip){
            System.out.println(trip.toString());
        }
    }
   // gets the trip you want to select using tripId to find it which is read in
    public Trips getTrip(String Id){
    String selectTrip = Id;
    for(Trips trip: trip){
        if(trip.tripId .equals(selectTrip)){
            return trip;
        }
    }
    return null;
}
// if enough seats left this method makes a booking 
public boolean makeBooking(Booking booking){
        if(booking.seatsPurchased > booking.availableSeats){
            System.out.println("There isnt enough seats left sorry!");
            return false;
        }else{
            // new objects calultes number of seats left
            Trips chosenTrip = getTrip(booking.tripId);
            chosenTrip.availableSeats=chosenTrip.availableSeats - booking.seatsPurchased;
            return true;
        }
}
}
