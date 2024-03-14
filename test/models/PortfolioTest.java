package models;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PortfolioTest {

  private Portfolio portfolio;

  @Before
  public void setUp() {
    portfolio = new Portfolio("Tech Investments");
  }

  @Test
  public void testAddStock() {
    Stock apple = new Stock("Apple", 50);
    Stock google = new Stock("Google", 30);
    portfolio.addStock(apple);
    portfolio.addStock(google);

    assertEquals(2, portfolio.getQuantity());
  }

  @Test
  public void testGetStocks() {
    Stock apple = new Stock("Apple", 50);
    portfolio.addStock(apple);

    assertEquals(1, portfolio.getStocks().size());
    assertEquals(apple, portfolio.getStocks().get(0));
  }

  @Test
  public void testGetTotalShares() {
    Stock apple = new Stock("Apple", 50);
    Stock google = new Stock("Google", 30);
    portfolio.addStock(apple);
    portfolio.addStock(google);

    assertEquals(80, portfolio.getTotalShares());
  }
  }

