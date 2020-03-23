public class Flight {

    private String flightNumber;
    private String airline;
    private String destTo;
    private String destFrom;
    private String departureTime;
    private String arrivalTime;
    private int price;
    private String duration;
    private int availableSeats;
    private Seat[] seats;
    private int luggagePrice;
    
    public Flight(String flightNumber, String airline, String destTo, String destFrom, String departureTime, String arrivalTime, int price){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.destFrom = destFrom;
        this.destTo = destTo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
    }
    
    public String getFlightNumber(){return flightNumber;}
    public void setFlightNumber(String val){flightNumber=val;}
    public String getAirline(){return airline;}
    public void setAirline(String val){airline=val;}
    public String getDestTo(){return destTo;}
    public void setDestTo(String val){destTo=val;}
    public String getDestFrom(){return destFrom;}
    public void setDestFrom(String val){destFrom=val;}
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
     * hvort það sé available
     */
    public void updateAvailability(Seat seat, boolean available){
    
    }
