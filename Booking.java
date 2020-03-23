package flight;

public class Booking {
   private String BOOKING_NUMBER;
   private Flight flight;
   private Seat seat;
   private Passenger passenger;
   private boolean luggage;
   private boolean paid;
   private boolean refunded;
   
   public String getBookingNumber(){return BOOKING_NUMBER;}
   public void setBookingNumber(String val){BOOKING_NUMBER=val;}
   public Flight getFlight(){return flight;}
   public void setFlight(Flight val){flight=val;}
   public Seat getSeat(){return seat;}
   public void setSeat(Seat val){seat=val;}
   public Passenger getPassenger(){return passenger;}
   public void setPassenger(Passenger val){passenger=val;}
   public boolean getLuggage(){return luggage;}
   public void setLuggage(boolean val){luggage=val;}
   public boolean getPaid(){return paid;}
   public void setPaid(boolean val){paid=val;}
   public boolean getRefunded(){return refunded;}
   public void setRefunded(boolean val){refunded=val;}
}
