package is.hi.flugleit;

import java.util.*;

import javax.json.*;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class FlightController {
    private FlightDB flightDB;
    private Flight[] flights;

    public FlightController(FlightDB flightDB) {
        this.flightDB = flightDB;
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

    public Flight[] getFlights() {
        return flights;
    }

    public void sort(String sortBy) {
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
    
    @RequestMapping("/search")
    public String getSearch(@RequestParam String date, @RequestParam String to, @RequestParam String from, @RequestParam String sort) {
        Flight[] flights = search(date, to, from);

        JsonArrayBuilder results = Json.createArrayBuilder();

        for (int i = 0; i < flights.length; i++) {
            results.add(Json.createObjectBuilder()
                .add("flightNumber", flights[i].getFlightNumber())
                .add("airline", flights[i].getAirline())
                .add("destTo", flights[i].getDestTo())
                .add("destFrom", flights[i].getDestFrom())
                .add("departureTime", flights[i].getDepartureTime())
                .add("arrivalTime", flights[i].getArrivalTime())
                .add("price", flights[i].getPrice())
                .add("availableSeats", flights[i].getAvailableSeats())
            );
        }

        return results.build().toString();
    }
}
