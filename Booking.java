import java.util.ArrayList;

public class Booking {
    //booking details
 String tripId;
     String startingLocation;
     String destination;
     String dateOfDeparture;
     String timeOfDeparture;
     String dateOfArrival;
     String timeOfArrival;
     int availableSeats; 
     int fare;
     int seatsPurchased;     
     String busCompany;

// booking constructore with selected trip details and number of seats purchased read in
    public Booking(Trips selectedTrip, int seatsPurchased) {
        this.tripId = selectedTrip.tripId;
        this.startingLocation = selectedTrip.startingLocation;
        this.destination = selectedTrip.destination;
        this.dateOfDeparture = selectedTrip.dateOfDeparture;
        this.timeOfDeparture = selectedTrip.timeOfDeparture;
        this.dateOfArrival= selectedTrip.dateOfArrival;
        this.timeOfArrival = selectedTrip.timeOfArrival;
        this.availableSeats = selectedTrip.availableSeats;
        this.fare = selectedTrip.fare;
        this.seatsPurchased=seatsPurchased;
        this.busCompany=busCompany;
    }
    // bus info return methods
public int getSeatsPurchased(){
        return this.seatsPurchased;
    }
    public int getAvailableSeats(){
        return availableSeats - this.seatsPurchased;
    }
    public String getBusName(){
        return busCompany;
    }
  public String getTripId() {
        return tripId;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public String getDestination() {
        return destination;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public int getFare() {
        return fare;
    }
}   
    
    

