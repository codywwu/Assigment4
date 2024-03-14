import static org.junit.Assert.*;

import controller.Controller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ControllerTest{
  @Test
  public void testIntro() throws IOException {
    String input = "aaa\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    controller.intro();
    assertEquals("\nPlease enter a username: \n"
        + "Hello aaa, Welcome To Money For US\n"
        + "Main menu\n"
        + "1. View Created Portfolio\n"
        + "2. Create new Portfolio\n"
        + "3. Exit Program\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Invalid input. Please enter a number between 1 and 3", out.toString());
  }

  @Test
  public void testNewUser() throws IOException {
    String input = "ata\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    controller.intro();
    assertEquals("\nPlease enter a username: \n"
        + "Hello ata, Welcome To Money For US\n"
        + "Main menu\n"
        + "1. View Created Portfolio\n"
        + "2. Create new Portfolio\n"
        + "3. Exit Program\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Invalid input. Please enter a number between 1 and 3", out.toString());
  }

  @Test
  public void testVCP() throws IOException {
    String input = "aaa\n1\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    controller.intro();
    assertEquals("\nPlease enter a username: \n"
        + "Hello aaa, Welcome To Money For US\n"
        + "Main menu\n"
        + "1. View Created Portfolio\n"
        + "2. Create new Portfolio\n"
        + "3. Exit Program\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Portfolio Name: importedPortfolio\n"
        + "  Company quantity: 1\n"
        + "Portfolio Name: AAPL\n"
        + "  Company quantity: 2\n"
        + "Portfolio Name: Po1\n"
        + "  Company quantity: 1\n"
        + "1, Exit to Main menu\n"
        + "2, Exit the program\n"
        + "3, View more details on one portfolio\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Invalid input. Please enter a number between 1 and 3", out.toString());
  }


  @Test
  public void testVCStock() throws IOException {
    String input = "aaa\n1\n3\nAAPL\n945935 ";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    controller.intro();
    assertEquals("\n"
        + "Please enter a username: \n"
        + "Hello aaa, Welcome To Money For US\n"
        + "Main menu\n"
        + "1. View Created Portfolio\n"
        + "2. Create new Portfolio\n"
        + "3. Exit Program\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Portfolio Name: importedPortfolio\n"
        + "  Company quantity: 1\n"
        + "Portfolio Name: AAPL\n"
        + "  Company quantity: 2\n"
        + "Portfolio Name: Po1\n"
        + "  Company quantity: 1\n"
        + "1, Exit to Main menu\n"
        + "2, Exit the program\n"
        + "3, View more details on one portfolio\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Please enter the name of the portfolio you would like to access:\n"
        + "Portfolio Name: AAPL\n"
        + "  Stock Name: AAPL\n"
        + "    Shared Value: 25\n"
        + "  Stock Name: AMZN\n"
        + "    Shared Value: 34\n"
        + "1, Exit to Main menu\n"
        + "2, Exit the program\n"
        + "3, Change dates to view the stock's profit on that date\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Invalid input. Please enter a number between 1 and 3", out.toString());
  }

  @Test
  public void testVCStockDate() throws IOException {
    String input = "aaa\n1\n3\nAAPL\n3\n2023-09-01\n945935 ";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    controller.intro();
    assertEquals("\n"
        + "Please enter a username: \n"
        + "Hello aaa, Welcome To Money For US\n"
        + "Main menu\n"
        + "1. View Created Portfolio\n"
        + "2. Create new Portfolio\n"
        + "3. Exit Program\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Portfolio Name: importedPortfolio\n"
        + "  Company quantity: 1\n"
        + "Portfolio Name: AAPL\n"
        + "  Company quantity: 2\n"
        + "Portfolio Name: Po1\n"
        + "  Company quantity: 1\n"
        + "1, Exit to Main menu\n"
        + "2, Exit the program\n"
        + "3, View more details on one portfolio\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Please enter the name of the portfolio you would like to access:\n"
        + "Portfolio Name: AAPL\n"
        + "  Stock Name: AAPL\n"
        + "    Shared Value: 25\n"
        + "  Stock Name: AMZN\n"
        + "    Shared Value: 34\n"
        + "1, Exit to Main menu\n"
        + "2, Exit the program\n"
        + "3, Change dates to view the stock's profit on that date\n"
        + "Please enter the number corresponding to your choice: \n"
        + "Invalid input. Please enter a number between 1 and 3", out.toString());
  }



  @Test
  public void testInValidMenuSelection() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    boolean result = controller.validMenuSelection(2, 3);

    assertEquals(false, result);
  }

  @Test
  public void testInValidMenuSelection1() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    boolean result = controller.validMenuSelection(0, 3);

    assertEquals(true, result);
  }

  @Test
  public void testInValidMenuSelection2() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();

    Controller controller = new Controller(in, out);
    boolean result = controller.validMenuSelection(-1, 3);

    assertEquals(true, result);
  }



}