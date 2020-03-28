package is.hi.flugleit;

import org.junit.*;
import static org.junit.Assert.*;

public class FlightControllerTest {
  private Flight[] flights;
  
  @Before
  public void setUp() { 
    flights=new Flight[2];
    flights[0]= new Flight("A515", "Air Iceland Connect", "Akureyri", "Reykjavík", "27.03.2020-18:45", "27.03.2020-19:30", 15000);
    flights[1]= new Flight("A573", "Air Iceland Connect", "Akureyri", "Reykjavík", "28.03.2020-07:00", "28.03.2020-07:50", 12500);
  }
  @After
  public void tearDown() { 
    flights=null;
    //ATH: þarf að gera eftirfarandi eða er nóg að gera bara hitt?
    flights[0]=null;
    flights[1]=null;
  }
  @Test
  public void testSearch() {
    Flight[] flights2=flights.search("27.03.2020","Akureyri", "Reykjavík");
    assertEquals(1, flights2.length);
    assertEquals(flights[0], flights2[0]);
  }
  
  @Test
  public void testSortByPrice() {
    Flight[] flights2=flights.sort(price);
    assertEquals(flights[1],flights2[0]);
  }
  
  @Test
  public void testSortByDuration() {
    Flight[] flights2=flights.sort(duration);
    assertEquals(flights[0],flights2[0]);
  }
}
