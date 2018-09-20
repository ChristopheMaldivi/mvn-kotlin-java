import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ExampleTest {

  @DisplayName("java test")
  @Test
  void i_am_a_test() {
    Hello.hi();
    assertThat(true).isTrue();
  }
}
