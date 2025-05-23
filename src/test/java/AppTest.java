import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGreeting() {
        App app = new App();
        String result = app.greet("World");
        assertEquals("Hello, World!", result);
    }
}
