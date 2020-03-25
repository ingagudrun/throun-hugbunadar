package is.hi.flugleit;

public class FlightController {
  private Flight[] flights;
  
  public Flight[] search(String date, String destTo, String destFrom){
  }
  
  public void sort(String sortProperty){
    if(sortProperty.equals("date")||sortProperty.equals("Date")||sortProperty.equals("DATE"))
      flights.sortByDate();
    else if(sortProperty.equals("price")||sortProperty.equals("Price")||sortProperty.equals("PRICE"))
      flights.sortByPrice();
    else if(sortProperty.equals("duration")||sortProperty.equals("Duration")||sortProperty.equals("DURATION"))
      flights.sortByDuration();
    else if (sortProperty.equals("arrival time")||sortProperty.equals("Arrival time")||sortProperty.equals("ARRIVAL TIME"))
      flights.sortByArrivalTime();
  }
  private void sortByDate(){}
  private void sortByPrice(){}
  private void sortByDuration(){}
  private void sortByArrivalTime(){}

}
