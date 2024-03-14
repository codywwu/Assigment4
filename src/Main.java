import controller.Controller;
import java.io.IOException;
import java.io.InputStreamReader;
import models.Model;

/**
 * main method to run the program.
 */
public class Main {
  public static void main(String[] args) throws IOException {
    Model module= new Model();
    Controller controller = new Controller(module,new InputStreamReader(System.in), System.out);
    controller.intro();
    // Start the application by invoking the controller to handle user input
  }

}