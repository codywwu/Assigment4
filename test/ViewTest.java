import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import views.View;

public class ViewTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void testDisplayWelcomeMessage() throws IOException {
    View view =new View(System.out);
    view.displayWelcomeMessage("TestUser");
    assertEquals("\nHello TestUser, Welcome To Money For US", outContent.toString());
  }
}