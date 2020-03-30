package is.hi.flugleit;

import java.sql.*;
import java.util.*;

public class FlightDB {
    public FlightDB() {

    }

    public Flight[] selectAll(String date, String destTo, String destFrom) {
        List<Flight> flights;

        pstmt = conn.prepareStatement("SELECT * FROM flights WHERE dest_to=? AND dest_from=? AND DATE(departure_time)=?");

        pstmt.setString(1, destTo);
        pstmt.setString(2, destFrom);
        pstmt.setString(3, date);

        ResultSet rs = pstmt.executeQuery();

        while (rs.next()) {
            flights.add(new Flight(rs.getString(1), rs.getString(2)));
        }

        return flights.toArray();
    }

    public void createFlight(Flight f) {
        pstmt = conn.prepareStatement("INSERT INTO flights(flight_number, airline, dest_to, dest_from, departure_time, arrival_time, price, luggage_price, duration) VALUES(?,?,?,?,?,?,?,?,?)");
        pstmt.setString(1, f.flightNumber);
        pstmt.setString(2, f.airline);
        pstmt.setString(3, f.destTo);
        pstmt.setString(4, f.destFrom);
        pstmt.setString(5, f.departureTime);
        pstmt.setString(6, f.arrivalTime);
        pstmt.setInt(7, f.price);
        pstmt.setInt(8, f.luggagePrice);
        pstmt.setInt(9, f.duration);

        pstmt.executeUpdate();

        for (int i=0; i < f.seats.length; i++) {
            // Create a DB record for each seat.
        }
    }
}
