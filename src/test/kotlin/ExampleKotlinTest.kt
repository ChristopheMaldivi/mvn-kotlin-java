import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ExampleKotlinTest {

    @DisplayName("kotlin test")
    @Test
    internal fun `I am a test`() {
        HelloKotlin.hi()
        assertThat(true).isTrue()
    }
}