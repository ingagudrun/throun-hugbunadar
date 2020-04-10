package is.hi.flugleit;

public class GroupBooking {
  private String groupBookingNumber;
  private Booking[] bookings;
  
  public GroupBooking(String groupBookingNumber, Booking[] bookings){
    this.groupBookingNumber = groupBookingNumber;

    bookings = new Booking[bookings.length];

    for(int i=0;i<bookings.length;i++)
      this.bookings[i] = bookings[i];
  }
  
  public String getGroupBookingNumber(){return groupBookingNumber;}
  public Booking[] getBookings() { return bookings; }
  public void setGroupBookingNumber(String val){groupBookingNumber=val;}

}
