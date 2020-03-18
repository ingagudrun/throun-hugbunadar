public class Flight {

    private String FLIGHT_NUMBER;
    private String AIRLINE;
    private String DEST_TO;
    private String DEST_FROM;
    private String departureTime;
    private String arrivalTime;
    private int price;
    private String duration;
    private int availableSeats;
    private Seat[] seats;
    private int luggagePrice;
    
    public String getFlightNumber(){return FLIGHT_NUMBER;}
    public void setFlightNumber(String val){FLIGHT_NUMBER=val;}
    public String getAirline(){return AIRLINE;}
    public void setAirline(String val){AIRLINE=val;}
    public String getDestTo(){return DEST_TO;}
    public void setDestTo(String val){DEST_TO=val;}
    public String getDestFrom(){return DEST_FROM;}
    public void setDestFrom(String val){DEST_FROM=val;}
    public String getDepartureTime(){return departureTime;}
    public void setDepartureTime(String val){departureTime=val;} 
    public String getArrivalTime(){return arrivalTime;}
    public void setArrivalTime(String val){arrivalTime=val;}    
    public int getPrice(){return price;}
    public void setFlightNumber(int val){price=val;}    
    public String getDuration(){return duration;}
    public void setDuration(String val){duration=val;}
    public int getAvailableSeats(){return availableSeats;}
    public void setAvailableSeats(int val){availableSeats=val;}
    public Seat[] getSeats(){return seats;}
    public void setSeats(Seat[] val){
        N=val.length;
        Seat seats=new Seat[N];
        for(i=0;i<N;i++)
            Seat[i]=val[i];
    }
    public int getLuggagePrice(){return luggagePrice;}
    public void setLuggagePrice(int val){luggagePrice=val;}
   
        /**
     * Updates the availability of a certain seat
     * ATH: þurfum að gera þannig að hverju sæti samsvari boolean breyta sem segir
     * hvort það sé available og þá laga í þessu hvernig við gerum það
     */
    public void updateAvailability(Seat seat, boolean available){
        for(Seat i in seats){
            if(i==seat)
                
        }
        //kannski gera þetta öðruvísi, td athuga fyrst hvort sætið breytist ekki í raun
        if(available) setAvailableSeats(availableSeats++);
        else if(!available) setAvailableSeats(availableSeats--);
    
    }
