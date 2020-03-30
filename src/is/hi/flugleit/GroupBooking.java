package is.hi.flugleit;

public class GroupBooking {
  private String groupBookingNumber;
  private Booking[] bookings;
  
  public GroupBooking(String groupBookingNumber, Booking[] bookings){
    this.groupBookingNumber=groupBookingNumber;
    int length=bookings.length;
    Booking[] this.bookings=new Booking[length];
    for(i=0;i<length;i++)
      this.bookings[i]=bookings[i];
  }
  
  public String getGroupBookingNumber(){return groupBookingNumber;}
  public void setGroupBookingNumber(String val){groupBookingNumber=val;}

}
