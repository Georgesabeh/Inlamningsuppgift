import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TextCounterTest {

    @Test
    public void testCountCharacters() {
        TextCounter counter = new TextCounter();
        counter.count("Hej");
        assertEquals(3, counter.getTotalChars());
    }

    @Test
    public void testCountLines() {
        TextCounter counter = new TextCounter();
        counter.count("Rad 1");
        counter.count("Rad 2");
        assertEquals(2, counter.getTotalLines());
    }    @Test
    public void testCountWords() {
        TextCounter counter = new TextCounter();
        counter.count("Rad 1");
        counter.count("Rad 2");
        assertEquals(4, counter.getTotalWords());
    }
}
