import com.example.Feline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FelineParametrizedTest {
    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "999, 999",
            "0, 0",
            "-1, -1",
    })
    public void getKittensFelineParametrizedTest(int count, int expected) throws Exception {
        Feline feline = new Feline();
        int actual = feline.getKittens(count);
        Assertions.assertEquals(expected, actual);
    }
}
