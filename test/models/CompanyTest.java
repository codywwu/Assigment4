package models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertFalse;

/** Some simple test cases for company object. */
public class CompanyTest {

  private Company company;

  @Before
  public void setUp() {
    // Setup with some initial values
    company = new Company("2021-01-01", "100", "90", true);
  }

  @Test
  public void testGetDate() {
    assertEquals("2021-01-01", company.getDate());
  }

  @Test
  public void testSetDate() {
    company.setDate("2021-02-01");
    assertEquals("2021-02-01", company.getDate());
  }

  @Test
  public void testGetHigh() {
    assertEquals("100", company.getHigh());
  }

  @Test
  public void testSetHigh() {
    company.setHigh("110");
    assertEquals("110", company.getHigh());
  }

  @Test
  public void testGetLow() {
    assertEquals("90", company.getLow());
  }

  @Test
  public void testSetLow() {
    company.setLow("85");
    assertEquals("85", company.getLow());
  }

  @Test
  public void testGetHasValidDate() {
    assertTrue(company.getHasValidDate());
  }

  @Test
  public void testSetHasValidDate() {
    company.hasValidDate = false;
    assertFalse(company.getHasValidDate());
  }
}
