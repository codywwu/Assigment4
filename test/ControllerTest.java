import static controller.Controller.isValidDateFormat;
import static org.junit.Assert.*;

import controller.Controller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.NoSuchElementException;
import models.MockModel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ControllerTest {
  @Test
  public void testIntro() throws IOException {
    String input = "aaa\n945935\n";
    Reader in = new StringReader(input);
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm =new MockModel(log);
    Controller controller = new Controller(mm,in, out);
    controller.intro();
    assertEquals(
        "\nPlease enter a username: \n"
            + "Hello aaa, Welcome To Money For US\n"
            + "Main menu\n"
            + "1. View Created Portfolio\n"
            + "2. Create new Portfolio\n"
            + "3. Exit Program\n"
            + "Please enter the number corresponding to your choice: \n"
            + "Invalid input. Please enter a number between 1 and 3",
        out.toString());
  }

//  @Test
//  public void testNewUser() throws IOException {
//    String input = "ata\n945935\n";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\nPlease enter a username: \n"
//            + "Hello ata, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Invalid input. Please enter a number between 1 and 3",
//        out.toString());
//  }
//
//  @Test
//  public void testVCP() throws IOException {
//    String input = "aaa\n1\n945935\n";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\nPlease enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Portfolio Name: importedPortfolio\n"
//            + "  Company quantity: 1\n"
//            + "Portfolio Name: AAPL\n"
//            + "  Company quantity: 2\n"
//            + "Portfolio Name: Po1\n"
//            + "  Company quantity: 1\n"
//            + "1, Exit to Main menu\n"
//            + "2, Exit the program\n"
//            + "3, View more details on one portfolio\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Invalid input. Please enter a number between 1 and 3",
//        out.toString());
//  }
//
//  @Test
//  public void testVCStock() throws IOException {
//    String input = "aaa\n1\n3\nAAPL\n945935 ";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\n"
//            + "Please enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Portfolio Name: importedPortfolio\n"
//            + "  Company quantity: 1\n"
//            + "Portfolio Name: AAPL\n"
//            + "  Company quantity: 2\n"
//            + "Portfolio Name: Po1\n"
//            + "  Company quantity: 1\n"
//            + "1, Exit to Main menu\n"
//            + "2, Exit the program\n"
//            + "3, View more details on one portfolio\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Please enter the name of the portfolio you would like to access:\n"
//            + "Portfolio Name: AAPL\n"
//            + "  Stock Name: AAPL\n"
//            + "    Shared Value: 25\n"
//            + "  Stock Name: AMZN\n"
//            + "    Shared Value: 34\n"
//            + "1, Exit to Main menu\n"
//            + "2, Exit the program\n"
//            + "3, Change dates to view the stock's profit on that date\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Invalid input. Please enter a number between 1 and 3",
//        out.toString());
//  }
//
//  @Test
//  public void testEnterDateViewStock() throws IOException {
//    String input = "aaa\n1\n3\nAAPL\n3\n2023-09-01\n945935 ";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\n"
//            + "Please enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Portfolio Name: importedPortfolio\n"
//            + "  Company quantity: 1\n"
//            + "Portfolio Name: AAPL\n"
//            + "  Company quantity: 2\n"
//            + "Portfolio Name: Po1\n"
//            + "  Company quantity: 1\n"
//            + "1, Exit to Main menu\n"
//            + "2, Exit the program\n"
//            + "3, View more details on one portfolio\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Please enter the name of the portfolio you would like to access:\n"
//            + "Portfolio Name: AAPL\n"
//            + "  Stock Name: AAPL\n"
//            + "    Shared Value: 25\n"
//            + "  Stock Name: AMZN\n"
//            + "    Shared Value: 34\n"
//            + "1, Exit to Main menu\n"
//            + "2, Exit the program\n"
//            + "3, Change dates to view the stock's profit on that date\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Invalid input. Please enter a number between 1 and 3",
//        out.toString());
//  }
//
//  @Test
//  public void testInvalidDateSelection() throws IOException {
//    String input = "2024-02-03";
//
//    assertTrue(isValidDateFormat(input));
//  }
//
//  @Test
//  public void testVCStockDate() throws IOException {
//    String input = "aaa\n1\n3\nAAPL\n3\n2023-09-01\n945935 ";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\n"
//            + "Please enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Portfolio Name: importedPortfolio\n"
//            + "  Company quantity: 1\n"
//            + "Portfolio Name: AAPL\n"
//            + "  Company quantity: 2\n"
//            + "Portfolio Name: Po1\n"
//            + "  Company quantity: 1\n"
//            + "1, Exit to Main menu\n"
//            + "2, Exit the program\n"
//            + "3, View more details on one portfolio\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Please enter the name of the portfolio you would like to access:\n"
//            + "Portfolio Name: AAPL\n"
//            + "  Stock Name: AAPL\n"
//            + "    Shared Value: 25\n"
//            + "  Stock Name: AMZN\n"
//            + "    Shared Value: 34\n"
//            + "1, Exit to Main menu\n"
//            + "2, Exit the program\n"
//            + "3, Change dates to view the stock's profit on that date\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Invalid input. Please enter a number between 1 and 3",
//        out.toString());
//  }
//
//  @Test
//  public void testFillFormInvalid() throws IOException {
//    String input = "aaa\n2\n2\nmyP\nMyP\nNOTEXIST\n945935 ";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\n"
//            + "Please enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "There are two ways to create a new Portfolio: \n"
//            + "1. Import new portfolio\n"
//            + "2. Filled out the form\n"
//            + "3. Go back to main menu\n"
//            + "4. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Please enter a portfolio name:\n"
//            + "Please enter a company's symbol (eg,GooG for google):\n"
//            + "Please enter a valid company symbol.\n",
//
//        out.toString());
//  }
//
//  @Test
//  public void addPartialStock() throws IOException {
//    String input = "aaa\n2\n2\nmyP\nmp\nGOOG\n0.1\n945935 ";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\n"
//            + "Please enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "There are two ways to create a new Portfolio: \n"
//            + "1. Import new portfolio\n"
//            + "2. Filled out the form\n"
//            + "3. Go back to main menu\n"
//            + "4. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Please enter a portfolio name:\n"
//            + "Please enter a company's symbol (eg,GooG for google):\n"
//            + "Please enter the quantity of purchase, the number must be larger than 0:\n"
//            + "Invalid input. Please enter a number.",
//
//        out.toString());
//  }
//
//  @Test
//  public void addThreeStocks() throws IOException {
//    String input = "aaa\n2\n2\nmyP\nmp\nGOOG\n10\n1\nAAPL\n80\n1\nKO\n10\n2\n1\n945935 ";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\n"
//            + "Please enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "There are two ways to create a new Portfolio: \n"
//            + "1. Import new portfolio\n"
//            + "2. Filled out the form\n"
//            + "3. Go back to main menu\n"
//            + "4. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Please enter a portfolio name:\n"
//            + "Please enter a company's symbol (eg,GooG for google):\n"
//            + "Please enter the quantity of purchase, the number must be larger than 0:\n"
//            + "You have chosen to purchase 10 shares of GOOG."
//            +"Add another company with shares or select done for done creating this port"
//            +"1. Add more stock"
//            +"2. Done"
//            +"Please enter the number corresponding to your choice:"
//            +"Please enter a company's symbol (eg,GooG for google):"
//            +"Please enter the quantity of purchase, the number must be larger than 0:"
//            +"You have chosen to purchase 80 shares of AAPL."
//            +"Add another company with shares or select done for done creating this port"
//            +"1. Add more stock"
//            +"2. Done"
//            +"Please enter the number corresponding to your choice:"
//            +"Please enter a company's symbol (eg,GooG for google):"
//            +"Please enter the quantity of purchase, the number must be larger than 0:"
//            +"You have chosen to purchase 10 shares of KO."
//            +"Add another company with shares or select done for done creating this port"
//            +"1. Add more stock"
//            +"2. Done"
//            +"Please enter the number corresponding to your choice: "
//            +"\n"
//            +"Portfolio 1 - The shares of your portfolio in total: 100"
//            +"Stock 1: GOOG"
//            +"Stock 2: AAPL"
//            +"Stock 3: KO"
//            +"\n"
//            +"Main menu"
//            +"1. View Created Portfolio"
//            +"2. Create new Portfolio"
//            +"3. Exit Program"
//            +"Please enter the number corresponding to your choice:"
//            +"Portfolio Name: importedPortfolio"
//            +"Company quantity: 1"
//            +"Portfolio Name: AAPL"
//            +" Company quantity: 2"
//            +"Portfolio Name: Po1"
//            +" Company quantity: 1"
//            +"Portfolio Name: Po2"
//            +"Company quantity: 1"
//            +"Portfolio Name: myP"
//            +"Company quantity: 1"
//            +"Portfolio Name: GOOG"
//            +"  Company quantity: 1"
//            +"Portfolio Name: mp"
//            +"  Company quantity: 3"
//            +"1, Exit to Main menu"
//            +"2, Exit the program"
//            +"3, View more details on one portfolio"
//            +"Please enter the number corresponding to your choice:"
//            +"Invalid input. Please enter a number between 1 and 3"
//        ,
//
//        out.toString());
//  }
//
//  @Test
//  public void testSetPortfolioName() throws IOException {
//    String input = "aaa\n2\n2\nmyP\n945935 ";
//    Reader in = new StringReader(input);
//    StringBuffer out = new StringBuffer();
//
//    Controller controller = new Controller(in, out);
//    controller.intro();
//    assertEquals(
//        "\n"
//            + "Please enter a username: \n"
//            + "Hello aaa, Welcome To Money For US\n"
//            + "Main menu\n"
//            + "1. View Created Portfolio\n"
//            + "2. Create new Portfolio\n"
//            + "3. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "There are two ways to create a new Portfolio: \n"
//            + "1. Import new portfolio\n"
//            + "2. Filled out the form\n"
//            + "3. Go back to main menu\n"
//            + "4. Exit Program\n"
//            + "Please enter the number corresponding to your choice: \n"
//            + "Please enter a portfolio name:\n"
//            + "Please enter a company's symbol (eg,GooG for google):\n"
//        ,
//
//        out.toString());
//  }




  @Test
  public void testInValidMenuSelection() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm =new MockModel(log);
    Controller controller = new Controller(mm,in, out);
    boolean result = controller.validMenuSelection(2, 3);

    assertEquals(false, result);
  }

  @Test
  public void testInValidMenuSelection1() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm =new MockModel(log);
    Controller controller = new Controller(mm,in, out);
    boolean result = controller.validMenuSelection(0, 3);

    assertEquals(true, result);
  }

  @Test
  public void testInValidMenuSelection2() throws IOException {
    Reader in = new StringReader("aaa");
    StringBuffer out = new StringBuffer();
    StringBuilder log = new StringBuilder();
    MockModel mm =new MockModel(log);
    Controller controller = new Controller(mm,in, out);
    boolean result = controller.validMenuSelection(-1, 3);

    assertEquals(true, result);
  }
}
