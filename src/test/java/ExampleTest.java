import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleTest {

  @DisplayName("java test")
  @Test
  void i_am_a_test() {
    new Hello().callKotlin();
    assertThat(true).isTrue();
  }
}
