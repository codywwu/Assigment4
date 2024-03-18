package models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Simple test cases for stock object. */
public class StockTest {

  private Stock stock;

  @Before
  public void setUp() {
    stock = new Stock("TestCompany", 100);
  }

  @Test
  public void testConstructorAndGets() {
    assertEquals(
        "Constructor or getter error for companyName", "TestCompany", stock.getCompanyName());
    assertEquals("Constructor or getter error for userShared", 100, stock.getUserShared());
  }

  @Test
  public void testSetCompanyName() {
    stock.setCompanyName("NewCompany");
    assertEquals("Setter error for companyName", "NewCompany", stock.getCompanyName());
  }

  @Test
  public void testSetVolume() {
    stock.setVolume(5000);
    assertEquals("Setter error for volume", 5000, stock.getVolume());
  }

  @Test
  public void testSetLocalHigh() {
    stock.setLocalHigh(200);
    assertEquals("Setter error for localHigh", 200, stock.getLocalHigh(), 0.0);
  }

  @Test
  public void testSetLocalLow() {
    stock.setLocalLow(150);
    assertEquals("Setter error for localLow", 150, stock.getLocalLow(), 0.0);
  }
}
