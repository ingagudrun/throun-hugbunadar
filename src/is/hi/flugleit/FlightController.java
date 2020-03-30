package is.hi.flugleit;

class FlightController {
    private flightDB FlightDB;
    private Flight[] flights;

    public FlightController() {
        flightDB = new FlightDB();
    }

    public void createFlight(Flight f) {
        flightDB.createFlight(f);
    }

    public Flight[] search(String date, String destTo, String destFrom, String sortBy) {
        flights = flightDB.selectAll(date, destTo, destFrom, sortBy);

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
                Arrays.sort(flights, (a,b) -> a.arrivalDate.compareTo(b.arrivalDate));
                break;
            case "price":
                Arrays.sort(flights, (a,b) -> a.price.compareTo(b.price));
                break;
            case "duration":
                Arrays.sort(flights, (a,b) -> a.duration.compareTo(b.duration));
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
