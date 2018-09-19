import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExampleTest {

  @DisplayName("java test")
  @Test
  void i_am_a_test() {
    Hello.hi();
    Assertions.assertTrue(true);
  }
}
