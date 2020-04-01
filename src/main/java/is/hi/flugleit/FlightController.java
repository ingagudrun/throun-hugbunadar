package is.hi.flugleit;

import java.util.*;

class FlightController {
    private FlightDB flightDB;
    private Flight[] flights;

    public FlightController() {
        flightDB = new FlightDB();
    }

    public void createFlight(Flight f) {
        flightDB.createFlight(f);
    }

    public Flight[] search(String date, String destTo, String destFrom, String sortBy) {
        flights = flightDB.selectAll(date, destTo, destFrom);

        sort(sortBy);

        return flights;
    }

    public Flight[] search(String date, String destTo, String destFrom) {
        flights = search(date, destTo, destFrom, "date");

        return flights;
    }

    public void sort(String sortBy) {
        switch (sortBy) {
            case "date":
                Arrays.sort(flights, (a,b) -> a.getArrivalTime().compareTo(b.getArrivalTime()));
                break;
            case "price":
                Arrays.sort(flights, (a,b) -> b.getPrice() - a.getPrice());
                break;
            case "duration":
                Arrays.sort(flights, (a,b) -> a.getDuration().compareTo(b.getDuration()));
                break;
        }
    }

    public void sortByDate() {
        sort("date");
    }

    public void sortByPrice() {
        sort("price");
    }

    public void sortByDuration() {
        sort("duration");
    }
}
