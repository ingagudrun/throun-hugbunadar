package is.hi.flugleit;

import org.junit.*;
import static org.junit.Assert.*;

public class FlightControllerTest {
  private Flight[] flights;
  private FlightController flightController;
  
  @Before
  public void setUp() { 
    flightController = new FlightController();

    flights[0]= new Flight("A515", "Air Iceland Connect", "Akureyri", "Reykjavík", "27.03.2020-18:45", "27.03.2020-19:30", 15000);
    flights[1]= new Flight("A573", "Air Iceland Connect", "Akureyri", "Reykjavík", "28.03.2020-07:00", "28.03.2020-07:50", 12500);
  }

  @After
  public void tearDown() { 
    flights=null;
    flightController=null;
  }

  /*@Test
  @Order(1)
  public void testCreate() {
    for (int i=0; i < flights.length; i++) {
      flightController.createFlight(flights[i]);
    }
  }*/

  @Test
  @Order(2)
  public void testSearch() {
    Flight[] flights2 = flightController.search("27.03.2020","Akureyri", "Reykjavík");

    assertEquals(1, flights2.length);
    assertEquals(flights[0], flights2[0]);
  }
  
  @Test
  @Order(3)
  public void testSortByPrice() {
    Flight[] flights2 = flightController.sortByPrice();

    assertEquals(flights[1],flights2[0]);
    assertEquals(flights[0],flights2[1]);
  }
  
  @Test
  @Order(4)
  public void testSortByDuration() {
    Flight[] flights2 = flightController.sortByDuration();

    assertEquals(flights[0],flights2[0]);
    assertEquals(flights[1],flights2[1]);
  }
  
  @Test
  @Order(5)
  public void testSearchFail() {
    Flight[] flights2 = flightController.search("27.03.2020","22", "Reykjavik");
    
    assertEquals(0, flights2.length);
  }
  
}
