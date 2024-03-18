import static controller.Controller.isValidDateFormat;
import static org.junit.Assert.assertTrue;
import controller.Controller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import models.MockModel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** Controller test class that offer various tests. */
public class ControllerTest {
  @Test
  public void testIntro() throws IOException {
    String input = "aaa\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\n"
            + "Please enter a username: \n"
            + "Hello, new user: aaa, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

  @Test
  public void testUser() throws IOException {
    String input = "inNAme\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\nPlease enter a username: \n"
            + "Hello inNAme, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

  @Test
  public void testNewUser() throws IOException {
    String input = "ata\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\nPlease enter a username: \n"
            + "Hello, new user: ata, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

  @Test
  public void testVCP() throws IOException {
    String input = "inNAme\n1\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\nPlease enter a username: \n"
            + "Hello inNAme, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Portfolio Name: Po1\n"
            + "  Company quantity: 1\n"
            + "1, Exit to Main menu\n"
            + "2, Exit the program\n"
            + "3, View more details on one portfolio\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

  @Test
  public void testVCStock() throws IOException {
    String input = "aaa\n1\n3\nPo1\n945935 ";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\n"
            + "Please enter a username: \n"
            + "Hello, new user: aaa, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Portfolio Name: Po1\n"
            + "  Company quantity: 1\n"
            + "1, Exit to Main menu\n"
            + "2, Exit the program\n"
            + "3, View more details on one portfolio\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter the name of the portfolio you would like to access: \n"
            + "Portfolio Name: Po1\n"
            + "  Stock Name: GOOG\n"
            + "    Shared Value: 333\n"
            + "1, Exit to Main menu\n"
            + "2, Exit the program\n"
            + "3, Change dates to view the stock's profit on that date\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

  @Test
  public void testInvalidDateSelection() throws IOException {
    String input = "2024-02-03";

    assertTrue(isValidDateFormat(input));
  }

  @Test
  public void testFillFormInvalid() throws IOException {
    String input = "aaa\n2\n2\nPo2\nGOOG\n234\n945935 ";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\n"
            + "Please enter a username: \n"
            + "Hello, new user: aaa, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "There are two ways to create a new Portfolio: \n"
            + "1. Import new portfolio\n"
            + "2. Filled out the form\n"
            + "3. Go back to main menu\n"
            + "4. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter a portfolio name: \n"
            + "Please enter a company's symbol (eg,GooG for google): \n"
            + "Please enter the quantity of purchase, the number must be larger than 0: \n"
            + "You have chosen to purchase 234 shares of GOOG.\n"
            + "Add another company with shares or select done for done creating this port\n"
            + "1. Add more stock\n"
            + "2. Done\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 2",
        out.toString());
  }

  @Test
  public void addPartialStock() throws IOException {
    String input = "aaa\n2\n2\nPo2\nGOOG\n0.1\n100\n945935 ";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\n"
            + "Please enter a username: \n"
            + "Hello, new user: aaa, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "There are two ways to create a new Portfolio: \n"
            + "1. Import new portfolio\n"
            + "2. Filled out the form\n"
            + "3. Go back to main menu\n"
            + "4. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter a portfolio name: \n"
            + "Please enter a company's symbol (eg,GooG for google): \n"
            + "Please enter the quantity of purchase, the number must be larger than 0: \n"
            + "Invalid input. Please enter a number.\n"
            + "You have chosen to purchase 100 shares of GOOG.\n"
            + "Add another company with shares or select done for done creating this port\n"
            + "1. Add more stock\n"
            + "2. Done\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 2",
        out.toString());
  }

  @Test
  public void addThreeStocks() throws IOException {
    String input = "aaa\n2\n2\nPo2\nGOOG\n10\n1\nAAPL\n80\n1\nKO\n10\n2\n1\n945935 ";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\n"
            + "Please enter a username: \n"
            + "Hello, new user: aaa, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "There are two ways to create a new Portfolio: \n"
            + "1. Import new portfolio\n"
            + "2. Filled out the form\n"
            + "3. Go back to main menu\n"
            + "4. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter a portfolio name: \n"
            + "Please enter a company's symbol (eg,GooG for google): \n"
            + "Please enter the quantity of purchase, the number must be larger than 0: \n"
            + "You have chosen to purchase 10 shares of GOOG.\n"
            + "Add another company with shares or select done for done creating this port\n"
            + "1. Add more stock\n"
            + "2. Done\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter a company's symbol (eg,GooG for google): \n"
            + "Please enter the quantity of purchase, the number must be larger than 0: \n"
            + "You have chosen to purchase 80 shares of AAPL.\n"
            + "Add another company with shares or select done for done creating this port\n"
            + "1. Add more stock\n"
            + "2. Done\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter a company's symbol (eg,GooG for google): \n"
            + "Please enter the quantity of purchase, the number must be larger than 0: \n"
            + "You have chosen to purchase 10 shares of KO.\n"
            + "Add another company with shares or select done for done creating this port\n"
            + "1. Add more stock\n"
            + "2. Done\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Portfolio 1 - The shares of your portfolio in total: 333\n"
            + "Stock 1: GOOG\n"
            + "\n"
            + "Portfolio 2 - The shares of your portfolio in total: 333\n"
            + "Stock 1: GOOG\n"
            + "\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Portfolio Name: Po1\n"
            + "  Company quantity: 1\n"
            + "Portfolio Name: Po1\n"
            + "  Company quantity: 1\n"
            + "1, Exit to Main menu\n"
            + "2, Exit the program\n"
            + "3, View more details on one portfolio\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

  @Test
  public void testDate() throws IOException {
    String input = "inNAme\n1\n3\nPo1\n3\n2024-02-02\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\n"
            + "Please enter a username: \n"
            + "Hello inNAme, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Portfolio Name: Po1\n"
            + "  Company quantity: 1\n"
            + "1, Exit to Main menu\n"
            + "2, Exit the program\n"
            + "3, View more details on one portfolio\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter the name of the portfolio you would like to access: \n"
            + "Portfolio Name: Po1\n"
            + "  Stock Name: GOOG\n"
            + "    Shared Value: 333\n"
            + "1, Exit to Main menu\n"
            + "2, Exit the program\n"
            + "3, Change dates to view the stock's profit on that date\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter in a date to view the stock's profit on that date (Ex.2024-03-05): \n"
            + "Date must be in the format of yyyy-MM-dd, please try again: \n"
            + "Each GOOG share worth following on: 2024-02-02\n"
            + "You have 333 shares on this company\n"
            + "Date: 2024-02-02\n"
            + "High: 143.8800\n"
            + "Low: 138.1700\n"
            + "Maximum value: 333000.0\n"
            + "Maximum value: 333000.0\n"
            + "\n"
            + "Total portfolio value based on highest stock prices: 333000.0\n"
            + "Total portfolio value based on lowest stock prices: 333000.0\n"
            + "\n"
            + "END OF YOUR PORTFOLIOS\n"
            + "Portfolio Name: Po1\n"
            + "  Company quantity: 1\n"
            + "1, Exit to Main menu\n"
            + "2, Exit the program\n"
            + "3, View more details on one portfolio\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());

    assertEquals("check if data has an XML file", log.toString());
  }

  @Test
  public void testImport() throws IOException {
    String input = "aaa\n2\n1\nNewUser\n945935";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    controller.intro();
    assertEquals(
        "\n"
            + "Please enter a username: \n"
            + "Hello, new user: aaa, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "There are two ways to create a new Portfolio: \n"
            + "1. Import new portfolio\n"
            + "2. Filled out the form\n"
            + "3. Go back to main menu\n"
            + "4. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Please enter the name of the file you would like to "
            + "access (no .xml is necessary): \n"
            + "Import file success!\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

  @Test
  public void testInValidMenuSelection() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    boolean result = controller.validMenuSelection(2, 3);

    assertEquals(false, result);
  }

  @Test
  public void testInValidMenuSelection1() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    boolean result = controller.validMenuSelection(0, 3);

    assertEquals(true, result);
  }

  @Test
  public void testInValidMenuSelection2() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm = new MockModel(log);
    Controller controller = new Controller(mm, in, out);
    boolean result = controller.validMenuSelection(-1, 3);

    assertEquals(true, result);
  }
}
