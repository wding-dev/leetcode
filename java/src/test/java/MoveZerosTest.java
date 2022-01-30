import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MoveZerosTest {
    @ParameterizedTest
    @CsvSource(
        value = {
            "[0,1,0,3,12]:[1,3,12,0,0]",
            "[0]:[0]"
        },
        delimiter = ':'
    )
    public void moveZerosTest(String input, String expectedResult) {
    }
}
