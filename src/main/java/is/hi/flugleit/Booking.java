package is.hi.flugleit;

public class Booking {
   private String bookingNumber;
   private Flight flight;
   private Seat seat;
   private Passenger passenger;
   private boolean luggage;
   private boolean paid;
   private boolean refunded;
   
   public Booking(Flight flight, Seat seat, Passenger passenger){
      this.flight=flight;
      this.seat=seat;
      this.passenger=passenger;
   }
   
   public String getBookingNumber(){return bookingNumber;}
   public void setBookingNumber(String val){bookingNumber=val;}
   public Flight getFlight(){return flight;}
   public Seat getSeat(){return seat;}
   public Passenger getPassenger(){return passenger;}
   public boolean getLuggage(){return luggage;}
   public void setLuggage(boolean val){luggage=val;}
   public boolean getPaid(){return paid;}
   public void setPaid(boolean val){paid=val;}
   public boolean getRefunded(){return refunded;}
   public void setRefunded(boolean val){refunded=val;}
}
