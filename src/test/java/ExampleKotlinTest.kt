import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ExampleKotlinTest {

    @DisplayName("kotlin test")
    @Test
    internal fun `I am a test`() {
        HelloKotlin.hi()
        Assertions.assertTrue(true)
    }
}