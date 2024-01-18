import java.util.ArrayList;


public class Trips {
    //trip details
      ArrayList<Trips> trip;
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
//constructor with bus parameters read in

    public Trips(String busCompany,String tripId, String startingLocation, String destination, String dateOfDeparture,String timeOfDeparture, String dateOfArrival, String timeOfArrival, int fare,int availableSeats) {
        this.tripId = tripId;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.dateOfDeparture = dateOfDeparture;
        this.timeOfDeparture = timeOfDeparture;
        this.dateOfArrival= dateOfArrival;
        this.timeOfArrival = timeOfArrival;
        this.availableSeats = availableSeats;
        this.fare = fare;
        this.seatsPurchased=seatsPurchased;
        this.busCompany=busCompany;
    }
    // method to return number of seats purchased
    public int getSeatsPurchased(){
        return this.seatsPurchased;
    }
    //method to return availble number of seats
    public int getAvailableSeats(){
        return availableSeats - this.seatsPurchased;
    }
    //other getter methods to return bus information
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
    
         public int setAvailableSeats(int availableSeats) {
        return this.availableSeats = availableSeats;
    }
    //to string method prints out bus details
    @Override
    public String toString() {
        return "Bus Company: " + busCompany +
                "\nTrip ID: " + tripId +
                "\nStarting Location: " + startingLocation +
                "\nDestination: " + destination +
                "\nDate of Departure: " + dateOfDeparture +
                "\nTime of Departure: " + timeOfDeparture +
                "\nDate of Arrival: " + dateOfArrival +
                "\nTime of Arrival: " + timeOfArrival +
                "\nFare: " + fare +
                "\nNumber of available seats: " + (availableSeats - seatsPurchased) +
                "\nTotal cost: " + (fare * seatsPurchased) +
                "\n";
    }
}

 
